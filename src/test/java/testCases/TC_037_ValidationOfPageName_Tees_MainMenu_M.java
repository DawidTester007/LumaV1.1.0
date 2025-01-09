package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.Men_TeesPage;



public class TC_037_ValidationOfPageName_Tees_MainMenu_M extends BaseTest {
	@Test(groups ={"functional","master"})
	public void ValidationOfPageName_Tees_MainMenu_M() {
		try {
		logger.info("****Rozpoczęto TC_037_ValidationOfPageName_Tees_MainMenu_M ****");
		MainMenuPage Mm = new MainMenuPage(driver);
		
		Mm.click_Men_Tees();
		logger.info("**** Clicked a category 'Tees' in menu --> men ****");
		Men_TeesPage Wt = new Men_TeesPage(driver);
		String expName = "Tees";
		if(Wt.get_txt_Name_Category().equals(expName)) {
			
			Assert.assertTrue(true);
			logger.info("**** Page name is correct ****");
			logger.info("****TC_037_ValidationOfPageName_Tees_MainMenu_M finished positive****");
			
		}else {
			logger.error("**** Page name is incorrect ****");
			logger.info("****TC_037_ValidationOfPageName_Tees_MainMenu_M finished negative****");
			
			Assert.fail("**** Page name is incorrect ****");
		}
}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
		}
	}
	
	

}
