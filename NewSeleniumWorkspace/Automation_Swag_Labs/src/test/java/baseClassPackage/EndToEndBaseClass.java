package baseClassPackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import pomPackage.CartPagePOM;
import pomPackage.CheckOutCompletePagePOM;
import pomPackage.CheckOutStepOnePagePOM;
import pomPackage.CheckOutStepTwoPagePOM;
import pomPackage.InventoryPagePOM;
import pomPackage.LogInPagePOM;
import utilityPackage.ActionsClassUtility;
import utilityPackage.PropertyFileUtility;
import utilityPackage.WebDriverUtility;

public abstract class EndToEndBaseClass
{
	public String browser;
	public String password;
	public String url;
	public String user;
	public String firstName;
	public String lastName;
	public String postalCode;
	
	//public ThreadLocal<WebDriver> tdriver= new ThreadLocal<>();
	
	public ActionsClassUtility action;
	public WebDriverUtility wdu;
	
	public LogInPagePOM login;
	public InventoryPagePOM inventory;
	public CartPagePOM cart;
	public CheckOutStepOnePagePOM checkoutpageOne;
	public CheckOutStepTwoPagePOM checkoutpageTwo;
	public CheckOutCompletePagePOM checkoutpageComplete;





	@BeforeSuite
	public void loadData() throws Exception
	{
		PropertyFileUtility pfu = new PropertyFileUtility();
		
		browser = pfu.giveData("browser");
		url = pfu.giveData("url");
		user = pfu.giveData("user");
		password = pfu.giveData("password");
		firstName = pfu.giveData("firstName");
		lastName = pfu.giveData("lastName");
		postalCode = pfu.giveData("postalCode");
		
	}
	
//	@BeforeTest
//	public void openBrowser()
//	{
//		wdu = new WebDriverUtility();
//		wdu.openBrowser(browser);
//		wdu.maxmizeBrowser();
//		wdu.openUrl(url);
//		wdu.setWaitTime(15);
//		driver = wdu.getDriver();
//
//		login = new LogInPagePOM(driver);
//		inventory = new InventoryPagePOM(driver);
//		cart = new CartPagePOM(driver);
//		checkoutpageOne = new CheckOutStepOnePagePOM(driver);
//		checkoutpageTwo = new CheckOutStepTwoPagePOM(driver);
//		checkoutpageComplete = new CheckOutCompletePagePOM(driver);
//
//	}
	
	@BeforeClass
	public void openBrowserAndDoLogIn() throws Exception
	{

		wdu = new WebDriverUtility();
		wdu.openBrowser(browser);
		wdu.maxmizeBrowser();
		wdu.openUrl(url);
		wdu.setWaitTime(15);
		//tdriver.set(wdu.getDriver());

		login = new LogInPagePOM(wdu.getDriver());
		inventory = new InventoryPagePOM(wdu.getDriver());
		cart = new CartPagePOM(wdu.getDriver());
		checkoutpageOne = new CheckOutStepOnePagePOM(wdu.getDriver());
		checkoutpageTwo = new CheckOutStepTwoPagePOM(wdu.getDriver());
		checkoutpageComplete = new CheckOutCompletePagePOM(wdu.getDriver());

		
		action = new ActionsClassUtility(wdu.getDriver());
		
		action.write_In_InputField(user, login.getUserNameField());
		action.write_In_InputField(password, login.getPasswordField());
		action.click_On_Element(login.getLogInButton());
	}
	
//	@AfterClass
//	public void closeBrowser() throws Exception
//	{
//		wdu.closePage();
//	}
	
}
