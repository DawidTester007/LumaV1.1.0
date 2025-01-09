package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.Men_PantsPage;

public class TC_039_ValidationOfPageName_Pants_MainMenu_M extends BaseTest {
	@Test(groups ={"functional","master"})
	public void ValidationOfPageName_Pants_MainMenu_M() {
		try {
		logger.info("****Starting TC_039_ValidationOfPageName_Pants_MainMenu_M ****");
		MainMenuPage Mm = new MainMenuPage(driver);
		
		Mm.click_Men_Pants();
		logger.info("**** Clicked a category 'Pants' in menu --> men ****");
		Men_PantsPage Mp = new Men_PantsPage(driver);
		String expName = "Pants";
		if(Mp.get_txt_Name_Category().equals(expName)) {
			
			Assert.assertTrue(true);
			logger.info("****Page name is correct ****");
			logger.info("****TC_039_ValidationOfPageName_Pants_MainMenu_M finished positive****");
			
		}else {
			logger.error("**** Page name is incorrect ****");
			logger.info("****TC_039_ValidationOfPageName_Pants_MainMenu_M finished negative****");
			
			Assert.fail("**** Page name is incorrect ****");
		}
	}catch(Exception e) {
		
		logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
		Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
	}
	}
	
	

}
