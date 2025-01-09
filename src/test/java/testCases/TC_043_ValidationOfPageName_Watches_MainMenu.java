package testCases;

import org.testng.Assert;


import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.WatchesPage;


public class TC_043_ValidationOfPageName_Watches_MainMenu extends BaseTest {
	@Test(groups ={"functional","master"})
	public void ValidationOfPageName_Watches_MainMenu() {
		try {
		logger.info("****Starting TC_043_ValidationOfPageName_Watches_MainMenu ****");
		MainMenuPage Mm = new MainMenuPage(driver);
		
		Mm.click_subCat_Gear_Watches();
		logger.info("**** Clicked a category 'Watches' in menu ****");
		
		WatchesPage Wp = new WatchesPage(driver);
		String expName = "Watches";
		if(Wp.get_txt_Name_Category().equals(expName)) {
			
			Assert.assertTrue(true);
			logger.info("**** Page name is correct ****");
			logger.info("****TC_043_ValidationOfPageName_Watches_MainMenu finished positive****");
			
		}else {
			logger.error("**** Page name is incorrect ****");
			logger.info("****TC_043_ValidationOfPageName_Watches_MainMenu finished negative****");
			
			Assert.fail("**** Page name is incorrect ****");
		}
}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
		}
	}
	
	

}
