package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.Men_JacketsPage;



public class TC_035_WalidacjaNazwyStrony_Jacket_MainMenu_M extends BaseTest {
	@Test(groups ={"functional","master"})
	public void WalidacjaNazwyStrony_Jacket_MainMenu_M() {
		try {
		logger.info("****Rozpoczęto TC_035_WalidacjaNazwyStrony_Jacket_MainMenu_M ****");
		MainMenuPage Mm = new MainMenuPage(driver);
		
		Mm.click_Men_Jacket();
		logger.info("**** Kliknięto przycisk 'Jackets' w kategorii 'Men' w menu ****");
		Men_JacketsPage Mj = new Men_JacketsPage(driver);
		String expName = "Jackets";
		if(Mj.get_txt_Name_Category().equals(expName)) {
			
			Assert.assertTrue(true);
			logger.info("**** Nazwa strony jest poprawna ****");
			logger.info("****TC_035_WalidacjaNazwyStrony_Jacket_MainMenu_M zakończył się powodzeniem****");
			
		}else {
			logger.error("**** Nazwa strony jest niepoprawna ****");
			logger.info("****TC_035_WalidacjaNazwyStrony_Jacket_MainMenu_M zakończył się niepowodzeniem****");
			
			Assert.fail();
		}
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
			
		}
	}
	
	

}
