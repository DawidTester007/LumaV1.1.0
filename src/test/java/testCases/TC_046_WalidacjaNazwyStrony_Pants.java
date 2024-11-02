package testCases;

import org.testng.Assert;

import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.PantsPage;


public class TC_046_WalidacjaNazwyStrony_Pants extends BaseTest {

	@Test(groups ={"functional","master"})
	public void WalidacjaNazwyStrony_Yoga() {
		try {
	MainPage Mp = new MainPage(driver);
	
	logger.info("**** Rozpoczęto TC_046_WalidacjaNazwyStrony_Pants****");
	
	Mp.click_txtLink_ShopPants();
	
	logger.info("**** Kliknięto LinkText 'Shop Pants' ****");
	
	PantsPage pp = new PantsPage(driver);
	
	if(pp.get_txt_Name_Category().equals("Pants")) {
		
		
		logger.info("**** Nazwa strony jest poprawna ****");
		logger.info("****TC_046_WalidacjaNazwyStrony_Pants zakończył się powodzeniem****");
		Assert.assertTrue(true);
	
	}else {
		logger.error("**** Nazwa strony jest niepoprawna ****");
		logger.info("****TC_046_WalidacjaNazwyStrony_Pants zakończył się niepowodzeniem****");
		Assert.fail();
		
	}
	
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
			
		}
	
	}

	
}
