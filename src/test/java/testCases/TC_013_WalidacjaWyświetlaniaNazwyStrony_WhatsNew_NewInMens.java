package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.WhatsNewPagePage;

public class TC_013_WalidacjaWyświetlaniaNazwyStrony_WhatsNew_NewInMens extends BaseTest{

	
	@Test(groups = {"functional","master"})
	public void Walidacja_WhatsNew_NewInMens() {
		try{
		logger.info("**** Uruchomienie TC_013_WalidacjaWyświetlaniaNazwyStrony_WhatsNew_NewInMens ****");
		MainMenuPage MM = new MainMenuPage(driver);
		MM.click_WhatsNew();
		logger.info("**** Kliknięcie kategorii Whats New ****");
		WhatsNewPagePage Wnp = new WhatsNewPagePage(driver);
		if(Wnp.check_txt_Men()== true) {
		Assert.assertTrue(true);
		logger.info("**** Nazwa strony została wyświetlona ****");
		logger.info("****TC_013_WalidacjaWyświetlaniaNazwyStrony_WhatsNew_NewInMens zakończył się powodzeniem****");
		}else {
			
			logger.error("**** Nazwa strony nie została wyświetlona ****");
			logger.info("****TC_013_WalidacjaWyświetlaniaNazwyStrony_WhatsNew_NewInMens zakończył się niepowodzeniem****");
			Assert.fail();

			
			
		}
		
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
			
		}
		
	}
}
