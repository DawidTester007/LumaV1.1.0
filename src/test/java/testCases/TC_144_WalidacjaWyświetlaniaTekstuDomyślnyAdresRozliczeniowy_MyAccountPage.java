package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_144_WalidacjaWyświetlaniaTekstuDomyślnyAdresRozliczeniowy_MyAccountPage extends BaseTest{
	@Test(groups = {"functional","regression","master"})
	public void WalidacjaWyświetlaniaTekstuDomyślnyAdresRozliczeniowy_MyAccountPage() {
		
		try {
			logger.info("****Rozpoczęto TC_144_WalidacjaWyświetlaniaTekstuDomyślnyAdresRozliczeniowy_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			MyAccountPage Map = new MyAccountPage(driver);
			
			
			
			
			if(Map.check_header_Settlement()==true) {
				
				logger.info("****Wyświetlono nagłówek 'Domyślny adres rozliczeniowy'****");
				logger.info("****TC_144_WalidacjaWyświetlaniaTekstuDomyślnyAdresRozliczeniowy_MyAccountPage zakończono powodzeniem****");
				Assert.assertTrue(true);
			}else {
				
				logger.error("****Nie wyświetlono nagłówka 'Domyślny adres rozliczeniowy'****");
				logger.info("****TC_144_WalidacjaWyświetlaniaTekstuDomyślnyAdresRozliczeniowy_MyAccountPage zakończono niepowodzeniem****");
				Assert.fail();
				
				
				}
			
			
			
			
		}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
		}
		
	}
	
}
