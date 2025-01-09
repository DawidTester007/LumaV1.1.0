package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.FooterPage;

public class TC_088_ValidationOfAdvanceSearchLinkDisplay_FooterPage extends BaseTest {

	@Test(groups = {"functional","regression","master"})
	public void ValidationOfAdvanceSearchLinkDisplay_FooterPage(){
		try {
		logger.info("****Starting TC_088_ValidationOfAdvanceSearchLinkDisplay_FooterPage****");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Scrolled down page****");
		
		FooterPage  Fp = new FooterPage(driver);
	
		if(Fp.checklinkTxt_advancedSearch()==true) {
			
			logger.info("****The 'Advance Search' link has been displayed****");
			logger.info("****TC_088_ValidationOfAdvanceSearchLinkDisplay_FooterPage finished positive****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****The 'Advance Search' link has not been displayed****");
			logger.info("****TC_088_ValidationOfAdvanceSearchLinkDisplay_FooterPage finished negative****");
			Assert.fail("****The 'Advance Search' link has not been displayed****");
			
		}
	}catch(Exception e) {
		
		logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
		Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
	
		}
		
	}
	
}
