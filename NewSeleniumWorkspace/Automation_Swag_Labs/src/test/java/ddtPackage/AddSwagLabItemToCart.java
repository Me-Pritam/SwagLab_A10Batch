package ddtPackage;

import org.openqa.selenium.WebDriver;

import pomPackage.InventoryPagePOM;
import pomPackage.LogInPagePOM;
import utilityPackage.ActionsClassUtility;
import utilityPackage.PropertyFileUtility;
import utilityPackage.WebDriverUtility;

public class AddSwagLabItemToCart 
{
	public static String browser;
	public static String url;
	public static String user;
	public static String password;
	
	public static WebDriver driver;
	
	public static void main(String[] args)
	{
		PropertyFileUtility pfu = new PropertyFileUtility();
		
		browser = pfu.giveData("browser");
		url =pfu.giveData("url");
		user = pfu.giveData("user");
		password = pfu.giveData("password");

		WebDriverUtility wdu = new WebDriverUtility();
		
		wdu.openBrowser(browser);
		wdu.openUrl(url);
		wdu.maxmizeBrowser();
		wdu.setWaitTime(15);
		
		driver = wdu.getDriver();
		
		LogInPagePOM login = new LogInPagePOM(driver);
		ActionsClassUtility acu = new ActionsClassUtility(driver);
		
		acu.write_In_InputField(user, login.getUserNameField());
		acu.write_In_InputField(password, login.getPasswordField());
		acu.click_On_Element(login.getLogInButton());
		
		InventoryPagePOM inventory = new InventoryPagePOM(driver);
		
		acu.click_On_Element(inventory.getAddBagToCartButton());
		acu.click_On_Element(inventory.getCartButton());
	}

}
