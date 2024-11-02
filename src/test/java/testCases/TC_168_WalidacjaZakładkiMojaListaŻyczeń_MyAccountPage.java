package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_168_WalidacjaZakładkiMojaListaŻyczeń_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void WalidacjaZakładkiMojaListaŻyczeń_MyAccountPage() {
		
		try {
			logger.info("****Rozpoczęto TC_168_WalidacjaZakładkiMojaListaŻyczeń_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			MyAccountPage Map = new MyAccountPage(driver);
			Map.click_tab_WishList();
			logger.info("****Kliknięto zakładkę 'Moja lista życzeń'****");
			String expTxt = "Moja lista życzeń";
			if(Map.get_txt_nazwa().equalsIgnoreCase(expTxt)) {
				
				logger.info("****Zakładka została uruchomiona i pojawiła się nazwa zakładki:"+expTxt+" ****");
				logger.info("****TC_168_WalidacjaZakładkiMojaListaŻyczeń_MyAccountPage zakończono powodzeniem****");
				Assert.assertTrue(true);
			}else {

				logger.error("****Zakładka nie została uruchomiona ****");
				logger.info("****TC_168_WalidacjaZakładkiMojaListaŻyczeń_MyAccountPage zakończono niepowodzeniem****");
				Assert.fail();
			}
			
			
			
	}catch(Exception e) {
				
				logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
				Assert.fail();
			
			}
		
	}
	
}
