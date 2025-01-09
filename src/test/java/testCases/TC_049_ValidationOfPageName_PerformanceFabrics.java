package testCases;

import org.testng.Assert;

import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.ErinRecPage;
import pages.MainPage;



public class TC_049_ValidationOfPageName_PerformanceFabrics extends BaseTest {

	@Test(groups ={"functional","master"})
	public void ValidationOfPageName_PerformanceFabrics() {
		try {
	MainPage Mp = new MainPage(driver);
	
	logger.info("**** Starting TC_049_ValidationOfPageName_Performence****");
	
	Mp.click_txtLink_ShopPerformance();
	
	logger.info("**** Clicked a category 'Shop Performance' ****");
	
	ErinRecPage Erp = new ErinRecPage(driver);
	
	if(Erp.get_txt_Name_Category().equals("Performance Fabrics")) {
		
		
		logger.info("**** Page name is correct ****");
		logger.info("****TC_049_ValidationOfPageName_PerformanceFabrics finished positive****");
		Assert.assertTrue(true);
	
	}else {
		logger.error("**** Page name is incorrect  ****");
		logger.info("****TC_049_ValidationOfPageName_PerformanceFabrics finished negative****");
		Assert.fail("**** Page name is incorrect  ****");
		
	}
	
	
}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
		}
	}

	
}
