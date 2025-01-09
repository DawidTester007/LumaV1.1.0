package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_177_ValidationOfFunctionalityShowAllProductsLink_MyAccountPage extends BaseTest {
	@Test(groups ={"functional","regression","master"})
	public void ValidationShowAllProductsLink_MyAccountPage() {
		
		try {
			logger.info("****Starting TC_177_ValidationOfFunctionalityShowAllProductsLink_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			logger.info("****Veronica demo account is logged in****");
			MyAccountPage Map = new MyAccountPage(driver);
			Map.click_link_ShowAllProducts();
			logger.info("****Clicked show all products link****");
			if(Map.check_header_LastOrders()) {
				
				logger.info("****The correct tab is active****");
				logger.info("****TC_177_ValidationOfFunctionalityShowAllProductsLink_MyAccountPage finished positive****");
				Assert.assertTrue(true);
			}else {

				logger.error("****The correct tab is inactive****");
				logger.info("****TC_177_ValidationOfFunctionalityShowAllProductsLink_MyAccountPage finished negative****");
				Assert.fail("****The correct tab is inactive****");
			}
			
			
			
	}catch(Exception e) {
				
				logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
				Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
			}
		
	}
	
}
