package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_194_ValidationOfSubscribeOptionsText_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","master"})
	public void ValidationOfSubscribeOptionsText_MyAccountPage() {
		
		try {
			logger.info("****Starting TC_194_ValidationOfSubscribeOptionsText_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			logger.info("****Veronica demo account is logged in****");
			MyAccountPage Map = new MyAccountPage(driver);
			Map.click_tab_NewsletterSub();
			logger.info("****Clicked newsletter subscription tab ****");
			String expTxt = "Opcje subskrypcji";
			if(Map.get_txt_optionOfSubscription().equalsIgnoreCase(expTxt)) {
			
				logger.info("****The text:"+expTxt+" has been displayed ****");
				logger.info("****TC_194_ValidationOfSubscribeOptionsText_MyAccountPage finished positive****");
				Assert.assertTrue(true);
			}else {
				
				logger.error("****The text:"+expTxt+" has not been displayed ****");
				logger.info("****TC_194_ValidationOfSubscribeOptionsText_MyAccountPage zakończono niepowodzeniem****");
				Assert.fail("****The text:"+expTxt+" has not been displayed ****");
				
			}
			
			
	}catch(Exception e) {
				
				logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
				Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
			}
		
	}
	
}
