package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.Women_PantsPage;



public class TC_031_WalidacjaNazwyStrony_Pants_MainMenu_F extends BaseTest {
	@Test(groups ={"functional","master"})
	public void WalidacjaNazwyStrony_Pants_MainMenu_F() {
		try {
		logger.info("****Rozpoczęto TC_031_WalidacjaNazwyStrony_Pants_MainMenu_F ****");
		MainMenuPage Mm = new MainMenuPage(driver);
		
		Mm.click_Women_Pants();
		logger.info("**** Kliknięto przycisk 'Pants' w kategorii 'Women' w menu ****");
		Women_PantsPage Wp = new Women_PantsPage(driver);
		String expName = "Pants";
		if(Wp.get_txt_Name_Category().equals(expName)) {
			
			Assert.assertTrue(true);
			logger.info("**** Nazwa strony jest poprawna ****");
			logger.info("****TC_031_WalidacjaNazwyStrony_Pants_MainMenu_F zakończył się powodzeniem****");
			
		}else {
			logger.error("**** Nazwa strony jest niepoprawna ****");
			logger.info("****TC_031_WalidacjaNazwyStrony_Pants_MainMenu_F zakończył się niepowodzeniem****");
			
			Assert.fail();
		}
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
			
		}
	}
	
	

}
