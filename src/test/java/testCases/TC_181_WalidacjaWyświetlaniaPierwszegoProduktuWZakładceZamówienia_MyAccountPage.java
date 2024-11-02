package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_181_WalidacjaWyświetlaniaPierwszegoProduktuWZakładceZamówienia_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void WalidacjaWyświetlaniaPierwszegoProduktuWZakładceZamówienia_MyAccountPage() {
		
		try {
			logger.info("****Rozpoczęto TC_181_WalidacjaWyświetlaniaPierwszegoProduktuWZakładceZamówienia_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			MyAccountPage Map = new MyAccountPage(driver);
			Map.click_tab_Orders();
			logger.info("****Kliknięto zakładkę zamówienia****");
			
			if(Map.check_row_firstOrder()) {
				
				logger.info("****Pierwszy produkt został wyświetlony w tabeli ****");
				logger.info("****TC_181_WalidacjaWyświetlaniaPierwszegoProduktuWZakładceZamówienia_MyAccountPage zakończono powodzeniem ****");
				Assert.assertTrue(true);
			}else {
				
				logger.error("****Pierwszy produkt nie został wyświetlony w tabeli ****");
				logger.info("****TC_181_WalidacjaWyświetlaniaPierwszegoProduktuWZakładceZamówienia_MyAccountPage zakończono niepowodzeniem ****");
				Assert.fail();
				
			}
			
			
			
			
	}catch(Exception e) {
				
				logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
				Assert.fail();
			
			}
		
	}
	
}
