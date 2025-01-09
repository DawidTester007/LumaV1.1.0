package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.WhatsNewPagePage;

public class TC_013_ValidationOfDisplayingPageName_WhatsNew_NewInMens extends BaseTest{

	
	@Test(groups = {"functional","master"})
	public void ValidationOfDisplayingPageName_WhatsNew_NewInMens() {
		try{
		logger.info("**** Starting TC_013_WalidacjaWyświetlaniaNazwyStrony_WhatsNew_NewInMens ****");
		MainMenuPage MM = new MainMenuPage(driver);
		MM.click_WhatsNew();
		logger.info("**** Clicked a category Whats New ****");
		WhatsNewPagePage Wnp = new WhatsNewPagePage(driver);
		if(Wnp.check_txt_Men()== true) {
		logger.info("****Page name has been displayed ****");
		logger.info("****TC_013_ValidationOfDisplayingPageName_WhatsNew_NewInMens finished positive****");
		Assert.assertTrue(true);
		}else {
			
			logger.error("****Page name has not been displayed ****");
			logger.info("****TC_013_ValidationOfDisplayingPageName_WhatsNew_NewInMens finished negative****");
			Assert.fail("****Page name has not been displayed ****");

			
			
		}
		
}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
		}
		
	}
}
