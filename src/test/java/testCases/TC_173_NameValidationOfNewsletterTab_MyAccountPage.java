package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_173_NameValidationOfNewsletterTab_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void NameValidationOfNewsletterTab_MyAccountPage() {
		
		try {
			logger.info("****Starting TC_173_NameValidationOfNewsletterTab_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			logger.info("****Veronica demo account is logged in****");
			MyAccountPage Map = new MyAccountPage(driver);
			Map.click_tab_NewsletterSub();
			logger.info("****Clicked newsletter tab ****");
			String expTxt = "Subskrypcja newsletter'a";
			if(Map.get_txt_nazwa().equalsIgnoreCase(expTxt)) {
				
				logger.info("****The correct tab is active : "+expTxt+"****");
				logger.info("****TC_173_NameValidationOfNewsletterTab_MyAccountPage finished positive****");
				Assert.assertTrue(true);
			}else {

				logger.error("****The incorrect tab is active : "+Map.get_txt_nazwa()+"****");
				logger.info("****TC_173_NameValidationOfNewsletterTab_MyAccountPage finished negative****");
				Assert.fail("****The incorrect tab is active : "+Map.get_txt_nazwa()+"****");
			}
			
			
			
	}catch(Exception e) {
				
				logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
				Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
			}
		
	}
	
}
