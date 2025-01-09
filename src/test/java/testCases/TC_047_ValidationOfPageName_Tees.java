package testCases;

import org.testng.Assert;

import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.TeesPage;


public class TC_047_ValidationOfPageName_Tees extends BaseTest {

	@Test(groups ={"functional","master"})
	public void ValidationOfPageName_Tees() {
		try {
	MainPage Mp = new MainPage(driver);
	
	logger.info("**** Starting TC_047_ValidationOfPageName_Tees****");
	
	Mp.click_txtLink_ShopTees();;
	
	logger.info("**** Clicked a category 'Shop Tees' ****");
	
	TeesPage Tp = new TeesPage(driver);
	
	if(Tp.get_txt_Name_Category().equals("Tees")) {
		
		
		logger.info("**** Page name is correct ****");
		logger.info("****TC_047_ValidationOfPageName_Tees finished positive****");
		Assert.assertTrue(true);
	
	}else {
		logger.error("**** Page name is incorrect ****");
		logger.info("****TC_047_ValidationOfPageName_Tees finished negative****");
		Assert.fail("**** Page name is incorrect ****");
		
	}
	
}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
		}
	
	}

	
}
