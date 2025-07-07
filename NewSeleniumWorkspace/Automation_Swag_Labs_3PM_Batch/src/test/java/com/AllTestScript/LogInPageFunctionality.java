package com.AllTestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

import com.utilityPackage.PropertyFileUtility;
import com.utilityPackage.WebDriverUtility;

import swagLab_pomPackage.LogInPagePOM;

public class LogInPageFunctionality 
{
	//Declared the Global variables to access anywhere from the Test Class
	public static String browser;
	public static String url;
	public static String username;
	public static String password;
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception
	{
		
		// Using PropertyFileUtility Class we are fetching the data from property file
		PropertyFileUtility property = new PropertyFileUtility();
		
		/*
		 * Using WebDriverUtility Class we are initializing the browser as well as we are maximizing
		 * the browser, we are opening the Url and also we are seting the implicit Wait
		 * Remember this class is developed by us.
		 */		
		WebDriverUtility driverUtility = new WebDriverUtility();
		
		
		// Reading the data from Property file 
		browser = property.giveProperty("browser");
		url = property.giveProperty("url");
		username = property.giveProperty("username");
		password = property.giveProperty("password");
		
		//Opening browser, url, maximizing, setting time
		driverUtility.openBrowser(browser);
		driverUtility.maximizeWindow();
		driverUtility.setWaitingTime(15);
		driverUtility.openUrl(url); 
		
		// Accesssing the Driver instance 
		driver = driverUtility.getDriver();
		
		//Creating The Object for LoginPagePOM to access the elements of the login Page
		LogInPagePOM login = new LogInPagePOM(driver);
		
		//using the getter methods from the POM class to access the web elements
		login.getUserNameField().sendKeys(username);
		login.getPasswordField().sendKeys(password);
		login.getLogInButton().click();
		
		Thread.sleep(2000);
		
		driverUtility.goBack();
		
		Thread.sleep(2000);
		
		driverUtility.refreshPage();
		
		Thread.sleep(2000);
		
		login.restoreElement();
		
		login.getUserNameField().sendKeys(username);
		login.getPasswordField().sendKeys(password);
		login.getLogInButton().click();
		
		
		
	}
}
