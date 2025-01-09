package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.WomenBottomPage;


public class TC_026_ValidationOfPageName_Bottom_MainMenu_F extends BaseTest {
	@Test(groups ={"functional","master"})
	public void ValidationOfPageName_Bottom_MainMenu_F() {
		try {
		logger.info("****Starting TC_026_ValidationOfPageName_Bottom_MainMenu_F ****");
		MainMenuPage Mm = new MainMenuPage(driver);
		
		Mm.click_Women_Bottom();;
		logger.info("**** Clicked a category 'Bottom' in menu --> women ****");
		WomenBottomPage Wbp = new WomenBottomPage(driver);
		String expName = "Bottoms";
		if(Wbp.get_txt_Name_Category().equals(expName)) {
			
			Assert.assertTrue(true);
			logger.info("**** Page name is correct ****");
			logger.info("****TC_026_WalidacjaNazwyStrony_Bottom_MainMenu_F finished positive****");
			
		}else {
			logger.error("**** Page name is incorrect ****");
			logger.info("****TC_026_WalidacjaNazwyStrony_Bottom_MainMenu_F finished negative****");
			
			Assert.fail("**** Page name is incorrect ****");
		}
}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			
		}
	}
	
	

}
