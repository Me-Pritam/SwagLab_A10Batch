package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutStepTwoPagePOM 
{
	@FindAll({@FindBy(xpath = "//button[@id='finish']"),
		      @FindBy(xpath = "//button[@name='finish']")})
	private WebElement finishButton;
	
	public CheckOutStepTwoPagePOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getFinishButton() {
		return finishButton;
	}
	
	
}
