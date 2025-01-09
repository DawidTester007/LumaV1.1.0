package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.ContactPage;
import pages.FooterPage;
import pages.PrivacyPage;

public class TC_119_ValidationOfFunctionalityContactUsLink_PrivacyPage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void ValidationOfFunctionalityContactUsLink_PrivacyPage() {
		try {
		FooterPage Fp = new FooterPage(driver);	
		String linkName = Fp.gettxt_linkTxt_privacy();
		Fp.click_linkTxt_privacy();
		logger.info("**** Clicked : "+linkName+" link****");
		PrivacyPage Pp = new PrivacyPage(driver);
		
		Pp.click_link_ContactUs();
		logger.info("****Clicked 'Contact Us' link****");
		String expNamePage="Skontaktuj się z nami";
		ContactPage Cp = new ContactPage(driver);
		
		
		if(Cp.get_txt_Name_Page().equals(expNamePage)) {
			
			logger.info("****Contact us link works correctly ****");
			logger.info("****TC_119_ValidationOfFunctionalityContactUsLink_PrivacyPage finished positive****");
			Assert.assertTrue(true);
		}else {
			logger.error("****Contact us link works incorrectly****");
			logger.info("****TC_119_ValidationOfFunctionalityContactUsLink_PrivacyPage finished negative****");
			Assert.fail("****Contact us link works incorrectly****");
			
		}
		}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
	}
		
	}
	
}
