package dataProvider;

import org.testng.annotations.DataProvider;

public class DataSet 
{
	@DataProvider(name = "logInData")
	public Object[][] getData()
	{
		Object[][] arr = new Object[3][2];
		
		arr[0][0]= "standard_user";
		arr[0][1]= "secret_sauce";
		
		arr[1][0]= "locked_out_user";
		arr[1][1]= "secret_sauce";
		
		arr[2][0]= "problem_user";
		arr[2][1]= "secret_sauce";
		return arr;
	}
}
