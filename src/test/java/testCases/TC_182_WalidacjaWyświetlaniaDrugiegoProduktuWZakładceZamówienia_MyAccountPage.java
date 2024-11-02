package testCases;

import org.testng.Assert;

import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_182_WalidacjaWyświetlaniaDrugiegoProduktuWZakładceZamówienia_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void WalidacjaWyświetlaniaDrugiegoProduktuWZakładceZamówienia_MyAccountPage() {
		
		try {
			logger.info("****Rozpoczęto TC_182_WalidacjaWyświetlaniaDrugiegoProduktuWZakładceZamówienia_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			MyAccountPage Map = new MyAccountPage(driver);
			Map.click_tab_Orders();
			logger.info("****Kliknięto zakładkę zamówienia****");
			
			if(Map.check_row_secondOrder()) {
				
				logger.info("****Drugi produkt został wyświetlony w tabeli ****");
				logger.info("****TC_182_WalidacjaWyświetlaniaDrugiegoProduktuWZakładceZamówienia_MyAccountPage zakończono powodzeniem ****");
				Assert.assertTrue(true);
			}else {
				
				logger.error("****Drugi produkt nie został wyświetlony w tabeli ****");
				logger.info("****TC_182_WalidacjaWyświetlaniaDrugiegoProduktuWZakładceZamówienia_MyAccountPage zakończono niepowodzeniem ****");
				Assert.fail();
				
			}
			
			
			
			
	}catch(Exception e) {
				
				logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
				Assert.fail();
			
			}
		
	}
	
}
