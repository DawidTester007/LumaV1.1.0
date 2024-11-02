package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.InfoBarPage;

public class TC_137_WalidacjaFunkcjonalnościLinku_InfoBarPage extends BaseTest{
	@Test(groups = {"functional","regression","master"})
	public void WalidacjaFunkcjonalnościLinku_InfoBarPage() {
		try {
		logger.info("**** Rozpoczęto TC_137_WalidacjaFunkcjonalnościLinku_InfoBarPage ****");
		InfoBarPage Ibp = new InfoBarPage(driver);
		String textLink = Ibp.get_txt_link_AdminPanel();
		Ibp.click_link_AdminPanel();
		logger.info("****Kliknięto Link :"+textLink+" ****");
		String expUrl = "https://demo-magento-2.auroracreation.com/admin_panel/";
		if(Ibp.get_currentUrl().equalsIgnoreCase(expUrl)) {
			logger.info("****Po kliknięciu linku, użytkownik został przeniesiony do poprawnej strony****");
			logger.info("****TC_137_WalidacjaFunkcjonalnościLinku_InfoBarPage zakończono powodzeniem****");
			Assert.assertTrue(true);
		}else {
			logger.error("****Po kliknięciu linku, użytkownik został przeniesiony do niepoprawnej strony****");
			logger.info("****TC_137_WalidacjaFunkcjonalnościLinku_InfoBarPage zakończono niepowodzeniem****");
			Assert.fail();
			
			
		}
	}catch(Exception e) {
		
		logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
		Assert.fail();
	
	}
		
		
	}
	
}
