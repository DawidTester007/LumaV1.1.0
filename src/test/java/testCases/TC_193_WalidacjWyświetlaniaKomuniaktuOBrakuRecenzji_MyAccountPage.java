package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_193_WalidacjWyświetlaniaKomuniaktuOBrakuRecenzji_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","master"})
	public void WalidacjWyświetlaniaKomuniaktuOBrakuRecenzji_MyAccountPage() {
		
		try {
			logger.info("****Rozpoczęto TC_193_WalidacjWyświetlaniaKomuniaktuOBrakuRecenzji_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			MyAccountPage Map = new MyAccountPage(driver);
			Map.click_tab_MyOpinion();
			logger.info("****Kliknięto zakładkę : Moje opinie o produktach****");
			String expTxt = "Nie masz jeszcze zgłoszonych żadnych recenzji.";
			if(Map.get_msg_NoOpinion().equalsIgnoreCase(expTxt)) {
			
				logger.info("****Pojawił się komunikat : Nie masz jeszcze zgłoszonych żadnych recenzji.****");
				logger.info("****TC_193_WalidacjWyświetlaniaKomuniaktuOBrakuRecenzji_MyAccountPage zakończono powodzeniem****");
				Assert.assertTrue(true);
			}else {
				
				logger.error("****Nie pojawił się komunikat : Nie masz jeszcze zgłoszonych żadnych recenzji.****");
				logger.info("****TC_193_WalidacjWyświetlaniaKomuniaktuOBrakuRecenzji_MyAccountPage zakończono niepowodzeniem****");
				Assert.fail();
				
			}
			
			
	}catch(Exception e) {
				
				logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
				Assert.fail();
			
			}
		
	}
	
}
