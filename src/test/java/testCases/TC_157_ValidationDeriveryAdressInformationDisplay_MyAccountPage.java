package testCases;

import org.testng.Assert;

import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_157_ValidationDeriveryAdressInformationDisplay_MyAccountPage extends BaseTest{
	@Test(groups = {"functional","regression","master"})
	public void ValidationDeriveryAdressInformationDisplay_MyAccountPage() {
		
		try {
			
			logger.info("****Starting TC_157_ValidationDeriveryAdressInformationDisplay_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			logger.info("****Veronica demo account is logged in****");
			MyAccountPage Map = new MyAccountPage(driver);
			if(Map.check_txt_InfoAdressDerivery()==true) {
				
				logger.info("****Information of derivery address has been displayed****");
				logger.info("****TC_157_ValidationDeriveryAdressInformationDisplay_MyAccountPage finished positive****");
				Assert.assertTrue(true);
			}else {
				

				logger.error("****Information of derivery address has not been displayed****");
				logger.info("****TC_157_ValidationDeriveryAdressInformationDisplay_MyAccountPage finished negative****");
				Assert.fail("****Information of derivery address has not been displayed****");
			}
			
		}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
		}
		
		
	}
	
}
