package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.InfoBarPage;

public class TC_136_WalidacjaLinkTekstu_InfoBarPage extends BaseTest {
	@Test(groups = {"functional","master"})
	public void WalidacjaLinkTekstu_InfoBar() {
		try {
		logger.info("****Rozpoczęto TC_136_WalidacjaLinkTekstu_InfoBar****");
		InfoBarPage Ibp = new InfoBarPage(driver);
		String expTxt ="Panel Administracyjny";
		
		if(Ibp.get_txt_link_AdminPanel().equalsIgnoreCase(expTxt)) {
			logger.info("****Link Tekst zgadza się z oczekiwanym tekstem****");
			logger.info("****TC_136_WalidacjaLinkTekstu_InfoBar zakończono powodzeniem****");
			Assert.assertTrue(true);
		}else {
			logger.error("****Link Tekst nie zgadza się z oczekiwanym tekstem****");
			logger.info("****TC_136_WalidacjaLinkTekstu_InfoBar zakończono niepowodzeniem****");
			Assert.fail();
			
		}
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
		}
	
		
	}
}
