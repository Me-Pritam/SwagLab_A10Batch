package dataProviderPackage;

import org.testng.annotations.DataProvider;

public class SampleDataProvider 
{
	@DataProvider(name = "SampleData")
	public Object[][] getData()
	{
		Object[][] arr = new Object[3][2];
		
		arr[0][0]="Java";
		arr[0][1]="TestNG";
		
		arr[1][0]="Python";
		arr[1][1]="PyTest";
		
		arr[2][0]="JavaScript";
		arr[2][1]="Cypress";
		
		return arr;
	}
}
