package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.ContactPage;
import pages.FooterPage;


public class TC_104_ValidationOfFunctionalityContactUsLink_FooterPage extends BaseTest {

	@Test(groups = {"functional","regression","master"})
	public void ValidationOfFunctionalityContactUsLink_FooterPage(){
		try {
		logger.info("****Starting TC_104_ValidationOfFunctionalityContactUsLink_FooterPage****");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Scrolled page down****");
		
		FooterPage  Fp = new FooterPage(driver);
		Fp.click_linkTxt_contact();
		logger.info("****Clicked contact us link****");
		ContactPage Cp = new ContactPage(driver);
		String expTxt = "Skontaktuj się z nami";
		if(Cp.get_txt_Name_Page().equals(expTxt)) {
			
			logger.info("****Page name is correct****");
			logger.info("****TC_104_ValidationOfFunctionalityContactUsLink_FooterPage finished positive****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****Page name is incorrect****");
			logger.info("****TC_104_ValidationOfFunctionalityContactUsLink_FooterPage finished negative ****");
			Assert.fail("****Page name is incorrect****");
			
		}
	}catch(Exception e) {
		
		logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
		Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
	
		}
		
	}
	
}
