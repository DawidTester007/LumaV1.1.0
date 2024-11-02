package testCases;

import org.testng.Assert;

import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.TrainingPage;

public class TC_023_WalidacjaNazwyStrony_Training extends BaseTest {

	
	@Test(groups ={"functional","master"})
	public void WalidacjaNazwyStrony_Training() {
		try {
		logger.info("****Rozpoczęto TC_022_WalidacjaNazwyStrony_Gear ****");
		MainMenuPage Mm = new MainMenuPage(driver);
		
		Mm.click_Training();
		logger.info("**** Kliknięto przycisk 'Training' w menu ****");
		TrainingPage Tp = new TrainingPage(driver);
		String expName = "Training";
		if(Tp.get_txt_Name_Category().equals(expName)) {
			
			Assert.assertTrue(true);
			logger.info("**** Nazwa strony jest poprawna ****");
			logger.info("****TC_023_WalidacjaNazwyStrony_Training zakończył się powodzeniem****");
			
		}else {
			logger.error("**** Nazwa strony jest niepoprawna ****");
			logger.info("****TC_023_WalidacjaNazwyStrony_Training zakończył się niepowodzeniem ***");
			
			Assert.fail();
		}
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
			
		}
	}
}
