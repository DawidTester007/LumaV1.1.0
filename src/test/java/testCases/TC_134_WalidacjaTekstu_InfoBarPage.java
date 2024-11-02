package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.InfoBarPage;

public class TC_134_WalidacjaTekstu_InfoBarPage extends BaseTest {
	@Test(groups = {"functional","master"})
	public void WalidacjaTekstu_InfoBar() {
		try {
		logger.info("****Rozpoczęto TC_134_WalidacjaTekstu_InfoBar****");
		InfoBarPage Ibp = new InfoBarPage(driver);
		String expTxt ="To jest sklep demo, resetowany co 6 godzin. Złożone zamówienia nie będą procesowane. Panel Administracyjny login: demo_admin hasło: demo_admin123";
		
		if(Ibp.get_txt_InfoBar().equalsIgnoreCase(expTxt)) {
			logger.info("****Tekst zgadza się z oczekiwanym tekstem****");
			logger.info("****TC_134_WalidacjaTekstu_InfoBar zakończono powodzeniem****");
			Assert.assertTrue(true);
		}else {
			logger.error("****Tekst nie zgadza się z oczekiwanym tekstem****");
			logger.info("****TC_134_WalidacjaTekstu_InfoBar zakończono niepowodzeniem****");
			Assert.fail();
			
		}
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
		}
	
		
	}
}
