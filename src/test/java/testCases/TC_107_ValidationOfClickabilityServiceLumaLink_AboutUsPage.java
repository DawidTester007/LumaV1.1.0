package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.AboutUsPage;
import pages.CustomerServicePage;
import pages.FooterPage;

public class TC_107_ValidationOfClickabilityServiceLumaLink_AboutUsPage extends BaseTest{
	@Test(groups={"functional","regression","master"})
	public void ValidationOfClickabilityServiceLumaLink_AboutUsPage() {
		try {
		logger.info("**** Starting TC_107_ValidationOfClickabilityServiceLumaLink_AboutUsPage ****");
		FooterPage Fp = new FooterPage(driver);
		Fp.click_linkTxt_aboutUs();
		logger.info("**** Clicked about us link ****");
		AboutUsPage Aup = new AboutUsPage(driver);
		String linkName = Aup.gettxt_serviceLink_AboutUs();
		Aup.click_serviceLink_AboutUs();
		logger.info("****Clicked : "+linkName+" link****");
		CustomerServicePage Csp = new CustomerServicePage(driver);
		String currTxt = Csp.get_txt_Name_Page();
		String ExpTxt = "Obsługa klienta";
		if(ExpTxt.equals(currTxt)) {
			
			logger.info("****Page name is correct****");
			logger.info("****TC_107_ValidationOfClickabilityServiceLumaLink_AboutUsPage finished positive****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****Page name is incorrect****");
			logger.info("****TC_107_ValidationOfClickabilityServiceLumaLink_AboutUsPage finished negative****");
			Assert.fail("****Page name is incorrect****");
			
		}
		
		}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
			}
		
	}
	
}
