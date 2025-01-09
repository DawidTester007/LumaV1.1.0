package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.MenTopsPage;

public class TC_202_ValidationOfDisplayingProductsCounter_Tops_M extends BaseTest{
	@Test(groups = {"functional","master"})
	public void ValidationOfDisplayingProductsCounter_Tops_M() {
		try {
		MainMenuPage Mmp = new MainMenuPage(driver);
		logger.info("****Starting TC_202_ValidationOfDisplayingProductsCounter_Tops_M****");
		Mmp.click_Men_Tops();
		logger.info("****Clicked a category Men ----> Tops****");
		MenTopsPage Mtp = new MenTopsPage(driver);
		
		if(Mtp.check_txt_counterOfProducts()) {
			
			logger.info("****The counter has been displayed****");
			logger.info("****TC_202_ValidationOfDisplayingProductsCounter_Tops_M finished positive****");
			Assert.assertTrue(true);
		}else {
			logger.error("****The counter has not been displayed****");
			logger.info("****TC_202_ValidationOfDisplayingProductsCounter_Tops_M finished negative****");
			Assert.fail("****The counter has not been displayed****");
			
		}
		}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
		}
	}
	
}
