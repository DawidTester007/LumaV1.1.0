package testCases;


import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.ProductPage;

public class TC_060_WalidacjaCenyProduktu_ProductPage extends BaseTest{
	@Test(groups ={"functional","regression","master"})
	public void WalidacjaCenyProduktu_ProductPage()  {
		try {
		logger.info("**** Rozpoczęto TC_060_WalidacjaCenyProduktu_ProductPage ****");
		MainPage Mp = new MainPage(driver);
		WebElement addCart = Mp.List_BtnCartProductOf_HSeller().get(0);
		js.executeScript("arguments[0].click();", addCart);
		logger.info("**** Kliknięto przycisk 'Dodaj do koszyka'****");
		ProductPage Pp = new ProductPage(driver);
		Thread.sleep(500);
		Boolean productPrice = Pp.check_Price_Product();
		if(productPrice==true) {
		
			logger.info("**** Cena produktu została wyświetlona ****");
			logger.info("**** TC_060_WalidacjaCenyProduktu_ProductPage zakończył się powodzeniem****");
			Assert.assertTrue(true);
			
		}else {
			logger.error("**** Cena produktu nie została wyświetlona ****");
			logger.info("**** TC_060_WalidacjaCenyProduktu_ProductPage zakończył się niepowodzeniem ****");
			Assert.fail();
			
		}

		
	}catch(Exception e) {
		
		logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
		Assert.fail();
	
		}

	}
	
}