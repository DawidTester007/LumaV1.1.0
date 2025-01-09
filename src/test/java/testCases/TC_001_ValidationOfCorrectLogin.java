package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.LoginPage;

public class TC_001_ValidationOfCorrectLogin extends BaseTest {

	@Test(groups ={"sanity","master"})
	public void ValidationOfCorrectLogin() {
		
		MainPage Mp = new MainPage(driver);
		try {
		logger.info("*****Starting TC_001_ValidationOfCorrectLogin *****");
		Mp.click_btnZaloguj();
		logger.info("*****Clicked button 'Login'*****");
		
		LoginPage Lp = new LoginPage(driver);
		Lp.send_DataEmail(prop.getProperty("email"));
		Lp.send_DataPwd(prop.getProperty("pwd"));
		logger.info("*****Filled fields*****");
		Lp.click_btn_Zaloguj();
		logger.info("*****Clicked button 'login in'*****");
		
		
		Assert.assertTrue(Mp.check_msg_Witaj());
		logger.info("***** The communicate was displayed *****"); 
		logger.info("***** TC_001_ValidationOfCorrectLogin finished positive *****");
}catch(Exception e) {
			
			logger.error("***** An exception was thrown during test:"+ e.getMessage()+" *****");
			logger.info("***** TC_001_ValidationOfCorrectLogin finished negative *****");
			Assert.fail("***** An exception was thrown during test:"+ e.getMessage()+" *****");
			
		}
	}
	
}
