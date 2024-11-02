package testCases;

import org.testng.Assert;


import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.WatchesPage;


public class TC_043_WalidacjaNazwyStrony_Watches_MainMenu extends BaseTest {
	@Test(groups ={"functional","master"})
	public void WalidacjaNazwyStrony_Watches_MainMenu() {
		try {
		logger.info("****Rozpoczęto TC_043_WalidacjaNazwyStrony_Watches_MainMenu ****");
		MainMenuPage Mm = new MainMenuPage(driver);
		
		Mm.click_subCat_Gear_Watches();
		logger.info("**** Kliknięto przycisk 'Watches' menu ****");
		
		WatchesPage Wp = new WatchesPage(driver);
		String expName = "Watches";
		if(Wp.get_txt_Name_Category().equals(expName)) {
			
			Assert.assertTrue(true);
			logger.info("**** Nazwa strony jest poprawna ****");
			logger.info("****TC_043_WalidacjaNazwyStrony_Watches_MainMenu zakończył się powodzeniem****");
			
		}else {
			logger.error("**** Nazwa strony jest niepoprawna ****");
			logger.info("****TC_043_WalidacjaNazwyStrony_Watches_MainMenu zakończył się niepowodzeniem****");
			
			Assert.fail();
		}
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
			
		}
	}
	
	

}
