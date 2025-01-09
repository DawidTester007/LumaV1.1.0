package testCases;


import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.ProductPage;

public class TC_060_ValidationOfProductPricesDisplay_ProductPage extends BaseTest{
	@Test(groups ={"functional","regression","master"})
	public void ValidationOfProductPricesDisplay_ProductPage()  {
		try {
		logger.info("**** Starting TC_060_ValidationOfProductPricesDisplay_ProductPage ****");
		MainPage Mp = new MainPage(driver);
		WebElement addCart = Mp.List_BtnCartProductOf_HSeller().get(0);
		js.executeScript("arguments[0].click();", addCart);
		logger.info("**** Clicked a button 'add to cart'****");
		ProductPage Pp = new ProductPage(driver);
		Thread.sleep(500);
		Boolean productPrice = Pp.check_Price_Product();
		if(productPrice==true) {
		
			logger.info("**** Price has been correctly displayed ****");
			logger.info("**** TC_060_ValidationOfProductPricesDisplay_ProductPage finished positive****");
			Assert.assertTrue(true);
			
		}else {
			logger.error("**** Price has not been correctly displayed ****");
			logger.info("**** TC_060_ValidationOfProductPricesDisplay_ProductPage finished negative ****");
			Assert.fail("**** Price has not been correctly displayed ****");
			
		}

		
	}catch(Exception e) {
		
		logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
		Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
	
		}

	}
	
}