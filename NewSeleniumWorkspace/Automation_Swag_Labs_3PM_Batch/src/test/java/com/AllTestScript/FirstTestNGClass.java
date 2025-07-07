package com.AllTestScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTestNGClass 
{
	@Test
	public void demo()
	{
		Reporter.log("Hello TestNG",true);
	}
}
