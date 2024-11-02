package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.Men_JacketsPage;
import pages.WhatsNewPagePage;



public class TC_015_WalidacjaNazwyStrony_Jacket_WhatsNew_M extends BaseTest {
	
	
	@Test(groups ={"functional","master"})
	public void WalidacjaNazwyStrony_Jacket_WhatsNew_M() {
		try {
		MainMenuPage Mm = new MainMenuPage(driver);
		logger.info("**** Rozpoczęto TC_015_WalidacjaNazwyStrony_Jacket_WhatsNew_M **** ");
		Mm.click_WhatsNew();
		logger.info("**** Kliknięto kategorię 'Whats New' ****");
		
		WhatsNewPagePage Wnp = new WhatsNewPagePage(driver);
		
		Wnp.click_cat_Men_Jacket();
		logger.info("**** Kliknięto podkategorię u mężczyzn 'Jackets' ****");
		Men_JacketsPage Mj = new Men_JacketsPage(driver);
		String expNamePage = "Jackets";
		if(Mj.get_txt_Name_Category().equals(expNamePage)) {
			
			Assert.assertTrue(true);
			logger.info("**** Nazwa strony jest poprawna ****");
			logger.info("**** TC_015_WalidacjaNazwyStrony_Jacket_WhatsNew_M zakończył się powodzeniem ****");
		}else {
			logger.error("**** Nazwa strony jest niepoprawna ****");
			logger.info("**** TC_015_WalidacjaNazwyStrony_Jacket_WhatsNew_M zakończył się niepowodzeniem ****");
			Assert.fail();

		}
		
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
			
		}
	}
	

}
