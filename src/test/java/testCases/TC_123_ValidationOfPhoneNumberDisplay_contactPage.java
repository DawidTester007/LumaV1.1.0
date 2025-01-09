package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.ContactPage;
import pages.FooterPage;

public class TC_123_ValidationOfPhoneNumberDisplay_contactPage extends BaseTest {
	@Test(groups = {"functional","master"})
	public void ValidationOfPhoneNumberDisplay_contactPage() {
		try {
		logger.info("****Starting TC_123_ValidationOfPhoneNumberDisplay_contactPage****");
		FooterPage Fp = new FooterPage(driver);
		
		Fp.click_linkTxt_contact();
		logger.info("****Clicked contact us link****");
		ContactPage Cp = new ContactPage(driver);
		if(Cp.check_txt_number()==true) {
			
			logger.info("****Phone number has been displayed****");
			logger.info("****TC_123_ValidationOfPhoneNumberDisplay_contactPage finished positive****");
			Assert.assertTrue(true);
		}else {
			

			logger.error("****Phone number has not been displayed****");
			logger.info("****TC_123_ValidationOfPhoneNumberDisplay_contactPage zfinished negative****");
			Assert.fail("****Phone number has not been displayed****");;
		}
}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
	}
		
	}
	
}
