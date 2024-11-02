package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_180_WalidacjaOpisuBrakProdktówWLiścieŻyczeń_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void WalidacjaOpisuBrakProdktówWLiścieŻyczeń_MyAccountPage() {
		
		try {
			logger.info("****Rozpoczęto TC_180_WalidacjaOpisuBrakProdktówWLiścieŻyczeń_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			MyAccountPage Map = new MyAccountPage(driver);
			if(Map.check_txt_infoWishList()) {
				
				logger.info("****Tekst Nie masz żadnych produktów na liście życzeń. Został wyświetlony ****");
				logger.info("****TC_180_WalidacjaOpisuBrakProdktówWLiścieŻyczeń_MyAccountPage zakończono powodzeniem****");
				Assert.assertTrue(true);
			}else {

				logger.error("****Tekst Nie masz żadnych produktów na liście życzeń. Nie został wyświetlony ****");
				logger.info("****TC_180_WalidacjaOpisuBrakProdktówWLiścieŻyczeń_MyAccountPage zakończono niepowodzeniem****");
				Assert.fail();
			}
			
			
			
	}catch(Exception e) {
				
				logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
				Assert.fail();
			
			}
		
	}
	
}
