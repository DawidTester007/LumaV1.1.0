package testCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.AboutUsPage;
import pages.FooterPage;

public class TC_105_ValidationOfInforamationTextsDisplay_AboutUsPage extends BaseTest {
	@Test(groups = {"functional","master"})
	public void ValidationOfInforamationTextsDisplay_AboutUsPage() {
		try {
		logger.info("**** Rozpoczęto TC_105_ValidationOfInforamationTextsDisplay_AboutUsPage ****");
		FooterPage Fp = new FooterPage(driver);
		
		Fp.click_linkTxt_aboutUs();
		logger.info("**** Clicked about us link ****");
		
		AboutUsPage Aup = new AboutUsPage(driver);
		int i = 1;
		for(WebElement Text : Aup.List_TextsAboutUs()) {
			
			try {
			boolean Display = Text.isDisplayed();
			
			if(Display) {
				logger.info("**** Text number : "+i+" has been displayed correctly ****");
				i++;
				
			}else {
				logger.error("**** Text number : "+i+" has been displayed incorrectly ****");
				logger.info("**** TC_105_ValidationOfInforamationTextsDisplay_AboutUsPage finished negative****");
				Assert.fail("**** Text number : "+i+" has been displayed incorrectly ****");
				
			}	}catch(Exception e) {
				
				logger.error("**** Text number : "+i+" has been displayed incorrectly ****");
				logger.info("**** TC_105_ValidationOfInforamationTextsDisplay_AboutUsPage finished negative****");
				Assert.fail("**** Text number : "+i+" has been displayed incorrectly ****");
				}
			
		}
		Assert.assertTrue(true);
		logger.info("**** Each of texts have been displayed****");
		logger.info("**** TC_105_ValidationOfInforamationTextsDisplay_AboutUsPage finished positive****");
	
		
	}catch(Exception e) {
		
		logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
		Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
	
		}
	
}}
