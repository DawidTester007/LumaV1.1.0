package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.Women_ShortsPage;



public class TC_032_WalidacjaNazwyStrony_Shorts_MainMenu_F extends BaseTest {
	@Test(groups ={"functional","master"})
	public void WalidacjaNazwyStrony_Shorts_MainMenu_F() {
		try {
		logger.info("****Rozpoczęto TC_032_WalidacjaNazwyStrony_Shorts_Kobiety_MainMenu ****");
		MainMenuPage Mm = new MainMenuPage(driver);
		
		Mm.click_Women_Shorts();
		logger.info("**** Kliknięto przycisk 'Shorts' w kategorii 'Women' w menu ****");
		Women_ShortsPage Ws = new Women_ShortsPage(driver);
		String expName = "Shorts";
		if(Ws.get_txt_Name_Category().equals(expName)) {
			
			Assert.assertTrue(true);
			logger.info("**** Nazwa strony jest poprawna ****");
			logger.info("****TC_032_WalidacjaNazwyStrony_Shorts_MainMenu_F zakoczył się powodzeniem****");
			
		}else {
			logger.error("**** Nazwa strony jest niepoprawna ****");
			logger.info("****TC_032_WalidacjaNazwyStrony_Shorts_MainMenu_F zakończył się niepowodzeniem****");
			
			Assert.fail();
		}
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
			
		}
	}
	
	

}
