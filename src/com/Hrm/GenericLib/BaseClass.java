package com.Hrm.GenericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.Hrm.ObjectRepo.Login;
import com.Hrm.ObjectRepo.Logout;

public class BaseClass 
{
	public static WebDriver driver;
	@BeforeClass
	public void OpenBrowser()
	{
		if(Constants.Browser.equals("chrome"))
		{
			//System.setProperty("webdriver.chrome.driver", "D:\\Manoj WorkSpace\\Framwork\\Resourses\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(Constants.Browser.equals("firefox"))
		{
			//System.setProperty("webdriver.gecko.driver","C:\\Eclipse_Oxygen\\POP UP\\Geckodriver\\geckodriver.exe" );
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		//Wait for every webelement in one TestScripts
		WebdriverCommonLib wlib=new WebdriverCommonLib();
		wlib.WaitForPageToLoad();
	}
	@AfterClass
	public void CloseBrowser()
	{
		driver.quit();	
	}
	@BeforeMethod
	public void LoginToApp()
	{
		Login lpage=PageFactory.initElements(driver, Login.class);
		lpage.LoginToHrm();
	}
	@AfterMethod
	public void LogoutFromApp()
	{
		Logout lg=PageFactory.initElements(driver,Logout.class);
		lg.logoff();	
	}
}
