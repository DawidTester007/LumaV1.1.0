package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.Men_TeesPage;



public class TC_037_WalidacjaNazwyStrony_Tees_MainMenu_M extends BaseTest {
	@Test(groups ={"functional","master"})
	public void WalidacjaNazwyStrony_Tees_MainMenu_M() {
		try {
		logger.info("****Rozpoczęto TC_037_WalidacjaNazwyStrony_Tees_MainMenu_M ****");
		MainMenuPage Mm = new MainMenuPage(driver);
		
		Mm.click_Men_Tees();
		logger.info("**** Kliknięto przycisk 'Tees' w kategorii 'Men' w menu ****");
		Men_TeesPage Wt = new Men_TeesPage(driver);
		String expName = "Tees";
		if(Wt.get_txt_Name_Category().equals(expName)) {
			
			Assert.assertTrue(true);
			logger.info("**** Nazwa strony jest poprawna ****");
			logger.info("****TC_037_WalidacjaNazwyStrony_Tees_MainMenu_M zakończył się powodzeniem****");
			
		}else {
			logger.error("**** Nazwa strony jest niepoprawna ****");
			logger.info("****TC_037_WalidacjaNazwyStrony_Tees_MainMenu_M zakończył się niepowodzeniem****");
			
			Assert.fail();
		}
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
			
		}
	}
	
	

}
