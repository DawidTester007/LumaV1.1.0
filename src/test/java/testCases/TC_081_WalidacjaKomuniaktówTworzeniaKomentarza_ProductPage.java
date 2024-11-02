package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.ProductPage;
import utilities.DataProv;

public class TC_081_WalidacjaKomuniaktówTworzeniaKomentarza_ProductPage extends BaseTest {

	
	@Test(dataProvider ="InvalidDataWriteComment", dataProviderClass = DataProv.class , groups ={"dataDriver","master"})
	public void WalidacjaKomuniaktówTworzeniaKomentarza_ProductPage(String rating, String nick, String summary, String opinion , String res)  {
		try {
		MainPage Mp = new MainPage(driver);
		logger.info("**** Rozpoczęto TC_081_WalidacjaKomuniaktówTworzeniaKomentarza_ProductPage ****");
		Mp.List_ImgProductOf_HSeller().get(0).click();
		logger.info("**** Kliknięto zdjęcie produktu ****");
		ProductPage Pp = new ProductPage(driver);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Przewinięto stronę na dół****");
		Thread.sleep(750);
		Pp.click_btn_opinions();
		logger.info("****Kliknięto zakładkę opinie****");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Przewinięto stronę na dół****");
		Pp.set_star(rating);
		logger.info("****Oceniono produkt****");
		Pp.set_box_nick(nick);
		Pp.set_box_summary(summary);
		Pp.set_box_review(opinion);
		logger.info("****Wypełniono pola****");
		Pp.click_btn_AddReview();
		logger.info("****Kliknięto przycisk 'Dodaj recenzję'****");
		
		if(res.equalsIgnoreCase("Invalid")) {
			
			if(Pp.check_msg_errorNick() || Pp.check_msg_errorRating() || Pp.check_msg_errorReview() || Pp.check_msg_errorSummary()) {

				logger.info("****Pojawił się komunikat walidacyjny****");
				
				
			}else {
				
				logger.error("****Nie pojawił się komunikat walidacyjny****");
				logger.info("****TC_081_WalidacjaKomuniaktówTworzeniaKomentarza_ProductPage zakończył się niepowodzeniem****");
				Assert.fail();
			}
			
			
		}else {
			
			logger.error("****TC_081_WalidacjaKomuniaktówTworzeniaKomentarza_ProductPage dotyczy danych,które są Invalid ****");
			logger.info("****TC_081_WalidacjaKomuniaktówTworzeniaKomentarza_ProductPage zakończył się niepowodzeniem****");
			Assert.fail();
		}
		
		logger.info("****TC_081_WalidacjaKomuniaktówTworzeniaKomentarza_ProductPage zakończył się powodzeniem ****");
		Assert.assertTrue(true);
		
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
			}
	}
	
}
