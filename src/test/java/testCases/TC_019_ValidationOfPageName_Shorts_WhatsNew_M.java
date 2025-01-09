package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.Men_ShortsPage;
import pages.WhatsNewPagePage;


public class TC_019_ValidationOfPageName_Shorts_WhatsNew_M extends BaseTest {

	
	@Test(groups ={"functional","master"})
	public void ValidationOfPageName_Shorts_WhatsNew_M() {
		try {
		MainMenuPage Mm = new MainMenuPage(driver);
		logger.info("**** Starting TC_019_ValidationOfPageName_Shorts_WhatsNew_M  ****");
		Mm.click_WhatsNew();
		logger.info("**** Clicked a category 'Whats New' ****");
		
		WhatsNewPagePage Wnp = new WhatsNewPagePage(driver);
		
		Wnp.click_cat_Men_Shorts();;
		logger.info("**** Clicked a subcategory in men 'Shorts' ****");
		Men_ShortsPage Ms = new Men_ShortsPage(driver);
		String expNamePage = "Shorts";
		if(Ms.get_txt_Name_Category().equals(expNamePage)) {
			
			Assert.assertTrue(true);
			logger.info("**** Page name is correct ****");
			logger.info("**** TC_019_ValidationOfPageName_Shorts_WhatsNew_M finished positive ****");
		}else {
			logger.error("**** Page name is incorrect****");
			logger.info("**** TC_019_ValidationOfPageName_Shorts_WhatsNew_M finished negative****");
			Assert.fail("**** Page name is incorrect ****");
	
		}
}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
		}
		
	}
}
