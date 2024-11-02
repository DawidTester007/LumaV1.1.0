package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.WomenTopsPage;


public class TC_025_WalidacjaNazwyStrony_Tops_MainMenu_F extends BaseTest {
	@Test(groups ={"functional","master"})
	public void WalidacjaNazwyStrony_Tops_MainMenu_F() {
		try {
		logger.info("****Rozpoczęto TC_025_WalidacjaNazwyStrony_Tops_MainMenu_F ****");
		MainMenuPage Mm = new MainMenuPage(driver);
		
		Mm.click_Women_Tops();;
		logger.info("**** Kliknięto przycisk 'Tops' w kategorii 'Women' w menu ****");
		WomenTopsPage Wtp = new WomenTopsPage(driver);
		String expName = "Tops";
		if(Wtp.get_txt_Name_Category().equals(expName)) {
			
			Assert.assertTrue(true);
			logger.info("**** Nazwa strony jest poprawna ****");
			logger.info("****TC_025_WalidacjaNazwyStrony_Tops_MainMenu_F zakończył się powodzeniem****");
			
		}else {
			logger.error("**** Nazwa strony jest niepoprawna ****");
			logger.info("****TC_025_WalidacjaNazwyStrony_Tops_MainMenu_F zakończył się niepowodzeniem****");
			
			Assert.fail();
		}
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
			
		}
	}
	
	

}
