package ddtPackage;

import org.openqa.selenium.WebDriver;

import pomPackage.LogInPagePOM;
import utilityPackage.PropertyFileUtility;
import utilityPackage.WebDriverUtility;

public class ReadingDataFromPropertyFile {

	public static String browser;
	public static String url;
	public static String user;
	public static String password;	
	
	public static WebDriver driver;
	
	public static void main(String[] args) 
	{
		try {		
			
			PropertyFileUtility property = new PropertyFileUtility();
			
			browser= property.giveData("browser");
			url= property.giveData("url");
			user= property.giveData("user");
			password= property.giveData("password");
			
			
			WebDriverUtility web = new WebDriverUtility();
			
			web.openBrowser(browser);
			web.maxmizeBrowser();
			web.openUrl(url);
			web.setWaitTime(15);
			
			driver = web.getDriver();				
			
			LogInPagePOM login = new LogInPagePOM(driver);
			
			login.getUserNameField().sendKeys(user);
			login.getPasswordField().sendKeys(password);
			login.getLogInButton().click();
			
			
			
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
