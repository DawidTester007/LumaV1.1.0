package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_171_WalidacjaZakładkiZapamiętaneMetodyPłatności_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void WalidacjaZakładkiZapamiętaneMetodyPłatności_MyAccountPage() {
		
		try {
			logger.info("****Rozpoczęto TC_171_WalidacjaZakładkiZapamiętaneMetodyPłatności_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			MyAccountPage Map = new MyAccountPage(driver);
			Map.click_tab_RememberedMethodsOfPay();
			logger.info("****Kliknięto zakładkę 'Zapamiętane metody płatności'****");
			String expTxt = "Zapamiętane metody płatności";
			
			if(Map.get_txt_RememberedMethods().equalsIgnoreCase(expTxt)) {
				
				logger.info("****Zakładka została uruchomiona i pojawiła się nazwa zakładki:"+expTxt+" ****");
				logger.info("****TC_171_WalidacjaZakładkiZapamiętaneMetodyPłatności_MyAccountPage zakończono powodzeniem****");
				Assert.assertTrue(true);
			}else {

				logger.error("****Zakładka nie została uruchomiona ****");
				logger.info("****TC_171_WalidacjaZakładkiZapamiętaneMetodyPłatności_MyAccountPage zakończono niepowodzeniem****");
				Assert.fail();
			}
			
			
			
	}catch(Exception e) {
				
				logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
				Assert.fail();
			
			}
		
	}
	
}
