package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.Men_TanksPage;
import pages.WhatsNewPagePage;



public class TC_017_ValidationOfPageName_Tanks_WhatsNew_M extends BaseTest{

	
	@Test(groups ={"functional","master"})
	public void ValidationOfPageName_Tanks_WhatsNew_M() {
		try {
		MainMenuPage Mm = new MainMenuPage(driver);
		logger.info("**** Starting TC_017_ValidationOfPageName_Tanks_WhatsNew_M  ****");
		Mm.click_WhatsNew();
		logger.info("**** Clicked a category 'Whats New' ****");
		
		WhatsNewPagePage Wnp = new WhatsNewPagePage(driver);
		
		Wnp.click_cat_Men_Tanks();;
		logger.info("**** Clicked a subcategory in men 'Tanks' ****");
		Men_TanksPage Mt = new Men_TanksPage(driver);
		String expNamePage = "Tanks";
		if(Mt.get_txt_Name_Category().equals(expNamePage)) {
			
			Assert.assertTrue(true);
			logger.info("**** Page name is correct ****");
			logger.info("**** TC_017_WalidacjaNazwyStrony_Tanks_WhatsNew_M finished positive ****");
		}else {
			logger.error("**** Page name is incorrect ****");
			logger.info("**** TC_017_WalidacjaNazwyStrony_Tanks_WhatsNew_M finished negative ****");
			Assert.fail("**** Page name is incorrect ****");
	
		}
}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
		}
		
	}
	
}
