package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.ProductPage;

public class TC_074_WalidacjaPrzyciskuPorównaj_ProductPage extends BaseTest {
	@Test(groups={"functional","regression","master"})
	public void WalidacjaPrzyciskuPorównaj_ProductPage() {
		try {
		MainPage Mp = new MainPage(driver);
		logger.info("**** Rozpoczęto TC_074_WalidacjaPrzyciskuPorównaj_ProductPage ****");
		Mp.List_ImgProductOf_HSeller().get(0).click();
		logger.info("**** Kliknięto zdjęcie produktu ****");
		ProductPage Pp = new ProductPage(driver);
		Pp.click_btn_compare();
		logger.info("**** Kliknięto przycisk 'porównaj' ****");
		
		if(Pp.check_msg_succesfulAddedToComparison()==true) {
			
			logger.info("**** Pojawił się komuniakt o dodaniu przedmiotu do modułu porównania ****");
			logger.info("**** TC_074_WalidacjaPrzyciskuPorównaj_ProductPage zakończył się powodzeniem****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("**** Nie pojawił się komuniakt o dodaniu przedmiotu do modułu porównania ****");
			logger.info("**** TC_074_WalidacjaPrzyciskuPorównaj_ProductPage zakończył się niepowodzeniem ****");
			Assert.fail();
		}
		
		
		}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
			
		}
		
		
	}
	
}
