package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;


public class TC_191_WalidacjWyświetlaniaKomuniaktuWProduktyDoPobrania_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void WalidacjWyświetlaniaKomuniaktuWProduktyDoPobrania_MyAccountPage() {
		
		try {
			logger.info("****Rozpoczęto TC_191_WalidacjWyświetlaniaKomuniaktuWProduktyDoPobrania_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			MyAccountPage Map = new MyAccountPage(driver);
			Map.click_tab_DownloadableProduct();
			logger.info("****Kliknięto zakładkę : Produkty do pobrania****");
			String expTxt = "Nie kupowałeś jeszcze żadnych produktów do pobrania.";
			if(Map.get_msg_DidntBuyAnything().equalsIgnoreCase(expTxt)) {
			
				logger.info("****Pojawił się komunikat o nie dokonaniu zakupów, które można byłoby pobrać****");
				logger.info("****TC_191_WalidacjWyświetlaniaKomuniaktuWProduktyDoPobrania_MyAccountPage zakończono powodzeniem****");
				Assert.assertTrue(true);
			}else {
				
				logger.error("****Nie pojawił się komunikat o nie dokonaniu zakupów, które można byłoby pobrać****");
				logger.info("****TC_191_WalidacjWyświetlaniaKomuniaktuWProduktyDoPobrania_MyAccountPage zakończono niepowodzeniem****");
				Assert.fail();
				
			}
			
			
			
			
			
			
			
			
			
			
	}catch(Exception e) {
				
				logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
				Assert.fail();
			
			}
		
	}
	
}
