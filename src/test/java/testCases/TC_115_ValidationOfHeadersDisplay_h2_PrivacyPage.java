package testCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.FooterPage;
import pages.PrivacyPage;
@Test(groups = {"functional","master"})
public class TC_115_ValidationOfHeadersDisplay_h2_PrivacyPage extends BaseTest{

	public void WalidacjaWyświetlaniaNagłówkówh2_PrivacyPage() {
	logger.info("**** Starting TC_115_ValidationOfHeadersDisplay_h2_PrivacyPage ****");
	try {	
		FooterPage Fp = new FooterPage(driver);	
		String linkName = Fp.gettxt_linkTxt_privacy();
		Fp.click_linkTxt_privacy();
		logger.info("**** Clicked : "+linkName+" link****");
		PrivacyPage Pp = new PrivacyPage(driver);
		int i = 0 ;
		int expAmount = 14;
		for(WebElement h2 : Pp.get_List_txth2()) {
			
			try {
				if(h2.isDisplayed()) {
					i++;
					logger.info("****Header : "+h2.getText()+" has displayed****");
					
				}else {
					logger.error("****Header : "+h2.getText()+" has not displayed****");
					logger.info("**** TC_115_ValidationOfHeadersDisplay_h2_PrivacyPage finished negative ****");
					Assert.fail("****Header : "+h2.getText()+" has not displayed****");
					
				}
				
				
				
			}catch(Exception e) {
				
				logger.error("****Header : "+h2.getText()+" has not displayed****");
				logger.info("**** TC_115_ValidationOfHeadersDisplay_h2_PrivacyPage finished negative ****");
				Assert.fail("****Header : "+h2.getText()+" has not displayed****");
			}
			
		}
		if(i == expAmount) {
		logger.info("**** Each header has been displayed****");
		logger.info("**** TC_115_ValidationOfHeadersDisplay_h2_PrivacyPage finished positive ****");
		Assert.assertTrue(true);
		}else {
			
			logger.error("**** Each header has not been displayed****");
			logger.info("**** TC_115_ValidationOfHeadersDisplay_h2_PrivacyPage finished negative ****");
			Assert.fail("**** Each header has not been displayed****");
		}
		
	}catch(Exception e) {
		
		logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
		Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
	
		}
	
	
	}
	
}
