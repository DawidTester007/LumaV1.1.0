package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.Men_PantsPage;
import pages.WhatsNewPagePage;



public class TC_018_ValidationOfPageName_Pants_WhatsNew_M extends BaseTest {

	@Test(groups ={"functional","master"})
	public void ValidationOfPageName_Pants_WhatsNew_M() {
		try {
		MainMenuPage Mm = new MainMenuPage(driver);
		logger.info("**** Starting TC_018_ValidationOfPageName_Pants_WhatsNew_M  ****");
		Mm.click_WhatsNew();
		logger.info("**** Clicked a category'Whats New' ****");
		
		WhatsNewPagePage Wnp = new WhatsNewPagePage(driver);
		
		Wnp.click_cat_Men_Pants();;;
		logger.info("**** Clicked a subcategory in men'Pants' ****");
		Men_PantsPage Wp = new Men_PantsPage(driver);
		String expNamePage = "Pants";
		if(Wp.get_txt_Name_Category().equals(expNamePage)) {
			
			Assert.assertTrue(true);
			logger.info("**** Page name is correct****");
			logger.info("**** TC_018_WalidacjaNazwyStrony_Pants_WhatsNew_M finished positive ****");
		}else {
			logger.error("**** Page name is incorrect ****");
			logger.info("**** TC_018_WalidacjaNazwyStrony_Pants_WhatsNew_M finished negative ****");
			Assert.fail("**** Page name is incorrect ****");
	
		}
}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
		}
		
	}
}
