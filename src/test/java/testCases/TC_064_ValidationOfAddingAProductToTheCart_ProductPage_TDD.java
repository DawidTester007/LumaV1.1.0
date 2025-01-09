package testCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.ProductPage;
import utilities.DataProv;

public class TC_064_ValidationOfAddingAProductToTheCart_ProductPage_TDD extends BaseTest{
	@Test(groups ={"dataDriver","master"}, dataProvider = "AmountToCart" , dataProviderClass = DataProv.class)
	public void ValidationOfAddingAProductToTheCart_ProductPage_TDD(String amount , String res)  {
		try {
		logger.info("**** Starting TC_064_ValidationOfAddingAProductToTheCart_ProductPage_TDD ****");
		MainPage Mp = new MainPage(driver);
		WebElement addCart = Mp.List_BtnCartProductOf_HSeller().get(0);
		js.executeScript("arguments[0].click();", addCart);
		logger.info("****Clicked a button 'Add to cart'****");
		ProductPage Pp = new ProductPage(driver);
		
		js.executeScript("arguments[0].click();", Pp.List_sizesOfProduct().get(0));
		logger.info("**** Clicked a product size : " + Pp.List_sizesOfProduct().get(0).getText()+ " ****");
		
		js.executeScript("arguments[0].click();", Pp.List_colorsOfProducts().get(0));
		logger.info("****Clicked a product color : " + Pp.List_colorsOfProducts().get(0).getAttribute("aria-label")+" ****");
		Pp.clear_AmountOfProduct();
		logger.info("**** The field 'amount' has been cleared ****");
		if(amount.contains(".")) {
			Pp.set_AmountOfProduct(amount.substring(0, amount.indexOf(".")));
		}else {
			
			Pp.set_AmountOfProduct(amount);
		}
		logger.info("**** Quantity of product has been set up ****");
		Pp.click_btn_addCart();
		logger.info("**** Clicked a button 'Add to cart' ****");
		
	
		
		if(res.equalsIgnoreCase("Valid")) {
			
			if(Pp.get_WebElement_AddedCorrectly().isDisplayed()==true) {
				logger.info("**** The communicate of adding product has been displayed **** ");
				logger.info("**** TC_064_ValidationOfAddingAProductToTheCart_ProductPage_TDD finished positive");
				Assert.assertTrue(true);
				
			}else {
				logger.error("**** The communicate of adding product has not been displayed  **** ");
				logger.info("**** TC_064_ValidationOfAddingAProductToTheCart_ProductPage_TDD finished negative");
				
				Assert.fail("**** The communicate of adding product has not been displayed  **** ");
				
			}
		}else if(res.equalsIgnoreCase("Invalid")) {
			
			if(Pp.msg_InavlidAmount().isDisplayed()==true) {
				
				logger.info("**** The communicate of adding product has been displayed **** ");
				logger.info("**** TC_064_ValidationOfAddingAProductToTheCart_ProductPage_TDD finished positive");
				Assert.assertTrue(true);
				
			}else {
				logger.error("**** The communicate of adding product has not been displayed  **** ");
				logger.info("**** TC_064_ValidationOfAddingAProductToTheCart_ProductPage_TDD finished negative");
				
				Assert.fail("**** The communicate of adding product has not been displayed  **** ");
				
				
			}
			
		}
		
		

		
	}catch(Exception e) {
		
		logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
		Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
	
		}

	}
	
}