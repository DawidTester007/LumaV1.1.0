package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.Women_HoodiesAndSweatshirtsPage;


public class TC_028_WalidacjaNazwyStrony_HoodiesAndSweatshirts_MainMenu_F extends BaseTest {
	@Test(groups ={"functional","master"})
	public void WalidacjaNazwyStrony_HoodiesAndSweatshirts_MainMenu_F() {
		try {
		logger.info("****Rozpoczęto TC_028_WalidacjaNazwyStrony_HoodiesAndSweatshirts_MainMenu_F ****");
		MainMenuPage Mm = new MainMenuPage(driver);
		
		Mm.click_Women_HoodiesAndSweatshirts();
		logger.info("**** Kliknięto przycisk 'Hoodies & Sweatshirts' w kategorii 'Women' w menu ****");
		Women_HoodiesAndSweatshirtsPage Whas = new Women_HoodiesAndSweatshirtsPage(driver);
		String expName = "Hoodies & Sweatshirts";
		if(Whas.get_txt_Name_Category().equals(expName)) {
			
			Assert.assertTrue(true);
			logger.info("**** Nazwa strony jest poprawna ****");
			logger.info("****TC_028_WalidacjaNazwyStrony_HoodiesAndSweatshirts_MainMenu_F zakończył się powodzeniem****");
			
		}else {
			logger.error("**** Nazwa strony jest niepoprawna ****");
			logger.info("****TC_028_WalidacjaNazwyStrony_HoodiesAndSweatshirts_MainMenu_F zakończył się niepowodzeniem****");
			
			Assert.fail("Nazwa strony jest niepoprawna");
		}
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
			
		}
	}
	
	

}
