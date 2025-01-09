package testCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.CustomerServicePage;
import pages.FooterPage;

public class TC_110_ValidationOfDisplayingTexts_CustomerServicePage extends BaseTest {
	@Test(groups={"functional","master"})
	public void ValidationOfDisplayingTexts_CustomerServicePage() {
		
		logger.info("****Starting TC_110_ValidationOfDisplayingTexts_CustomerServicePage****");
		try {
		FooterPage Fp = new FooterPage(driver);
		String link = Fp.gettxt_linkTxt_service();
		Fp.click_linkTxt_service();
		logger.info("****Clicked: "+link+ " link****");
		CustomerServicePage Csp = new CustomerServicePage(driver);
		int expAmount = 10;
		int i = 0;
		for(WebElement texts : Csp.get_List_txt_Tag_p()) {
			try {
			if(texts.isDisplayed()) {
			i++;
			logger.info("**** Number: "+i+" of describtion  ****");
			
			}else {
			logger.error("**** Describtion number: "+i+" has not been displayed****");
			logger.info("**** TC_110_ValidationOfDisplayingTexts_CustomerServicePage finished negative ****");
			Assert.fail("**** Describtion number: "+i+" has not been displayed****");	
			}
			
			}catch(Exception e) {
				
			logger.error("****Describtion number: "+i+" has not been displayed ****");
			logger.info("**** TC_110_ValidationOfDisplayingTexts_CustomerServicePage finished negative ****");
			Assert.fail("****Describtion number: "+i+" has not been displayed ****");	
			}
			
		}
		if(i==expAmount) {
			
			logger.info("**** Each of describtion have been displayed****");
			logger.info("**** TC_110_ValidationOfDisplayingTexts_CustomerServicePage finished positive ****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("**** Not each of describtion has been displayed****");
			logger.info("**** TC_110_ValidationOfDisplayingTexts_CustomerServicePage finished negative ****");
			Assert.fail("**** Not each of describtion has been displayed****");	
			
		}	}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
			}
	}
	
}
