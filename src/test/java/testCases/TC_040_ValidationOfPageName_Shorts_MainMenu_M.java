package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.Men_ShortsPage;


public class TC_040_ValidationOfPageName_Shorts_MainMenu_M extends BaseTest {
	@Test(groups ={"functional","master"})
	public void ValidationOfPageName_Shorts_MainMenu_M() {
		try {
		logger.info("****Starting TC_040_ValidationOfPageName_Shorts_MainMenu_M ****");
		MainMenuPage Mm = new MainMenuPage(driver);
		
		Mm.click_Men_Shorts();
		logger.info("**** Clicked a category 'Shorts' in menu --> men ****");
		
		Men_ShortsPage Ms = new Men_ShortsPage(driver);
		String expName = "Shorts";
		if(Ms.get_txt_Name_Category().equals(expName)) {
			
			Assert.assertTrue(true);
			logger.info("**** Page name is correct ****");
			logger.info("****TC_040_ValidationOfPageName_Shorts_MainMenu_M finished positive****");
			
		}else {
			logger.error("**** Page name is correct ****");
			logger.info("****TC_040_ValidationOfPageName_Shorts_MainMenu_M finished negative ****");
			Assert.fail("**** Page name is correct ****");
		}
}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
		}
	}
	
	

}
