package all_testNG_package;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import dataProvider.DataSet;
import pomPackage.LogInPagePOM;
import utilityPackage.ActionsClassUtility;

public class UsingInvocationCount
{
	public WebDriver driver;
	
	@Test(dataProvider = "logInData",dataProviderClass = DataSet.class)
	public void openBrowser(String user, String password)
	{
		ChromeOptions chromeOptions = new ChromeOptions();
//	    Map<String, Object> prefs = new HashMap<>();
//
//	    // Disable password manager
//	    prefs.put("credentials_enable_service", false);
//	    prefs.put("profile.password_manager_enabled", false);
//
//	    chromeOptions.setExperimentalOption("prefs", prefs);
//
//	    // Disable password save & safety check popups
//	    chromeOptions.addArguments("--disable-save-password-bubble");
//	    chromeOptions.addArguments("--disable-features=PasswordManager,EnablePasswordsAccountStorage,AutofillServerCommunication,SafeBrowsingEnhancedProtection");
//
//	    // Optional: run with fresh profile (prevents old saved logins from triggering)
	    chromeOptions.addArguments("--guest");

	    driver = new ChromeDriver(chromeOptions); 
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.saucedemo.com/");
		
		LogInPagePOM login = new LogInPagePOM(driver);
		
		ActionsClassUtility action = new ActionsClassUtility(driver);
		
		action.write_In_InputField(user,login.getUserNameField());
		action.write_In_InputField(password,login.getPasswordField());
		action.click_On_Element(login.getLogInButton());
		
				
	}
}
