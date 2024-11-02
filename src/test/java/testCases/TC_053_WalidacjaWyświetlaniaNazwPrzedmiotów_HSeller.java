package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;

public class TC_053_WalidacjaWyświetlaniaNazwPrzedmiotów_HSeller extends BaseTest {

	@Test(groups ={"functional","master"})
	public void WalidacjaNazwPrzedmiotów_HSeller() {
		try {
		MainPage Mp = new MainPage(driver);
		logger.info("****Rozpoczęto TC_053_WalidacjaWyświetlaniaNazwPrzedmiotów_HSeller****");
		for(int i = 1 ;i<=Mp.ListOf_Products_HSellerList().size(); i++) {
			if(Mp.List_NameProductOf_HSeller().get(i-1).isDisplayed()==true) {
				
				logger.info("****Nazwa produktu nr: "+i+" została wyświetlona****");
			}else
			{
				logger.error("****Nazwa produktu nr: "+i+" nie została wyświetlona****");
				logger.info("****TC_053_WalidacjaWyświetlaniaNazwPrzedmiotów_HSeller zakończył się niepowodzeniem****");
				Assert.fail();
			}
		
		}
		
		Assert.assertTrue(true);
		logger.info("****WalidacjaWyświetlaniaNazwPrzedmiotów_HSeller zakończyła się powodzeniem****");
		logger.info("****TC_053_WalidacjaWyświetlaniaNazwPrzedmiotów_HSeller został zakończony****");
		
		}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
			
		}
		
	}
	
}
