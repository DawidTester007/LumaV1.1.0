package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.FooterPage;

public class TC_084_ValidationAboutUsLink_FooterPage extends BaseTest {

	@Test(groups = {"functional","regression","master"})
	public void ValidationAboutUsLink_FooterPage(){
		try {
		logger.info("****Starting TC_084_ValidationAboutUsLink_FooterPage****");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Scrolled down page****");
		
		FooterPage  Fp = new FooterPage(driver);
	
		if(Fp.check_linkTxt_aboutUs()==true) {
			
			logger.info("****Link about us has been displayed****");
			logger.info("****TC_084_ValidationAboutUsLink_FooterPage finished positive****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****Link about us has not been displayed****");
			logger.info("****TC_084_ValidationAboutUsLink_FooterPage finished negative****");
			Assert.fail("****Link about us has not been displayed****");
			
		}
	}catch(Exception e) {
		
		logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
		Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
	
		}
		
	}
	
}
