package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.Men_HoodiesAndSweatshirtsPage;


public class TC_036_WalidacjaNazwyStrony_HoodiesAndSweatshirts_MainMenu_M extends BaseTest {
	@Test(groups ={"functional","master"})
	public void WalidacjaNazwyStrony_HoodiesAndSweatshirts_MainMenu_M() {
		try {
		logger.info("****Rozpoczęto TC_036_WalidacjaNazwyStrony_HoodiesAndSweatshirts_MainMenu_M ****");
		MainMenuPage Mm = new MainMenuPage(driver);
		
		Mm.click_Men_HoodiesAndSweatshirts();
		logger.info("**** Kliknięto przycisk 'Hoodies & Sweatshirts' w kategorii 'Men' w menu ****");
		Men_HoodiesAndSweatshirtsPage Mhas = new Men_HoodiesAndSweatshirtsPage(driver);
		String expName = "Hoodies & Sweatshirts";
		if(Mhas.get_txt_Name_Category().equals(expName)) {
			
			Assert.assertTrue(true);
			logger.info("**** Nazwa strony jest poprawna ****");
			logger.info("****TC_036_WalidacjaNazwyStrony_HoodiesAndSweatshirts_MainMenu_M zakończył się powodzeniem****");
			
		}else {
			logger.error("**** Nazwa strony jest niepoprawna ****");
			logger.info("****TC_036_WalidacjaNazwyStrony_HoodiesAndSweatshirts_MainMenu_M zakończył się niepowodzeniem****");
			
			Assert.fail();
		}
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
			
		}
	}
	
	

}
