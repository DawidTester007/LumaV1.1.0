package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_165_WalidacjaLinkuZobaczWszystkie_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void WalidacjaLinkuZobaczWszystkie_MyAccountPage() {
		try {
		logger.info("****Rozpoczęto TC_165_WalidacjaLinkuZobaczWszystkie_MyAccountPage****");
		BaseTest Bt = new BaseTest();
		Bt.LoginToVeronicaAccount();
		MyAccountPage Map = new MyAccountPage(driver);
		Map.click_link_showOrders();
		logger.info("****Kliknięto link 'Zobacz wszystkie'****");
		String expTxt = "Zamówienia";
		if(Map.get_txt_nazwa().equalsIgnoreCase(expTxt)) {
			
			logger.info("****Zakładka została uruchomiona i pojawiła się nazwa zakładki:"+expTxt+" ****");
			logger.info("****TC_165_WalidacjaLinkuZobaczWszystkie_MyAccountPage zakończono powodzeniem****");
			Assert.assertTrue(true);
		}else {

			logger.error("****Zakładka nie została uruchomiona ****");
			logger.info("****TC_165_WalidacjaLinkuZobaczWszystkie_MyAccountPage zakończono niepowodzeniem****");
			Assert.fail();
		}
		
		
		
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
		}
	}
	
}
