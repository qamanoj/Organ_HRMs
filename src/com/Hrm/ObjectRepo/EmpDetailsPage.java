package com.Hrm.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmpDetailsPage {	
	@FindBy(id="firstName")
	private WebElement FNameEdit;
	
	@FindBy(xpath=".//*[@id='lastName']")
	private WebElement LNameEdit;
	
	@FindBy(xpath=".//*[@id='employeeId']")
	private WebElement EmpID;
	
	/*@FindBy(xpath=".//*[@id='photofile']")
	private WebElement photofile;*/
	
	@FindBy(xpath=".//*[@id='btnSave']")
	private WebElement Save;
	 
	/*public static void FileUpload() throws Throwable
	{ 
		
		Runtime.getRuntime().exec("‪‪C:\\Users\\user\\Desktop\\abcd.exe");
	}*/
	
	public void CreateEmp(String FirstName,String LastName,String ID) throws Throwable 
	{
		FNameEdit.sendKeys(FirstName);
		LNameEdit.sendKeys(LastName);
		EmpID.sendKeys(ID);
		//photofile.click();
		//EmpDetailsPage.FileUpload();
		Save.click();
	}

}
