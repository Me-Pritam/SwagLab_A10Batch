package utilityPackage;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverUtility 
{
	public ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>();

	
	public void openBrowser(String browser)
	{
		switch (browser.toLowerCase())
		{
		case "chrome":
			ChromeOptions chromeOptions = new ChromeOptions();
		    Map<String, Object> prefs = new HashMap<>();
	
		    // Disable password manager
		    prefs.put("credentials_enable_service", false);
		    prefs.put("profile.password_manager_enabled", false);
	
		    chromeOptions.setExperimentalOption("prefs", prefs);
	
		    // Disable password save & safety check pop ups
		    chromeOptions.addArguments("--disable-save-password-bubble");
		    chromeOptions.addArguments("--disable-features=PasswordManager,EnablePasswordsAccountStorage,AutofillServerCommunication,SafeBrowsingEnhancedProtection");
	
		    // Optional: run with fresh profile (prevents old saved logins from triggering)
		    chromeOptions.addArguments("--guest");
			//chromeOptions.addArguments("--headless");

		    
			tlDriver.set(new ChromeDriver(chromeOptions));
			break;
		case "firefox":
			tlDriver.set(new FirefoxDriver());
			break;
		case "edge":
			tlDriver.set(new EdgeDriver());			
			break;
		default:
			throw new InvalidArgumentException("Wrong browser name has been passed.");
			
		}
	}
	
	public WebDriver getDriver()
	{
		return tlDriver.get();
	}
	
	public void maxmizeBrowser()
	{
		getDriver().manage().window().maximize();
	}
	
	public void openUrl(String url)
	{
		getDriver().get(url);
	}
	
	public void setWaitTime(int num)
	{
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(num));
	}
	
	public void closePage()
	{
		getDriver().close();
	}
}
