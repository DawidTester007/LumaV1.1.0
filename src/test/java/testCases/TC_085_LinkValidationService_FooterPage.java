package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.FooterPage;

public class TC_085_LinkValidationService_FooterPage extends BaseTest {

	@Test(groups = {"functional","regression","master"})
	public void LinkValidationService_FooterPage(){
		try {
		logger.info("****Starting TC_085_LinkValidationService_FooterPage****");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Scrolled down page****");
		
		FooterPage  Fp = new FooterPage(driver);
	
		if(Fp.check_linkTxt_service()==true) {
			
			logger.info("****'Customer Service' link has been displayed****");
			logger.info("****TC_085_LinkValidationService_FooterPage finished positive****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****'Customer Service' link has not been displayed****");
			logger.info("****TC_085_LinkValidationService_FooterPage finished negative****");
			Assert.fail("****'Customer Service' link has not been displayed****");
			
		}
	}catch(Exception e) {
		
		logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
		Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
	
		}
		
	}
	
}
