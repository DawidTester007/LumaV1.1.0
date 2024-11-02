package testCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.ProductPage;

public class TC_073_WalidacjaCenProduktów_ProductPage extends BaseTest {
	@Test(groups={"functional","regression","master"})
	public void WalidacjaCenProduktów_ProductPage() {
		
		try {
			MainPage Mp = new MainPage(driver);
			logger.info("**** Rozpoczęto TC_073_WalidacjaCenProduktów_ProductPage ****");
			Mp.List_ImgProductOf_HSeller().get(0).click();
			logger.info("**** Kliknięto zdjęcie produktu ****");
			ProductPage Pp = new ProductPage(driver);
			
			for(WebElement x: Pp.List_PricesProducts()) {
				
				if(x.isDisplayed()==true) {
					
					logger.info("**** Została wyświetlona cena produktu ****");
				}
			}
			logger.info("**** Wszystkie proponowane przedmioty posiadają cenę ****");
			logger.info("**** TC_073_WalidacjaCenProduktów_ProductPage zakończył się powodzeniem ****");
			Assert.assertTrue(true);
	}catch(Exception e) {
	
		logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
		Assert.fail();
		
	}
	}
}
