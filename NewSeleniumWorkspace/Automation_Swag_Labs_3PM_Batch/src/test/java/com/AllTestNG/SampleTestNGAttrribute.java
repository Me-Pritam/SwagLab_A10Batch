package com.AllTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTestNGAttrribute
{
	static WebDriver driver ;
	public final int i =0;
	
	@Test
	public void openBrowser()
	{
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	}
	
	@Test(dependsOnMethods = "openBrowser")
	public void openUrl()
	{
		driver.get("https://www.saucedemo.com/v1/");
	}
	
	@Test(dependsOnMethods = "openUrl",invocationCount = i)
	public void doLogIn() throws Exception
	{
//		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("locked_out_user");
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
//		
//		driver.findElement(By.xpath("//input[@id='login-button']")).click();
//		
//		Thread.sleep(2000);
		
		for(int j =0;j<=5;j++)
		{
			
		}
		
		driver.navigate().refresh();
	}
}
