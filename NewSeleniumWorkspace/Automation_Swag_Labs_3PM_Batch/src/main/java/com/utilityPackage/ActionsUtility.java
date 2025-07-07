package com.utilityPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsUtility 
{
	public   WebDriver driver;
	
	public Actions action ;
	
	public ActionsUtility(WebDriver driver)
	{
		this.driver=driver;
		
		action =  new Actions(driver);
	}
	
	 
	
	public void clickOnElement(WebElement element)
	{
		action.click(element).perform();
	}
	
	public void writeInInputField(WebElement element, String value)
	{
		action.sendKeys(element,value).perform();
	}
}
