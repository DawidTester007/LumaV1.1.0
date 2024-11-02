package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_179_WalidacjaTekstuMojaListŻyczeń_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","master"})
	public void WalidacjaTekstuMojaListŻyczeń_MyAccountPage() {
		
		try {
			logger.info("****Rozpoczęto TC_179_WalidacjaTekstuMojaListŻyczeń_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			MyAccountPage Map = new MyAccountPage(driver);
			String expTxt = "Moja lista życzeń";
			if(Map.get_txt_wishList().equalsIgnoreCase(expTxt)) {
				
				logger.info("****Tekst :"+expTxt+" jest poprawnie wyświetlony"+" ****");
				logger.info("****TC_179_WalidacjaTekstuMojaListŻyczeń_MyAccountPage zakończono powodzeniem****");
				Assert.assertTrue(true);
			}else {

				logger.error("****Tekst :"+expTxt+" jest niepoprawnie wyświetlony ****");
				logger.info("****TC_179_WalidacjaTekstuMojaListŻyczeń_MyAccountPage zakończono niepowodzeniem****");
				Assert.fail();
			}
			
			
			
	}catch(Exception e) {
				
				logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
				Assert.fail();
			
			}
		
	}
	
}
