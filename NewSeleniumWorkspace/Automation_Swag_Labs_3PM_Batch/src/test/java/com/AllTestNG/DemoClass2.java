package com.AllTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoClass2 
{
	@Test
	public void m4()
	{
		Reporter.log("this m4 method from Class 2",true);
	}
	
	@Test(groups = "Integration")
	public void m5()
	{
		Reporter.log("this m5 method from Class 2",true);
		
	}
	
	@Test(dependsOnMethods = "m5")
	public void m6()
	{
		Reporter.log("this m6 method from Class 2",true);
		
	}
}
