package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.LoginPage;
import pages.MainPage;
import utilities.DataProv;

public class TC_004_WalidacjaNiepoprawnegoLogowania_TDD extends BaseTest {

	@Test (dataProvider = "DataLogin" , dataProviderClass = DataProv.class , groups ={"dataDriver","master"})
	public void WalidacjaLogowania_TDD(String email , String pwd , String res) {
		logger.info("**** TC_004_WalidacjaLogowania_TDD został rozpoczęty **** ");
		MainPage Mp = new MainPage(driver);
		try {
		Mp.click_btnZaloguj();
		logger.info("*** Kliknięto przycisk 'zaloguj się' **** ");
		LoginPage Lp = new LoginPage(driver);
		
		Lp.send_DataEmail(email);
		Lp.send_DataPwd(pwd);
		logger.info("*** Wypełniono pola **** ");
		Lp.click_btn_Zaloguj();
		logger.info("*** Kliknięto przycisk logowania **** ");
		
		if(res.equalsIgnoreCase("Invalid")) {
			
			if(Mp.check_msg_Witaj()==true) {
				logger.info("**** Dane są nieprawidłowe, użytkownik nie powinien zostać zalogoawny ****");
				logger.error("**** TC_004_WalidacjaLogowania_TDD zakończył się niepowodzeniem **** ");
				Assert.fail();
				
			}else if(Mp.check_msg_Witaj()==false) {
				logger.info("**** Użytkownik nie został zalogoawny **** ");
				logger.info("**** TC_004_WalidacjaLogowania_TDD zakończył się powodzeniem **** ");
				Assert.assertTrue(true);
				
				
			}
			
			if(res.equalsIgnoreCase("Valid")) {
				
				
				if(Mp.check_msg_Witaj()==true) {
					logger.info("**** Użytkownik zalogował się na konto **** ");
					logger.error("**** TC_004_WalidacjaLogowania_TDD zakończył się powodzeniem **** ");
					Assert.assertTrue(true);
					
				}
				
				else if(Mp.check_msg_Witaj()==false) {
					logger.info("**** Użytkownik nie zalogował się na konto **** ");
					logger.error("**** TC_004_WalidacjaLogowania_TDD zakończył się niepowodzeniem **** ");
					Assert.fail();
					
				}
			
			}
			
		}
		
		
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
			
		}
		
	}
	
}
