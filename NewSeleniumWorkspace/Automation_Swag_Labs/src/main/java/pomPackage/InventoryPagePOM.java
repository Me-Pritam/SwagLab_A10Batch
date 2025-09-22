package pomPackage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class InventoryPagePOM
{
	@FindAll({@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']"),
			  @FindBy(xpath = "//button[@name='add-to-cart-sauce-labs-backpack']")})
	private WebElement addBagToCartButton;
	
	@FindAll({@FindBy(xpath = "(//div[@class='inventory_item_description']/descendant::button)[1]")})
	private WebElement removeButton;
	
	@FindAll({@FindBy(xpath = "//div[@id='shopping_cart_container']")
	         ,@FindBy(xpath = "//div[contains(@class,'shopping_cart_container')]")})
	private WebElement cartButton;
	
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
	private WebElement tShirtAddToCartButton;
	
	@FindBy(xpath = "//div[@class='inventory_item']")
	private List<WebElement>allProducts;
	
	@FindBy(xpath = "//div[@class='inventory_item_price']")
	private List<WebElement>allPrices;
	     
	@FindBy(xpath = "//span[@class='shopping_cart_badge']")
	private WebElement productNumberBadge;
	
	@FindBy(xpath = "//select[@class='product_sort_container']")
	private WebElement filterDropDown;

	public InventoryPagePOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddBagToCartButton() {
		return addBagToCartButton;
	}

	public WebElement getCartButton() {
		return cartButton;
	}
	
	public List<WebElement> getAllProducts() {
		return allProducts;
	}

	public WebElement getProductNumberBadge() {
		return productNumberBadge;
	}

	public WebElement getRemoveButton() {
		return removeButton;
	}
	
	@FindBy(xpath = "//select[@class='product_sort_container']")
	private WebElement priceDropDown;

	public List<WebElement> getAllPrices() {
		return allPrices;
	}
	
	
	public WebElement gettShirtAddToCartButton() {
		return tShirtAddToCartButton;
	}

	public void sortHighToLow()
	{
		Select select = new Select(priceDropDown);
		
		select.selectByVisibleText("Price (high to low)");
	}
	
	
	
}
