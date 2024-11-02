package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.InfoBarPage;

public class TC_135_WalidacjaWyświetlaniaLinku_InfoBarPage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void WalidacjaWyświetlaniaLinku_InfoBar() {
		try {
		logger.info("****Rozpoczęto TC_135_WalidacjaWyświetlaniaLinku_InfoBar****");
		InfoBarPage Ibp = new InfoBarPage(driver);
		if(Ibp.check_link_AdminPanel()) {
			logger.info("****Wyświetlono link w pasku informacyjnym****");
			logger.info("****TC_135_WalidacjaWyświetlaniaLinku_InfoBar zakończono powodzeniem****");
			Assert.assertTrue(true);
		}else {
			logger.error("****Nie wyświetlono linku w pasku informacyjnym****");
			logger.info("****TC_135_WalidacjaWyświetlaniaLinku_InfoBar zakończono niepowodzeniem****");
			Assert.fail();
			
		}
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
		}
	
		
	}
}
