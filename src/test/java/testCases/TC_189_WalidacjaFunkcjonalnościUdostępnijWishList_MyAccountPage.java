package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.MyAccountPage;
import pages.ProductPage;

public class TC_189_WalidacjaFunkcjonalnościUdostępnijWishList_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void WalidacjaFunkcjonalnościUdostępnijWishList_MyAccountPage() {
		
		try {
			logger.info("****Rozpoczęto TC_189_WalidacjaFunkcjonalnościUdostępnijWishList_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			MyAccountPage Map = new MyAccountPage(driver);
			MainPage Mp = new MainPage(driver);
			Mp.click_logo();
			logger.info("****Kliknięto logo strony****");
			Mp.List_ImgProductOf_HSeller().get(0).click();
			logger.info("****Kliknięto obraz pierwszego produktu z Hotseller****");
			ProductPage Pp = new ProductPage(driver);
			Pp.click_btn_toWishList();
			logger.info("****Kliknięto przycisk dodaj do listy życzeń****");
			Mp.click_btn_mojeKonto();
			logger.info("****Kliknięto przycisk 'Moje konto'****");
			Map.click_tab_WishList();
			logger.info("****Kliknięto zakładkę Moja lista życzeń****");
			Map.click_btn_shareYourWishList();
			logger.info("****Kliknięto przycisk: Podziel się listą życzeń****");
			String expTxt = "Udostępnianie listy życzeń";
			if(Map.get_txt_nazwa().equalsIgnoreCase(expTxt)) {
				
				logger.info("****Przycisk w poprawny sposób przeniósł użytkownika do: "+expTxt+"****");
				driver.navigate().back();
				Map.click_btn_deleteProuctFromWishList();
				logger.info("****Usunięto produkt z listy życzeń****");
				logger.info("****TC_189_WalidacjaFunkcjonalnościUdostępnijWishList_MyAccountPage zakończono powodzeniem****");
				Assert.assertTrue(true);
				
			}else {
				
				logger.error("****Przycisk nie przeniósł użytkownika do: "+expTxt+"****");
				logger.info("****TC_189_WalidacjaFunkcjonalnościUdostępnijWishList_MyAccountPage zakończono niepowodzeniem****");
				Assert.fail();
				
			}
			
			
			
			
			
			
	}catch(Exception e) {
				
				logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
				Assert.fail();
			
			}
		
	}
	
}
