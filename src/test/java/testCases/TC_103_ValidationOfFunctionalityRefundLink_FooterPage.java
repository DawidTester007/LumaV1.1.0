package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.AdvanceSearchPage;
import pages.FooterPage;


public class TC_103_ValidationOfFunctionalityRefundLink_FooterPage extends BaseTest {

	@Test(groups = {"functional","regression","master"})
	public void ValidationOfFunctionalityRefundLink_FooterPage(){
		try {
		logger.info("****Starting TC_103_ValidationOfFunctionalityRefundLink_FooterPage****");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Scrolled page down****");
		
		FooterPage  Fp = new FooterPage(driver);
		Fp.click_linkTxt_refund();
		logger.info("****Clicked Refund link****");
		AdvanceSearchPage Asp = new AdvanceSearchPage(driver);
		String expTxt = "Zamówienia i zwroty";
		if(Asp.get_txt_Name_Page().equals(expTxt)) {
			
			logger.info("****Page name is correct****");
			logger.info("****TC_103_ValidationOfFunctionalityRefundLink_FooterPage finished positive****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****Page name is incorrect****");
			logger.info("****TC_103_ValidationOfFunctionalityRefundLink_FooterPage finished negative ****");
			Assert.fail("****Page name is incorrect****");
			
		}
	}catch(Exception e) {
		
		logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
		Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
	
		}
		
	}
	
}
