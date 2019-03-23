package com.Hrm.GenericLib;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
public class SampleListener implements ITestListener{
	@Override
	public void onTestFailure(ITestResult H) {
		String FailedTestCaseName=H.getMethod().getMethodName();
		EventFiringWebDriver efw=new EventFiringWebDriver(BaseClass.driver);
		
		File srcFile=efw.getScreenshotAs(OutputType.FILE);
		File destFile=new File("D:\\Selenium\\ScreenShot.png");
		try 
		{
			FileUtils.copyFile(srcFile,destFile);
		}
		catch(IOException h)
		{
			System.out.println("ScreenShot for Exceptions"+h.getMessage());
	    }
}

	
	
	
	
	
	







@Override
public void onFinish(ITestContext arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void onStart(ITestContext arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
	// TODO Auto-generated method stub
	
}


@Override
public void onTestSkipped(ITestResult arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void onTestStart(ITestResult arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void onTestSuccess(ITestResult arg0) {
	// TODO Auto-generated method stub
	
}


}