package testCases;

import org.testng.Assert;


import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.FitnessPage;
import pages.MainMenuPage;


public class TC_042_WalidacjaNazwyStrony_Fitness_MainMenu extends BaseTest {
	@Test(groups ={"functional","master"})
	public void WalidacjaNazwyStrony_Fitness_MainMenu() {
		try {
		logger.info("****Rozpoczęto TC_042_WalidacjaNazwyStrony_Fitness_MainMenu ****");
		MainMenuPage Mm = new MainMenuPage(driver);
		
		Mm.click_subCat_Gear_FitnessEquipment();
		logger.info("**** Kliknięto przycisk 'FitnessEquipment' menu ****");
		
		FitnessPage Bp = new FitnessPage(driver);
		String expName = "Fitness Equipment";
		if(Bp.get_txt_Name_Category().equals(expName)) {
			
			Assert.assertTrue(true);
			logger.info("**** Nazwa strony jest poprawna ****");
			logger.info("****TC_042_WalidacjaNazwyStrony_Fitness_MainMenu zakończył się powodzeniem****");
			
		}else {
			logger.error("**** Nazwa strony jest niepoprawna ****");
			logger.info("****TC_042_WalidacjaNazwyStrony_Fitness_MainMenu zakończył się niepowodzeniem****");
			
			Assert.fail();
		}
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
			
		}
	}
	
	

}
