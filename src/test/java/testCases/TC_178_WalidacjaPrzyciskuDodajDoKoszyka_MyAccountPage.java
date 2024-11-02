package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_178_WalidacjaPrzyciskuDodajDoKoszyka_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void WalidacjaPrzyciskuDodajDoKoszyka_MyAccountPage() {
		
		try {
			logger.info("****Rozpoczęto TC_178_WalidacjaPrzyciskuDodajDoKoszyka_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			MyAccountPage Map = new MyAccountPage(driver);
			Map.click_checkBox_FirstProduct();
			logger.info("****Zaznaczono checkbox pierwszego produktu****");
			Map.click_btn_addToCart();
			logger.info("****Kliknięto przycisk dodaj do koszyka****");
			
			if(Map.check_msg_AddedToCart()) {
				
				logger.info("****Wyświetlił się komunikat o dodaniu przedmiotu****");
				logger.info("****TC_178_WalidacjaPrzyciskuDodajDoKoszyka_MyAccountPage zakończono powodzeniem****");
				Assert.assertTrue(true);
			}else {

				logger.error("Nie Wyświetlił się komunikat o dodaniu przedmiotu ****");
				logger.info("****TC_178_WalidacjaPrzyciskuDodajDoKoszyka_MyAccountPage zakończono niepowodzeniem****");
				Assert.fail();
			}
			
			
			
	}catch(Exception e) {
				
				logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
				Assert.fail();
			
			}
		
	}
	
}
