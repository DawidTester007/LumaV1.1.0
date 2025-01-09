package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.AboutUsPage;
import pages.ContactPage;
import pages.FooterPage;

public class TC_106_ValidationOfClickabilityContactLumaLink_AboutUsPage extends BaseTest{
	@Test(groups={"functional","regression","master"})
	public void ValidationOfClickabilityContactLumaLink_AboutUsPage() {
		try {
		logger.info("**** Starting TC_106_ValidationOfClickabilityContactLumaLink_AboutUsPage ****");
		FooterPage Fp = new FooterPage(driver);
		
		Fp.click_linkTxt_aboutUs();
		logger.info("**** Clicked about us link ****");
		AboutUsPage Aup = new AboutUsPage(driver);
		String linkName = Aup.gettxt_contactLink_AboutUs();
		Aup.click_contactLink_AboutUs();
		logger.info("****Clicked : "+linkName+" link ****");
		ContactPage Cp = new ContactPage(driver);
		String currTxt = Cp.get_txt_Name_Page();
		String ExpTxt = "Skontaktuj się z nami";
		if(ExpTxt.equals(currTxt)) {
			
			logger.info("****Name page is correct ****");
			logger.info("****TC_106_ValidationOfClickabilityContactLumaLink_AboutUsPage finished positive****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****Name page is incorrect ****");
			logger.info("****TC_106_ValidationOfClickabilityContactLumaLink_AboutUsPage finished negative****");
			Assert.fail("****Name page is incorrect ****");
			
		}
		
		}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
			}
		
	}
	
}
