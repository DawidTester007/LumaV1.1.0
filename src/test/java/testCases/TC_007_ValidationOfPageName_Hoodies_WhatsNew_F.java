package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.WhatsNewPagePage;
import pages.Women_HoodiesAndSweatshirtsPage;

public class TC_007_ValidationOfPageName_Hoodies_WhatsNew_F extends BaseTest {
	
	@Test(groups ={"functional","master"})
	public void ValidationOfPageName_Hoodies_WhatsNew_F() {
		try {
		MainMenuPage Mm = new MainMenuPage(driver);
		logger.info("**** Starting TC_007_ValidationOfPageName_Hoodies_WhatsNew_F **** ");
		Mm.click_WhatsNew();
		logger.info("**** Clicked a button 'Whats New' ****");
		
		WhatsNewPagePage Wnp = new WhatsNewPagePage(driver);
		
		Wnp.click_cat_Women_HoodiesAndSweatshirts();
		logger.info("**** Clicked a subcategory in women 'Hoodies & Sweatshirts' ****");
		Women_HoodiesAndSweatshirtsPage Whas = new Women_HoodiesAndSweatshirtsPage(driver);
		String expNamePage = "Hoodies & Sweatshirts";
		if(Whas.get_txt_Name_Category().equals(expNamePage)) {
			
			Assert.assertTrue(true);
			logger.info("**** Page name is correct ****");
			logger.info("**** TC_007_ValidationOfPageName_Hoodies_WhatsNew_F finished positive ****");
		}else {
			logger.error("**** Page name is not correct ****");
			logger.info("**** TC_007_ValidationOfPageName_Hoodies_WhatsNew_F finished negative ****");
			Assert.fail("**** Page name is not correct ****");
	
		}
		
}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			
		}	
	}
	
}
