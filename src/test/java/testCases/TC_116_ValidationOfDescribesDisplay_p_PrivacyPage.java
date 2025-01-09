package testCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.FooterPage;
import pages.PrivacyPage;
@Test(groups = {"functional","master"})
public class TC_116_ValidationOfDescribesDisplay_p_PrivacyPage extends BaseTest{

	public void ValidationOfDescribesDisplay_p_PrivacyPage() {
	logger.info("**** Starting TC_116_ValidationOfDescribesDisplay_p_PrivacyPage ****");
	try {	
		FooterPage Fp = new FooterPage(driver);	
		String linkName = Fp.gettxt_linkTxt_privacy();
		Fp.click_linkTxt_privacy();
		logger.info("**** Clicked : "+linkName+" link ****");
		PrivacyPage Pp = new PrivacyPage(driver);
		int i = 0;
		int expAmount = 32;
		for(WebElement h2 : Pp.List_txtp()) {
			
			try {
				if(!h2.getText().isEmpty()) {
				if(h2.isDisplayed()) {
					i++;
					logger.info("**** The describe number : "+i+" has been displayed****");
					
				}else {
					logger.error("****The describe number : "+i+" has been displayed****");
					logger.info("**** TC_116_ValidationOfDescribesDisplay_p_PrivacyPage finished negative ****");
					Assert.fail("****The describe number : "+i+" has been displayed****");
					
				}}else {
					
					logger.error("****The describe number : "+i+" is empty****");
					logger.info("**** TC_116_ValidationOfDescribesDisplay_p_PrivacyPage finished negative ****");
					Assert.fail("****The describe number : "+i+" is empty****");
				}
				
				
				
			}catch(Exception e) {
				
				logger.error("****The describe number : "+i+" has been displayed****");
				logger.info("**** TC_116_ValidationOfDescribesDisplay_p_PrivacyPage finished negative ****");
				Assert.fail("****The describe number : "+i+" has been displayed****");
			}
			
		}
		if(i==expAmount) {
		logger.info("****Each describe was displayed****");
		logger.info("**** TC_116_ValidationOfDescribesDisplay_p_PrivacyPage finished positive ****");
		Assert.assertTrue(true);
		}else {
			
			logger.error("****The number of descriptions does not match the expected number****");
			logger.info("**** TC_116_ValidationOfDescribesDisplay_p_PrivacyPage finished negative ****");
			Assert.fail("****The number of descriptions does not match the expected number****");
			
			
		}
		
	}catch(Exception e) {
		
		logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
		Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
	
		}
	
	
	}
	
}
