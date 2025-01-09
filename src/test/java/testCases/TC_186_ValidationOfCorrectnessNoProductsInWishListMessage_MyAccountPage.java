package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_186_ValidationOfCorrectnessNoProductsInWishListMessage_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","master"})
	public void ValidationOfCorrectnessNoProductsInWishListMessage_MyAccountPage() {
		
		try {
			logger.info("****Starting TC_186_ValidationOfCorrectnessNoProductsInWishListMessage_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			logger.info("****Veronica demo account is logged in****");
			MyAccountPage Map = new MyAccountPage(driver);
			Map.click_tab_WishList();;
			logger.info("****Clicked wish list tab****");
			String expTxt = "Nie masz żadnych produktów na liście życzeń.";
			if(Map.check_msg_NoProducts().equalsIgnoreCase(expTxt)) {
				logger.info("****A message about no products in wish list has been displayed correctly****");
				logger.info("****TC_186_ValidationOfCorrectnessNoProductsInWishListMessage_MyAccountPage finished positive****");
				Assert.assertTrue(true);
				
			}else {
				logger.error("****A message about no products in wish list has not been displayed correctly****");
				logger.info("****TC_186_ValidationOfCorrectnessNoProductsInWishListMessage_MyAccountPage finished negative****");
				Assert.fail("****A message about no products in wish list has not been displayed correctly****");	
			}
			
			
			
			
	}catch(Exception e) {
				
				logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
				Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
			}
		
	}
	
}
