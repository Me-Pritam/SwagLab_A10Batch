package all_testNG_package;

import org.testng.Reporter;
import org.testng.annotations.Test;

import baseClassPackage.DummyBaseClass;

public class DummyClass1 extends DummyBaseClass
{
	@Test
	public void testMethod1()
	{
		Reporter.log("This is the Test Case or Test Method 1",true);
	}
	
	@Test
	public void testMethod2()
	{
		Reporter.log("This is the Test Case or Test Method 2",true);
	}
	
	@Test
	public void testMethod3()
	{
		Reporter.log("This is the Test Case or Test Method 3",true);
	}
}
