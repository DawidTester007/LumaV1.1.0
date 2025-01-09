package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.YogaPage;

public class TC_045_ValidationOfPageName_Yoga extends BaseTest {

	@Test(groups ={"functional","master"})
	public void ValidationOfPageName_Yoga() {
		try {
	MainPage Mp = new MainPage(driver);
	
	logger.info("**** Starting TC_045_ValidationOfPageName_Yoga****");
	
	Mp.click_txtLink_Yoga();
	
	logger.info("**** Clicked a category 'Shop New Yoga' ****");
	
	YogaPage Yp = new YogaPage(driver);
	
	if(Yp.get_txt_Name_Category().equals("New Luma Yoga Collection")) {
		
		
		logger.info("**** Page name is correct****");
		logger.info("****TC_045_ValidationOfPageName_Yoga finished positive****");
		Assert.assertTrue(true);
	
	}else {
		logger.error("**** Page name is incorrect****");
		logger.info("****TC_045_ValidationOfPageName_Yoga finished negative****");
		Assert.fail("**** Page name is incorrect****");
		
	}
	
}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
		}
	
	}

	
}
