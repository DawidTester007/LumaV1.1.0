package testCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.CustomerServicePage;
import pages.FooterPage;

public class TC_111_ValidationOfDisplayingHeaders_h2_CustomerServicePage extends BaseTest {
	@Test(groups={"functional","master"})
	public void ValidationOfDisplayingHeaders_h2_CustomerServicePage() {
		
		logger.info("****Starting TC_111_ValidationOfDisplayingHeaders_h2_CustomerServicePage****");
		
		FooterPage Fp = new FooterPage(driver);
		String link = Fp.gettxt_linkTxt_service();
		Fp.click_linkTxt_service();
		logger.info("****Clicked: "+link+" link****");
		CustomerServicePage Csp = new CustomerServicePage(driver);
		int expAmount = 3;
		int i = 0;
		for(WebElement h2 : Csp.get_List_txt_Tag_h2()) {
			try {
			if(h2.isDisplayed()) {
			i++;
			logger.info("**** A header h2 number: "+i+" has been displayed****");
			
			}else {
			logger.error("**** A header h2 number: "+i+" has not been displayed ****");
			logger.info("**** TC_111_ValidationOfDisplayingHeaders_h2_CustomerServicePage finished negative ****");
			Assert.fail("**** A header h2 number: "+i+" has not been displayed ****");	
			}
			}catch(Exception e) {
				
				logger.error("**** A header h2 number: "+i+" has not been displayed ****");
				logger.info("**** TC_111_ValidationOfDisplayingHeaders_h2_CustomerServicePage finished negative ****");
				Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
				}
			
		}
		if(i==expAmount) {
			
			logger.info("**** Each of headers h2 have been displayed****");
			logger.info("**** TC_111_ValidationOfDisplayingHeaders_h2_CustomerServicePage finished positive ****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("**** Not each of headers h2 has been displayed****");
			logger.info("**** TC_111_ValidationOfDisplayingHeaders_h2_CustomerServicePage finished negative ****");
			Assert.fail("**** Not each of headers h2 has been displayed****");	
			
		}
	}
	
}
