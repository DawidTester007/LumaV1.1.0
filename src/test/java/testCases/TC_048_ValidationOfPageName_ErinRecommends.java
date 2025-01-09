package testCases;

import org.testng.Assert;

import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.ErinRecPage;
import pages.MainPage;



public class TC_048_ValidationOfPageName_ErinRecommends extends BaseTest {

	@Test(groups ={"functional","master"})
	public void ValidationOfPageName_ErinRecommends() {
	MainPage Mp = new MainPage(driver);
	try {
	
	logger.info("**** Starting TC_048_ValidationOfPageName_ErinRecommends****");
	
	Mp.click_txtLink_ShopErin();;
	
	logger.info("**** Clicked a category 'Shop Erin Recommends' ****");
	
	ErinRecPage Erp = new ErinRecPage(driver);
	
	if(Erp.get_txt_Name_Category().equals("Erin Recommends")) {
		
		
		logger.info("**** Page name is correct****");
		logger.info("****TC_048_ValidationOfPageName_ErinRecommends finished positive****");
		Assert.assertTrue(true);
	
	}else {
		logger.error("**** Page name is incorrect ****");
		logger.info("****TC_048_ValidationOfPageName_ErinRecommends finished negative****");
		Assert.fail("**** Page name is incorrect ****");
		
	}
	
	}catch(Exception e) {
		
		logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
		Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
	}
	
	}

	
}
