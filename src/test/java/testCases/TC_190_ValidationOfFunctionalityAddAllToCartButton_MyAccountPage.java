package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.MyAccountPage;
import pages.ProductPage;

public class TC_190_ValidationOfFunctionalityAddAllToCartButton_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void ValidationOfFunctionalityAddAllToCartButton_MyAccountPage() {
		
		try {
			logger.info("****Starting TC_190_ValidationOfFunctionalityAddAllToCartButton_MyAccountPage****");
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
			Map.click_btn_AddToCart();
			logger.info("****Clicked Add all to cart button****");
			String expTxt = "Musisz wybrać opcje produktu";
			if(Map.get_msg_chooseOptionOfProduct().contains(expTxt)) {
				
				logger.info("****Validation message about necessity select product options has been displayed****");
				driver.navigate().back();
				Map.click_btn_deleteProuctFromWishList();
				logger.info("****The product has been deleted from wish list ****");
				logger.info("****TC_190_ValidationOfFunctionalityAddAllToCartButton_MyAccountPage finished positive****");
				Assert.assertTrue(true);
				
			}else {
				
				logger.error("****Validation message about necessity select product options has not been displayed****");
				logger.info("****TC_190_ValidationOfFunctionalityAddAllToCartButton_MyAccountPage finished negative ****");
				Assert.fail("****Validation message about necessity select product options has not been displayed****");
				
			}
			
			
			
			
			
			
	}catch(Exception e) {
				
				logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
				Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
			}
		
	}
	
}
