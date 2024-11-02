package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.WhatsNewPagePage;
import pages.Women_PantsPage;

public class TC_012_WalidacjaNazwyStrony_Shorts_WhatsNew_F extends BaseTest {

	
	@Test(groups ={"functional","master"})
	public void WalidacjaNazwyStrony_Shorts_WhatsNew_F() {
		try {
		MainMenuPage Mm = new MainMenuPage(driver);
		logger.info("**** Rozpoczęto TC_012_WalidacjaNazwyStrony_Shorts_WhatsNew_F ****");
		Mm.click_WhatsNew();
		logger.info("**** Kliknięto kategorię 'Whats New' ****");
		
		WhatsNewPagePage Wnp = new WhatsNewPagePage(driver);
		
		Wnp.click_cat_Women_Shorts();;
		logger.info("**** Kliknięto podkategorię u kobiet 'Shorts' ****");
		Women_PantsPage Wp = new Women_PantsPage(driver);
		String expNamePage = "Shorts";
		if(Wp.get_txt_Name_Category().equals(expNamePage)) {
			
			Assert.assertTrue(true);
			logger.info("**** Nazwa strony jest poprawna ****");
			logger.info("**** TC_012_WalidacjaNazwyStrony_Shorts_WhatsNew_F zakończył się powodzeniem ****");
		}else {
			logger.error("**** Nazwa strony jest niepoprawna ****");
			logger.info("**** TC_012_WalidacjaNazwyStrony_Shorts_WhatsNew_F zakończył się niepowodzeniem ****");
			Assert.fail();
	
		}
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
			
		}
		
	}
}
