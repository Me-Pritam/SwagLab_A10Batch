package swagLab_pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LogInPagePOM {
	@FindAll({ @FindBy(xpath = "//input[@id='user-name']"), @FindBy(xpath = "//input[@name='user-name']") })
	private WebElement userNameField;

	@FindAll({ @FindBy(css = "input[data-test='password']"), @FindBy(css = "input[placeholder='Password']") })
	private WebElement passwordField;

	@FindBy(id = "login-button")
	private WebElement logInButton;

	public WebDriver driver;

	// Created a Constructor to load the Driver instance from the TestClass to this
	// POM class
	public LogInPagePOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void restoreElement()
	{
		PageFactory.initElements(driver, this);
	}

	// Getter methods to acess the private web elements

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
