package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.MyAccountPage;
import pages.ProductPage;

public class TC_189_ValidationOfFunctionalityShareWishList_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void ValidationOfFunctionalityShareWishList_MyAccountPage() {
		
		try {
			logger.info("****Starting TC_189_ValidationOfFunctionalityShareWishList_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			logger.info("****Veronica demo account is logged in****");
			MyAccountPage Map = new MyAccountPage(driver);
			MainPage Mp = new MainPage(driver);
			Mp.click_logo();
			logger.info("****Clicked logo page****");
			Mp.List_ImgProductOf_HSeller().get(0).click();
			logger.info("****Clicked first image products from HotSeller****");
			ProductPage Pp = new ProductPage(driver);
			Pp.click_btn_toWishList();
			logger.info("****Clicked add to wish list button****");
			Mp.click_btn_mojeKonto();
			logger.info("****Clicked my account button****");
			Map.click_tab_WishList();
			logger.info("****Clicked my wish list tab****");
			Map.click_btn_shareYourWishList();
			logger.info("****Clicked share wish list button****");
			String expTxt = "Udostępnianie listy życzeń";
			if(Map.get_txt_nazwa().equalsIgnoreCase(expTxt)) {
				
				logger.info("****The button works correctly****");
				driver.navigate().back();
				Map.click_btn_deleteProuctFromWishList();
				logger.info("****The product has been deleted from wish list ****");
				logger.info("****TC_189_ValidationOfFunctionalityShareWishList_MyAccountPage finished positive****");
				Assert.assertTrue(true);
				
			}else {
				
				logger.error("****The button works incorrectly****");
				logger.info("****TC_189_ValidationOfFunctionalityShareWishList_MyAccountPage finished negative****");
				Assert.fail("****The button works incorrectly****");
				
			}
			
			
			
			
			
			
	}catch(Exception e) {
				
				logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
				Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
			}
		
	}
	
}
