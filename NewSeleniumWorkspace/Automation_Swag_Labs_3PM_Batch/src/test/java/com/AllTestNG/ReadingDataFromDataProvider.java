package com.AllTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

import dataProviderPackage.QAValoidationFormDataProvider;

public class ReadingDataFromDataProvider 
{	
	@Test(dataProvider = "DataFromExcel",dataProviderClass = QAValoidationFormDataProvider.class)
	public void demoTest(String name,String email,String mobile,String gender,String experience,String skills,String tools,String details)
	{
		Reporter.log(name+" "+ email+" "+mobile+" "+gender+" "+experience+" "+skills+" "+tools+" "+details,true);
		Reporter.log("Execution Done",true);
	}
}
