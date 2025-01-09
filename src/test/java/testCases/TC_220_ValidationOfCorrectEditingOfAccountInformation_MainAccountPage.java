package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_220_ValidationOfCorrectEditingOfAccountInformation_MainAccountPage extends BaseTest {
	@Test(groups = {"interface","master"})
	public void ValidationOfCorrectEditingOfAccountInformation_MainAccountPage() throws InterruptedException  {
		try {
			logger.info("****Starting TC_220_ValidationOfCorrectEditingOfAccountInformation_MainAccountPage****");
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
			String name = BaseTest.randomString();
			String pwd = BaseTest.stringMix();
			System.out.println(name + " "+ pwd);
			Map.send_field_firstname(name);
			Map.send_field_lastname(BaseTest.randomString());
			Map.send_field_email(name+"@gmail.com");
			Map.send_field_CurrPwd(prop.getProperty("pwd"));
			Map.send_field_Pwd(pwd);
			Map.send_field_ConfPwd(pwd);
			logger.info("****Fields : name, lastname, email, current password, new password, confirm passwrod have been filled in****");
			Map.click_btn_save();
			logger.info("****Save button has been clicked****");
			if(Map.check_msg_tryAgainLater()==true) {
				
				logger.error("****The message: 'Unable to send mail. Please try again later.' has been displayed ****");
				logger.info("****TC_220_ValidationOfCorrectEditingOfAccountInformation_MainAccountPage finished negative****");
				Assert.fail("****The message: 'Unable to send mail. Please try again later.' has been displayed ****");
			}else {
				logger.info("****The message: 'Unable to send mail. Please try again later.' has not been displayed****");
				logger.info("****TC_220_ValidationOfCorrectEditingOfAccountInformation_MainAccountPage finished positive****");
				Assert.assertTrue(true);;
				
			}
			
			
	}catch(Exception e) {
				
		logger.error("****An exception was thrown during test "+e.getMessage()+" ****");
		Assert.fail("****An exception was thrown during test "+e.getMessage()+" ****");
			
			}
	}
	
}
