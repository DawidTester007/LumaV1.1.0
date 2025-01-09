package testCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.AboutUsPage;
import pages.CustomerServicePage;
import pages.FooterPage;

public class TC_113_ValidationOfDisplayingHeaderDataInTable_CustomerServicePage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void ValidationOfDisplayingHeaderDataInTable_CustomerServicePage() {
		
		logger.info("**** Starting TC_113_ValidationOfDisplayingHeaderDataInTable_CustomerServicePage ****");
		FooterPage Fp = new FooterPage(driver);
		try {
		Fp.click_linkTxt_aboutUs();
		logger.info("**** Clicked about us link ****");
		AboutUsPage Aup = new AboutUsPage(driver);
		String link = Aup.gettxt_serviceLink_AboutUs();
		Aup.click_serviceLink_AboutUs();
		
		logger.info("**** Clicked : "+link+" link ****");
		CustomerServicePage Csp = new CustomerServicePage(driver);
		int expAmount = 8 ;
		int i = 0;
		for(WebElement header : Csp.get_List_DataOfHeaderTab()) {
			try {
			if(header.isDisplayed()) {
				i++;
				logger.info("**** Text: "+header.getText()+" has been displayed****");
				
			}else {
				logger.error("**** Number data: "+i+" in header has not displayed****");
				logger.info("**** TC_113_ValidationOfDisplayingHeaderDataInTable_CustomerServicePage finished negative ****");
				Assert.fail("**** Number data: "+i+" in header has not displayed****");
			}
			}catch(Exception e) {
				
				logger.error("**** Number data: \"+i+\" in header has not displayed ****");
				logger.info("**** TC_113_ValidationOfDisplayingHeaderDataInTable_CustomerServicePage finished negative****");
				Assert.fail("**** Number data: \"+i+\" in header has not displayed ****");
				}
		
		}	
		if(i == expAmount) {
		logger.info("**** Each of header data have been displayed ****" );
		logger.info("**** TC_113_ValidationOfDisplayingHeaderDataInTable_CustomerServicePage finished positive ****");
		Assert.assertTrue(true);
		}else {
			logger.error("**** Not each of header data have been displayed ****" );
			logger.info("**** TC_113_ValidationOfDisplayingHeaderDataInTable_CustomerServicePage finished negative ****");
			Assert.fail("**** Not each of header data have been displayed ****");
			
		}
		}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
			}
		
		
	}
	
}
