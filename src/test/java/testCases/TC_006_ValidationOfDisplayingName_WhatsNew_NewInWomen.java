package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.WhatsNewPagePage;

public class TC_006_ValidationOfDisplayingName_WhatsNew_NewInWomen extends BaseTest {

	@Test(groups = {"functional","master"})
	public void ValidationOfDisplayingName_WhatsNew_NewInWomen() {
		try{
		logger.info("**** Staring TC_006_ValidationOfDisplayingName_WhatsNew_NewInWomen ****");
		MainMenuPage MM = new MainMenuPage(driver);
		MM.click_WhatsNew();
		logger.info("**** Clicked a category 'whatsNew' ****");
		WhatsNewPagePage Wnp = new WhatsNewPagePage(driver);
		if(Wnp.check_txt_NewsWomen()== true) {
		Assert.assertTrue(true);
		logger.info("**** Page Name has been displayed ****");
		logger.info("****TC_006_ValidationOfDisplayingName_WhatsNew_NewInWomen finished positive****");
		}else {
			
			logger.error("**** Name has not been displayed ****");
			logger.info("****TC_006_ValidationOfDisplayingName_WhatsNew_NewInWomen finished negative****");
			Assert.fail("**** Name has not been displayed ****");

			
			
		}
		
}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			
		}
		
	}
	
	
}
