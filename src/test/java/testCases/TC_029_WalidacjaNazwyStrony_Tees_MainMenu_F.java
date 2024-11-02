package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.Women_TeesPage;


public class TC_029_WalidacjaNazwyStrony_Tees_MainMenu_F extends BaseTest {
	@Test(groups ={"functional","master"})
	public void WalidacjaNazwyStrony_Tees_MainMenu_F() {
		try {
		logger.info("****Rozpoczęto TC_029_WalidacjaNazwyStrony_Tees_MainMenu_F ****");
		MainMenuPage Mm = new MainMenuPage(driver);
		
		Mm.click_Women_Tees();
		logger.info("**** Kliknięto przycisk 'Tees' w kategorii 'Women' w menu ****");
		Women_TeesPage Wt = new Women_TeesPage(driver);
		String expName = "Tees";
		if(Wt.get_txt_Name_Category().equals(expName)) {
			
			Assert.assertTrue(true);
			logger.info("**** Nazwa strony jest poprawna ****");
			logger.info("****TC_029_WalidacjaNazwyStrony_Tees_MainMenu_F zakończył się powodzeniem****");
			
		}else {
			logger.error("**** Nazwa strony jest niepoprawna ****");
			logger.info("****TC_029_WalidacjaNazwyStrony_Tees_MainMenu_F zakończył się niepowodzeniem****");
			
			Assert.fail();
		}
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
			
		}
	}
	
	

}
