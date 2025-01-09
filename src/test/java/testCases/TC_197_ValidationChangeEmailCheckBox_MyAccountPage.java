package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_197_ValidationChangeEmailCheckBox_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void ValidationChangeEmailCheckBox_MyAccountPage() {
		try {
		BaseTest Bt = new BaseTest();
		Bt.LoginToVeronicaAccount();
		logger.info("****Veronica demo account is logged in****");
		MyAccountPage Map = new MyAccountPage(driver);
		Map.click_tab_AccountData();
		logger.info("****Clicked account data tab****");
		Map.click_checkBox_changeEmail();
		logger.info("****Change email checkbox has been checked****");
		String expTxt = "Zmień adres email";
		if(Map.get_txt_changeEmail().equalsIgnoreCase(expTxt)) {
			logger.info("****Additional fields has been displayed****");
			logger.info("****TC_197_ValidationChangeEmailCheckBox_MyAccountPage finished positive****");
			Assert.assertTrue(true);
		}else {
			logger.error("****Additional fields has not been displayed****");
			logger.info("****TC_197_ValidationChangeEmailCheckBox_MyAccountPage finished negative****");
			Assert.fail("****Additional fields has not been displayed****");
		}
		
	}catch(Exception e) {
		
		logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
		Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
	
	}
	}
	
}
