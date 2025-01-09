package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.MyAccountPage;
import pages.RegistrationPage;


public class TC_003_ValidationOfCorrectRegister extends BaseTest {

	@Test(groups ={"sanity","master"})
	public void ValidationOfCorrectRegister() {
		logger.info("**** Starting TC_003_ValidationOfCorrectRegister ****");
		MainPage Mp = new MainPage(driver);
		try{
		Mp.click_btnZarejestruj();
		logger.info("**** Clicked a button 'create account' ****");
	
		RegistrationPage Rp = new RegistrationPage(driver);
	
		Rp.send_firstname(randomString());
		Rp.send_lastname(randomString());
		Rp.send_email(randomString()+"@gmail.com");
		String pwd = stringMix();
		Rp.send_password(pwd);
		Rp.send_Confpassword(pwd);
	
		logger.info("**** Fields have been filled in ****");
		Rp.click_createAcc();
		logger.info("**** Clicked a button 'register' ****");
		MyAccountPage Map = new MyAccountPage(driver);
		Assert.assertTrue(Map.check_thanks());
		logger.info("**** User was registered ****");
		logger.info("**** TC_003_ValidationOfCorrectRegister finished negative ****");
}catch(Exception e) {
			
			logger.error("****During test was thrown an exception:"+ e.getMessage()+" ****");
			Assert.fail("****During test was thrown an exception:"+ e.getMessage()+" ****");
			
		}
	
}
	
}
