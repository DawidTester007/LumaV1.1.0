package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_199_ValidationOfFunctionalityOfChangePasswordAndEmailCheckboxes_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void ValidationOfFunctionalityOfChangePasswordAndEmailCheckboxes_MyAccountPage() {
		try {
		BaseTest Bt = new BaseTest();
		Bt.LoginToVeronicaAccount();
		logger.info("****Veronica demo account is logged in****");
		MyAccountPage Map = new MyAccountPage(driver);
		Map.click_tab_AccountData();
		logger.info("****Clicked account data tab****");
		Map.click_checkBox_changeEmail();
		logger.info("****Change email checkbox has been checked****");
		Map.click_checkBox_changePwd();
		logger.info("****Change password checkbox has been checked****");
		String expTxt = "Zmień adres E-mail i hasło";
		if(Map.get_txt_changeEmailAndPwd().equalsIgnoreCase(expTxt)) {
			logger.info("****The requirement fields have been displayed****");
			logger.info("****TC_199_ValidationOfFunctionalityOfChangePasswordAndEmailCheckboxes_MyAccountPage finished positive****");
			Assert.assertTrue(true);
		}else {
			logger.error("****The requirement fields have been displayed****");
			logger.info("****TC_199_ValidationOfFunctionalityOfChangePasswordAndEmailCheckboxes_MyAccountPage finished negative****");
			Assert.fail("****The requirement fields have been displayed****");
		}
		}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
		}
	}
	
}
