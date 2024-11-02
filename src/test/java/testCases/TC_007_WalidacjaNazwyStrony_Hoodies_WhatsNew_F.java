package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.WhatsNewPagePage;
import pages.Women_HoodiesAndSweatshirtsPage;

public class TC_007_WalidacjaNazwyStrony_Hoodies_WhatsNew_F extends BaseTest {
	
	@Test(groups ={"functional","master"})
	public void WalidacjaNazwyStrony_Hoodies_WhatsNew_F() {
		try {
		MainMenuPage Mm = new MainMenuPage(driver);
		logger.info("**** Rozpoczęto TC_007_WalidacjaNazwyStrony_Hoodies_WhatsNew_F **** ");
		Mm.click_WhatsNew();
		logger.info("**** Kliknięto kategorię 'Whats New' ****");
		
		WhatsNewPagePage Wnp = new WhatsNewPagePage(driver);
		
		Wnp.click_cat_Women_HoodiesAndSweatshirts();
		logger.info("**** Kliknięto podkategorię u kobiet 'Hoodies & Sweatshirts' ****");
		Women_HoodiesAndSweatshirtsPage Whas = new Women_HoodiesAndSweatshirtsPage(driver);
		String expNamePage = "Hoodies & Sweatshirts";
		if(Whas.get_txt_Name_Category().equals(expNamePage)) {
			
			Assert.assertTrue(true);
			logger.info("**** Nazwa strony jest poprawna ****");
			logger.info("**** TC_007_WalidacjaNazwyStrony_Hoodies_WhatsNew_F zakończył się powodzeniem ****");
		}else {
			logger.error("**** Nazwa strony jest niepoprawna ****");
			logger.info("**** TC_007_WalidacjaNazwyStrony_Hoodies_WhatsNew_F zakończył się niepowodzeniem ****");
			Assert.fail();
	
		}
		
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
			
		}	
	}
	
}
