package testCases;

import org.testng.Assert;

import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.ErinRecPage;
import pages.MainPage;



public class TC_049_WalidacjaNazwyStrony_Performence extends BaseTest {

	@Test(groups ={"functional","master"})
	public void WalidacjaNazwyStrony_Performence() {
		try {
	MainPage Mp = new MainPage(driver);
	
	logger.info("**** Rozpoczęto TC_049_WalidacjaNazwyStrony_Performence****");
	
	Mp.click_txtLink_ShopPerformance();
	
	logger.info("**** Kliknięto LinkText 'Shop Performance ' ****");
	
	ErinRecPage Erp = new ErinRecPage(driver);
	
	if(Erp.get_txt_Name_Category().equals("Performance Fabrics")) {
		
		
		logger.info("**** Nazwa strony jest poprawna ****");
		logger.info("****TC_049_WalidacjaNazwyStrony_Performence zakończył się powodzeniem****");
		Assert.assertTrue(true);
	
	}else {
		logger.error("**** Nazwa strony jest niepoprawna ****");
		logger.info("****TC_049_WalidacjaNazwyStrony_Performence zakończył się niepowodzeniem****");
		Assert.fail();
		
	}
	
	
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
			
		}
	}

	
}
