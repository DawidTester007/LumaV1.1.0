package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.LoginPage;
import pages.MainPage;
import pages.ProductPage;

public class TC_075_ValidationOfButtonAddWishListWithoutLogin_ProductPage extends BaseTest{
	@Test(groups = {"functional","regression","master"})
	public void ValidationOfButtonAddToCartWithoutLogin_ProductPage() {
		try {
		logger.info("****Starting TC_075_ValidationOfButtonAddWishListWithoutLogin_ProductPage****");
		MainPage Mp = new MainPage(driver);
		
		Mp.List_ImgProductOf_HSeller().get(0).click();
		logger.info("****Clicked a product image****");
		ProductPage Pp = new ProductPage(driver);
		
		Pp.click_btn_toWishList();
		logger.info("****Clicked a button Add to Wish List****");
		LoginPage Lp = new LoginPage(driver);
		if(Lp.isDisplayed_com_youHaveToLoginIn()) {
			
			logger.info("**** Validation Messege has appeared and the user did not add a product to whish list****");
			logger.info("**** TC_075_WalidacjaPrzyciskuDodajDoListy_BezLogowania_ProductPage finished positive ****");
			Assert.assertTrue(true);
		}else {
			logger.error("**** Validation Messege has not appeared ****");
			logger.info("**** TC_075_WalidacjaPrzyciskuDodajDoListy_BezLogowania_ProductPage finished negative ****");
			Assert.fail("**** Validation Messege has not appeared ****");
			
		}
		}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
		}
	}
	
}
