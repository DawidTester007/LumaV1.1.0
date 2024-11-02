package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_186_WalidacjaKomunikatuOBrakuPrzedmiotówWLiścieŻyczeń_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","master"})
	public void WalidacjaKomunikatuOBrakuPrzedmiotówWLiścieŻyczeń_MyAccountPage() {
		
		try {
			logger.info("****Rozpoczęto TC_186_WalidacjaKomunikatuOBrakuPrzedmiotówWLiścieŻyczeń_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			MyAccountPage Map = new MyAccountPage(driver);
			Map.click_tab_WishList();;
			logger.info("****Kliknięto zakładkę Moja lista życzeń****");
			String expTxt = "Nie masz żadnych produktów na liście życzeń.";
			if(Map.check_msg_NoProducts().equalsIgnoreCase(expTxt)) {
				logger.info("****Komunikat: "+expTxt+" został poprawnie wyświetlony****");
				logger.info("****TC_186_WalidacjaKomunikatuOBrakuPrzedmiotówWLiścieŻyczeń_MyAccountPage zakończono powodzeniem****");
				Assert.assertTrue(true);
				
			}else {
				logger.error("****Komunikat: "+expTxt+" nie został poprawnie wyświetlony****");
				logger.info("****TC_186_WalidacjaKomunikatuOBrakuPrzedmiotówWLiścieŻyczeń_MyAccountPage zakończono powodzeniem****");
				Assert.fail();	
			}
			
			
			
			
	}catch(Exception e) {
				
				logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
				Assert.fail();
			
			}
		
	}
	
}
