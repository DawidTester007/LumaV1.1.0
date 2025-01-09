package testCases;

import org.testng.Assert;

import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.EcoPage;
import pages.MainPage;



public class TC_050_ValidationOfPageName_Eco extends BaseTest {

	@Test(groups ={"functional","master"})
	public void ValidationOfPageName_Eco() {
		try {
	MainPage Mp = new MainPage(driver);
	
	logger.info("**** Starting TC_050_WalidacjaNazwyStrony_Eco****");
	
	Mp.click_txtLink_EcoFriendly();;
	
	logger.info("**** Clicked a category'Shop Eco-Friendly' ****");
	
	EcoPage Ep = new EcoPage(driver);
	
	if(Ep.get_txt_Name_Category().equals("Eco Friendly")) {
		
		
		logger.info("**** Page name is correct ****");
		logger.info("****TC_050_ValidationOfPageName_Eco finished positive****");
		Assert.assertTrue(true);
	
	}else {
		logger.error("**** Page name is incorrect ****");
		logger.info("****TC_050_ValidationOfPageName_Eco zakończył finished negative****");
		Assert.fail("**** Page name is incorrect ****");
		
	}
	
}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
		}
	
	}

	
}
