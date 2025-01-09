package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.FooterPage;

public class TC_095_ValidationOfAdvanceSearchLinkText_FooterPage extends BaseTest {

	@Test(groups = {"functional","master"})
	public void ValidationOfAdvanceSearchLinkText_FooterPage(){
		try {
		logger.info("****Starting TC_095_ValidationOfAdvanceSearchLinkText_FooterPage****");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Scrolled page down****");
		
		FooterPage  Fp = new FooterPage(driver);
		String exptxt = "Wyszukiwanie zaawansowane";
		if(Fp.gettxt_linkTxt_advancedSearch().equals(exptxt)) {
			
			logger.info("****'Wyszukiwanie zaawansowane' link is correct****");
			logger.info("****TC_095_ValidationOfAdvanceSearchLinkText_FooterPage finished positive****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****'Wyszukiwanie zaawansowane' link is incorrect****");
			logger.info("****TC_095_ValidationOfAdvanceSearchLinkText_FooterPage finished negative ****");
			Assert.fail("****'Wyszukiwanie zaawansowane' link is incorrect****");
			
		}
	}catch(Exception e) {
		
		logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
		Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
	
		}
		
	}
	
}
