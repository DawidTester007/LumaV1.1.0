package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.FooterPage;

public class TC_087_ValidationOfSearchLink_FooterPage extends BaseTest {

	@Test(groups = {"functional","regression","master"})
	public void ValidationOfSearchLink_FooterPage(){
		try {
		logger.info("****Starting TC_087_ValidationOfSearchLink_FooterPage****");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Scrolled down page****");
		
		FooterPage  Fp = new FooterPage(driver);
	
		if(Fp.check_linkTxt_PopularSearchItem()==true) {
			
			logger.info("****Link'Wyszukiwane frazy' has been displayed****");
			logger.info("****TC_087_ValidationOfSearchLink_FooterPage finished positive****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****Link'Wyszukiwane frazy' has not been displayed****");
			logger.info("****TC_087_ValidationOfSearchLink_FooterPage finished negative****");
			Assert.fail("****Link'Wyszukiwane frazy' has not been displayed****");
			
		}
	}catch(Exception e) {
		
		logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
		Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
	
		}
		
	}
	
}
