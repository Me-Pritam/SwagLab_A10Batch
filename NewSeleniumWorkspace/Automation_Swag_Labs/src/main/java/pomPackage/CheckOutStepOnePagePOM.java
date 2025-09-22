package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutStepOnePagePOM 
{
	@FindAll({@FindBy(xpath = "//input[@id='first-name']"),
		      @FindBy(xpath = "//input[@name='firstName']")})
	private WebElement firstNameField;
	
	@FindAll({@FindBy(xpath = "//input[@id='last-name']"),
		      @FindBy(xpath = "//input[@name='lastName']")})
	private WebElement lastnameField;
	
	@FindAll({@FindBy(xpath = "//input[@id='postal-code']"),
		      @FindBy(xpath = "//input[@name='postalCode']")})
	private WebElement postalCodeField;
	
	@FindAll({@FindBy(xpath = "//input[@id='continue']"),
		      @FindBy(xpath = "//input[@name='continue']")})
	private WebElement continueButton;
	
	public CheckOutStepOnePagePOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstNameField() {
		return firstNameField;
	}

	public WebElement getLastnameField() {
		return lastnameField;
	}

	public WebElement getPostalCodeField() {
		return postalCodeField;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}
	
	
	
}
