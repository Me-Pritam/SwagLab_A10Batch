package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPagePOM 
{
	@FindAll({@FindBy(xpath = "//button[@id='checkout']"),
			  @FindBy(xpath = "//button[@name='checkout']")})
	private WebElement checkOutButton;
	
	public CartPagePOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCheckOutButton() {
		return checkOutButton;
	}
	
	
}
