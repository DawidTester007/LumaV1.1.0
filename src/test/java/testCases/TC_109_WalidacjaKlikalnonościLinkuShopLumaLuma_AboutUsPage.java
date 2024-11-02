package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.AboutUsPage;
import pages.FooterPage;
import pages.MainPage;


public class TC_109_WalidacjaKlikalnonościLinkuShopLumaLuma_AboutUsPage extends BaseTest{
	@Test(groups={"functional","regression","master"})
	public void WalidacjaKlikalnonościLinkuShopLumaLuma_AboutUsPage() {
		try {
		logger.info("**** Rozpoczęto TC_109_WalidacjaKlikalnonościLinkuShopLumaLuma_AboutUsPage ****");
		FooterPage Fp = new FooterPage(driver);
		Fp.click_linkTxt_aboutUs();
		logger.info("**** Kliknięto link AboutUs ****");
		AboutUsPage Aup = new AboutUsPage(driver);
		String linkName = Aup.gettxt_lumaMainPageLink_AboutUs();
		Aup.click_lumaMainPageLink_AboutUs();;
		logger.info("****Kliknięto link : "+linkName+"****");
		MainPage Mp = new MainPage(driver);
		String currTxt = Mp.get_titleMainPage();
		String ExpTxt = "Home Page";
		if(ExpTxt.equals(currTxt)) {
			
			logger.info("****Tytuł strony jest poprawny****");
			logger.info("****TC_109_WalidacjaKlikalnonościLinkuShopLumaLuma_AboutUsPage zakończono powodzeniem****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****Tytuł strony jest niepoprawny****");
			logger.info("****TC_109_WalidacjaKlikalnonościLinkuShopLumaLuma_AboutUsPage zakończono niepowodzeniem****");
			Assert.fail();
			
		}
		
		}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
			}
		
	}
	
}
