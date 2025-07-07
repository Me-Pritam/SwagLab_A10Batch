package com.AllTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ParallelClass2 
{
	@Test
	public void addBikeLightToCart()
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().setSize(new Dimension(700,600));
		driver.manage().window().setPosition(new Point(750, 50));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		try 
		{
			driver.get("https://www.saucedemo.com/v1/");
			
			driver.findElement(By.xpath("//input[@id='user-name']"))
			      .sendKeys("standard_user");
			
			driver.findElement(By.xpath("//input[@id='password']"))
			      .sendKeys("secret_sauce");
			
			driver.findElement(By.xpath("//input[@id='login-button']"))
			 	  .click();
			
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='app_logo']")));
			
			
			driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']/ancestor::div[@class='inventory_item']/descendant::button[text()='ADD TO CART']"))
			      .click();
			
			driver.findElement(By.xpath("//*[name()='svg' and @data-icon='shopping-cart']"))
			      .click();
			
			driver.findElement(By.xpath("//a[text()='CHECKOUT']")).click();
			
			driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("DemoFirstName");
			
			driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("DemoLastName");
			
			driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("500060");
			
			driver.findElement(By.xpath("//input[@value='CONTINUE']")).click();
			
			driver.findElement(By.xpath("//a[text()='FINISH']")).click();
			
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
