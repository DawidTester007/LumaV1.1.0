package testCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.ProductPage;

public class TC_061_WalidacjaRozmiarówProduktów_ProductPage extends BaseTest{
	@Test(groups ={"functional","regression","master"})
	public void WalidacjaRozmiarówProduktów_ProductPage()  {
		try {
		logger.info("**** Rozpoczęto WalidacjaCenyProduktu ****");
		MainPage Mp = new MainPage(driver);
		
		WebElement addCart = Mp.List_BtnCartProductOf_HSeller().get(0);
		js.executeScript("arguments[0].click();", addCart);
		logger.info("**** Kliknięto przycisk 'Dodaj do koszyka'****");
		ProductPage Pp = new ProductPage(driver);
	
		for(WebElement size : Pp.List_sizesOfProduct()){
			
			size.click();
			logger.info("**** Kliknięto rozmiar : "+size.getText()+" ****");
			
			if(size.getAttribute("class").contains("selected")) {
				
				logger.info("**** Rozmiar został poprawnie wybrany ****");
				
			}else {
				logger.info("**** Rozmiar nie został wybrany ****");
				logger.error("**** TC_061_WalidacjaRozmiarówProduktów_ProductPage zakończył się niepowodzeniem ****");
				Assert.fail();
			}
			
		}
		logger.info("**** Wszystkie rozmiary zostały w poprany sposób kliknięte ****");
		logger.info("**** TC_061_WalidacjaRozmiarówProduktów_KartaZProduktem zakończył się powodzeniem ****");
		Assert.assertTrue(true);
	

		
	}catch(Exception e) {
		
		logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
		Assert.fail();
	
		}

	}
	
}