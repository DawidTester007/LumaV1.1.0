package testCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;

public class TC_055_WalidacjaKlikalnościKolorPrzedmiotów_HSeller extends BaseTest {
	@Test(groups ={"functional","regression","master"})
	public void WalidacjaRozmiarPrzedmiotów_HSelle(){
		try {
		logger.info("****Rozpoczęto TC_055_WalidacjaKlikalnościKolorPrzedmiotów_HSeller****");
		MainPage Mp = new MainPage(driver);
		
		for(WebElement color : Mp.List_ColorsProductOf_HSeller()) {
			
			if(color.isEnabled()) {
				
				color.click();
				
				if(color.getAttribute("aria-checked").equals("true")) {
					
					logger.info("**** Kliknięto kolor przedmiotu :" + color.getAttribute("data-option-label")+ " ****");
				}else {
					logger.error("**** Nie kliknięto koloru ****");
					logger.info("****TC_055_WalidacjaKlikalnościKolorPrzedmiotów_HSeller zakończył się niepowodzeniem****");
					Assert.fail();
					
				}
				
			}else {
				
				logger.error("**** Kolor jest niedostępny do kliknięcia ****");
				logger.info("****TC_055_WalidacjaKlikalnościKolorPrzedmiotów_HSeller został zakonczony****");
				Assert.fail();
			}
			
			
			
		}	
		logger.info("****Wszystkie opcje kolorów zostały kliknięte****");
		logger.info("****TC_055_WalidacjaKlikalnościKolorPrzedmiotów_HSeller zakończył się powodzeniem****");
		Assert.assertTrue(true);
		
		}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
			}
		
	
		
		
	}
	
}
