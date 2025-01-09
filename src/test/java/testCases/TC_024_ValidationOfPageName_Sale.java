package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.SalePage;

public class TC_024_ValidationOfPageName_Sale extends BaseTest{

	@Test(groups ={"functional","master"})
	public void ValidationOfPageName_Sale() {
		try {
		logger.info("****Starting TC_024_ValidationOfPageName_Sale ****");
		MainMenuPage Mm = new MainMenuPage(driver);
		
		Mm.click_Sale();
		logger.info("**** Clicked a category 'Sale'w menu ****");
		SalePage Sp = new SalePage(driver);
		String expName = "Sale";
		if(Sp.get_txt_Name_Category().equals(expName)) {
			
			Assert.assertTrue(true);
			logger.info("**** Page ame is correct ****");
			logger.info("**** TC_024_WalidacjaNazwyStrony_Sale finished positive****");
			
		}else {
			logger.error("**** Page name is incorrect ****");
			logger.info("****TC_024_WalidacjaNazwyStrony_Sale finished negative****");
			
			Assert.fail("**** Page name is incorrect ****");
		}
}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			
		}
	}
	
}
