package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_200_ValidationOfFunctionalityOfRemoteAssistanceShoppingCheckbox_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void ValidationOfFunctionalityOfRemoteAssistanceShoppingCheckbox_MyAccountPage() {
		try {
		BaseTest Bt = new BaseTest();
		Bt.LoginToVeronicaAccount();
		logger.info("****Veronica demo account is logged in****");
		MyAccountPage Map = new MyAccountPage(driver);
		Map.click_tab_AccountData();
		logger.info("****Clicked account data tab****");
		Map.click_checkBox_RemoteShopping();
		logger.info("****Allow remote shopping assistance checkbox has been selected****");
		if(Map.check_checkBox_RemoteShopping()) {
			logger.info("****CheckBox of Allow remote shopping assistance works correctly****");
			logger.info("****TC_200_ValidationOfFunctionalityOfRemoteAssistanceShoppingCheckbox_MyAccountPage finished positive****");
			Assert.assertTrue(true);
		}else {
			logger.error("****CheckBox of Allow remote shopping assistance works incorrectly****");
			logger.info("****TC_200_ValidationOfFunctionalityOfRemoteAssistanceShoppingCheckbox_MyAccountPage finished negative****");
			Assert.fail("****CheckBox of Allow remote shopping assistance works incorrectly****");
			
		}
		}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
		}
	}
	
}
