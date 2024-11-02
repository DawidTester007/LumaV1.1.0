package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.SalePage;

public class TC_024_WalidacjaNazwyStrony_Sale extends BaseTest{

	@Test(groups ={"functional","master"})
	public void WalidacjaNazwyStrony_Sale() {
		try {
		logger.info("****Rozpoczęto TC_024_WalidacjaNazwyStrony_Sale ****");
		MainMenuPage Mm = new MainMenuPage(driver);
		
		Mm.click_Sale();
		logger.info("**** Kliknięto przycisk 'Sale'w menu ****");
		SalePage Sp = new SalePage(driver);
		String expName = "Sale";
		if(Sp.get_txt_Name_Category().equals(expName)) {
			
			Assert.assertTrue(true);
			logger.info("**** Nazwa strony jest poprawna ****");
			logger.info("****TC_024_WalidacjaNazwyStrony_Sale zakończył się powodzeniem****");
			
		}else {
			logger.error("**** Nazwa strony jest niepoprawna ****");
			logger.info("****TC_024_WalidacjaNazwyStrony_Sale zakończył się niepowodzeniem****");
			
			Assert.fail();
		}
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
			
		}
	}
	
}
