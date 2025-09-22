package all_testNG_package;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class UsingDemoAssertions 
{
	@Test
	public void m1()
	{
		Assert.assertTrue(true);
		Reporter.log("This testCase is passed");
	}
	
	@Test
	public void m2()
	{
		Assert.assertFalse(true,"This testCase condiiton is failed");
		Reporter.log("This testCase is passed");
		
	}
	
	@Test(dependsOnMethods = "m2")
	public void m3()
	{
		Reporter.log("This is m3 method");
	}
}
