package baseClassPackage;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SampleBaseClass 
{
	@BeforeSuite
	public void beforeSuite()
	{
		Reporter.log("This is the BeforeSuite",true);
	}
	
	@BeforeTest
	public void beforeTest()
	{
		Reporter.log("This is the BeforeTest",true);
	}
	
	@BeforeClass
	public void beforeClass()
	{
		Reporter.log("This is the BeforeClass",true);
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		Reporter.log("This is the BeforeMethod",true);
	}
	
	@AfterSuite
	public void afterSuite()
	{
		Reporter.log("This is the AfterSuite",true);
	}
	
	@AfterTest
	public void afterTest()
	{
		Reporter.log("This is the AfterTest",true);
	}
	
	@AfterMethod
	public void afterMethod()
	{
		Reporter.log("This is the AfterMethod",true);
	}
	
	@AfterClass
	public void afterClass()
	{
		Reporter.log("This is the AfterClass",true);
	}
}
