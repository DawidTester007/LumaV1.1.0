package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.ContactPage;
import pages.FooterPage;

public class TC_122_ValidationOfWeLoveHearingTextDisplay_contactPage extends BaseTest {
	@Test(groups = {"functional","master"})
	public void ValidationOfWeLoveHearingTextDisplay_contactPage() {
		try {
		logger.info("****Starting TC_122_ValidationOfWeLoveHearingTextDisplay_contactPage****");
		FooterPage Fp = new FooterPage(driver);
		
		Fp.click_linkTxt_contact();
		logger.info("****Clicked contact us link****");
		ContactPage Cp = new ContactPage(driver);
		if(Cp.check_txt_We_Love_Hearing()==true) {
			
			logger.info("****We love hearing text has been displayed****");
			logger.info("****TC_122_ValidationOfWeLoveHearingTextDisplay_contactPage finished positive****");
			Assert.assertTrue(true);
		}else {
			

			logger.error("****We love hearing text has not been displayed****");
			logger.info("****TC_122_ValidationOfWeLoveHearingTextDisplay_contactPage finished negative****");
			Assert.fail("****We love hearing text has not been displayed****");;
		}
		}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
	}
		
	}
	
}
