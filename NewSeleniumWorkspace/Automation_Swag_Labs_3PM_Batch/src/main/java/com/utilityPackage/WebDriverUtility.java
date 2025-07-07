package com.utilityPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverUtility
{
	//Declared the global variable to access from any where of the class
	public ThreadLocal<WebDriver>tlDriver = new ThreadLocal<WebDriver>();
	
	//The Custom method to open the desired browser
	public WebDriver openBrowser(String browser)
	{
		if (browser.equalsIgnoreCase("chrome"))
		{
			tlDriver.set( new ChromeDriver());
		}
		else if (browser.equalsIgnoreCase("firefox"))
		{
			tlDriver.set(new FirefoxDriver());
		}
		else if (browser.equalsIgnoreCase("edge"))
		{
			tlDriver.set(new EdgeDriver());
		}
		
		return getDriver();
	}
	
	//The Custom method to maximize the browser
	public void maximizeWindow()
	{
		getDriver().manage().window().maximize();
	}
	
	//The Custom method to minimize the browser
	public void minizeWindow()
	{
		getDriver().manage().window().minimize();
	}
	
	//Custom method to open the URL
	public void openUrl(String url)
	{
		getDriver().get(url);
	}
	
	//Custom method to provide the implicitWait
	public void setWaitingTime(long num)
	{
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(num));
	}
	
	//Custom method to close the window
	public void closeWindow()
	{
		getDriver().close();
	}
	
	//Custom method to go back to old page
	public void goBack()
	{
		getDriver().navigate().back();
	}
	
	//Custom method to refresh the Page
	public void refreshPage()
	{
		getDriver().navigate().refresh();
	}
	
	public WebDriver getDriver()
	{
		return tlDriver.get();
	}
}
