package testCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.CustomerServicePage;
import pages.FooterPage;

public class TC_112_ValidationOfDisplayingHeaders_h3_CustomerServicePage extends BaseTest {
	@Test(groups={"functional","master"})
	public void ValidationOfDisplayingHeaders_h3_CustomerServicePage() {
		try {
		logger.info("****Starting TC_112_ValidationOfDisplayingHeaders_h3_CustomerServicePage****");
		
		FooterPage Fp = new FooterPage(driver);
		String link = Fp.gettxt_linkTxt_service();
		Fp.click_linkTxt_service();
		logger.info("****Clicked: "+link+" link****");
		CustomerServicePage Csp = new CustomerServicePage(driver);
		int i = 0;
		int expAmount = 2;
		for(WebElement h3 : Csp.get_List_txt_Tag_h3()) {
			try {
			if(h3.isDisplayed()) {
			i++;
			logger.info("**** Text "+h3.getText()+" has been displayed ****");
			
			}else {
			logger.error("**** Header h3 number"+i+" has not displayed ****");
			logger.info("**** TC_112_ValidationOfDisplayingHeaders_h3_CustomerServicePage finished negative ****");
			Assert.fail("**** Header h3 number"+i+" has not displayed ****");	
			}
			}catch(Exception e) {
							
				logger.error("**** Header h3 number"+i+" has not displayed ****");
				logger.info("**** TC_112_ValidationOfDisplayingHeaders_h3_CustomerServicePage finished negative ****");
			Assert.fail("**** Header h3 number"+i+" has not displayed ****");
			}
			
		}
		if(i==expAmount) {
			
			logger.info("**** Each of headers h3 have been displayed****");
			logger.info("**** TC_112_ValidationOfDisplayingHeaders_h3_CustomerServicePage finished positive ****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("**** Not each of headers h3 have been displayed****");
			logger.info("**** TC_112_ValidationOfDisplayingHeaders_h3_CustomerServicePage finished negative ****");
			Assert.fail("**** Not each of headers h3 have been displayed****");	
			
		}	}catch(Exception e) {
			
			logger.error("****An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
			}
	}
	
}
