package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.WomenPage;

public class TC_020_WalidacjaNazwyStrony_Women extends BaseTest {

	@Test(groups ={"functional","master"})
	public void WalidacjaNazwyStrony_Women() {
		try {
		logger.info("****Rozpoczęto TC_020_WalidacjaNazwyStrony_Women****");
		MainMenuPage Mm = new MainMenuPage(driver);
		
		Mm.click_Women();
		logger.info("**** Kliknięto przycisk 'Women' w menu ****");
		WomenPage Wp = new WomenPage(driver);
		String expName = "Women";
		if(Wp.get_txt_Name_Category().equals(expName)) {
			
			Assert.assertTrue(true);
			logger.info("**** Nazwa strony jest poprawna ****");
			logger.info("****TC_020_WalidacjaNazwyStrony_Women zakończył się powodzeniem****");
			
		}else {
			logger.error("**** Nazwa strony jest niepoprawna ****");
			logger.info("****TC_020_WalidacjaNazwyStrony_Women zakończył się niepowodzeniem****");
			
			Assert.fail();
		}
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
			
		}
	}
	
}
