package baseClassPackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.utilityPackage.ActionsUtility;
import com.utilityPackage.PropertyFileUtility;
import com.utilityPackage.WebDriverUtility;

import swagLab_pomPackage.LogInPagePOM;

public class LogInBaseClass 
{
	public static String browser;
	public static String url;
	public static String username;
	public static String lockedUser;
	public static String password;
	
	public  WebDriver driver;
	
	public static PropertyFileUtility property;
	public static ActionsUtility action;
	public static WebDriverUtility wdu;
	public static  LogInPagePOM login;
	
	@BeforeTest
	public void loadData()
	{
		property = new PropertyFileUtility();
		browser = property.giveProperty("browser");
		url = property.giveProperty("url");
		username = property.giveProperty("username");
		lockedUser = property.giveProperty("lockedUser");
		password = property.giveProperty("password");
		wdu = new WebDriverUtility();
	}
	
	@BeforeMethod
	public void openBrowserWithUrl()
	{
		
		wdu.openBrowser(browser);
//		wdu.maximizeWindow();
		wdu.setWaitingTime(25);
		wdu.openUrl(url);
		driver = wdu.getDriver();
		action = new ActionsUtility(driver);
		login = new LogInPagePOM(driver);
	}
	
	@AfterMethod
	public void closeBrowser() throws Exception
	{
		Thread.sleep(3000);
		
		wdu.closeWindow();
	}
	
}
