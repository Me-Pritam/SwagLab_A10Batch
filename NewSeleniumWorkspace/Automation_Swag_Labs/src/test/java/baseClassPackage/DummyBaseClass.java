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

public class DummyBaseClass
{
	@BeforeSuite
	public void beforeSuite()
	{
		Reporter.log("This is the BeforeSuite Method",true);
	}
	
	@BeforeTest
	public void beforeTest()
	{
		Reporter.log("This is the Before Test Method",true);
	}
	
	@BeforeClass
	public void beforeClass()
	{
		Reporter.log("This is the Before Class Method",true);
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		Reporter.log("This is the Before Method",true);
	}
	
	@AfterSuite
	public void afterSuite()
	{
		Reporter.log("This is the AfterSuite Method",true);
	}
	
	@AfterTest
	public void afterTest()
	{
		Reporter.log("This is the After Test Method",true);
	}
	
	@AfterClass
	public void afterClass()
	{
		Reporter.log("This is the After Class Method",true);
	}
	
	@AfterMethod
	public void aftermethod()
	{
		Reporter.log("This is the After Method",true);
	}
}
