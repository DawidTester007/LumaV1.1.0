package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.MenPage;


public class TC_021_WalidacjaNazwyStrony_Men extends BaseTest {

	@Test(groups ={"functional","master"})
	public void WalidacjaNazwyStrony_Men() {
		try {
		logger.info("****Rozpoczęto TC_021_WalidacjaNazwyStrony_Men****");
		MainMenuPage Mm = new MainMenuPage(driver);
		
		Mm.click_Men();
		logger.info("**** Kliknięto przycisk Men w menu ****");
		MenPage Mp = new MenPage(driver);
		String expName = "Men";
		if(Mp.get_txt_Name_Category().equals(expName)) {
			
			Assert.assertTrue(true);
			logger.info("**** Nazwa strony jest poprawna ****");
			logger.info("****TC_021_WalidacjaNazwyStrony_Men zakończył się powodzeniem****");
			
		}else {
			logger.error("**** Nazwa strony jest niepoprawna ****");
			logger.info("****TC_021_WalidacjaNazwyStrony_Men zakończył się niepowodzeniem****");
			
			Assert.fail();
		}
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
			
		}
	}
	
}
