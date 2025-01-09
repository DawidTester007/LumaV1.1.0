package testCases;

import org.testng.Assert;


import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.DowloadVideoPage;
import pages.MainMenuPage;



public class TC_044_ValidationOfPageName_Video_MainMenu extends BaseTest {
	@Test(groups ={"functional","master"})
	public void ValidationOfPageName_Video_MainMenu() {
		try {
		logger.info("****Rozpoczęto TC_044_ValidationOfPageName_Video_MainMenu ****");
		MainMenuPage Mm = new MainMenuPage(driver);
		
		Mm.click_subCat_Training_Video();
		logger.info("**** Clicked a category 'Video Download' in menu ****");
		
		DowloadVideoPage Dvp = new DowloadVideoPage(driver);
		String expName = "Video Download";
		if(Dvp.get_txt_Name_Category().equals(expName)) {
			
			Assert.assertTrue(true);
			logger.info("**** Page name is correct ****");
			logger.info("****TC_044_ValidationOfPageName_Video_MainMenu finished positive****");
			
		}else {
			logger.error("**** Page name is incorrect ****");
			logger.info("****TC_044_ValidationOfPageName_Video_MainMenu finished negative****");
			
			Assert.fail("**** Page name is incorrect ****");
		}
}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
		}
	}
	
	

}
