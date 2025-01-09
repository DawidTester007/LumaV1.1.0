package testCases;

import org.testng.Assert;

import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_156_ValidationOfDisplayingInformationAboutSettlementAdress_MyAccountPage extends BaseTest{
	@Test(groups = {"functional","regression","master"})
	public void ValidationOfDisplayingInformationAboutSettlementAdress_MyAccountPage() {
		
		try {
			
			logger.info("****Starting TC_156_ValidationOfDisplayingInformationAboutSettlementAdress_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			logger.info("****Veronica demo account is logged in****");
			MyAccountPage Map = new MyAccountPage(driver);
			if(Map.check_txt_InfoAdressSettlement()==true) {
				
				logger.info("****Information about settlement adress has been displayed****");
				logger.info("****TC_156_ValidationOfDisplayingInformationAboutSettlementAdress_MyAccountPage finished positive****");
				Assert.assertTrue(true);
			}else {
				

				logger.error("****Information about settlement adress has not been displayed****");
				logger.info("****TC_156_ValidationOfDisplayingInformationAboutSettlementAdress_MyAccountPage finished negative****");
				Assert.fail("****Information about settlement adress has not been displayed****");
			}
			
		}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
		}
		
		
	}
	
}
