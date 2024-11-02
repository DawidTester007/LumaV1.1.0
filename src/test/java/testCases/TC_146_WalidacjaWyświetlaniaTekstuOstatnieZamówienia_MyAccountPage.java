package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_146_WalidacjaWyświetlaniaTekstuOstatnieZamówienia_MyAccountPage extends BaseTest{
	@Test(groups = {"functional","regression","master"})
	public void WalidacjaWyświetlaniaTekstuOstatnieZamówienia_MyAccountPage() {
		
		try {
			logger.info("****Rozpoczęto TC_146_WalidacjaWyświetlaniaTekstuOstatnieZamówienia_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			MyAccountPage Map = new MyAccountPage(driver);
			
			
			
			
			if(Map.check_header_LastOrders()==true) {
				
				logger.info("****Wyświetlono nagłówek 'Ostatnie zamówienia'****");
				logger.info("****TC_146_WalidacjaWyświetlaniaTekstuOstatnieZamówienia_MyAccountPage zakończono powodzeniem****");
				Assert.assertTrue(true);
			}else {
				
				logger.error("****Nie wyświetlono nagłówka 'Ostatnie zamówienia'****");
				logger.info("****TC_146_WalidacjaWyświetlaniaTekstuOstatnieZamówienia_MyAccountPage zakończono niepowodzeniem****");
				Assert.fail();
				
				
				}
			
			
			
			
			
		}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
		}
		
	}
	
}
