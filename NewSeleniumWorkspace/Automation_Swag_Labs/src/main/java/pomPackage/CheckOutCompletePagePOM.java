package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutCompletePagePOM
{
	@FindAll({@FindBy(xpath = "//h2[@class='complete-header']"),
		      @FindBy(xpath = "//h2[@data-test='complete-header']")})
	private WebElement confirmationMessageBox;
	
	@FindAll({@FindBy(xpath = "//button[@id='back-to-products']"),
		      @FindBy(xpath = "//button[@name='back-to-products']")})
	private WebElement homeButton;
	
	public CheckOutCompletePagePOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getConfirmationMessageBox() {
		return confirmationMessageBox;
	}

	public WebElement getHomeButton() {
		return homeButton;
	}
	
	
}
