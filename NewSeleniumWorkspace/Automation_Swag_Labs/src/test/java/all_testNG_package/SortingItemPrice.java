package all_testNG_package;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import baseClassPackage.EndToEndBaseClass;

public class SortingItemPrice extends EndToEndBaseClass 
{
	@Test
	public void checkVisibilityOfPrices() throws Exception
	{
		for (WebElement element : inventory.getAllPrices())
		{
			Assert.assertTrue(element.isDisplayed(),"The price is not displayed");
			Reporter.log("The price is displayed");
		}
	}
	
	@Test(dependsOnMethods = "checkVisibilityOfPrices")
	public void sortFromHighToLow() throws Exception
	{
		inventory.sortHighToLow();
		
		List<WebElement> allsortedPriceBox = wdu.getDriver().findElements(By.xpath("//div[@class='inventory_item_price']"));
		
		List<Double>prices = new ArrayList<Double>();
		
		for(int i=0 ; i<allsortedPriceBox.size() ; i++)
		{
			prices.add(Double.parseDouble(allsortedPriceBox.get(i).getText().replace("$","")));
		}
		
		List<Double> copiedPriceList = new ArrayList<Double>(prices);
		
		copiedPriceList.sort(Collections.reverseOrder());
		
		System.out.print(prices);
		System.out.print(copiedPriceList);
		
		Assert.assertEquals(prices, copiedPriceList,"The price is not in higher to lower");
		
		Reporter.log("The Price is sorted in Higher to Lower");
	}
	
	
}
