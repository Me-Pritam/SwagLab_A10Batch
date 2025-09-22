package all_testNG_package;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupExecutionClass2 
{
	@Test(groups = "demoGroup")
	public void a1()
	{
		Reporter.log("This is A1 Method from class 2",true);
	}
	
	@Test(groups = "demoGroup")
	public void a2()
	{
		Reporter.log("This is A2 Method from class 2",true);
	}
	
	@Test(groups = "dummyGroup")
	public void a3()
	{
		Reporter.log("This is A3 Method from class 2",true);
	}
}
