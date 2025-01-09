package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.Men_TanksPage;

public class TC_038_ValidationOfPageName_Tanks_MainMenu_M extends BaseTest {
	@Test(groups ={"functional","master"})
	public void ValidationOfPageName_Tanks_MainMenu_M() {
		try {
		logger.info("****Starting TC_038_ValidationOfPageName_Tanks_MainMenu_M ****");
		MainMenuPage Mm = new MainMenuPage(driver);
		
		Mm.click_Men_Tanks();
		logger.info("**** Clicked a category 'Tanks' in menu --> men ****");
		Men_TanksPage Wbat = new Men_TanksPage(driver);
		String expName = "Tanks";
		if(Wbat.get_txt_Name_Category().equals(expName)) {
			
			Assert.assertTrue(true);
			logger.info("**** Page name is correct ****");
			logger.info("****TC_038_ValidationOfPageName_Tanks_MainMenu_M finished positive****");
			
		}else {
			logger.error("**** Page name is incorrect ****");
			logger.info("****TC_038_ValidationOfPageName_Tanks_MainMenu_M finished negative****");
			
			Assert.fail();
		}
}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
		}
	}
	
	

}
