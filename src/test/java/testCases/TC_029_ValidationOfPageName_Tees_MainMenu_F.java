package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.Women_TeesPage;


public class TC_029_ValidationOfPageName_Tees_MainMenu_F extends BaseTest {
	@Test(groups ={"functional","master"})
	public void ValidationOfPageName_Tees_MainMenu_F() {
		try {
		logger.info("****Starting TC_029_ValidationOfPageName_Tees_MainMenu_F ****");
		MainMenuPage Mm = new MainMenuPage(driver);
		
		Mm.click_Women_Tees();
		logger.info("**** Clicked a category 'Tees' in menu --> women ****");
		Women_TeesPage Wt = new Women_TeesPage(driver);
		String expName = "Tees";
		if(Wt.get_txt_Name_Category().equals(expName)) {
			
			Assert.assertTrue(true);
			logger.info("**** Page name is correct ****");
			logger.info("****TC_029_ValidationOfPageName_Tees_MainMenu_F finished positive****");
			
		}else {
			logger.error("**** Page name is incorrect ****");
			logger.info("****TC_029_ValidationOfPageName_Tees_MainMenu_F finished negative****");
			
			Assert.fail("**** Page name is incorrect ****");
		}
}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			
		}
	}
	
	

}
