package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.ContactPage;
import pages.FooterPage;
import pages.PrivacyPage;

public class TC_119_WalidacjaLinkuContactUs_PrivacyPage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void WalidacjaLinkuContactUs_PrivacyPage() {
		try {
		FooterPage Fp = new FooterPage(driver);	
		String linkName = Fp.gettxt_linkTxt_privacy();
		Fp.click_linkTxt_privacy();
		logger.info("**** Kliknięto link : "+linkName+" ****");
		PrivacyPage Pp = new PrivacyPage(driver);
		
		Pp.click_link_ContactUs();
		logger.info("****Kliknięto link 'Contact Us'****");
		String expNamePage="Skontaktuj się z nami";
		ContactPage Cp = new ContactPage(driver);
		System.out.println(Cp.get_txt_Name_Page());
		
		if(Cp.get_txt_Name_Page().equals(expNamePage)) {
			
			logger.info("****Link Contact Us działa poprawnie****");
			logger.info("****TC_119_WalidacjaLinkuContactUs_PrivacyPage zakończył się powodzeniem****");
			Assert.assertTrue(true);
		}else {
			logger.error("****Link Contact Us nie działa poprawnie****");
			logger.info("****TC_119_WalidacjaLinkuContactUs_PrivacyPage zakończył się niepowodzeniem****");
			Assert.fail();
			
		}
		}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
	}
		
	}
	
}
