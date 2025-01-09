package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.ContactPage;
import pages.FooterPage;

public class TC_126_ValidationOfDisplayWeAreAvaliableText_contactPage extends BaseTest {
	@Test(groups = {"functional","master"})
	public void ValidationOfDisplayWeAreAvaliableText_contactPage() {
		try {
		logger.info("****Starting TC_126_ValidationOfDisplayWeAreAvaliableText_contactPage****");
		FooterPage Fp = new FooterPage(driver);
		
		Fp.click_linkTxt_contact();
		logger.info("****Clicked contact us link****");
		ContactPage Cp = new ContactPage(driver);
		if(Cp.check_txt_WeAreAvalaible24h7()==true) {
			
			logger.info("****The text has been displayed****");
			logger.info("****TC_126_ValidationOfDisplayWeAreAvaliableText_contactPage finished positive****");
			Assert.assertTrue(true);
		}else {
			

			logger.error("****The text has not been displayed****");
			logger.info("****TC_126_ValidationOfDisplayWeAreAvaliableText_contactPage finished negative****");
			Assert.fail("****The text has not been displayed****");
		}
		
}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
	}
	}
	
}
