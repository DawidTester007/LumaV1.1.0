package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.LoginPage;
import pages.MainPage;
import pages.MyAccountPage;
import pages.ProductPage;

public class TC_076_ValidationOfAddToCartButton_ProductPage extends BaseTest{
	@Test(groups = {"functional","regression","master"})
	public void ValidationOfAddToCartButton_ProductPage() {
		try {
		MainPage Mp = new MainPage(driver);
		logger.info("***Starting TC_076_ValidationOfAddToCartButton_ProductPage ***");
		Mp.click_btnZaloguj();
		logger.info("****Clicked a login button****");
		LoginPage Lp = new LoginPage(driver);
		Lp.send_DataEmail(prop.getProperty("email"));
		Lp.send_DataPwd(prop.getProperty("pwd"));
		logger.info("****Fields have been filled in****");
		Lp.click_btn_Zaloguj();
		logger.info("****Clicked a login button****");
		
		Mp.click_logo();
		logger.info("****Clicked logo****");
		
		Mp.List_ImgProductOf_HSeller().get(0).click();
		logger.info("****Clicked product image****");
		ProductPage Pp = new ProductPage(driver);
		
		Pp.click_btn_toWishList();
		logger.info("****Clicked a wish list button'****");
		
		MyAccountPage Map = new MyAccountPage(driver);
		
		if(Map.check_msg_addedToWishList()==true) {
			
			logger.info("**** Validation messege about adding product to wish list has been displayed****");
			logger.info("**** TC_076_ValidationOfAddToCartButton_ProductPage finished positive ****");
			Assert.assertTrue(true);
		}else {
			logger.error("**** Validation messege about adding product to wish list has not been displayed****");
			logger.info("**** TC_076_ValidationOfAddToCartButton_ProductPage finished negative****");
			Assert.fail("**** Validation messege about adding product to wish list has not been displayed****");
			
		}
		
		}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
		}
	}
	
}
