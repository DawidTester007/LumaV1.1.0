package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_176_ValidationLastOrdersTextDisplay_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","master"})
	public void ValidationLastOrdersTextDisplay_MyAccountPage() {
		
		try {
			logger.info("****Starting TC_176_ValidationLastOrdersTextDisplay_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			logger.info("****Veronica demo account is logged in****");
			MyAccountPage Map = new MyAccountPage(driver);
			if(Map.check_txt_lastOrders()) {
				
				logger.info("****The text has been displayed ****");
				logger.info("****TC_176_ValidationLastOrdersTextDisplay_MyAccountPage finished positive****");
				Assert.assertTrue(true);
			}else {

				logger.error("****The text has not been displayed ****");
				logger.info("****TC_176_ValidationLastOrdersTextDisplay_MyAccountPage finished negative****");
				Assert.fail("****The text has not been displayed ****");
			}
			
			
			
	}catch(Exception e) {
				
				logger.error("****An exception was thrown during test:"+ e.getMessage()+" ****");
				Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
			}
		
	}
	
}
