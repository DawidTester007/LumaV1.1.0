package testCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.ProductPage;

public class TC_061_ValidationOfProductSize_ProductPage extends BaseTest{
	@Test(groups ={"functional","regression","master"})
	public void ValidationOfProductSize_ProductPage()  {
		try {
		logger.info("**** Starting WalidacjaCenyProduktu ****");
		MainPage Mp = new MainPage(driver);
		
		WebElement addCart = Mp.List_BtnCartProductOf_HSeller().get(0);
		js.executeScript("arguments[0].click();", addCart);
		logger.info("**** Clicked a button 'Add to cart'****");
		ProductPage Pp = new ProductPage(driver);
	
		for(WebElement size : Pp.List_sizesOfProduct()){
			
			size.click();
			logger.info("**** Clicked a product size : "+size.getText()+" ****");
			
			if(size.getAttribute("class").contains("selected")) {
				
				logger.info("**** The size has been correctly selected ****");
				
			}else {
				logger.info("**** The size has not been correctly selected ****");
				logger.error("**** TC_061_ValidationOfProductSize_ProductPage finished negative ****");
				Assert.fail("**** The size has not been correctly selected ****");
			}
			
		}
		logger.info("**** Each of products size has been selected correctly ****");
		logger.info("**** TC_061_ValidationOfProductSize_ProductPage finished positive ****");
		Assert.assertTrue(true);
	

		
	}catch(Exception e) {
		
		logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
		Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
	
		}

	}
	
}