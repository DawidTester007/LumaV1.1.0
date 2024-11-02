package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_172_WalidacjaZakładkiMojeOpinie_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void WalidacjaZakładkiMojeOpinie_MyAccountPage() {
		
		try {
			logger.info("****Rozpoczęto TC_172_WalidacjaZakładkiMojeOpinie_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			MyAccountPage Map = new MyAccountPage(driver);			Map.click_tab_MyOpinion();
			logger.info("****Kliknięto zakładkę 'Moje opinie o produktach'****");
			String expTxt = "Moje opinie o produktach";
			if(Map.get_txt_nazwa().equalsIgnoreCase(expTxt)) {
				
				logger.info("****Zakładka została uruchomiona i pojawiła się nazwa zakładki:"+expTxt+" ****");
				logger.info("****TC_172_WalidacjaZakładkiMojeOpinie_MyAccountPage zakończono powodzeniem****");
				Assert.assertTrue(true);
			}else {

				logger.error("****Zakładka nie została uruchomiona ****");
				logger.info("****TC_172_WalidacjaZakładkiMojeOpinie_MyAccountPage zakończono niepowodzeniem****");
				Assert.fail();
			}
			
			
			
	}catch(Exception e) {
				
				logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
				Assert.fail();
			
			}
		
	}
	
}
