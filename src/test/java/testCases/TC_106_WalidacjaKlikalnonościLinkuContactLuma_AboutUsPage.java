package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.AboutUsPage;
import pages.ContactPage;
import pages.FooterPage;

public class TC_106_WalidacjaKlikalnonościLinkuContactLuma_AboutUsPage extends BaseTest{
	@Test(groups={"functional","regression","master"})
	public void WalidacjaKlikalnonościLinkuContactLuma_AboutUsPage() {
		try {
		logger.info("**** Rozpoczęto TC_106_WalidacjaKlikalnonościLinkuContactLuma_AboutUsPage ****");
		FooterPage Fp = new FooterPage(driver);
		
		Fp.click_linkTxt_aboutUs();
		logger.info("**** Kliknięto link AboutUs ****");
		AboutUsPage Aup = new AboutUsPage(driver);
		String linkName = Aup.gettxt_contactLink_AboutUs();
		Aup.click_contactLink_AboutUs();
		logger.info("****Kliknięto link : "+linkName+"****");
		ContactPage Cp = new ContactPage(driver);
		String currTxt = Cp.get_txt_Name_Page();
		String ExpTxt = "Skontaktuj się z nami";
		if(ExpTxt.equals(currTxt)) {
			
			logger.info("****Nazwa strony jest poprawna****");
			logger.info("****TC_106_WalidacjaKlikalnonościLinkuContactLuma_AboutUsPage zakończono powodzeniem****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****Nazwa strony jest niepoprawna****");
			logger.info("****TC_106_WalidacjaKlikalnonościLinkuContactLuma_AboutUsPage zakończono niepowodzeniem****");
			Assert.fail();
			
		}
		
		}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
			}
		
	}
	
}
