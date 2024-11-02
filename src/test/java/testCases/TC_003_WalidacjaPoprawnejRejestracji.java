package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.MyAccountPage;
import pages.RegistrationPage;


public class TC_003_WalidacjaPoprawnejRejestracji extends BaseTest {

	@Test(groups ={"sanity","master"})
	public void WalidacjaPoprawnejRejestracji() {
		logger.info("**** Rozpoczęto TC_003_WalidacjaPoprawnejRejestracji ****");
		MainPage Mp = new MainPage(driver);
		try{
		Mp.click_btnZarejestruj();
		logger.info("**** Kliknięto przycisk 'utwórz konto' ****");
	
		RegistrationPage Rp = new RegistrationPage(driver);
	
		Rp.send_firstname(randomString());
		Rp.send_lastname(randomString());
		Rp.send_email(randomString()+"@gmail.com");
		String pwd = stringMix();
		Rp.send_password(pwd);
		Rp.send_Confpassword(pwd);
	
		logger.info("**** Wprowadzono dane do pól ****");
		Rp.click_createAcc();
		logger.info("**** Kliknięto przycisk zarejestruj ****");
		MyAccountPage Map = new MyAccountPage(driver);
		Assert.assertTrue(Map.check_thanks());
		logger.info("**** Użytkownik został zarejestrowany ****");
		logger.info("**** TC_003_WalidacjaPoprawnejRejestracji zakończył się powodzeniem ****");
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
			
		}
	
}
	
}
