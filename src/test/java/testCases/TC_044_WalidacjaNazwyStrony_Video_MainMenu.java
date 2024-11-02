package testCases;

import org.testng.Assert;


import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.DowloadVideoPage;
import pages.MainMenuPage;



public class TC_044_WalidacjaNazwyStrony_Video_MainMenu extends BaseTest {
	@Test(groups ={"functional","master"})
	public void WalidacjaNazwyStrony_Video_MainMenu() {
		try {
		logger.info("****Rozpoczęto TC_044_WalidacjaNazwyStrony_Video_MainMenu ****");
		MainMenuPage Mm = new MainMenuPage(driver);
		
		Mm.click_subCat_Training_Video();
		logger.info("**** Kliknięto przycisk 'Video Download' menu ****");
		
		DowloadVideoPage Dvp = new DowloadVideoPage(driver);
		String expName = "Video Download";
		if(Dvp.get_txt_Name_Category().equals(expName)) {
			
			Assert.assertTrue(true);
			logger.info("**** Nazwa strony jest poprawna ****");
			logger.info("****TC_044_WalidacjaNazwyStrony_Video_MainMenu zakończył się powodzeniem****");
			
		}else {
			logger.error("**** Nazwa strony jest niepoprawna ****");
			logger.info("****TC_044_WalidacjaNazwyStrony_Video_MainMenu zakończył się niepowodzeniem****");
			
			Assert.fail();
		}
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
			
		}
	}
	
	

}
