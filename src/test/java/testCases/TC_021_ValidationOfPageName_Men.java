package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.MenPage;


public class TC_021_ValidationOfPageName_Men extends BaseTest {

	@Test(groups ={"functional","master"})
	public void ValidationOfPageName_Men() {
		try {
		logger.info("****Starting TC_021_ValidationOfPageName_Men****");
		MainMenuPage Mm = new MainMenuPage(driver);
		
		Mm.click_Men();
		logger.info("**** Clicked a category 'Men' in menu ****");
		MenPage Mp = new MenPage(driver);
		String expName = "Men";
		if(Mp.get_txt_Name_Category().equals(expName)) {
			
			Assert.assertTrue(true);
			logger.info("**** Page name is correct ****");
			logger.info("****TC_021_WalidacjaNazwyStrony_Men finished positive****");
			
		}else {
			logger.error("**** Page name is incorrect****");
			logger.info("****TC_021_WalidacjaNazwyStrony_Men finished negative****");
			
			Assert.fail("**** Page name is incorrect****");
		}
}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			
		}
	}
	
}
