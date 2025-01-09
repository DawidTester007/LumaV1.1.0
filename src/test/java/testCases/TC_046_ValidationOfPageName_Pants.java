package testCases;

import org.testng.Assert;

import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.PantsPage;


public class TC_046_ValidationOfPageName_Pants extends BaseTest {

	@Test(groups ={"functional","master"})
	public void ValidationOfPageName_Pants() {
		try {
	MainPage Mp = new MainPage(driver);
	
	logger.info("**** Starting TC_046_ValidationOfPageName_Pants****");
	
	Mp.click_txtLink_ShopPants();
	
	logger.info("**** Clicked a category 'Shop Pants' ****");
	
	PantsPage pp = new PantsPage(driver);
	
	if(pp.get_txt_Name_Category().equals("Pants")) {
		
		
		logger.info("**** Page name is correct ****");
		logger.info("****TC_046_ValidationOfPageName_Pants finished positive****");
		Assert.assertTrue(true);
	
	}else {
		logger.error("**** Page name is incorrect ****");
		logger.info("****TC_046_ValidationOfPageName_Pants finished negative****");
		Assert.fail("**** Page name is incorrect ****");
		
	}
	
}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
		}
	
	}

	
}
