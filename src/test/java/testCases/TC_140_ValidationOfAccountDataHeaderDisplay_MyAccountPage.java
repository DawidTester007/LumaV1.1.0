package testCases;

import org.testng.Assert;

import org.testng.annotations.Test;

import baseTest.BaseTest;

import pages.MyAccountPage;

public class TC_140_ValidationOfAccountDataHeaderDisplay_MyAccountPage extends BaseTest{
	@Test(groups = {"functional","regression","master"})
	public void ValidationOfAccountDataHeaderDisplay_MyAccountPage() {
		
		try {
			logger.info("****Starting TC_140_ValidationOfAccountDataTextDisplay_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			logger.info("****Veronica demo account is logged in****");
			MyAccountPage Map = new MyAccountPage(driver);
			if(Map.check_header_DataOfAccount()==true) {
				
				logger.info("****The account data header has been displayed****");
				logger.info("****TC_140_ValidationOfAccountDataHeaderDisplay_MyAccountPage finished positive****");
				Assert.assertTrue(true);
			}else {
				
				logger.error("****The account data header has been displayed****");
				logger.info("****TC_140_ValidationOfAccountDataHeaderDisplay_MyAccountPage finished negative****");
				Assert.fail("****The account data header has been displayed****");
				
				
				}
			
			
			
		}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
		}
		
	}
	
}
