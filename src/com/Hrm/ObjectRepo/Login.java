 package com.Hrm.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Hrm.GenericLib.BaseClass;
import com.Hrm.GenericLib.Constants;
import com.Hrm.GenericLib.WebdriverCommonLib;

public class Login extends WebdriverCommonLib {
@FindBy(id="txtUsername")
private WebElement UsernameEdit;

@FindBy(id="txtPassword")
private WebElement PasswordEdit;

@FindBy(id="btnLogin")
private WebElement LoginButton;

public  void LoginToHrm()
{
	BaseClass.driver.get(Constants.URL);

	UsernameEdit.sendKeys(Constants.UserName);
	PasswordEdit.sendKeys(Constants.Password);
	LoginButton.click();
}
public  void LoginToHrm(String Username,String Password)
{
	BaseClass.driver.get(Constants.URL);
	UsernameEdit.sendKeys(Username);
	PasswordEdit.sendKeys(Password);
	LoginButton.click();
}
}
