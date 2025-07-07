package com.AllTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.AllListeners.DemoListeners;

public class DemoClass1 
{
	@Test(groups = "Integration")
	public void m1()
	{
		Reporter.log("this m1 method from Class 1",true);
	}
	
	@Test(groups = "Integration")
	public void m2()
	{
		Reporter.log("this m2 method from Class 1",true);
		
	}
	
	@Test(dependsOnMethods = "m2")
	public void m3()
	{
		Reporter.log("this m3 method from Class 1",true);
		
	}
}

