package com.AllTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import baseClassPackage.LogInBaseClass;

public class LogInUsingTestNG extends LogInBaseClass
{
	@Test(priority = 1)
	public void positiveLogIn()
	{
		
		
		action.writeInInputField(login.getUserNameField(), username);
		action.writeInInputField(login.getPasswordField(), password);
		action.clickOnElement(login.getLogInButton());

		SoftAssert sAssert = new SoftAssert();
		
		sAssert.assertEquals(driver.getCurrentUrl(),
				"https://www.saucedemo.com/v1/inventory.html",
				"LogInPage Link is not matching with Current URL");

		Reporter.log("The Expected Url is Same",true);
		
//		sAssert.assertAll();
		
	}

	@Test(priority = 2)
	public void negativeLogIn()
	{
		SoftAssert sAssert = new SoftAssert();
		
		action.writeInInputField(login.getUserNameField(), lockedUser);
		action.writeInInputField(login.getPasswordField(), password);
		action.clickOnElement(login.getLogInButton());

		sAssert.assertNotEquals(driver.getCurrentUrl(),
				"https://www.saucedemo.com/v1/inventory.html",
				"LogInPage Link is not matching with Current URL");

		sAssert.assertAll();
		
		Reporter.log("The Expected Url is different",true);
		
		
	}
}
