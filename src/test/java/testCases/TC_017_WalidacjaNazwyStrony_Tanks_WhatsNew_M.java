package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.Men_TanksPage;
import pages.WhatsNewPagePage;



public class TC_017_WalidacjaNazwyStrony_Tanks_WhatsNew_M extends BaseTest{

	
	@Test(groups ={"functional","master"})
	public void WalidacjaNazwyStrony_Tanks_WhatsNew_M() {
		try {
		MainMenuPage Mm = new MainMenuPage(driver);
		logger.info("**** Rozpoczęto TC_017_WalidacjaNazwyStrony_Tanks_WhatsNew_M  ****");
		Mm.click_WhatsNew();
		logger.info("**** Kliknięto kategorię 'Whats New' ****");
		
		WhatsNewPagePage Wnp = new WhatsNewPagePage(driver);
		
		Wnp.click_cat_Men_Tanks();;
		logger.info("**** Kliknięto podkategorię u meżczyzn 'Tanks' ****");
		Men_TanksPage Mt = new Men_TanksPage(driver);
		String expNamePage = "Tanks";
		if(Mt.get_txt_Name_Category().equals(expNamePage)) {
			
			Assert.assertTrue(true);
			logger.info("**** Nazwa strony jest poprawna ****");
			logger.info("**** TC_017_WalidacjaNazwyStrony_Tanks_WhatsNew_M zakończył się powodzeniem ****");
		}else {
			logger.error("**** Nazwa strony jest niepoprawna ****");
			logger.info("**** TC_017_WalidacjaNazwyStrony_Tanks_WhatsNew_M zakończyl się niepowodzeniem ****");
			Assert.fail();
	
		}
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
			
		}
		
	}
	
}
