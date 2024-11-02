package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.LoginPage;
import pages.MainPage;
import pages.ProductPage;

public class TC_075_WalidacjaPrzyciskuDodajDoListy_BezLogowania_ProductPage extends BaseTest{
	@Test(groups = {"functional","regression","master"})
	public void WalidacjaPrzyciskuDodajDoListy_BezLogowania_ProductPage() {
		try {
		logger.info("****Rozpoczęto TC_075_WalidacjaPrzyciskuDodajDoListy_BezLogowania_ProductPage****");
		MainPage Mp = new MainPage(driver);
		
		Mp.List_ImgProductOf_HSeller().get(0).click();
		logger.info("****Kliknięto obraz przedmiotu****");
		ProductPage Pp = new ProductPage(driver);
		
		Pp.click_btn_toWishList();
		logger.info("****Kliknięto przycisk 'Dodaj do listy życzeń'****");
		LoginPage Lp = new LoginPage(driver);
		if(Lp.isDisplayed_com_youHaveToLoginIn()) {
			
			logger.info("**** Wyświetlono komunikat walidacyjny i użytkownik nie dodał przedmiotu do listy życzeń****");
			logger.info("**** TC_075_WalidacjaPrzyciskuDodajDoListy_BezLogowania_ProductPage zakończył się powodzeniem ****");
			Assert.assertTrue(true);
		}else {
			logger.error("**** Nie wyświetlono komunikatu walidacyjnego****");
			logger.info("**** TC_075_WalidacjaPrzyciskuDodajDoListy_BezLogowania_ProductPage zakończył się niepowodzeniem ****");
			Assert.fail();
			
		}
		}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
			
		}
	}
	
}
