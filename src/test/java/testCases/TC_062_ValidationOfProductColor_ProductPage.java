package testCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.ProductPage;

public class TC_062_ValidationOfProductColor_ProductPage extends BaseTest{
	@Test(groups ={"functional","regression","master"})
	public void ValidationOfProductColor_ProductPage()  {
		try {
		logger.info("**** Starting WalidacjaCenyProduktu ****");
		MainPage Mp = new MainPage(driver);
		
		WebElement addCart = Mp.List_BtnCartProductOf_HSeller().get(0);
		js.executeScript("arguments[0].click();", addCart);
		logger.info("**** Clicked a button 'Add to cart'****");
		ProductPage Pp = new ProductPage(driver);
	
		for(WebElement size : Pp.List_colorsOfProducts()){
			
			size.click();
			logger.info("**** Clicked a product color : "+size.getAttribute("data-option-label")+" ****");
			
			if(size.getAttribute("class").contains("selected")) {
				
				logger.info("**** The color was selected correctly ****");
				
			}else {
				logger.error("**** The color was selected incorrectly ****");
				logger.info("**** TC_062_ValidationOfProductColor_ProductPage finished negative ****");
				Assert.fail("**** The color was selected incorrectly ****");
			}
			
		}
		logger.info("**** Each Product color has been selected correctly ****");
		logger.info("**** TC_062_ValidationOfProductColor_ProductPage finished positive ****");
		Assert.assertTrue(true);
	

		
	}catch(Exception e) {
		
		logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
		Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
	
		}

	}
	
}