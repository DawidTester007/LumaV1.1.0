package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.GearPage;
import pages.MainMenuPage;


public class TC_022_WalidacjaNazwyStrony_Gear extends BaseTest{

	@Test(groups ={"functional","master"})
	public void WalidacjaNazwyStrony_Gear() {
		try {
		logger.info("****Rozpoczęto TC_022_WalidacjaNazwyStrony_Gear ****");
		MainMenuPage Mm = new MainMenuPage(driver);
		
		Mm.click_Gear();
		
		GearPage Gp = new GearPage(driver);
		String expName = "Gear";
		if(Gp.get_txt_Name_Category().equals(expName)) {
			
			Assert.assertTrue(true);
			logger.info("**** Nazwa strony jest poprawna ****");
			logger.info("****TC_022_WalidacjaNazwyStrony_Gear zakończył się powodzeniem****");
			
		}else {
			logger.error("**** Nazwa strony jest niepoprawna ****");
			logger.info("****TC_022_WalidacjaNazwyStrony_Gear zakończył się niepowodzeniem****");
			
			Assert.fail();
		}
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
			
		}
	}
}
