package all_testNG_package;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import baseClassPackage.ParallelMethodExecutionBaseClass;
import org.testng.asserts.SoftAssert;

public class ParallelMethodExecution extends ParallelMethodExecutionBaseClass
{
	@Test
	public void AadBagToCart()
	{
		SoftAssert sAssert = new SoftAssert();


		sAssert.assertEquals(driver.getCurrentUrl(),
							"https://www.saucedemo.com/inventory.html",
							"The Iventory Page is not opening!!!!!");
		
		Reporter.log("The Inventary Page is dispayed",true);
		
		action.click_On_Element(inventory.getAddBagToCartButton());

		sAssert.assertAll();
	}
	
	@Test
	
	public void add_tShirt_To_cart()
	{
		SoftAssert sAssert = new SoftAssert();

		sAssert.assertEquals(driver.getCurrentUrl(),
				"https://www.saucedemo.com/inventory.html",
				"The Iventory Page is not opening!!!!!");
		
		action.click_On_Element(inventory.gettShirtAddToCartButton());

		sAssert.assertAll();
	}



}
