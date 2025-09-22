package all_testNG_package;

import org.testng.Reporter;
import org.testng.annotations.Test;

import baseClassPackage.DummyBaseClass;

public class DummyClass2 extends DummyBaseClass
{
	@Test
	public void testMethod1()
	{
		Reporter.log("This is the Test Case or Test Method 1 in Class2",true);
	}
}
