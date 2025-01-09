package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;

public class TC_051_ValidationOfName_HotSeller extends BaseTest {
	@Test(groups ={"functional","master"})
	public void ValidationNameOfHotSeller() {
		try {
		logger.info("****Starting TC_051_ValidationOfName_HotSeller****");
		MainPage Mp = new MainPage(driver);
		
		String expTitle = "Hot Sellers";
		if(Mp.text_HSeller().equals(expTitle)) {
			
			Assert.assertTrue(true);
			logger.info("**** Page name is correct ****");
			logger.info("****TC_051_ValidationOfName_HotSeller finished positive****");
		}else {
			logger.error("**** Page name is incorrect ****");
			logger.info("****TC_051_ValidationOfName_HotSeller finished negative****");
			Assert.fail("**** Page name is incorrect ****");
		
		}
		
}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
		}
	}
	
}
