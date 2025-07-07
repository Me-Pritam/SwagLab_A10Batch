package com.AllTestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class UsingHardAssertion 
{
	@Test
	public void checkUrl()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		try {
			
			driver.get("https://www.saucedemo.com/v1/");
			
			Assert.assertNotEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/v1/", "The loaded URL is different");
			Reporter.log("The Urls are Same",true);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
