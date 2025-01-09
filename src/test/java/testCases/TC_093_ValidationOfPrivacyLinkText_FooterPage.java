package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.FooterPage;

public class TC_093_ValidationOfPrivacyLinkText_FooterPage extends BaseTest {

	@Test(groups = {"functional","master"})
	public void ValidationOfPrivacyLinkText_FooterPage(){
		try {
		logger.info("****Starting TC_093_ValidationOfPrivacyLinkText_FooterPage****");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Scrolled page down****");
		
		FooterPage  Fp = new FooterPage(driver);
		String exptxt = "Polityka prywatności i pliki cookie";
		if(Fp.gettxt_linkTxt_privacy().equals(exptxt)) {
			
			logger.info("****'Polityka prywatności i pliki cookie' link is correct ****");
			logger.info("****TC_093_ValidationOfPrivacyLinkText_FooterPage finished positive****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****'Polityka prywatności i pliki cookie' link is incorrect****");
			logger.info("****TC_093_ValidationOfPrivacyLinkText_FooterPage finished negative ****");
			Assert.fail("****'Polityka prywatności i pliki cookie' link is incorrect****");
			
		}
	}catch(Exception e) {
		
		logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
		Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
	
		}
		
	}
	
}
