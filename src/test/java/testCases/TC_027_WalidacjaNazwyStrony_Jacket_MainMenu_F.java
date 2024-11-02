package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.Women_JacketsPage;


public class TC_027_WalidacjaNazwyStrony_Jacket_MainMenu_F extends BaseTest {
	@Test(groups ={"functional","master"})
	public void WalidacjaNazwyStrony_Jacket_MainMenu_F() {
		try {
		logger.info("****Rozpoczęto TC_027_WalidacjaNazwyStrony_Jacket_MainMenu_F ****");
		MainMenuPage Mm = new MainMenuPage(driver);
		
		Mm.click_Women_Jacket();
		logger.info("**** Kliknięto przycisk 'Jackets' w kategorii 'Women' w menu ****");
		Women_JacketsPage Wj = new Women_JacketsPage(driver);
		String expName = "Jackets";
		if(Wj.get_txt_Name_Category().equals(expName)) {
			
			Assert.assertTrue(true);
			logger.info("**** Nazwa strony jest poprawna ****");
			logger.info("****TC_027_WalidacjaNazwyStrony_Jacket_MainMenu_F zakończył się powodzeniem****");
			
		}else {
			logger.error("**** Nazwa strony jest niepoprawna ****");
			logger.info("****TC_027_WalidacjaNazwyStrony_Jacket_MainMenu_F zakończył się niepowodzeniem****");
			
			Assert.fail();
		}
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
			
		}
	}
	
	

}
