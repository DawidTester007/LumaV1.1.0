package testCases;


import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.ProductPage;

public class TC_059_ValidationOfTheAddToCartButton_HSeller extends BaseTest{
	@Test(groups ={"functional","regression","master"})
	public void ValidationOfTheAddToCartButton_HSeller()  {
		try {
		logger.info("**** Starting TC_059_ValidationOfTheAddToCartButton_HSeller ****");
		MainPage Mp = new MainPage(driver);
		
		String NameOfProduct = Mp.List_NameProductOf_HSeller().get(0).getText();
		
		WebElement button = Mp.List_BtnCartProductOf_HSeller().get(0);
		
		js.executeScript("arguments[0].click()", button);
		logger.info("**** Clicked a button 'Add to cart' **** ");
		
		ProductPage Pp = new ProductPage(driver);
		if(Pp.get_NameOfProduct().equalsIgnoreCase(NameOfProduct)) {
			
			logger.info("**** Product has been correctly displayed****");
			logger.info("**** TC_059_ValidationOfTheAddToCartButton_HSeller finished positive****");
			Assert.assertTrue(true);
		}else {
			logger.error("**** Product has not been correctly displayed****");
			logger.info("**** TC_059_ValidationOfTheAddToCartButton_HSeller finished negative****");
			Assert.fail("**** Product has not been correctly displayed****");
			
		}

		
	}catch(Exception e) {
		
		logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
		Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
	
		}

	}
	
}