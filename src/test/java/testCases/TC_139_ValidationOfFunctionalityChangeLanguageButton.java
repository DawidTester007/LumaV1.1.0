package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;

public class TC_139_ValidationOfFunctionalityChangeLanguageButton extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void ValidationOfFunctionalityChangeLanguageButton() throws InterruptedException {
		try {
		logger.info("****Starting TC_139_ValidationOfFunctionalityChangeLanguageButton ****");
		MainPage Mp = new MainPage(driver);
		Mp.click_btn_switcherLang();
		logger.info("****Clicked language button****");
		Mp.click_btn_switcherLang_En();
		logger.info("****The english option has been chosen****");
		String currTxt = Mp.get_Txt_btn_SignIn();
		String expTxt = "Sign In";
		
		if(currTxt.equalsIgnoreCase(expTxt)) {
			
			logger.info("****A change language of page has been finished correctly****");
			logger.info("****TC_139_ValidationOfFunctionalityChangeLanguageButton finished positive****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****A change language of page has not been finished correctly****");
			logger.info("****TC_139_ValidationOfFunctionalityChangeLanguageButton finished negative****");
			Assert.fail("****A change language of page has not been finished correctly****");
			
		}
		
	}catch(Exception e) {
		
		logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
		Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
	
	}
	}
	
}
