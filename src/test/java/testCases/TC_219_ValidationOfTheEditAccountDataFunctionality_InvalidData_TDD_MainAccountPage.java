package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;
import utilities.DataProv;

public class TC_219_ValidationOfTheEditAccountDataFunctionality_InvalidData_TDD_MainAccountPage extends BaseTest {
	@Test(groups = {"dataDriver","master"} , dataProvider = "InvalidDataEditAccountInfo", dataProviderClass = DataProv.class)
	public void ValidationOfTheEditAccountDataFunctionality_InvalidData_TDD_MainAccountPage(String name , String lastname , String email , String currPwd, String newPwd, String confPwd, String res) throws InterruptedException {
		try {
		logger.info("****Starting TC_219_ValidationOfTheEditAccountDataFunctionality_TDD_MainAccountPage****");
		BaseTest Bt = new BaseTest();
		Bt.LoginToVeronicaAccount();
		logger.info("****Veronica demo account is logged in****");
		MyAccountPage Map = new MyAccountPage(driver);
		Map.click_tab_AccountData();
		logger.info("****A account data tab has been clicked****");
		Map.click_checkBox_changeEmail();
		logger.info("****Change address email checkbox has been clicked****");
		Map.click_checkBox_changePwd();
		logger.info("****Change password checkbox has been clicked****");
		Map.clear_field_firstname();
		logger.info("****Name field has been cleared****");
		Map.clear_field_lastname();
		logger.info("****Lastname field has been cleared****");
		Map.clear_field_email();
		logger.info("****Email field has been cleared****");
		Map.send_field_firstname(name);
		Map.send_field_lastname(lastname);
		Map.send_field_email(email);
		Map.send_field_CurrPwd(currPwd);
		Map.send_field_Pwd(newPwd);
		Map.send_field_ConfPwd(confPwd);
		logger.info("****Fields : name, lastname, email, current password, new password, confirm passwrod have been filled in****");
		Map.click_btn_save();
		logger.info("****Save button has been clicked****");
		if(Map.check_msg_pwdDoesntMatch() || Map.check_msg_firstname() || Map.check_msg_lastname() || Map.check_msg_email() || Map.check_msg_confPwd() || Map.check_msg_currPwd() || Map.check_msg_Pwd() ) {
			
			logger.info("****Validation message has been displayed****");
			logger.info("****TC_219_ValidationOfTheEditAccountDataFunctionality_InvalidData_TDD_MainAccountPage finished positive****");
			Assert.assertTrue(true);
		}else {
			logger.error("****Validation message has not been displayed****");
			logger.info("****TC_219_ValidationOfTheEditAccountDataFunctionality_InvalidData_TDD_MainAccountPage finished negative****");
			Assert.fail("****Validation message has not been displayed****");
			
		}
		
		
}catch(Exception e) {
			
	logger.error("****An exception was thrown during test "+e.getMessage()+" ****");
	Assert.fail("****An exception was thrown during test "+e.getMessage()+" ****");
		
		}
	}
	
}
