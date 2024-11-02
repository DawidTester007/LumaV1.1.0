package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.LoginPage;

public class TC_001_WalidacjaPoprawnegoLogowania extends BaseTest {

	@Test(groups ={"sanity","master"})
	public void WalidacjaPoprawnegoLogowania() {
		
		MainPage Mp = new MainPage(driver);
		try {
		logger.info("*****Rozpoczęcie TC_001_WalidacjaPoprawnegoLogowania *****");
		Mp.click_btnZaloguj();
		logger.info("*****Kliknięto przycisk zaloguj*****");
		
		LoginPage Lp = new LoginPage(driver);
		Lp.send_DataEmail(prop.getProperty("email"));
		Lp.send_DataPwd(prop.getProperty("pwd"));
		logger.info("*****Wypełnieniono pola*****");
		Lp.click_btn_Zaloguj();
		logger.info("*****Kliknięto przycisk zaloguj*****");
		
		
		Assert.assertTrue(Mp.check_msg_Witaj());
		logger.info("***** Komunikat powitalny został wyświetlony *****"); 
		logger.info("***** TC_001_WalidacjaPoprawnegoLogowania zakończył się powodzeniem *****");
}catch(Exception e) {
			
			logger.error("***** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" *****");
			Assert.fail();
			
		}
	}
	
}
