package com.Hrm.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout {
	@FindBy(xpath=".//*[@id='welcome']")
	private WebElement welcomepage;
	
	@FindBy(xpath="//div[@id='welcome-menu']/ul/li[3]/a")
	private WebElement logout_btn;


public void logoff()
{
	welcomepage.click();
	logout_btn.click();
}
}