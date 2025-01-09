package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.WhatsNewPagePage;
import pages.Women_BratAndTanksPage;


public class TC_010_ValidationOfPageName_BrasAndTanks_WhatsNew_F extends BaseTest{

	
	@Test(groups ={"functional","master"})
	public void ValidationOfPageName_BrasAndTanks_WhatsNew_F() {
		try {
		MainMenuPage Mm = new MainMenuPage(driver);
		logger.info("**** Starting TC_010_ValidationOfPageName_BrasAndTanks_WhatsNew_F  ****");
		Mm.click_WhatsNew();
		logger.info("**** Clicked a category 'Whats New' ****");
		
		WhatsNewPagePage Wnp = new WhatsNewPagePage(driver);
		
		Wnp.click_cat_Women_BrasAndTanks();;
		logger.info("**** Clicked a subcategory in women 'BrasAndTanks' ****");
		Women_BratAndTanksPage WBat = new Women_BratAndTanksPage(driver);
		String expNamePage = "Bras & Tanks";
		if(WBat.get_txt_Name_Category().equals(expNamePage)) {
			
			Assert.assertTrue(true);
			logger.info("**** Page name is correct ****");
			logger.info("**** TC_010_WalidacjaNazwyStrony_BrasAndTanks_WhatsNew_F finished positive ****");
		}else {
			logger.error("****Page name is incorrect ****");
			logger.info("**** TC_010_WalidacjaNazwyStrony_BrasAndTanks_WhatsNew_F finished negative ****");
			Assert.fail("****Page name is incorrect ****");
	
		}
}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			
		}
		
	}
	
}
