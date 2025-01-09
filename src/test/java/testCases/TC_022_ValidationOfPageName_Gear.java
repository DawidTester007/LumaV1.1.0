package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.GearPage;
import pages.MainMenuPage;


public class TC_022_ValidationOfPageName_Gear extends BaseTest{

	@Test(groups ={"functional","master"})
	public void ValidationOfPageName_Gear() {
		try {
		logger.info("****Starting TC_022_ValidationOfPageName_Gear ****");
		MainMenuPage Mm = new MainMenuPage(driver);
		
		Mm.click_Gear();
		logger.info("**** Clicked a category 'Gear' in menu ****");
		GearPage Gp = new GearPage(driver);
		String expName = "Gear";
		if(Gp.get_txt_Name_Category().equals(expName)) {
			
			Assert.assertTrue(true);
			logger.info("**** Page name is correct ****");
			logger.info("****TC_022_WalidacjaNazwyStrony_Gear finished positive****");
			
		}else {
			logger.error("**** Page name is incorrect  ****");
			logger.info("****TC_022_WalidacjaNazwyStrony_Gear finished negative****");
			
			Assert.fail("**** Page name is incorrect  ****");
		}
}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
		}
	}
}
