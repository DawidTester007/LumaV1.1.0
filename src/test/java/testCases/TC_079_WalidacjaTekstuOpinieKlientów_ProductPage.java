package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.ProductPage;

public class TC_079_WalidacjaTekstuOpinieKlientów_ProductPage extends BaseTest {
	@Test(groups = {"functional","master"})
	public void WalidacjaTekstuOpinieKlientów_ProductPage() throws InterruptedException {
		
		MainPage Mp = new MainPage(driver);
		logger.info("**** Rozpoczęto TC_079_WalidacjaTekstuOpinieKlientów_ProductPage ****");
		Mp.List_ImgProductOf_HSeller().get(0).click();
		logger.info("**** Kliknięto zdjęcie produktu ****");
		ProductPage Pp = new ProductPage(driver);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Przewinięto stronę na dół****");
		Thread.sleep(750);
		Pp.click_btn_opinions();
		logger.info("****Kliknięto zakładkę opinie****");
		
		String currTxt = Pp.get_txt_OpinionOfClients();
		String expTxt = "Opinie klientów";
		
		if(currTxt.equals(expTxt)) {
			
			logger.info("****Nazwa zakładki ma poprawną wartość :"+currTxt+" ****");
			logger.info("****TC_079_WalidacjaTekstuOpinieKlientów_ProductPage zakończył się powodzeniem****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****Nazwa zakładki ma niepoprawną wartość  ****");
			logger.info("****TC_079_WalidacjaTekstuOpinieKlientów_ProductPage zakończył się niepowodzeniem****");
			Assert.fail();
			
		}
		
		
		
		
		
	}
	
}
