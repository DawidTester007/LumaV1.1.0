package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.Men_ShortsPage;
import pages.WhatsNewPagePage;


public class TC_019_WalidacjaNazwyStrony_Shorts_WhatsNew_M extends BaseTest {

	
	@Test(groups ={"functional","master"})
	public void WalidacjaNazwyStrony_Shorts_WhatsNew_M() {
		try {
		MainMenuPage Mm = new MainMenuPage(driver);
		logger.info("**** Rozpoczęto TC_019_WalidacjaNazwyStrony_Shorts_WhatsNew_M  ****");
		Mm.click_WhatsNew();
		logger.info("**** Kliknięto kategorię 'Whats New' ****");
		
		WhatsNewPagePage Wnp = new WhatsNewPagePage(driver);
		
		Wnp.click_cat_Men_Shorts();;
		logger.info("**** Kliknięto podkategorię u mężczyzn 'Shorts' ****");
		Men_ShortsPage Ms = new Men_ShortsPage(driver);
		String expNamePage = "Shorts";
		if(Ms.get_txt_Name_Category().equals(expNamePage)) {
			
			Assert.assertTrue(true);
			logger.info("**** Nazwa strony jest poprawna ****");
			logger.info("**** TC_019_WalidacjaNazwyStrony_Shorts_WhatsNew_M zakończył się powodzeniem ****");
		}else {
			logger.error("**** Nazwa strony jest niepoprawna ****");
			logger.info("**** TC_019_WalidacjaNazwyStrony_Shorts_WhatsNew_M zakończył się niepowodzeniem ****");
			Assert.fail();
	
		}
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
			
		}
		
	}
}
