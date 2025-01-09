package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.FooterPage;

public class TC_096_ValidationOfRefundLinkText_FooterPage extends BaseTest {

	@Test(groups = {"functional","master"})
	public void ValidationOfRefundLinkText_FooterPage(){
		try {
		logger.info("****Starting TC_096_ValidationOfRefundLinkText_FooterPage****");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Scrolled page down****");
		
		FooterPage  Fp = new FooterPage(driver);
		String exptxt = "Zamówienia i zwroty";
		if(Fp.gettxt_linkTxt_refund().equals(exptxt)) {
			
			logger.info("****'Zamówienia i zwroty' link is correct****");
			logger.info("****TC_096_ValidationOfRefundLinkText_FooterPage finished positive****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****'Zamówienia i zwroty' link is incorrect****");
			logger.info("****TC_096_ValidationOfRefundLinkText_FooterPage finished negative ****");
			Assert.fail("****'Zamówienia i zwroty' link is incorrect****");
			
		}
	}catch(Exception e) {
		
		logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
		Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
	
		}
		
	}
	
}
