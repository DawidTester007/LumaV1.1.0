package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.FooterPage;

public class TC_092_ValidationOfServiceLinkText_FooterPage extends BaseTest {

	@Test(groups = {"functional","master"})
	public void ValidationOfServiceLinkText_FooterPage(){
		try {
		logger.info("****Starting TC_092_ValidationOfServiceLinkText_FooterPage****");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Scrolled page down****");
		
		FooterPage  Fp = new FooterPage(driver);
		String exptxt = "Customer Service";
		if(Fp.gettxt_linkTxt_service().equals(exptxt)) {
			
			logger.info("****The link 'Customer Service' is correct****");
			logger.info("****TC_092_ValidationOfServiceLinkText_FooterPage finished positive****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****The link 'Customer Service' is incorrect****");
			logger.info("****TC_092_ValidationOfServiceLinkText_FooterPage finished negative****");
			Assert.fail("****The link 'Customer Service' is incorrect****");
			
		}
	}catch(Exception e) {
		
		logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
		Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
	
		}
		
	}
	
}
