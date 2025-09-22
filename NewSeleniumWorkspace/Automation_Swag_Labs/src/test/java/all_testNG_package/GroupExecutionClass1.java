package all_testNG_package;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupExecutionClass1 
{
	@Test(groups = "demoGroup")
	public void m1()
	{
		Reporter.log("This is M1 Method from class 1",true);
	}
	
	@Test(groups = "dummyGroup")
	public void m2()
	{
		Reporter.log("This is M2 Method from class 1",true);
	}
	
	@Test(groups = {"demoGroup","dummyGroup"})
	public void m3()
	{
		Reporter.log("This is M3 Method from class 1",true);
	}
}
