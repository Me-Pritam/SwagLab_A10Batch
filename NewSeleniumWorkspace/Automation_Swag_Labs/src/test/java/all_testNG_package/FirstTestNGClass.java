package all_testNG_package;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTestNGClass
{
	@Test
	public void demoMethod()
	{
		Reporter.log("The Test method",true);
	}
}
