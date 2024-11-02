package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_173_WalidacjaZakładkiNewsletter_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void WalidacjaZakładkiNewsletterMyAccountPage() {
		
		try {
			logger.info("****Rozpoczęto TC_173_WalidacjaZakładkiNewsletterMyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			MyAccountPage Map = new MyAccountPage(driver);
			Map.click_tab_NewsletterSub();
			logger.info("****Kliknięto zakładkę 'Subskrypcja newsletter'a'****");
			String expTxt = "Subskrypcja newsletter'a";
			if(Map.get_txt_nazwa().equalsIgnoreCase(expTxt)) {
				
				logger.info("****Zakładka została uruchomiona i pojawiła się nazwa zakładki:"+expTxt+" ****");
				logger.info("****TC_173_WalidacjaZakładkiNewsletterMyAccountPage zakończono powodzeniem****");
				Assert.assertTrue(true);
			}else {

				logger.error("****Zakładka nie została uruchomiona ****");
				logger.info("****TC_173_WalidacjaZakładkiNewsletterMyAccountPage zakończono niepowodzeniem****");
				Assert.fail();
			}
			
			
			
	}catch(Exception e) {
				
				logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
				Assert.fail();
			
			}
		
	}
	
}
