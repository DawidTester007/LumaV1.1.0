package testCases;

import org.testng.Assert;

import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_154_ValidationOfDisplayingNameAndEmailUser_MyAccountPage extends BaseTest{
	@Test(groups = {"functional","master"})
	public void ValidationOfDisplayingNameAndEmailUser_MyAccountPage() {
		
		try {
			
			logger.info("****Starting TC_154_ValidationOfDisplayingNameAndEmailUser_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			logger.info("****Veronica demo account is logged in****");
			MyAccountPage Map = new MyAccountPage(driver);
			if(Map.check_txt_infoNameAndEmail()==true) {
				
				logger.info("****Email and name have been displayed****");
				logger.info("****TC_154_ValidationOfDisplayingNameAndEmailUser_MyAccountPage finished positive****");
				Assert.assertTrue(true);
			}else {
				

				logger.error("****Email and name have not been displayed****");
				logger.info("****TC_154_ValidationOfDisplayingNameAndEmailUser_MyAccountPage finished negative****");
				Assert.fail("****Email and name have not been displayed****");
			}
			
		}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
		}
		
		
	}
	
}
