package utilityPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassUtility 
{
	public Actions action;
	
	public ActionsClassUtility(WebDriver driver)
	{
		action = new Actions(driver);
	}
	
	public void write_In_InputField(String data, WebElement element)
	{
		action.sendKeys(element,data).perform();
	}
	
	public void click_On_Element(WebElement element)
	{
		action.click(element).perform();
	}
	
	public void scroll_To_The_Element(WebElement element)
	{
		action.scrollToElement(element).perform();
	}
}
