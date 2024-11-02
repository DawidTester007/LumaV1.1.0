package testCases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.ProductPage;

public class TC_082_WalidacjaTworzeniaKomentarza_ProductPage extends BaseTest {

	
	@Test(groups = {"functional","regression","master"})
	public void WalidacjaKomuniaktówTworzeniaKomentarza_ProductPage()  {
		try {
		MainPage Mp = new MainPage(driver);
		logger.info("**** Rozpoczęto TC_082_WalidacjaTworzeniaKomentarza_ProductPage ****");
		Mp.List_ImgProductOf_HSeller().get(0).click();
		logger.info("**** Kliknięto zdjęcie produktu ****");
		ProductPage Pp = new ProductPage(driver);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Przewinięto stronę na dół****");
		Thread.sleep(1000);
		Pp.click_btn_opinions();
		logger.info("****Kliknięto zakładkę opinie****");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Przewinięto stronę na dół****");
		Pp.set_star("trzy");
		logger.info("****Oceniono produkt****");
		Pp.set_box_nick(stringMix());
		Pp.set_box_summary(stringMix());
		Pp.set_box_review(stringMix());
		logger.info("****Wypełniono pola****");
		Pp.click_btn_AddReview();
		logger.info("****Kliknięto przycisk 'Dodaj recenzję'****");
		WebElement msg = DriverWait.until(ExpectedConditions.visibilityOf(Pp.get_msg_AddedView()));
		if(msg.isDisplayed()) {
			logger.info("****Pojawił się komunikat o dodaniu recenzjii****");
			logger.info("****TC_082_WalidacjaTworzeniaKomentarza_ProductPage zakończył się powodzeniem ****");
			Assert.assertTrue(true);
			
		}else {
			logger.error("****Nie pojawił się komunikat o dodaniu recenzjii****");
			logger.info("****TC_082_WalidacjaTworzeniaKomentarza_ProductPage zakończył się niepowodzeniem ****");
			Assert.fail();
			
			
		}
		
		
		
		
		}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
			}
	}
	
}
