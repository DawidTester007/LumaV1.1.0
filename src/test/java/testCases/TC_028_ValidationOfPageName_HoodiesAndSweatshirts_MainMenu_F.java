package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.Women_HoodiesAndSweatshirtsPage;


public class TC_028_ValidationOfPageName_HoodiesAndSweatshirts_MainMenu_F extends BaseTest {
	@Test(groups ={"functional","master"})
	public void ValidationOfPageName_HoodiesAndSweatshirts_MainMenu_F() {
		try {
		logger.info("****Rozpoczęto TC_028_ValidationOfPageName_HoodiesAndSweatshirts_MainMenu_F ****");
		MainMenuPage Mm = new MainMenuPage(driver);
		
		Mm.click_Women_HoodiesAndSweatshirts();
		logger.info("**** Clicked a category 'Hoodies & Sweatshirts' in menu --> women ****");
		Women_HoodiesAndSweatshirtsPage Whas = new Women_HoodiesAndSweatshirtsPage(driver);
		String expName = "Hoodies & Sweatshirts";
		if(Whas.get_txt_Name_Category().equals(expName)) {
			
			Assert.assertTrue(true);
			logger.info("**** Page name is correct ****");
			logger.info("****TC_028_ValidationOfPageName_HoodiesAndSweatshirts_MainMenu_F finished positive****");
			
		}else {
			logger.error("**** Page name is incorrect ****");
			logger.info("****TC_028_ValidationOfPageName_HoodiesAndSweatshirts_MainMenu_F finished negative****");
			
			Assert.fail("**** Page name is incorrect ****");
		}
}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			
		}
	}
	
	

}
