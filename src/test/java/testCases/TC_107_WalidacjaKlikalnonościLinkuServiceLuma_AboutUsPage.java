package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.AboutUsPage;
import pages.CustomerServicePage;
import pages.FooterPage;

public class TC_107_WalidacjaKlikalnonościLinkuServiceLuma_AboutUsPage extends BaseTest{
	@Test(groups={"functional","regression","master"})
	public void WalidacjaKlikalnonościLinkuServiceLuma_AboutUsPage() {
		try {
		logger.info("**** Rozpoczęto TC_107_WalidacjaKlikalnonościLinkuServiceLuma_AboutUsPage ****");
		FooterPage Fp = new FooterPage(driver);
		Fp.click_linkTxt_aboutUs();
		logger.info("**** Kliknięto link AboutUs ****");
		AboutUsPage Aup = new AboutUsPage(driver);
		String linkName = Aup.gettxt_serviceLink_AboutUs();
		Aup.click_serviceLink_AboutUs();
		logger.info("****Kliknięto link : "+linkName+"****");
		CustomerServicePage Csp = new CustomerServicePage(driver);
		String currTxt = Csp.get_txt_Name_Page();
		String ExpTxt = "Obsługa klienta";
		if(ExpTxt.equals(currTxt)) {
			
			logger.info("****Nazwa strony jest poprawna****");
			logger.info("****TC_107_WalidacjaKlikalnonościLinkuServiceLuma_AboutUsPage zakończono powodzeniem****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****Nazwa strony jest niepoprawna****");
			logger.info("****TC_107_WalidacjaKlikalnonościLinkuServiceLuma_AboutUsPage zakończono niepowodzeniem****");
			Assert.fail();
			
		}
		
		}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
			}
		
	}
	
}
