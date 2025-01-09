package testCases;

import org.testng.Assert;


import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.FitnessPage;
import pages.MainMenuPage;


public class TC_042_ValidationOfPageName_Fitness_MainMenu extends BaseTest {
	@Test(groups ={"functional","master"})
	public void ValidationOfPageName_Fitness_MainMenu() {
		try {
		logger.info("****Starting TC_042_ValidationOfPageName_Fitness_MainMenu ****");
		MainMenuPage Mm = new MainMenuPage(driver);
		
		Mm.click_subCat_Gear_FitnessEquipment();
		logger.info("**** Clicked a category 'FitnessEquipment' in menu ****");
		
		FitnessPage Bp = new FitnessPage(driver);
		String expName = "Fitness Equipment";
		if(Bp.get_txt_Name_Category().equals(expName)) {
			
			Assert.assertTrue(true);
			logger.info("**** Page name is correct ****");
			logger.info("****TC_042_ValidationOfPageName_Fitness_MainMenu finished positive****");
			
		}else {
			logger.error("**** Page name is incorrect ****");
			logger.info("****TC_042_ValidationOfPageName_Fitness_MainMenu finished negative****");
			
			Assert.fail("**** Page name is incorrect ****");
		}
}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
		}
	}
	
	

}
