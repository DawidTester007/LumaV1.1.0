package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.WomenTopsPage;


public class TC_025_ValidationOfPageName_Tops_MainMenu_F extends BaseTest {
	@Test(groups ={"functional","master"})
	public void ValidationOfPageName_Tops_MainMenu_F() {
		try {
		logger.info("****Starting TC_025_ValidationOfPageName_Tops_MainMenu_F ****");
		MainMenuPage Mm = new MainMenuPage(driver);
		
		Mm.click_Women_Tops();;
		logger.info("**** Clicked a subcategory 'Tops' in menu --> women  ****");
		WomenTopsPage Wtp = new WomenTopsPage(driver);
		String expName = "Tops";
		if(Wtp.get_txt_Name_Category().equals(expName)) {
			
			Assert.assertTrue(true);
			logger.info("**** Page name is correct ****");
			logger.info("****TC_025_WalidacjaNazwyStrony_Tops_MainMenu_F finished positive****");
			
		}else {
			logger.error("**** Page name is incorrect  ****");
			logger.info("****TC_025_WalidacjaNazwyStrony_Tops_MainMenu_F finished negative****");
			
			Assert.fail("**** Page name is incorrect  ****");
		}
}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
		}
	}
	
	

}
