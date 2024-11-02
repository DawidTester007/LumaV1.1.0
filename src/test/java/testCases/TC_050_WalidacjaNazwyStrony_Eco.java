package testCases;

import org.testng.Assert;

import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.EcoPage;
import pages.MainPage;



public class TC_050_WalidacjaNazwyStrony_Eco extends BaseTest {

	@Test(groups ={"functional","master"})
	public void WalidacjaNazwyStrony_Eco() {
		try {
	MainPage Mp = new MainPage(driver);
	
	logger.info("**** Rozpoczęto TC_050_WalidacjaNazwyStrony_Eco****");
	
	Mp.click_txtLink_EcoFriendly();;
	
	logger.info("**** Kliknięto LinkText 'Shop Eco-Friendly' ****");
	
	EcoPage Ep = new EcoPage(driver);
	
	if(Ep.get_txt_Name_Category().equals("Eco Friendly")) {
		
		
		logger.info("**** Nazwa strony jest poprawna ****");
		logger.info("****TC_050_WalidacjaNazwyStrony_Eco zakończył się powodzeniem****");
		Assert.assertTrue(true);
	
	}else {
		logger.error("**** Nazwa strony jest niepoprawna ****");
		logger.info("****TC_050_WalidacjaNazwyStrony_Eco zakończył się niepowodzeniem****");
		Assert.fail();
		
	}
	
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
			
		}
	
	}

	
}
