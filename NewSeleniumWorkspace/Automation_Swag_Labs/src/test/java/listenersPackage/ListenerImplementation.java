package listenersPackage;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.compress.utils.FileNameUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import baseClassPackage.EndToEndBaseClass;
import utilityPackage.WebDriverUtility;

public class ListenerImplementation implements ITestListener 
{

	@Override
	public void onTestStart(ITestResult result) 
	{
		Reporter.log("The Test case ~ "+result.getMethod().getMethodName()+" is started execution");
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("The Test Case ~ "+result.getMethod().getMethodName()+" is sucessful");
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy__HH-mm-ss");
		String formattedDate = date.format(format);
		
		Object testObj = result.getInstance();
		WebDriver driver = ((EndToEndBaseClass)testObj).wdu.getDriver();
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		
		File tempFile = screenshot.getScreenshotAs(OutputType.FILE);
		
		File srcFile = new File("./ScreenshotFolder/"+formattedDate+"_"+result.getMethod().getMethodName()+".png");
		
		
		try {
			FileUtils.copyFile(tempFile, srcFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result)
	{
		Reporter.log("Then Test case ~ "+result.getMethod().getMethodName()+" is Skipped");
	}

	@Override
	public void onStart(ITestContext context) {
		
		Reporter.log("The TestExecution is started ~ "+context.getName());
		
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		Reporter.log("The TestExecxution is finished");
	}
	
}
