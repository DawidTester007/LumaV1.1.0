package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.WhatsNewPagePage;
import pages.MainMenuPage;

public class TC_005_WalidacjaNazwyStronyWhatsNew extends BaseTest {

	@Test(groups ={"functional","master"})
	public void WalidacjaNazwyStronyWhatsNew() {
		try {
		logger.info("****Uruchomiono TC_005_WalidacjaNazwyStronyWhatsNew****");
		MainMenuPage Mn = new MainMenuPage(driver);
		
		Mn.click_WhatsNew();
		logger.info("****Kliknięto kategorię 'WhatsNew'****");
		WhatsNewPagePage Wnp = new WhatsNewPagePage(driver);
		if(Wnp.check_NamePage()== true) {
			
			Assert.assertTrue(true);
			logger.info("****Nazwa strony została wyświetlona ****");
			logger.info("****TC_005_WalidacjaNazwyStronyWhatsNew zakończył się powodzeniem****");
			
		}else {
			logger.info("****Nazwa strony została nie została wyświetlona****");
			logger.error("****TC_005_WalidacjaNazwyStronyWhatsNew zakończył się niepowodzeniem ****");
			Assert.assertTrue(false);
		
			
			
			
		}
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
			
		}
		
	}
	
}
