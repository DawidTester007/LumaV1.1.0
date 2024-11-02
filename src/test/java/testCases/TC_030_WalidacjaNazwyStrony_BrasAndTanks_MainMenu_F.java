package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.Women_BratAndTanksPage;



public class TC_030_WalidacjaNazwyStrony_BrasAndTanks_MainMenu_F extends BaseTest {
	@Test(groups ={"functional","master"})
	public void WalidacjaNazwyStrony_BrasAndTanks_MainMenu_F() {
		try {
		logger.info("****Rozpoczęto TC_030_WalidacjaNazwyStrony_BrasAndTanks_MainMenu_F ****");
		MainMenuPage Mm = new MainMenuPage(driver);
		
		Mm.click_Women_BrasAndTanks();
		logger.info("**** Kliknięto przycisk 'Bras & Tanks' w kategorii 'Women' w menu ****");
		Women_BratAndTanksPage Wbat = new Women_BratAndTanksPage(driver);
		String expName = "Bras & Tanks";
		if(Wbat.get_txt_Name_Category().equals(expName)) {
			
			Assert.assertTrue(true);
			logger.info("**** Nazwa strony jest poprawna ****");
			logger.info("****TC_030_WalidacjaNazwyStrony_BrasAndTanks_MainMenu_F zakończył się powodzeniem****");
			
		}else {
			logger.error("**** Nazwa strony jest niepoprawna ****");
			logger.info("****TC_030_WalidacjaNazwyStrony_BrasAndTanks_MainMenu_F zakończył się niepowodzeniem****");
			
			Assert.fail();
		}
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
			
		}
	}
	
	

}
