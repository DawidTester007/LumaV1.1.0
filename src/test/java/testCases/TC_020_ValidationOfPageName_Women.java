package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.WomenPage;

public class TC_020_ValidationOfPageName_Women extends BaseTest {

	@Test(groups ={"functional","master"})
	public void ValidationOfPageName() {
		try {
		logger.info("****Starting TC_020_ValidationOfPageName_Women****");
		MainMenuPage Mm = new MainMenuPage(driver);
		
		Mm.click_Women();
		logger.info("**** Clicked a category 'Women' in menu ****");
		WomenPage Wp = new WomenPage(driver);
		String expName = "Women";
		if(Wp.get_txt_Name_Category().equals(expName)) {
			
			Assert.assertTrue(true);
			logger.info("**** Page name is correct ****");
			logger.info("****TC_020_WalidacjaNazwyStrony_Women finished positive****");
			
		}else {
			logger.error("**** Page name is incorrect ****");
			logger.info("****TC_020_WalidacjaNazwyStrony_Women  finished negative****");
			
			Assert.fail("**** Page name is incorrect ****");
		}
}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
		}
	}
	
}
