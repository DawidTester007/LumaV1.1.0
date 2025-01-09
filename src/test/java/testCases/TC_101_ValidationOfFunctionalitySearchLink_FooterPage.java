package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.FooterPage;
import pages.PopularSearchPage;


public class TC_101_ValidationOfFunctionalitySearchLink_FooterPage extends BaseTest {

	@Test(groups = {"functional","regression","master"})
	public void ValidationOfFunctionalitySearchLink_FooterPage(){
		try {
		logger.info("****Starting TC_101_ValidationOfFunctionalitySearchLink_FooterPage****");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Scrolled page down****");
		
		FooterPage  Fp = new FooterPage(driver);
		Fp.click_linkTxt_PopularSearchItem();
		logger.info("****Clicked search link****");
		PopularSearchPage Msp = new PopularSearchPage(driver);
		String expTxt = "Popularne wyszukiwane frazy";
		if(Msp.get_txt_Name_Page().equals(expTxt)) {
			
			logger.info("****Page name is correct****");
			logger.info("****TC_101_ValidationOfFunctionalitySearchLink_FooterPage zakończył się powodzeniem****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****Page name is incorrect****");
			logger.info("****TC_101_ValidationOfFunctionalitySearchLink_FooterPage zakończył się niepowodzeniem ****");
			Assert.fail("****Page name is incorrect****");
			
		}
	}catch(Exception e) {
		
		logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
		Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
	
		}
		
	}
	
}
