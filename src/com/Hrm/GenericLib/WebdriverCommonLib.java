package com.Hrm.GenericLib;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebdriverCommonLib 
{
	public void WaitForPageToLoad()
	{
		BaseClass.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	public void WindowHandle()
	{
		BaseClass.driver.getWindowHandle();
	}
	public void Cancel()
	{
		Alert alt=BaseClass.driver.switchTo().alert();
		alt.dismiss();
	}
	public void OK()
	{
		Alert alt=BaseClass.driver.switchTo().alert();
	    alt.accept();			
	}
	public void MouseMovement(WebElement ExpElement)
	{
		Actions act=new Actions(BaseClass.driver);
		act.moveToElement(ExpElement).perform();
	}
	public void Rightclick(WebElement ExpElement)
	{
		Actions act=new  Actions(BaseClass.driver);
		act.contextClick(ExpElement).perform();
	}
	public void DragAndDrop(WebElement actElement,WebElement ExpElement)
	{
		Actions act=new Actions(BaseClass.driver);
		act.dragAndDrop(actElement, ExpElement).perform();
	}
	public void Select(WebElement wb,String value)
	{
		 Select sel=new Select(wb);
		sel.selectByVisibleText(value);
	}

}
