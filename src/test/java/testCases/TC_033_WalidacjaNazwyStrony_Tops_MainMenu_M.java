package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.MenTopsPage;



public class TC_033_WalidacjaNazwyStrony_Tops_MainMenu_M extends BaseTest {
	@Test(groups ={"functional","master"})
	public void WalidacjaNazwyStrony_Tops_MainMenu_M() {
		try {
		logger.info("****Rozpoczęto TC_033_WalidacjaNazwyStrony_Tops_MainMenu_M  ****");
		MainMenuPage Mm = new MainMenuPage(driver);
		
		Mm.click_Men_Tops();;
		logger.info("**** Kliknięto przycisk 'Tops' w kategorii 'Men' w menu ****");
		MenTopsPage Mtp = new MenTopsPage(driver);
		String expName = "Tops";
		if(Mtp.get_txt_Name_Category().equals(expName)) {
			
			Assert.assertTrue(true);
			logger.info("**** Nazwa strony jest poprawna ****");
			logger.info("****TC_033_WalidacjaNazwyStrony_Tops_MainMenu_M zakończył się powodzeniem ****");
			
		}else {
			logger.error("**** Nazwa strony jest niepoprawna ****");
			logger.info("****TC_033_WalidacjaNazwyStrony_Tops_MainMenu_M zakończył się niepowodzeniem ****");
			
			Assert.fail();
		}
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
			
		}
	}
	
	

}
