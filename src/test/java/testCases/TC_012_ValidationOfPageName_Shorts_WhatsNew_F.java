package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.WhatsNewPagePage;
import pages.Women_PantsPage;

public class TC_012_ValidationOfPageName_Shorts_WhatsNew_F extends BaseTest {

	
	@Test(groups ={"functional","master"})
	public void ValidationOfPageName_Shorts_WhatsNew_F() {
		try {
		MainMenuPage Mm = new MainMenuPage(driver);
		logger.info("**** Starting TC_012_ValidationOfPageName_Shorts_WhatsNew_F ****");
		Mm.click_WhatsNew();
		logger.info("**** Clicked a category 'Whats New' ****");
		
		WhatsNewPagePage Wnp = new WhatsNewPagePage(driver);
		
		Wnp.click_cat_Women_Shorts();;
		logger.info("**** Clicked a subcategory in women 'Shorts' ****");
		Women_PantsPage Wp = new Women_PantsPage(driver);
		String expNamePage = "Shorts";
		if(Wp.get_txt_Name_Category().equals(expNamePage)) {
			
			Assert.assertTrue(true);
			logger.info("**** Page name is correct ****");
			logger.info("**** TC_012_WalidacjaNazwyStrony_Shorts_WhatsNew_F finished positive ****");
		}else {
			logger.error("**** Page name is incorrect ****");
			logger.info("**** TC_012_WalidacjaNazwyStrony_Shorts_WhatsNew_F finished negative ****");
			Assert.fail("**** Page name is incorrect ****");
	
		}
}catch(Exception e) {
			
			logger.error("****An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
		}
		
	}
}
