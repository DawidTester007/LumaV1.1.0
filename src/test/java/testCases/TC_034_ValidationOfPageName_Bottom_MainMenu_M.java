package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.MenBottomPage;


public class TC_034_ValidationOfPageName_Bottom_MainMenu_M extends BaseTest {
	@Test(groups ={"functional","master"})
	public void ValidationOfPageName_Bottom_MainMenu_M() {
		try {
		logger.info("****Starting TC_034_ValidationOfPageName_Bottom_MainMenu_M ****");
		MainMenuPage Mm = new MainMenuPage(driver);
		
		Mm.click_Men_Bottom();;
		logger.info("**** Clicked a category 'Bottom' in menu --> men ****");
		MenBottomPage Mtp = new MenBottomPage(driver);
		String expName = "Bottoms";
		if(Mtp.get_txt_Name_Category().equals(expName)) {
			
			Assert.assertTrue(true);
			logger.info("**** Page name is correct ****");
			logger.info("****TC_034_ValidationOfPageName_Bottom_MainMenu_M finished positive****");
			
		}else {
			logger.error("**** Page name is incorrect ****");
			logger.info("****TC_034_ValidationOfPageName_Bottom_MainMenu_M finished negative****");
			
			Assert.fail("**** Page name is incorrect ****");
		}
}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
		}
	}
	
	

}
