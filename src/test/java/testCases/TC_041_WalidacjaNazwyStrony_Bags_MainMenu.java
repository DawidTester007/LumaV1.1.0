package testCases;

import org.testng.Assert;

import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.BagsPage;
import pages.MainMenuPage;


public class TC_041_WalidacjaNazwyStrony_Bags_MainMenu extends BaseTest {
	@Test(groups ={"functional","master"})
	public void WalidacjaNazwyStrony_Bags_MainMenu() {
		try {
		logger.info("****Rozpoczęto TC_041_WalidacjaNazwyStrony_Bags_MainMenu ****");
		MainMenuPage Mm = new MainMenuPage(driver);
		
		Mm.click_subCat_Gear_Bags();;
		logger.info("**** Kliknięto przycisk 'Bags'w menu ****");
		
		BagsPage Bp = new BagsPage(driver);
		String expName = "Bags";
		if(Bp.get_txt_Name_Category().equals(expName)) {
			
			Assert.assertTrue(true);
			logger.info("**** Nazwa strony jest poprawna ****");
			logger.info("****TC_041_WalidacjaNazwyStrony_Bags_MainMenu zakończył się powodzeniem****");
			
		}else {
			logger.error("**** Nazwa strony jest niepoprawna ****");
			logger.info("****TC_041_WalidacjaNazwyStrony_Bags_MainMenu zakończył się niepowodzeniem****");
			
			Assert.fail();
		}
	}catch(Exception e) {
		
		logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
		Assert.fail();
		
	}
	}
	
	

}
