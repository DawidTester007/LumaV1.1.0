package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.LoginPage;
import pages.MainPage;
import pages.MyAccountPage;
import pages.ProductPage;

public class TC_076_WalidacjaPrzyciskuDodajDoListy_ProductPage extends BaseTest{
	@Test(groups = {"functional","regression","master"})
	public void WalidacjaPrzyciskuDodajDoListy_ProductPage() {
		try {
		MainPage Mp = new MainPage(driver);
		logger.info("***Rozpoczęto TC_076_WalidacjaPrzyciskuDodajDoListy_ProductPage ***");
		Mp.click_btnZaloguj();
		logger.info("****Kliknięto przycisk zaloguj****");
		LoginPage Lp = new LoginPage(driver);
		Lp.send_DataEmail(prop.getProperty("email"));
		Lp.send_DataPwd(prop.getProperty("pwd"));
		logger.info("****Wypełnieniono pola****");
		Lp.click_btn_Zaloguj();
		logger.info("****Kliknięto przycisk zaloguj****");
		
		Mp.click_logo();
		logger.info("****Kliknięto logo strony****");
		
		Mp.List_ImgProductOf_HSeller().get(0).click();
		logger.info("****Kliknięto obraz przedmiotu****");
		ProductPage Pp = new ProductPage(driver);
		
		Pp.click_btn_toWishList();
		logger.info("****Kliknięto przycisk 'Dodaj do listy życzeń'****");
		
		MyAccountPage Map = new MyAccountPage(driver);
		
		if(Map.check_msg_addedToWishList()==true) {
			
			logger.info("**** Wyświetlono komunikat o dodaniu przedmiotu do Wish list****");
			logger.info("**** TC_076_WalidacjaPrzyciskuDodajDoListy_ProductPage zakończył się powodzeniem ****");
			Assert.assertTrue(true);
		}else {
			logger.error("**** Nie wyświetlono komunikatu o dodaniu przedmiotu do Wish list****");
			logger.info("**** TC_076_WalidacjaPrzyciskuDodajDoListy_ProductPage zakończył się niepowodzeniem ****");
			Assert.fail();
			
		}
		
		}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
			
		}
	}
	
}
