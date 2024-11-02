package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.MyAccountPage;
import pages.RegistrationPage;
import utilities.DataProv;


public class TC_002_WalidacjaNiepoprawnejRejestracji_TDD extends BaseTest {

	@Test(dataProvider = "InvalidDataRegistration",dataProviderClass = DataProv.class, groups ={"dataDriver","master"})
	public void WalidacjaRejestracji_TDD(String name, String lastName , String email, String pwd, String confPwd, String res) {
		logger.info("**** Rozpoczęto test TC_002_WalidacjaRejestracji_TDD ****");
		MainPage Mp = new MainPage(driver);
		try {
		Mp.click_btnZarejestruj();
		logger.info("**** Kliknięto przycisk 'utwórz konto' ****");
		
		RegistrationPage Rp = new RegistrationPage(driver);
		
		Rp.send_firstname(name);
		Rp.send_lastname(lastName);
		Rp.send_email(email);
		Rp.send_password(pwd);
		Rp.send_Confpassword(confPwd);
		
		logger.info("**** Wprowadzono dane do pól****");
		Rp.click_createAcc();
		logger.info("**** Kliknięto przycisk 'zarejestruj' ****");
		if(res.equalsIgnoreCase("Invalid")) {
			logger.info("**** Wprowadzone dane powinny spowodować nie zarejestrowanie użytkownika ****");
			MyAccountPage Map = new MyAccountPage(driver);
			if(Map.check_thanks()==true) {
				logger.error("**** Użytkownik zarejstrował się pomimo niepoprawnych danych****");
				logger.info("**** Test TC_002_WalidacjaRejestracji_TDD zakończył się niepowodzeniem****");
				Assert.assertTrue(false);
				
			}else {
				
				Assert.assertTrue(true);
				logger.info("**** Użytkownik nie został zarejestrowany****");
				logger.info("**** Test TC_002_WalidacjaRejestracji_TDD zakończył się powodzeniem****");
			}
			
			
			
		}else {
			logger.info("**** Przypadek testowy obejmuję dane, które powinny zostać odrzucone przez stronę ****");
			logger.info("**** TC_002_WalidacjaNiepoprawnejRejestracji_TDD zakończono niepowodzeniem ****");
		}
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
			
		}
		
	}
	
}
	

