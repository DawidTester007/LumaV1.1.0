package testCases;

import org.testng.Assert;

import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.BagsPage;
import pages.MainMenuPage;


public class TC_041_ValidationOfPageName_Bags_MainMenu extends BaseTest {
	@Test(groups ={"functional","master"})
	public void ValidationOfPageName_Bags_MainMenu() {
		try {
		logger.info("****Starting TC_041_ValidationOfPageName_Bags_MainMenu ****");
		MainMenuPage Mm = new MainMenuPage(driver);
		
		Mm.click_subCat_Gear_Bags();;
		logger.info("**** Clicked a category 'Bags' in menu ****");
		
		BagsPage Bp = new BagsPage(driver);
		String expName = "Bags";
		if(Bp.get_txt_Name_Category().equals(expName)) {
			
			Assert.assertTrue(true);
			logger.info("**** Page name is correct ****");
			logger.info("****TC_041_ValidationOfPageName_Bags_MainMenu finished positive****");
			
		}else {
			logger.error("**** Page name is incorrect ****");
			logger.info("****TC_041_ValidationOfPageName_Bags_MainMenu finished negative****");
			
			Assert.fail("**** Page name is incorrect ****");
		}
	}catch(Exception e) {
		
		logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
		Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
	}
	}
	
	

}
