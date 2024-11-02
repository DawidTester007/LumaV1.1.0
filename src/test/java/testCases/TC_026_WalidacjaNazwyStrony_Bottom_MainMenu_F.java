package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.WomenBottomPage;


public class TC_026_WalidacjaNazwyStrony_Bottom_MainMenu_F extends BaseTest {
	@Test(groups ={"functional","master"})
	public void WalidacjaNazwyStrony_Bottom_MainMenu_F() {
		try {
		logger.info("****Rozpoczęto WalidacjaNazwyStrony_Bottom_MainMenu_F ****");
		MainMenuPage Mm = new MainMenuPage(driver);
		
		Mm.click_Women_Bottom();;
		logger.info("**** Kliknięto przycisk 'Bottom' w kategorii 'Women' w menu ****");
		WomenBottomPage Wbp = new WomenBottomPage(driver);
		String expName = "Bottoms";
		if(Wbp.get_txt_Name_Category().equals(expName)) {
			
			Assert.assertTrue(true);
			logger.info("**** Nazwa strony jest poprawna ****");
			logger.info("****TC_026_WalidacjaNazwyStrony_Bottom_MainMenu_F zakończył się powodzeniem****");
			
		}else {
			logger.error("**** Nazwa strony jest niepoprawna ****");
			logger.info("****TC_026_WalidacjaNazwyStrony_Bottom_MainMenu_F zakończył się niepowodzeniem****");
			
			Assert.fail();
		}
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
			
		}
	}
	
	

}
