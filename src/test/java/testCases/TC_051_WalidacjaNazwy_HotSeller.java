package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;

public class TC_051_WalidacjaNazwy_HotSeller extends BaseTest {
	@Test(groups ={"functional","master"})
	public void WalidacjaNazwy_HotSeller() {
		try {
		logger.info("****Rozpoczęto TC_051_WalidacjaNazwy_HotSeller****");
		MainPage Mp = new MainPage(driver);
		
		String expTitle = "Hot Sellers";
		if(Mp.text_HSeller().equals(expTitle)) {
			
			Assert.assertTrue(true);
			logger.info("**** Nazwa jest poprawna ****");
			logger.info("****TC_051_WalidacjaNazwy_HotSeller zakończył się powodzeniem****");
		}else {
			logger.error("**** Nazwa jest niepoprawna ****");
			logger.info("****TC_051_WalidacjaNazwy_HotSeller zakończył się niepowodzeniem****");
			Assert.fail();
		
		}
		
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
			
		}
	}
	
}
