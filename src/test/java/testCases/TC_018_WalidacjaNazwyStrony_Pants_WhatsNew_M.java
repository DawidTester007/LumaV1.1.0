package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.Men_PantsPage;
import pages.WhatsNewPagePage;



public class TC_018_WalidacjaNazwyStrony_Pants_WhatsNew_M extends BaseTest {

	@Test(groups ={"functional","master"})
	public void WalidacjaNazwyStrony_Pants_WhatsNew_M() {
		try {
		MainMenuPage Mm = new MainMenuPage(driver);
		logger.info("**** TC_018_WalidacjaNazwyStrony_Pants_WhatsNew_M  ****");
		Mm.click_WhatsNew();
		logger.info("**** Kliknięto kategorię 'Whats New' ****");
		
		WhatsNewPagePage Wnp = new WhatsNewPagePage(driver);
		
		Wnp.click_cat_Men_Pants();;;
		logger.info("**** Kliknięto podkategorię u meżczyzn 'Pants' ****");
		Men_PantsPage Wp = new Men_PantsPage(driver);
		String expNamePage = "Pants";
		if(Wp.get_txt_Name_Category().equals(expNamePage)) {
			
			Assert.assertTrue(true);
			logger.info("**** Nazwa strony jest poprawna ****");
			logger.info("**** TC_018_WalidacjaNazwyStrony_Pants_WhatsNew_M zakończył się powodzeniem ****");
		}else {
			logger.error("**** Nazwa strony jest niepoprawna ****");
			logger.info("**** TC_018_WalidacjaNazwyStrony_Pants_WhatsNew_M zakończył się niepowodzeniem ****");
			Assert.fail();
	
		}
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
			
		}
		
	}
}
