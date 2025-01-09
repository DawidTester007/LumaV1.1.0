package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.FooterPage;

public class TC_094_ValidationOfMostSearchLinkText_FooterPage extends BaseTest {

	@Test(groups = {"functional","master"})
	public void ValidationOfMostSearchLinkText_FooterPage(){
		try {
		logger.info("****Starting TC_094_ValidationOfMostSearchLinkText_FooterPage****");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Scrolled page down****");
		
		FooterPage  Fp = new FooterPage(driver);
		String exptxt = "Wyszukiwane frazy";
		if(Fp.gettxt_linkTxt_PopularSearchItem().equals(exptxt)) {
			
			logger.info("****'Wyszukiwane frazy' link is correct****");
			logger.info("****TC_094_ValidationOfMostSearchLinkText_FooterPage finished positive****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****'Wyszukiwane frazy' link is incorrect****");
			logger.info("****TC_094_ValidationOfMostSearchLinkText_FooterPage finished negative ****");
			Assert.fail("****'Wyszukiwane frazy' link is incorrect****");
			
		}
	}catch(Exception e) {
		
		logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
		Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
	
		}
		
	}
	
}
