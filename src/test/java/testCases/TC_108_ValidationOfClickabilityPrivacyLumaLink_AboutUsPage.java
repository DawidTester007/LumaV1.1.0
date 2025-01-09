package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.AboutUsPage;
import pages.FooterPage;
import pages.PrivacyPage;

public class TC_108_ValidationOfClickabilityPrivacyLumaLink_AboutUsPage extends BaseTest{
	@Test(groups={"functional","regression","master"})
	public void ValidationOfClickabilityPrivacyLumaLink_AboutUsPage() {
		try {
		logger.info("**** Starting TC_108_ValidationOfClickabilityPrivacyLumaLink_AboutUsPage ****");
		FooterPage Fp = new FooterPage(driver);
		Fp.click_linkTxt_aboutUs();
		logger.info("**** Clicked about us link ****");
		AboutUsPage Aup = new AboutUsPage(driver);
		String linkName = Aup.gettxt_privacyLink_AboutUs();
		Aup.click_privacyLink_AboutUs();;
		logger.info("****Clicked : "+linkName+" link****");
		PrivacyPage Pp = new PrivacyPage(driver);
		String currTxt = Pp.get_txt_Name_Page();
		String ExpTxt = "Privacy Policy";
		if(ExpTxt.equals(currTxt)) {
			
			logger.info("****Page name is correct****");
			logger.info("****TC_108_ValidationOfClickabilityPrivacyLumaLink_AboutUsPage finished positive****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****Page name is incorrect****");
			logger.info("****TC_108_ValidationOfClickabilityPrivacyLumaLink_AboutUsPage finished negative****");
			Assert.fail("****Page name is incorrect****");
			
		}
		
		}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
			}
		
	}
	
}
