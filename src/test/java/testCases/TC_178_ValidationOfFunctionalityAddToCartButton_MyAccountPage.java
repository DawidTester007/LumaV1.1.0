package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_178_ValidationOfFunctionalityAddToCartButton_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void ValidationOfFunctionalityAddToCartButton_MyAccountPage() {
		
		try {
			logger.info("****Starting TC_178_ValidationOfFunctionalityAddToCartButton_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			logger.info("****Veronica demo account is logged in****");
			MyAccountPage Map = new MyAccountPage(driver);
			Map.click_checkBox_FirstProduct();
			logger.info("****first product checkbox has been selected****");
			Map.click_btn_addToCart();
			logger.info("****Clicked add to cart button****");
			
			if(Map.check_msg_AddedToCart()) {
				
				logger.info("****A message about adding the product has been displayed****");
				logger.info("****TC_178_ValidationOfFunctionalityAddToCartButton_MyAccountPage finished positive****");
				Assert.assertTrue(true);
			}else {

				logger.error("****A message about adding the product has not been displayed****");
				logger.info("****TC_178_ValidationOfFunctionalityAddToCartButton_MyAccountPage finished negative****");
				Assert.fail("****A message about adding the product has not been displayed****");
			}
			
			
			
	}catch(Exception e) {
				
				logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
				Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
			}
		
	}
	
}
