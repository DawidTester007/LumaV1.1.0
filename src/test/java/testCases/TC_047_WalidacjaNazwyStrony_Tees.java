package testCases;

import org.testng.Assert;

import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.TeesPage;


public class TC_047_WalidacjaNazwyStrony_Tees extends BaseTest {

	@Test(groups ={"functional","master"})
	public void WalidacjaNazwyStrony_Yoga() {
		try {
	MainPage Mp = new MainPage(driver);
	
	logger.info("**** Rozpoczęto TC_047_WalidacjaNazwyStrony_Tees****");
	
	Mp.click_txtLink_ShopTees();;
	
	logger.info("**** Kliknięto LinkText 'Shop Tees' ****");
	
	TeesPage Tp = new TeesPage(driver);
	
	if(Tp.get_txt_Name_Category().equals("Tees")) {
		
		
		logger.info("**** Nazwa strony jest poprawna ****");
		logger.info("****TC_047_WalidacjaNazwyStrony_Tees zakończył się powodzeniem****");
		Assert.assertTrue(true);
	
	}else {
		logger.error("**** Nazwa strony jest niepoprawna ****");
		logger.info("****TC_047_WalidacjaNazwyStrony_Tees zakończył się niepowodzeniem****");
		Assert.fail();
		
	}
	
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
			
		}
	
	}

	
}
