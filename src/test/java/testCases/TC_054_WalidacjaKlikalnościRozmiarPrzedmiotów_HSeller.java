package testCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;

public class TC_054_WalidacjaKlikalnościRozmiarPrzedmiotów_HSeller extends BaseTest {
	@Test(groups ={"functional","regression","master"})
	public void WalidacjaRozmiarPrzedmiotów_HSelle(){
		try {
		logger.info("****Rozpoczęto TC_054_WalidacjaKlikalnościRozmiarPrzedmiotów_HSeller****");
		MainPage Mp = new MainPage(driver);
		
		for(WebElement size : Mp.List_SizeProductOf_HSeller()) {
			
			if(size.isEnabled()) {
				
				size.click();
				
				if(size.getAttribute("aria-checked").equals("true")) {
					
					logger.info("**** Kliknięto rozmiar przedmiotu :" + size.getAttribute("data-option-label")+ "****");
				}else {
					logger.error("**** Nie kliknięto rozmiaru ****");
					logger.info("****TC_054_WalidacjaKlikalnościRozmiarPrzedmiotów_HSeller zakończył się niepowodzeniem****");
					Assert.fail();
					
				}
				
			}else {
				
				logger.error("**** Rozmiar jest niedostępny do kliknięcia ****");
				logger.info("****TC_054_WalidacjaKlikalnościRozmiarPrzedmiotów_HSeller zakończył się niepowodzeniem****");
				Assert.fail();
			}
			
			
			
		}	
		logger.info("****Wszystkie wyświetlone rozmiary zostały kliknięte****");
		logger.info("****TC_054_WalidacjaKlikalnościRozmiarPrzedmiotów_HSeller zakończył się powodzeniem****");
		Assert.assertTrue(true);
		
		}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
			}
		
	
		
		
	}
	
}
