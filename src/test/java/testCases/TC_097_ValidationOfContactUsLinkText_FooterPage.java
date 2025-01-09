package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.FooterPage;

public class TC_097_ValidationOfContactUsLinkText_FooterPage extends BaseTest {

	@Test(groups = {"functional","master"})
	public void ValidationOfContactUsLinkText_FooterPage(){
		try {
		logger.info("****Starting TC_097_ValidationOfContactUsLinkText_FooterPage****");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Scrolled page down****");
		
		FooterPage  Fp = new FooterPage(driver);
		String exptxt = "Skontaktuj się z nami";
		if(Fp.gettxt_linkTxt_contact().equals(exptxt)) {
			
			logger.info("****'Skontaktuj się z nami' link is correct****");
			logger.info("****TC_097_ValidationOfContactUsLinkText_FooterPage finshed positive****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****'Skontaktuj się z nami' link is incorrect****");
			logger.info("****TC_097_ValidationOfContactUsLinkText_FooterPage finished negative ****");
			Assert.fail("****'Skontaktuj się z nami' link is incorrect****");
			
		}
	}catch(Exception e) {
		
		logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
		Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
	
		}
		
	}
	
}
