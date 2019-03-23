package com.Hrm.TestScript;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Hrm.GenericLib.BaseClass;
import com.Hrm.GenericLib.ExcelLib;

import com.Hrm.ObjectRepo.AddEmployee;
import com.Hrm.ObjectRepo.EmpDetailsPage;
import com.Hrm.ObjectRepo.PIM;
/*
 * Listener class is mandatory to take screenshots and it will be before TestScripts
 */
@Listeners(com.Hrm.GenericLib.SampleListener.class)
public class HrmScript extends BaseClass 
{	
	ExcelLib elib=new ExcelLib();
	
@Test
public void TestScripts() throws Throwable, InvalidFormatException, IOException 
{   
	String FirstName=elib.getExcelData("Sheet1",3,2);
	String LastName=elib.getExcelData("Sheet1",3,3);
	String ID=elib.getExcelData("Sheet1",3,4);
	
	 PIM p=PageFactory.initElements(BaseClass.driver, PIM.class); 
	 p.pims();
	 AddEmployee add=PageFactory.initElements(BaseClass.driver, AddEmployee.class);
	 add.clickOnperation();
	 
	 EmpDetailsPage edp=PageFactory.initElements(BaseClass.driver,EmpDetailsPage.class);
	 edp.CreateEmp(FirstName, LastName, ID);
	 
}
}


