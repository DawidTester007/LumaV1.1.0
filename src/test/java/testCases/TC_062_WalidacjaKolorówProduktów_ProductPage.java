package testCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.ProductPage;

public class TC_062_WalidacjaKolorówProduktów_ProductPage extends BaseTest{
	@Test(groups ={"functional","regression","master"})
	public void WalidacjaKolorówProduktów_ProductPage()  {
		try {
		logger.info("**** Rozpoczęto WalidacjaCenyProduktu ****");
		MainPage Mp = new MainPage(driver);
		
		WebElement addCart = Mp.List_BtnCartProductOf_HSeller().get(0);
		js.executeScript("arguments[0].click();", addCart);
		logger.info("**** Kliknięto przycisk 'Dodaj do koszyka'****");
		ProductPage Pp = new ProductPage(driver);
	
		for(WebElement size : Pp.List_colorsOfProducts()){
			
			size.click();
			logger.info("**** Kliknięto kolor : "+size.getAttribute("data-option-label")+" ****");
			
			if(size.getAttribute("class").contains("selected")) {
				
				logger.info("**** Kolor został poprawnie wybrany ****");
				
			}else {
				logger.error("**** Kolor został niepoprawnie wybrany ****");
				logger.info("**** TC_062_WalidacjaKolorówProduktów_ProductPage zakończył się niepowodzeniem ****");
				Assert.fail();
			}
			
		}
		logger.info("**** Wszystkie kolory zostały kliknięte ****");
		logger.info("**** TC_062_WalidacjaKolorówProduktów_ProductPage zakończył się powodzeniem ****");
		Assert.assertTrue(true);
	

		
	}catch(Exception e) {
		
		logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
		Assert.fail();
	
		}

	}
	
}