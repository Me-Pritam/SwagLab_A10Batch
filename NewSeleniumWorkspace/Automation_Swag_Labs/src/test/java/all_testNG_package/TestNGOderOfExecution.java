package all_testNG_package;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGOderOfExecution 
{	
	@Test
	public void logIn()
	{
		Reporter.log("LogIn is sucessful",true);
	}
	
	@Test(dependsOnMethods = "logIn",priority = -1)
	public void friendRequest()
	{
		Reporter.log("FriendRequest is sent",true);
	}
	
	@Test(dependsOnMethods = {"logIn","friendRequest"})
	public void notification()
	{
		Reporter.log("Notification is received",true);
	}	
}
