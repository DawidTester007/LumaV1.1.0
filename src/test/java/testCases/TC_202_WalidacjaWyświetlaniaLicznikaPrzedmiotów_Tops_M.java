package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.MenTopsPage;

public class TC_202_WalidacjaWyświetlaniaLicznikaPrzedmiotów_Tops_M extends BaseTest{
	@Test(groups = {"functional","master"})
	public void WalidacjaWyświetlaniaLicznikaPrzedmiotów_Tops_M() {
		try {
		MainMenuPage Mmp = new MainMenuPage(driver);
		logger.info("****Rozpoczęto TC_202_WalidacjaWyświetlaniaLicznikaPrzedmiotów_Tops_M****");
		Mmp.click_Men_Tops();
		logger.info("****Kliknięto kategorię Men ----> Tops****");
		MenTopsPage Mtp = new MenTopsPage(driver);
		
		if(Mtp.check_txt_counterOfProducts()) {
			
			logger.info("****Pojawił się licznik produktów****");
			logger.info("****TC_202_WalidacjaWyświetlaniaLicznikaPrzedmiotów_Tops_M zakończono powodzeniem****");
			Assert.assertTrue(true);
		}else {
			logger.error("****Nie pojawił się licznik produktów****");
			logger.info("****TC_202_WalidacjaWyświetlaniaLicznikaPrzedmiotów_Tops_M zakończono niepowodzeniem****");
			Assert.fail();
			
		}
		}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
		}
	}
	
}
