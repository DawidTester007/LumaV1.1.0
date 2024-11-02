package testCases;

import java.util.NoSuchElementException;

import org.openqa.selenium.NotFoundException;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.ProductPage;

public class TC_069_WalidacjaTekstuInneProdukty_PageProduct extends BaseTest{

	@Test(groups={"functional","master"})
	public void WalidacjaTekstuInneProdukty_PageProduct() {
	
		try {
		MainPage Mp = new MainPage(driver);
		logger.info("**** Rozpoczęto TC_069_WalidacjaTekstuInneProdukty_PageProduct ****");
		Mp.List_ImgProductOf_HSeller().get(1).click();
		logger.info("**** Kliknięto zdjęcie produktu ****");
		ProductPage Pp = new ProductPage(driver);
		String expTxt1 ="Znaleźliśmy inne produkty, które mogą Cię zainteresować!";
		String expTxt2 ="Produkty powiązane";
		
		try {
		if(Pp.get_txt_anotherProducts1().isDisplayed()) {
			
			if(Pp.get_txt_anotherProducts1().getText().equals(expTxt1)) {
				logger.info("**** Komunikat ma poprawną zawartość ****" );
				logger.info("**** TC_069_WalidacjaTekstuInneProdukty_PageProduct zakończył się powodzeniem ****");
				Assert.assertTrue(true);
				
			}else {
				logger.error("**** Komunikat ma niepoprawną zawartość ****" );
				logger.info("**** TC_069_WalidacjaTekstuInneProdukty_PageProduct zakończył się niepowodzeniem ****");
				Assert.fail();
				
			}
			
		}
	
		}catch(NoSuchElementException e) {
			
		if(Pp.get_txt_anotherProducts2().isDisplayed()) {
				
			if(Pp.get_txt_anotherProducts2().getText().equals(expTxt2)) {
				logger.info("**** Komunikat ma poprawną zawartość ****" );
				logger.info("**** TC_069_WalidacjaTekstuInneProdukty_PageProduct zakończył się powodzeniem ****");
				Assert.assertTrue(true);
				
			}else {
				logger.info("**** Komunikat ma niepoprawną zawartość ****" );
				logger.info("**** TC_069_WalidacjaTekstuInneProdukty_PageProduct zakończył się niepowodzeniem ****");
				Assert.fail();
				
			}
			
				
		}
			
		}catch(NotFoundException e) {
			if(Pp.get_txt_anotherProducts2().isDisplayed()) {
				
				if(Pp.get_txt_anotherProducts2().getText().equals(expTxt2)) {
					logger.info("**** Komunikat ma poprawną zawartość ****" );
					logger.info("**** TC_069_WalidacjaTekstuInneProdukty_PageProduct zakończył się powodzeniem ****");
					Assert.assertTrue(true);
					
				}else {
					logger.info("**** Komunikat ma niepoprawną zawartość ****" );
					logger.info("**** TC_069_WalidacjaTekstuInneProdukty_PageProduct zakończył się niepowodzeniem ****");
					Assert.fail();
					
				}
				
					
			}
			
		}
	
	}catch(Exception e) {
	
		logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
		Assert.fail();
		
	}
}
}


