package testCases;

import org.testng.Assert;

import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.ErinRecPage;
import pages.MainPage;



public class TC_048_WalidacjaNazwyStrony_Erin_Rec extends BaseTest {

	@Test(groups ={"functional","master"})
	public void WalidacjaNazwyStrony_Erin_Rec() {
	MainPage Mp = new MainPage(driver);
	try {
	
	logger.info("**** Rozpoczęto TC_048_WalidacjaNazwyStrony_Erin_Rec****");
	
	Mp.click_txtLink_ShopErin();;
	
	logger.info("**** Kliknięto LinkText 'Shop Erin Recommends' ****");
	
	ErinRecPage Erp = new ErinRecPage(driver);
	
	if(Erp.get_txt_Name_Category().equals("Erin Recommends")) {
		
		
		logger.info("**** Nazwa strony jest poprawna ****");
		logger.info("****TC_048_WalidacjaNazwyStrony_Erin_Rec zakończył się powodzeniem****");
		Assert.assertTrue(true);
	
	}else {
		logger.error("**** Nazwa strony jest niepoprawna ****");
		logger.info("****TC_048_WalidacjaNazwyStrony_Erin_Rec zakończył się niepowodzeniem****");
		Assert.fail();
		
	}
	
	}catch(Exception e) {
		
		logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
		Assert.fail();
		
	}
	
	}

	
}
