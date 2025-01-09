package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_179_ValidationMyWishListText_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","master"})
	public void ValidationMyWishListText_MyAccountPage() {
		
		try {
			logger.info("****Starting TC_179_ValidationMyWishListText_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			logger.info("****Veronica demo account is logged in****");
			MyAccountPage Map = new MyAccountPage(driver);
			String expTxt = "Moja lista życzeń";
			if(Map.get_txt_wishList().equalsIgnoreCase(expTxt)) {
				
				logger.info("****My wish List text is correct ****");
				logger.info("****TC_179_ValidationMyWishListText_MyAccountPage finished positive****");
				Assert.assertTrue(true);
			}else {

				logger.error("****My wish List text is incorrect ****");
				logger.info("****TC_179_ValidationMyWishListText_MyAccountPage finished negative****");
				Assert.fail("****My wish List text is incorrect ****");
			}
			
			
			
	}catch(Exception e) {
				
				logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
				Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
			}
		
	}
	
}
