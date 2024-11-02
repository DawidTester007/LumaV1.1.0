package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_195_WalidacjaPrzyciskuZapiszWNewsletter_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void WalidacjaPrzyciskuZapiszWNewsletter_MyAccountPage() {
		
		try {
			logger.info("****Rozpoczęto TC_195_WalidacjaPrzyciskuZapiszWNewsletter_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			MyAccountPage Map = new MyAccountPage(driver);
			Map.click_tab_NewsletterSub();
			logger.info("****Kliknięto zakładkę : Subskrypcja newsletter'a****");
			Map.click_btn_saveNewsletter();
			logger.info("****Kliknięto przycisk zapisz w Subskrypcja newsletter'a****");
			String expTxt = "We have updated your subscription.";
			if(Map.get_msg_UpdatedSubscription().equalsIgnoreCase(expTxt)) {
			
				logger.info("****Pojawił się komunikat : "+expTxt+"****");
				logger.info("****TC_195_WalidacjaPrzyciskuZapiszWNewsletter_MyAccountPage zakończono powodzeniem****");
				Assert.assertTrue(true);
			}else {
				
				logger.error("****Nie pojawił się komunikat : "+expTxt+"****");
				logger.info("****TC_195_WalidacjaPrzyciskuZapiszWNewsletter_MyAccountPage zakończono niepowodzeniem****");
				Assert.fail();
				
			}
			
			
	}catch(Exception e) {
				
				logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
				Assert.fail();
			
			}
		
	}
	
}
