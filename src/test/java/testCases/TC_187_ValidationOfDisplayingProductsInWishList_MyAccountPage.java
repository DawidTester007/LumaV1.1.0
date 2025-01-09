package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.MyAccountPage;
import pages.ProductPage;

public class TC_187_ValidationOfDisplayingProductsInWishList_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void ValidationOfDisplayingProductsInWishList_MyAccountPage() {
		
		try {
			logger.info("****Starting TC_187_ValidationOfDisplayingProductsInWishList_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			logger.info("****Veronica demo account is logged in****");
			MyAccountPage Map = new MyAccountPage(driver);
			MainPage Mp = new MainPage(driver);
			Mp.click_logo();
			logger.info("****Clicked page logo****");
			Mp.List_ImgProductOf_HSeller().get(0).click();
			logger.info("****Clicked first image products from HotSeller****");
			ProductPage Pp = new ProductPage(driver);
			Pp.click_btn_toWishList();
			logger.info("****Clicked add to wish list button****");
			Mp.click_btn_mojeKonto();
			logger.info("****Clicked my account button****");
			Map.click_tab_WishList();
			logger.info("****Clicked my wish list tab****");
			
			if(Map.check_firstProduct_MyWishList()) {
				
				logger.info("****The product has been correctly displayed in wish list****");
				Map.click_btn_deleteProuctFromWishList();
				logger.info("****The product has been deleted from wish list ****");
				logger.info("****TC_187_ValidationOfDisplayingProductsInWishList_MyAccountPage finished positive****");
				Assert.assertTrue(true);
				
			}else {
				
				logger.error("****The products has not been correctly displayed in wish list****");
				logger.info("****TC_187_ValidationOfDisplayingProductsInWishList_MyAccountPage finished negative****");
				Assert.fail("****The products has not been correctly displayed in wish list****");
				
			}
			
			
			
			
			
			
	}catch(Exception e) {
				
				logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
				Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
			}
		
	}
	
}
