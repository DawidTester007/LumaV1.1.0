package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_192_WalidacjWyświetlaniaKomuniaktuWZapamiętaneMetodyPłatnościa_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","master"})
	public void WalidacjWyświetlaniaKomuniaktuWZapamiętaneMetodyPłatnościa_MyAccountPage() {
		
		try {
			logger.info("****Rozpoczęto TC_192_WalidacjWyświetlaniaKomuniaktuWZapamiętaneMetodyPłatnościa_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			MyAccountPage Map = new MyAccountPage(driver);
			Map.click_tab_RememberedMethodsOfPay();
			logger.info("****Kliknięto zakładkę : Zapamiętane metody płatności****");
			String expTxt = "Nie masz zapisanych metod płatności.";
			if(Map.get_msg_DidntSaveAnyMethods().equalsIgnoreCase(expTxt)) {
			
				logger.info("****Pojawił się komunikat : Nie masz zapisanych metod płatności****");
				logger.info("****TC_192_WalidacjWyświetlaniaKomuniaktuWZapamiętaneMetodyPłatnościa_MyAccountPage zakończono powodzeniem****");
				Assert.assertTrue(true);
			}else {
				
				logger.error("****Nie pojawił się komunikat : Nie masz zapisanych metod płatności****");
				logger.info("****TC_192_WalidacjWyświetlaniaKomuniaktuWZapamiętaneMetodyPłatnościa_MyAccountPage zakończono niepowodzeniem****");
				Assert.fail();
				
			}
			
			
	}catch(Exception e) {
				
				logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
				Assert.fail();
			
			}
		
	}
	
}
