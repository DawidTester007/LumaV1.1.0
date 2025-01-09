package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.Men_JacketsPage;



public class TC_035_ValidationOfPageName_Jacket_MainMenu_M extends BaseTest {
	@Test(groups ={"functional","master"})
	public void ValidationOfPageName_Jacket_MainMenu_M() {
		try {
		logger.info("****Starting TC_035_ValidationOfPageName_Jacket_MainMenu_M ****");
		MainMenuPage Mm = new MainMenuPage(driver);
		
		Mm.click_Men_Jacket();
		logger.info("**** Clicked a category 'Jackets' in menu --> men ****");
		Men_JacketsPage Mj = new Men_JacketsPage(driver);
		String expName = "Jackets";
		if(Mj.get_txt_Name_Category().equals(expName)) {
			
			Assert.assertTrue(true);
			logger.info("**** Page name is correct ****");
			logger.info("****TC_035_ValidationOfPageName_Jacket_MainMenu_M finished positive****");
			
		}else {
			logger.error("**** Page name is incorrect****");
			logger.info("****TC_035_ValidationOfPageName_Jacket_MainMenu_M finished negative****");
			
			Assert.fail("**** Page name is incorrect****");
		}
}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
		}
	}
	
	

}
