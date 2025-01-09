package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_195_ValidationOfSubscribeNewsletterButton_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void ValidationOfSubscribeNewsletterButton_MyAccountPage() {
		
		try {
			logger.info("****Starting TC_195_ValidationOfSubscribeNewsletterButton_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			logger.info("****Veronica demo account is logged in****");
			MyAccountPage Map = new MyAccountPage(driver);
			Map.click_tab_NewsletterSub();
			logger.info("****Clicked subscribe newsletter tab****");
			Map.click_btn_saveNewsletter();
			logger.info("****Clicked subscribe newsletter button****");
			String expTxt = "We have updated your subscription.";
			if(Map.get_msg_UpdatedSubscription().equalsIgnoreCase(expTxt)) {
			
				logger.info("****"+expTxt+" message has been displayed****");
				logger.info("****TC_195_ValidationOfSubscribeNewsletterButton_MyAccountPage finished positive****");
				Assert.assertTrue(true);
			}else {
				
				logger.error("****"+expTxt+" message has not been displayed****");
				logger.info("****TC_195_ValidationOfSubscribeNewsletterButton_MyAccountPage finished negtaive****");
				Assert.fail("****"+expTxt+" message has not been displayed****");
				
			}
			
			
	}catch(Exception e) {
				
				logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
				Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
			}
		
	}
	
}
