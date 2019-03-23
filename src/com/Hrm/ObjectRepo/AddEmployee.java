package com.Hrm.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEmployee {
	@FindBy(id="menu_pim_addEmployee")
	private WebElement add_emp;

public void clickOnperation()
{
	add_emp.click();
}
}