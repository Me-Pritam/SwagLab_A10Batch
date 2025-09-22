package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LogInPagePOM 
{
	@FindAll({@FindBy(xpath = "//input[@placeholder='Username']"),@FindBy(xpath = "//input[@name='user-name']")})
	private WebElement userNameField;
	
	@FindBys({@FindBy(xpath = "//input[@placeholder='Password']"),@FindBy(xpath = "//input[@name='password']")})
	private WebElement passwordField;
	
	@FindBy(css = "input[id='login-button']")
	private WebElement logInButton;
	
	
	public LogInPagePOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	public WebElement getUserNameField() {
		return userNameField;
	}


	public WebElement getPasswordField() {
		return passwordField;
	}


	public WebElement getLogInButton() {
		return logInButton;
	}
	
	
}
