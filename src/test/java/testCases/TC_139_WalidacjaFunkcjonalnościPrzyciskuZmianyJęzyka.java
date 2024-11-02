package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;

public class TC_139_WalidacjaFunkcjonalnościPrzyciskuZmianyJęzyka extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void WalidacjaFunkcjonalnościPrzyciskuZmianyJęzyka() throws InterruptedException {
		try {
		logger.info("****Rozpoczęcie TC_139_WalidacjaFunkcjonalnościPrzyciskuZmianyJęzyka ****");
		MainPage Mp = new MainPage(driver);
		Mp.click_btn_switcherLang();
		logger.info("****Kliknięto przycisk Język****");
		Mp.click_btn_switcherLang_En();
		logger.info("****Wybrano opcję angielski****");
		String currTxt = Mp.get_Txt_btn_SignIn();
		String expTxt = "Sign In";
		
		if(currTxt.equalsIgnoreCase(expTxt)) {
			
			logger.info("****Zmienienie języka powiodło się****");
			logger.info("****TC_139_WalidacjaFunkcjonalnościPrzyciskuZmianyJęzyka zakończono powodzeniem****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****Zmienienie języka nie powiodło się****");
			logger.info("****TC_139_WalidacjaFunkcjonalnościPrzyciskuZmianyJęzyka zakończono powodzeniem****");
			Assert.fail();
			
		}
		
	}catch(Exception e) {
		
		logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
		Assert.fail();
	
	}
	}
	
}
