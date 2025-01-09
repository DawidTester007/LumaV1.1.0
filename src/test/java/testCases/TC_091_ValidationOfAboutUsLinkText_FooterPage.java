package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.FooterPage;

public class TC_091_ValidationOfAboutUsLinkText_FooterPage extends BaseTest {

	@Test(groups = {"functional","master"})
	public void ValidationOfAboutUsLinkText_FooterPage(){
		try {
		logger.info("****Starting TC_091_ValidationOfAboutUsLinkText_FooterPage****");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Scrolled page down****");
		
		FooterPage  Fp = new FooterPage(driver);
		String exptxt = "About us";
		if(Fp.gettxt_linkTxt_aboutUs().equals(exptxt)) {
			
			logger.info("****The about us link is correct****");
			logger.info("****TC_091_ValidationOfAboutUsLinkText_FooterPage finished positive****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****The about us link is incorrect****");
			logger.info("****TC_091_ValidationOfAboutUsLinkText_FooterPage finished negative****");
			Assert.fail("****The about us link is incorrect****");
			
		}
	}catch(Exception e) {
		
		logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
		Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
	
		}
		
	}
	
}
