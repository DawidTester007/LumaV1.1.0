package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.ProductPage;

public class TC_074_FunctionalityValidationOfButtonCompare_ProductPage extends BaseTest {
	@Test(groups={"functional","regression","master"})
	public void FunctionalityValidationOfButtonCompare_ProductPage() {
		try {
		MainPage Mp = new MainPage(driver);
		logger.info("**** Starting TC_074_FunctionalityValidationOfButtonCompare_ProductPage ****");
		Mp.List_ImgProductOf_HSeller().get(0).click();
		logger.info("**** Clicked a product image ****");
		ProductPage Pp = new ProductPage(driver);
		Pp.click_btn_compare();
		logger.info("**** Clicked a button compare ****");
		
		if(Pp.check_msg_succesfulAddedToComparison()==true) {
			
			logger.info("**** A message about adding a product to the comparison module appeared ****");
			logger.info("**** TC_074_FunctionalityValidationOfButtonCompare_ProductPage finished positive****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("**** A message about adding a product to the comparison module has not appeared ****");
			logger.info("**** TC_074_FunctionalityValidationOfButtonCompare_ProductPage finished negative ****");
			Assert.fail("**** A message about adding a product to the comparison module has not appeared ****");
		}
		
		
		}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
		}
		
		
	}
	
}
