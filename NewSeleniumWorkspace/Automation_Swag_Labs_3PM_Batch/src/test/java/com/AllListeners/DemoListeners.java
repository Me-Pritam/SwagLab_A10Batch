package com.AllListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class DemoListeners implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		
		Reporter.log(result.getMethod().getMethodName()+" ~ is started executing",true);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		Reporter.log(result.getMethod().getMethodName()+" ~ is Paased in the execution",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {

		Reporter.log(result.getMethod().getMethodName()+" ~ is Failed in the execution",true);
		result.getThrowable();
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		Reporter.log(result.getMethod().getMethodName()+" ~ is Skipped in the execution",true);
		result.getThrowable();
	}

	@Override
	public void onStart(ITestContext context)
	{
		Reporter.log(context.getName()+" ~ this context is just started execution",true);
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		Reporter.log(context.getName()+" ~ this context is just finished the execution ",true);
	}
	
}
