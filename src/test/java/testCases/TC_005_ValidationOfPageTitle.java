package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.WhatsNewPagePage;
import pages.MainMenuPage;

public class TC_005_ValidationOfPageTitle extends BaseTest {

	@Test(groups ={"functional","master"})
	public void ValidationOfPageTitle() {
		try {
		logger.info("****Starting TC_005_ValidationOfPageTitle****");
		MainMenuPage Mn = new MainMenuPage(driver);
		
		Mn.click_WhatsNew();
		logger.info("****Clicked a category 'WhatsNew'****");
		WhatsNewPagePage Wnp = new WhatsNewPagePage(driver);
		if(Wnp.check_NamePage()== true) {
			
			Assert.assertTrue(true);
			logger.info("****Name of page has been displayed ****");
			logger.info("****TC_005_ValidationOfPageTitle finished positive ****");
			
		}else {
			logger.error("****Name of page has not been displayed****");
			logger.info("****TC_005_ValidationOfPageTitle finished negative ****");
			Assert.fail("****Name of page has not been displayed****");
		
			
			
			
		}
}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			
		}
		
	}
	
}
