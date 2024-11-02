package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;

public class TC_052_WalidacjaOpisu_HotSeller extends BaseTest {
	@Test(groups ={"functional","master"})
	public void WalidacjaNazwy_HotSeller() {
		try {
		logger.info("****Rozpoczęto TC_052_WalidacjaOpisu_HotSeller****");
		MainPage Mp = new MainPage(driver);
		
		String expTitle = "Here is what`s trending on Luma right now";
		if(Mp.get_textDesc_HSeller().equals(expTitle)) {
			
			Assert.assertTrue(true);
			logger.info("**** Opis który zawiera Hot Seller jest poprawny ****");
			logger.info("***TC_052_WalidacjaOpisu_HotSeller zakończył się powodzeniem****");
		}else {
			logger.error("**** Opis który zawiera Hot Seller jest niepoprawny ****");
			logger.info("****TC_052_WalidacjaOpisu_HotSeller zakończył się niepowodzeniem****");
			Assert.fail();
		
		}
		
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
			
		}
	}
	
}
