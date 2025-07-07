package com.AllTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ExecutingTest 
{
	@Test
	public void logIn()
	{
		Reporter.log("LogIn Sucessfully",true);
	}
	
	@Test(dependsOnMethods = "logIn")
	public void  friendRequest()
	{
		Reporter.log("FriendRequest is sent sucessfully",true);
	}
	
	@Test(dependsOnMethods = "friendRequest")
	public void notification()
	{
		Reporter.log("Notification page is opened",true);
	}
}
