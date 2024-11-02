package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.Men_HoodiesAndSweatshirtsPage;
import pages.WhatsNewPagePage;


public class TC_014_WalidacjaNazwyStrony_Hoodies_WhatsNew_M extends BaseTest {

	@Test(groups ={"functional","master"})
	public void WalidacjaNazwyStrony_Hoodies_WhatsNew_M() {
		try {
		MainMenuPage Mm = new MainMenuPage(driver);
		logger.info("**** Rozpoczęto TC_014_WalidacjaNazwyStrony_Hoodies_WhatsNew_M **** ");
		Mm.click_WhatsNew();
		logger.info("**** Kliknięto kategorię 'Whats New' ****");
		
		WhatsNewPagePage Wnp = new WhatsNewPagePage(driver);
		
		Wnp.click_cat_Men_HoodiesAndSweatshirts();
		logger.info("**** Kliknięto podkategorię u meżczyzn 'Hoodies & Sweatshirts' ****");
		Men_HoodiesAndSweatshirtsPage Mhas = new Men_HoodiesAndSweatshirtsPage(driver);
		String expNamePage = "Hoodies & Sweatshirts";
		if(Mhas.get_txt_Name_Category().equals(expNamePage)) {
			
			Assert.assertTrue(true);
			logger.info("**** Nazwa strony jest poprawna ****");
			logger.info("**** TC_014_WalidacjaNazwyStrony_Hoodies_WhatsNew_M zakończył się powodzeniem****");
		}else {
			logger.error("**** Nazwa strony jest niepoprawna ****");
			logger.info("**** TC_014_WalidacjaNazwyStrony_Hoodies_WhatsNew_M zakończył się niepowodzeniem ****");
			Assert.fail();
	
		}
		
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
			
		}	
	}
}
