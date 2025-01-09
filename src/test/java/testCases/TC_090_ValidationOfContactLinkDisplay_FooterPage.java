package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.FooterPage;

public class TC_090_ValidationOfContactLinkDisplay_FooterPage extends BaseTest {

	@Test(groups = {"functional","regression","master"})
	public void ValidationOfContactLinkDisplay_FooterPage(){
		try {
		logger.info("****Starting TC_090_ValidationOfContactLinkDisplay_FooterPage****");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Scrolled page down****");
		
		FooterPage  Fp = new FooterPage(driver);
	
		if(Fp.check_linkTxt_contact()==true) {
			
			logger.info("****Contact link has been displayed****");
			logger.info("****TC_090_ValidationOfContactLinkDisplay_FooterPage finished positive****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****Contact link has not been displayed****");
			logger.info("****TC_090_ValidationOfContactLinkDisplay_FooterPage finished negative****");
			Assert.fail("****Contact link has not been displayed****");
			
		}
	}catch(Exception e) {
		
		logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
		Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
	
		}
		
	}
	
}
