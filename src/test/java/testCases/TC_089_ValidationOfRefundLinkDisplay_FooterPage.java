package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.FooterPage;

public class TC_089_ValidationOfRefundLinkDisplay_FooterPage extends BaseTest {

	@Test(groups = {"functional","regression","master"})
	public void ValidationOfRefundLinkDisplay_FooterPage(){
		try {
		logger.info("****Starting TC_089_ValidationOfRefundLinkDisplay_FooterPage****");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Scrolled page down****");
		
		FooterPage  Fp = new FooterPage(driver);
	
		if(Fp.check_linkTxt_refund()==true) {
			
			logger.info("****Link Refund has been displayed****");
			logger.info("****TC_089_ValidationOfRefundLinkDisplay_FooterPage finished positive****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****Link Refund has not been displayed****");
			logger.info("****TC_089_ValidationOfRefundLinkDisplay_FooterPage finished negative****");
			Assert.fail("****Link Refund has not been displayed****");
			
		}
	}catch(Exception e) {
		
		logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
		Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
	
		}
		
	}
	
}
