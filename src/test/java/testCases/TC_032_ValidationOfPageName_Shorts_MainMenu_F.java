package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.Women_ShortsPage;



public class TC_032_ValidationOfPageName_Shorts_MainMenu_F extends BaseTest {
	@Test(groups ={"functional","master"})
	public void ValidationOfPageName_Shorts_MainMenu_F() {
		try {
		logger.info("****Starting TC_032_ValidationOfPageName_Shorts_MainMenu_F ****");
		MainMenuPage Mm = new MainMenuPage(driver);
		
		Mm.click_Women_Shorts();
		logger.info("**** Clicked category 'Shorts' in menu --> women ****");
		Women_ShortsPage Ws = new Women_ShortsPage(driver);
		String expName = "Shorts";
		if(Ws.get_txt_Name_Category().equals(expName)) {
			
			Assert.assertTrue(true);
			logger.info("**** Page name is correct ****");
			logger.info("****TC_032_ValidationOfPageName_Shorts_MainMenu_F finished positive****");
			
		}else {
			logger.error("**** Page name is incorrect ****");
			logger.info("****TC_032_ValidationOfPageName_Shorts_MainMenu_F finished negative****");
			
			Assert.fail("**** Page name is incorrect ****");
		}
}catch(Exception e) {
			
			logger.error("****An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
		}
	}
	
	

}
