package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.Men_HoodiesAndSweatshirtsPage;
import pages.WhatsNewPagePage;


public class TC_014_ValidationOfPageName_Hoodies_WhatsNew_M extends BaseTest {

	@Test(groups ={"functional","master"})
	public void ValidationOfPageName_Hoodies_WhatsNew_M() {
		try {
		MainMenuPage Mm = new MainMenuPage(driver);
		logger.info("**** Starting TC_014_WalidacjaNazwyStrony_Hoodies_WhatsNew_M **** ");
		Mm.click_WhatsNew();
		logger.info("**** Clicked a category 'Whats New' ****");
		
		WhatsNewPagePage Wnp = new WhatsNewPagePage(driver);
		
		Wnp.click_cat_Men_HoodiesAndSweatshirts();
		logger.info("**** Clicked a subcategory in men 'Hoodies & Sweatshirts' ****");
		Men_HoodiesAndSweatshirtsPage Mhas = new Men_HoodiesAndSweatshirtsPage(driver);
		String expNamePage = "Hoodies & Sweatshirts";
		if(Mhas.get_txt_Name_Category().equals(expNamePage)) {
			
			Assert.assertTrue(true);
			logger.info("**** Page name is correct ****");
			logger.info("**** TC_014_WalidacjaNazwyStrony_Hoodies_WhatsNew_M finished positive****");
		}else {
			logger.error("**** Page ame is incorrect ****");
			logger.info("**** TC_014_WalidacjaNazwyStrony_Hoodies_WhatsNew_M finished negative ****");
			Assert.fail("**** Page ame is incorrect ****");
	
		}
		
}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
		}	
	}
}
