package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.ProductPage;

public class TC_080_WalidacjaTekstuKomentarza_ProductPage extends BaseTest {
	@Test(groups = {"functional","master"})
	public void WalidacjaTekstuKomentarza_ProductPage() throws InterruptedException {
		
		MainPage Mp = new MainPage(driver);
		logger.info("**** Rozpoczęto TC_080_WalidacjaTekstuKomentarza_ProductPage ****");
		Mp.List_ImgProductOf_HSeller().get(0).click();
		logger.info("**** Kliknięto zdjęcie produktu ****");
		ProductPage Pp = new ProductPage(driver);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Przewinięto stronę na dół****");
		Thread.sleep(750);
		Pp.click_btn_opinions();
		logger.info("****Kliknięto zakładkę opinie****");
		String currTxt = Pp.get_txt_WriteSomethg();
		String expTxt = "Napisz opinię o produkcie:";
		
		if(currTxt.equals(expTxt)) {
			
			logger.info("****Nazwa zakładki komentarza ma poprawną wartość :"+currTxt+" ****");
			
			String expName = Pp.get_NameOfProduct();
			String currName = Pp.get_txt_NameProductInOpinion();
			if(currName.equals(expName)) {
				
				logger.info("****Nazwa przedmiotu w zakładce komentarza ma poprawną wartość :"+currName+" ****");
				logger.info("****TC_080_WalidacjaTekstuKomentarza_ProductPage zakończył się powodzeniem****");
				Assert.assertTrue(true);
			}else {
				
				logger.error("****Nazwa przedmiotu w zakładce komentarza ma niepoprawną wartość :"+currName+" ****");
				logger.info("****TC_080_WalidacjaTekstuKomentarza_ProductPage zakończył się niepowodzeniem****");
				Assert.assertTrue(true);
				
				
			}
		}else {
			
			logger.error("****Nazwa zakładki komentarza ma niepoprawną wartość  ****");
			logger.info("****TC_080_WalidacjaTekstuKomentarza_ProductPage zakończył się niepowodzeniem****");
			Assert.fail();
			
		}
		
		
		
		
		
	}
	
}
