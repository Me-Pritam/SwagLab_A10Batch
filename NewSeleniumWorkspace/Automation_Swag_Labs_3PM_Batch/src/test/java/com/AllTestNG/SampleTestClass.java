package com.AllTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

import baseClassPackage.SampleBaseClass;

public class SampleTestClass extends SampleBaseClass
{
	 
	public void demotest()
	{
		Reporter.log("It is an Demo Test",true);
	}
}
