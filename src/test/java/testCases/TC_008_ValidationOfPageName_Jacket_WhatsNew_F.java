package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.WhatsNewPagePage;

import pages.Women_JacketsPage;

public class TC_008_ValidationOfPageName_Jacket_WhatsNew_F extends BaseTest {
	
	
	@Test(groups ={"functional","master"})
	public void ValidationOfPageName_Jacket_WhatsNew_F() {
		try {
		MainMenuPage Mm = new MainMenuPage(driver);
		logger.info("**** Starting TC_008_ValidationOfPageName_Jacket_WhatsNew_F **** ");
		Mm.click_WhatsNew();
		logger.info("**** Clicked a category 'Whats New' ****");
		
		WhatsNewPagePage Wnp = new WhatsNewPagePage(driver);
		
		Wnp.click_cat_Women_Jacket();
		logger.info("**** Clicked a subcategory in women 'Jackets' ****");
		Women_JacketsPage Wj = new Women_JacketsPage(driver);
		String expNamePage = "Jackets";
		if(Wj.get_txt_Name_Category().equals(expNamePage)) {
			
			Assert.assertTrue(true);
			logger.info("**** Page name is correct ****");
			logger.info("**** TC_008_WalidacjaNazwyStrony_Jacket_WhatsNew_F finished positive ****");
		}else {
			logger.error("**** Page name is incorrect ****");
			logger.info("**** TC_008_WalidacjaNazwyStrony_Jacket_WhatsNew_F finished negative ****");
			Assert.fail("**** Page name is incorrect ****");

		}
		
}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			
		}
	}
	

}
