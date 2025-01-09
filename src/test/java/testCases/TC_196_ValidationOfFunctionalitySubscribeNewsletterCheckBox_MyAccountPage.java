package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_196_ValidationOfFunctionalitySubscribeNewsletterCheckBox_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void ValidationOfFunctionalitySubscribeNewsletterCheckBox_MyAccountPage() {
		
		try {
			logger.info("****Starting TC_196_ValidationOfFunctionalitySubscribeNewsletterCheckBox_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			logger.info("****Veronica demo account is logged in****");
			MyAccountPage Map = new MyAccountPage(driver);
			Map.click_tab_NewsletterSub();
			logger.info("****Clicked subscribe newsletter tab****");
			Map.click_checkbox_MainNewsletter();
			logger.info("****Clicked Main Newsletter checkbox****");
			String expTxt1 = "We have saved your subscription.";
			String expTxt2 = "We have removed your newsletter subscription.";
			
			if(Map.check_checkbox_MainNewsletter() == false) {
					
				Map.click_btn_saveNewsletter();
				logger.info("****Clicked save button****");
				if(Map.get_msg_RemoveSub().equalsIgnoreCase(expTxt2)) {
					
						logger.info("**** "+expTxt2+" message has been displayed****");
						logger.info("****TC_196_ValidationOfFunctionalitySubscribeNewsletterCheckBox_MyAccountPage finished positive****");
						Assert.assertTrue(true);
				}else {
						
						logger.error("**** "+expTxt2+" message has not been displayed****");
						logger.info("****TC_196_ValidationOfFunctionalitySubscribeNewsletterCheckBox_MyAccountPage finished negative****");
						Assert.fail("**** "+expTxt2+" message has not been displayed****");
						
					}
			}else {
				
				Map.click_btn_saveNewsletter();
				logger.info("****Clicked save button****");
				if(Map.get_msg_SavedSub().equalsIgnoreCase(expTxt1)) {
					
					logger.info("**** "+expTxt1+" message has been displayed****");
					logger.info("****TC_196_ValidationOfFunctionalitySubscribeNewsletterCheckBox_MyAccountPage finished positive****");
					Assert.assertTrue(true);
			}else {
					
					logger.error("**** "+expTxt1+" message has not been displayed****");
					logger.info("****TC_196_ValidationOfFunctionalitySubscribeNewsletterCheckBox_MyAccountPage finished negative****");
					Assert.fail("**** "+expTxt1+" message has not been displayed****");
					
				}
				
				
			}
			
	}catch(Exception e) {
				
				logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
				Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
			}
		
	}
	
}
