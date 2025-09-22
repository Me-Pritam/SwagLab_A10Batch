package all_testNG_package;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import baseClassPackage.EndToEndBaseClass;

public class Check_Number_Of_Added_Item_Using_SoftAssertion extends EndToEndBaseClass
{
	@Test
	public void check_Visibility_Of_All_Products()
	{
		SoftAssert sAssert = new SoftAssert();

		for (WebElement product : inventory.getAllProducts())
		{
			sAssert.assertTrue(product.isDisplayed(),"The product is not displayed");
			Reporter.log("The Product is displayed",true);
		}

		sAssert.assertAll();
	}

	@Test(dependsOnMethods = "check_Visibility_Of_All_Products")
	public void check_Added_Item_Number()
	{
		SoftAssert sAssert = new SoftAssert();
		action.click_On_Element(inventory.getAddBagToCartButton());

		sAssert.assertEquals(inventory.getRemoveButton().getText(),
				"Remove",
				"The Cart Button Text is NOT Changed");
		Reporter.log("The Cart Button text is Changed to \"Remove\"",true);

		sAssert.assertEquals(inventory.getProductNumberBadge().getText(),
				"1",
				"The Product Number is different");
		Reporter.log("The numberof the item in cart is same as selected",true);

		sAssert.assertAll();
		
		//Assert.fail();
	}


}
