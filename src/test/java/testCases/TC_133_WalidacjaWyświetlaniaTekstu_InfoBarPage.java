package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.InfoBarPage;

public class TC_133_WalidacjaWyświetlaniaTekstu_InfoBarPage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void WalidacjaWyświetlaniaTekstu_InfoBar() {
		try {
		logger.info("****Rozpoczęto TC_133_WalidacjaWyświetlaniaTekstu_InfoBar****");
		InfoBarPage Ibp = new InfoBarPage(driver);
		if(Ibp.check_InfoBar()) {
			logger.info("****Wyświetlono tekst w pasku informacyjnym****");
			logger.info("****TC_133_WalidacjaWyświetlaniaTekstu_InfoBar zakończono powodzeniem****");
			Assert.assertTrue(true);
		}else {
			logger.error("****Nie wyświetlono tekstu w pasku informacyjnym****");
			logger.info("****TC_133_WalidacjaWyświetlaniaTekstu_InfoBar zakończono niepowodzeniem****");
			Assert.fail();
			
		}
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
		}
	
		
	}
}
