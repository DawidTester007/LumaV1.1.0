package testCases;

import org.testng.Assert;

import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.TrainingPage;

public class TC_023_ValidationOfPageName_Training extends BaseTest {

	
	@Test(groups ={"functional","master"})
	public void ValidationOfPageName_Training() {
		try {
		logger.info("****Rozpoczęto TC_022_WalidacjaNazwyStrony_Gear ****");
		MainMenuPage Mm = new MainMenuPage(driver);
		
		Mm.click_Training();
		logger.info("**** Clicked a category 'Training' in menu ****");
		TrainingPage Tp = new TrainingPage(driver);
		String expName = "Training";
		if(Tp.get_txt_Name_Category().equals(expName)) {
			
			Assert.assertTrue(true);
			logger.info("**** Page name is correct ****");
			logger.info("****TC_023_WalidacjaNazwyStrony_Training finished positive****");
			
		}else {
			logger.error("**** Page name is incorrect ****");
			logger.info("****TC_023_WalidacjaNazwyStrony_Training finished negative ***");
			
			Assert.fail("**** Page name is incorrect ****");
		}
}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
		}
	}
}
