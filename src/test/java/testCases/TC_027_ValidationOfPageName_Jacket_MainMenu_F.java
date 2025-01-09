package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.Women_JacketsPage;


public class TC_027_ValidationOfPageName_Jacket_MainMenu_F extends BaseTest {
	@Test(groups ={"functional","master"})
	public void ValidationOfPageName_Jacket_MainMenu_F() {
		try {
		logger.info("****Starting TC_027_ValidationOfPageName_Jacket_MainMenu_F ****");
		MainMenuPage Mm = new MainMenuPage(driver);
		
		Mm.click_Women_Jacket();
		logger.info("**** Clicked a subcategory 'Jackets' in menu --> women ****");
		Women_JacketsPage Wj = new Women_JacketsPage(driver);
		String expName = "Jackets";
		if(Wj.get_txt_Name_Category().equals(expName)) {
			
			Assert.assertTrue(true);
			logger.info("**** Page name is correct ****");
			logger.info("****TC_027_ValidationOfPageName_Jacket_MainMenu_F finished positive****");
			
		}else {
			logger.error("**** Page name is incorrect ****");
			logger.info("****TC_027_ValidationOfPageName_Jacket_MainMenu_F finished negative****");
			
			Assert.fail("**** Page name is incorrect ****");
		}
}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			
		}
	}
	
	

}
