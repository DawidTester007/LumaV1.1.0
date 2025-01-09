package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_181_ValidationOfDisplayingAFirstProductInOrdersTab_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void ValidationOfDisplayingAFirstProductInOrdersTab_MyAccountPage() {
		
		try {
			logger.info("****Starting TC_181_ValidationOfDisplayingAFirstProductInOrdersTab_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			logger.info("****Veronica demo account is logged in****");
			MyAccountPage Map = new MyAccountPage(driver);
			Map.click_tab_Orders();
			logger.info("****Clicked the orders tab****");
			
			if(Map.check_row_firstOrder()) {
				
				logger.info("****First product has been displayed ****");
				logger.info("****TC_181_ValidationOfDisplayingAFirstProductInOrdersTab_MyAccountPage finished positive ****");
				Assert.assertTrue(true);
			}else {
				
				logger.error("****First product has not been displayed****");
				logger.info("****TC_181_ValidationOfDisplayingAFirstProductInOrdersTab_MyAccountPage finished negative ****");
				Assert.fail("****First product has not been displayed****");
				
			}
			
			
			
			
	}catch(Exception e) {
				
				logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
				Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
			}
		
	}
	
}
