package testCases;

import org.testng.Assert;

import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_182_ValidationOfDisplayingASecondProductInOrdersTab_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void ValidationOfDisplayingASecondProductInOrdersTab_MyAccountPage() {
		
		try {
			logger.info("****Rozpoczęto TC_182_ValidationOfDisplayingASecondProductInOrdersTab_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			logger.info("****Veronica demo account is logged in****");
			MyAccountPage Map = new MyAccountPage(driver);
			Map.click_tab_Orders();
			logger.info("****Clicked the orders tab****");
			
			if(Map.check_row_secondOrder()) {
				
				logger.info("****Second product has been displayed****");
				logger.info("****TC_182_ValidationOfDisplayingASecondProductInOrdersTab_MyAccountPage finished positive****");
				Assert.assertTrue(true);
			}else {
				
				logger.error("****Second product has been displayed ****");
				logger.info("****TC_182_ValidationOfDisplayingASecondProductInOrdersTab_MyAccountPage finished negative ****");
				Assert.fail("****Second product has been displayed ****");
				
			}
			
			
			
			
	}catch(Exception e) {
				
				logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
				Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
			}
		
	}
	
}
