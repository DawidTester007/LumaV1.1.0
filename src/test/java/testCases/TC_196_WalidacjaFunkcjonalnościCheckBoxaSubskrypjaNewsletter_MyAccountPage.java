package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_196_WalidacjaFunkcjonalnościCheckBoxaSubskrypjaNewsletter_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void WalidacjaFunkcjonalnościCheckBoxaSubskrypjaNewsletter_MyAccountPage() {
		
		try {
			logger.info("****Rozpoczęto TC_196_WalidacjaFunkcjonalnościCheckBoxaSubskrypjaNewsletter_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			MyAccountPage Map = new MyAccountPage(driver);
			Map.click_tab_NewsletterSub();
			logger.info("****Kliknięto zakładkę : Subskrypcja newsletter'a****");
			Map.click_checkbox_MainNewsletter();
			logger.info("****Kliknięto checkBox: Ogólny newsletter****");
			String expTxt1 = "We have saved your subscription.";
			String expTxt2 = "We have removed your newsletter subscription.";
			
			if(Map.check_checkbox_MainNewsletter() == false) {
					
				Map.click_btn_saveNewsletter();
				logger.info("****Kliknięto przycisk zapisz w Subskrypcja newsletter'a****");
				if(Map.get_msg_RemoveSub().equalsIgnoreCase(expTxt2)) {
					
						logger.info("****Pojawił się komunikat : "+expTxt2+"****");
						logger.info("****TC_196_WalidacjaFunkcjonalnościCheckBoxaSubskrypjaNewsletter_MyAccountPage zakończono powodzeniem****");
						Assert.assertTrue(true);
				}else {
						
						logger.error("****Nie pojawił się komunikat : "+expTxt2+"****");
						logger.info("****TC_196_WalidacjaFunkcjonalnościCheckBoxaSubskrypjaNewsletter_MyAccountPage zakończono niepowodzeniem****");
						Assert.fail();
						
					}
			}else {
				
				Map.click_btn_saveNewsletter();
				logger.info("****Kliknięto przycisk zapisz w Subskrypcja newsletter'a****");
				if(Map.get_msg_SavedSub().equalsIgnoreCase(expTxt1)) {
					
					logger.info("****Pojawił się komunikat : "+expTxt1+"****");
					logger.info("****TC_196_WalidacjaFunkcjonalnościCheckBoxaSubskrypjaNewsletter_MyAccountPage zakończono powodzeniem****");
					Assert.assertTrue(true);
			}else {
					
					logger.error("****Nie pojawił się komunikat : "+expTxt1+"****");
					logger.info("****TC_196_WalidacjaFunkcjonalnościCheckBoxaSubskrypjaNewsletter_MyAccountPage zakończono niepowodzeniem****");
					Assert.fail();
					
				}
				
				
			}
			
	}catch(Exception e) {
				
				logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
				Assert.fail();
			
			}
		
	}
	
}
