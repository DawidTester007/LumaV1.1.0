package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_145_ValidationOfDisplayingDriveryAddressHeader_MyAccountPage extends BaseTest{
	@Test(groups = {"functional","regression","master"})
	public void ValidationOfDisplayingDriveryAddressHeader_MyAccountPage() {
		
		try {
			logger.info("****Starting TC_145_ValidationOfDisplayingDriveryAddressHeader_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			logger.info("****Veronica demo account is logged in****");
			MyAccountPage Map = new MyAccountPage(driver);
			
			
			
			if(Map.check_header_DeriveryAddress()==true) {
				
				logger.info("****The Drivery Address header has been displayed****");
				logger.info("****TC_145_ValidationOfDisplayingDriveryAddressHeader_MyAccountPage finished positive****");
				Assert.assertTrue(true);
			}else {
				
				logger.error("****The Drivery Address header has not been displayed****");
				logger.info("****TC_145_ValidationOfDisplayingDriveryAddressHeader_MyAccountPage finished negative****");
				Assert.fail("****The Drivery Address header has not been displayed****");
				
				
				}
			
			
			
			
		}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
		}
		
	}
	
}
