package testCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.ProductPage;

public class TC_073_ProductsPriceValidation_ProductPage extends BaseTest {
	@Test(groups={"functional","regression","master"})
	public void ProductsPriceValidation_ProductPage() {
		
		try {
			MainPage Mp = new MainPage(driver);
			logger.info("**** Starting TC_073_ProductsPriceValidation_ProductPage ****");
			Mp.List_ImgProductOf_HSeller().get(0).click();
			logger.info("**** Clicked a product image****");
			ProductPage Pp = new ProductPage(driver);
			
			for(WebElement x: Pp.List_PricesProducts()) {
				
				if(x.isDisplayed()==true) {
					
					logger.info("**** The product price has been displayed ****");
				}else {
					
					logger.error("**** The product price has not been displayed ****");
					logger.info("**** TC_073_ProductsPriceValidation_ProductPage finished negative ****");
					Assert.fail("**** The product price has not been displayed ****");
				}
			}
			logger.info("**** Each of recommend product has price ****");
			logger.info("**** TC_073_ProductsPriceValidation_ProductPage finished positive ****");
			Assert.assertTrue(true);
	}catch(Exception e) {
	
		logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
		Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
	}
	}
}
