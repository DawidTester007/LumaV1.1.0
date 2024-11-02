package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.YogaPage;

public class TC_045_WalidacjaNazwyStrony_Yoga extends BaseTest {

	@Test(groups ={"functional","master"})
	public void WalidacjaNazwyStrony_Yoga() {
		try {
	MainPage Mp = new MainPage(driver);
	
	logger.info("**** Rozpoczęto TC_045_WalidacjaNazwyStrony_Yoga****");
	
	Mp.click_txtLink_Yoga();
	
	logger.info("**** Kliknięto LinkText 'Shop New Yoga' ****");
	
	YogaPage Yp = new YogaPage(driver);
	
	if(Yp.get_txt_Name_Category().equals("New Luma Yoga Collection")) {
		
		
		logger.info("**** Nazwa strony jest poprawna ****");
		logger.info("****TC_045_WalidacjaNazwyStrony_Yoga zakończył się powodzeniem****");
		Assert.assertTrue(true);
	
	}else {
		logger.error("**** Nazwa strony jest niepoprawna ****");
		logger.info("****TC_045_WalidacjaNazwyStrony_Yoga zakończył się niepowodzeniem****");
		Assert.fail();
		
	}
	
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
			
		}
	
	}

	
}
