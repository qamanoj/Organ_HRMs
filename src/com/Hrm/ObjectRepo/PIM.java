package com.Hrm.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PIM {
	@FindBy(id="menu_pim_viewPimModule")
	private WebElement Pim;

	 public void pims()
	 {
		 Pim.click();
	 }

}
