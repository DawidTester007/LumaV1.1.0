package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.MyAccountPage;
import pages.RegistrationPage;
import utilities.DataProv;


public class TC_002_ValidationOfIncorrectRegistration_TDD extends BaseTest {

	@Test(dataProvider = "InvalidDataRegistration",dataProviderClass = DataProv.class, groups ={"dataDriver","master"})
	public void ValidationOfIncorrectRegistration_TDD(String name, String lastName , String email, String pwd, String confPwd, String res) {
		logger.info("**** Starting TC_002_ValidationOfIncorrectRegistration_TDD ****");
		MainPage Mp = new MainPage(driver);
		try {
		Mp.click_btnZarejestruj();
		logger.info("**** Clicked button 'create account'****");
		
		RegistrationPage Rp = new RegistrationPage(driver);
		
		Rp.send_firstname(name);
		Rp.send_lastname(lastName);
		Rp.send_email(email);
		Rp.send_password(pwd);
		Rp.send_Confpassword(confPwd);
		
		logger.info("**** The fields have been filled in****");
		Rp.click_createAcc();
		logger.info("**** Clicked button 'register' ****");
		if(res.equalsIgnoreCase("Invalid")) {
			logger.info("**** Data was incorrect, user should not register ****");
			MyAccountPage Map = new MyAccountPage(driver);
			if(Map.check_thanks()==true) {
				logger.error("****The user registered on the site despite incorrect data ****");
				logger.info("**** TC_002_WalidacjaRejestracji_TDD finished negative****");
				Assert.fail("****The user registered on the site despite incorrect data ****");
				
			}else {
				
				Assert.assertTrue(true);
				logger.info("**** The user did not register to site****");
				logger.info("**** TC_002_WalidacjaRejestracji_TDD finished positive****");
			}
			
			
			
		}else {
			logger.info("**** TestCase contain only invalid data, that supposed to be reject by site ****");
			logger.info("**** TC_002_WalidacjaNiepoprawnejRejestracji_TDD finished negative ****");
		}
}catch(Exception e) {
			
			logger.error("**** During test was thrown an exception:"+ e.getMessage()+" ****");
			Assert.fail("**** During test was thrown an exception:"+ e.getMessage()+" ****");
			
		}
		
	}
	
}
	

