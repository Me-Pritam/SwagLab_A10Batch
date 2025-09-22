package baseClassPackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import pomPackage.InventoryPagePOM;
import pomPackage.LogInPagePOM;
import utilityPackage.ActionsClassUtility;
import utilityPackage.PropertyFileUtility;
import utilityPackage.WebDriverUtility;

public class ParallelMethodExecutionBaseClass 
{
	public String browser;
	public String password;
	public String url;
	public String user;
	public String firstName;
	public String lastName;
	public String postalCode;

	public WebDriver driver;

	public ActionsClassUtility action;
	public WebDriverUtility wdu;

	public LogInPagePOM login;
	public InventoryPagePOM inventory;

	//	public CartPagePOM cart;
	//	public CheckOutStepOnePagePOM checkoutpageOne;
	//	public CheckOutStepTwoPagePOM checkoutpageTwo;
	//	public CheckOutCompletePagePOM checkoutpageComplete;

	@BeforeTest
	public void leadData()
	{
		PropertyFileUtility pfu = new PropertyFileUtility();

		browser = pfu.giveData("browser");
		url = pfu.giveData("url");
		user = pfu.giveData("user");
		password = pfu.giveData("password");

		wdu = new WebDriverUtility();

	}

	@BeforeMethod
	public void openBrowserAndDoLogIn()
	{


		wdu.openBrowser(browser);

		//wdu.maxmizeBrowser();

		wdu.openUrl(url);

		wdu.setWaitTime(15);

		driver = wdu.getDriver();

		login = new LogInPagePOM(driver);

		inventory = new InventoryPagePOM(driver);

		action = new ActionsClassUtility(driver);

		action.write_In_InputField(user,login.getUserNameField());

		action.write_In_InputField(password,login.getPasswordField());

		action.click_On_Element(login.getLogInButton());
	}

//	@AfterMethod()
//	public void quitBrowser()
//	{
//		wdu.closePage();
//	}


}
