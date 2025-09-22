package all_testNG_package;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import baseClassPackage.EndToEndBaseClass;

@Listeners(listenersPackage.ListenerImplementation.class)

public class AddingItem_End_To_End_Using_Hard_Assertions extends EndToEndBaseClass
{
	@Test
	public void addItem()
	{
		 
		Assert.assertEquals(wdu.getDriver().getCurrentUrl(),
				          "https://www.saucedemo.com/inventory.html",
				          "The Inventory Page is not loaded");
		Reporter.log("The Inventory Page is Loaded");
		action.click_On_Element(inventory.getAddBagToCartButton());
	}
	
	@Test(dependsOnMethods = "addItem")
	public void goToCart()
	{
		Assert.assertTrue(inventory.getCartButton().isDisplayed(),"The cart button is not displayed");
		Reporter.log("The cart button is displayed");
		action.click_On_Element(inventory.getCartButton());
	}
	
	@Test(dependsOnMethods = "goToCart")
	public void doCheckout()
	{
		Assert.assertTrue(cart.getCheckOutButton().isDisplayed(),"The checkout button is not displayed");
		Reporter.log("The checkout button is displayed");
		action.click_On_Element(cart.getCheckOutButton());
	}
	
	@Test(dependsOnMethods = "doCheckout")
	public void fillOrderDetails()
	{
		Assert.assertEquals(checkoutpageOne.getFirstNameField().isDisplayed(),true,"The FirstnameField is not displayed");
		Reporter.log("The FirstNameField is displayed",true);
		action.write_In_InputField(firstName,checkoutpageOne.getFirstNameField());
		
		Assert.assertEquals(checkoutpageOne.getLastnameField().isDisplayed(),true,"The LastNameField is not displayed");
		Reporter.log("The LastNameField is displayed",true);
		action.write_In_InputField(lastName,checkoutpageOne.getLastnameField());
		
		Assert.assertEquals(checkoutpageOne.getPostalCodeField().isDisplayed(),true,"The PostalCodeField is not displayed");
		Reporter.log("The PostalCodeField is displayed",true);
		action.write_In_InputField(postalCode, checkoutpageOne.getPostalCodeField());
		
		Assert.assertEquals(checkoutpageOne.getContinueButton().isDisplayed(),true,"The ContinueButton is not displayed");
		Reporter.log("The ContinueButton is displayed",true);
		action.click_On_Element(checkoutpageOne.getContinueButton());
	}
	
	@Test(dependsOnMethods = "fillOrderDetails")
	public void finishOrder()
	{
		Assert.assertEquals(wdu.getDriver().getCurrentUrl(),"https://www.saucedemo.com/checkout-step-two.html","The Cart Page Two is not loaded");
		Reporter.log("The Cart Page Two is Loaded",true);
		
		Assert.assertTrue(checkoutpageTwo.getFinishButton().isDisplayed(),"The Finish Button is not Displayed");
		Reporter.log("The Finish Button is Displayed",true);
		action.click_On_Element(checkoutpageTwo.getFinishButton());
	}
	
	@Test(dependsOnMethods = "finishOrder")
	public void verifyMessage()
	{
		Assert.assertEquals(wdu.getDriver().getCurrentUrl(),
				           "https://www.saucedemo.com/checkout-complete.html",
				           "The Checkout Complete Page is not Loaded");
		Reporter.log("The Checkout Complete Page is Loaded",true);
		
		String message = checkoutpageComplete.getConfirmationMessageBox().getText();
		
//		if (message.equals("Thank you for your order!"))
//		{
//			Reporter.log("The order is sucessful",true);
//		}
//		else {
//			Reporter.log("The order is not done",true);
//		}
		
		Assert.assertEquals(message,
				           "Thank you for your order!",
				           "The Confirmation Message is not matching");
		
		Reporter.log("The Confirmation Message is matched",true);
		
		Assert.assertTrue(checkoutpageComplete.getHomeButton().isDisplayed(),"The Home Button is not Displayed");
		Reporter.log("The Home Button is Displayed",true);
		
		action.click_On_Element(checkoutpageComplete.getHomeButton());
		
		Assert.fail();
	}
	
}
