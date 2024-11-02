package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.AboutUsPage;
import pages.FooterPage;
import pages.PrivacyPage;

public class TC_108_WalidacjaKlikalnonościLinkuPrivacyLuma_AboutUsPage extends BaseTest{
	@Test(groups={"functional","regression","master"})
	public void WalidacjaKlikalnonościLinkuPrivacyLuma_AboutUsPage() {
		try {
		logger.info("**** Rozpoczęto TC_108_WalidacjaKlikalnonościLinkuPrivacyLuma_AboutUsPage ****");
		FooterPage Fp = new FooterPage(driver);
		Fp.click_linkTxt_aboutUs();
		logger.info("**** Kliknięto link AboutUs ****");
		AboutUsPage Aup = new AboutUsPage(driver);
		String linkName = Aup.gettxt_privacyLink_AboutUs();
		Aup.click_privacyLink_AboutUs();;
		logger.info("****Kliknięto link : "+linkName+"****");
		PrivacyPage Pp = new PrivacyPage(driver);
		String currTxt = Pp.get_txt_Name_Page();
		String ExpTxt = "Privacy Policy";
		if(ExpTxt.equals(currTxt)) {
			
			logger.info("****Nazwa strony jest poprawna****");
			logger.info("****TC_108_WalidacjaKlikalnonościLinkuPrivacyLuma_AboutUsPage zakończono powodzeniem****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****Nazwa strony jest niepoprawna****");
			logger.info("****TC_108_WalidacjaKlikalnonościLinkuPrivacyLuma_AboutUsPage zakończono niepowodzeniem****");
			Assert.fail();
			
		}
		
		}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
			}
		
	}
	
}
