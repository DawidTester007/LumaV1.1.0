package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_145_WalidacjaWyświetlaniaTekstuDomyślnyAdresDostawy_MyAccountPage extends BaseTest{
	@Test(groups = {"functional","regression","master"})
	public void WalidacjaWyświetlaniaTekstuDomyślnyAdresDostawy_MyAccountPage() {
		
		try {
			logger.info("****Rozpoczęto TC_145_WalidacjaWyświetlaniaTekstuDomyślnyAdresDostawy_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			MyAccountPage Map = new MyAccountPage(driver);
			
			
			
			if(Map.check_header_DeriveryAddress()==true) {
				
				logger.info("****Wyświetlono nagłówek 'Domyślny adres dostawy'****");
				logger.info("****TC_145_WalidacjaWyświetlaniaTekstuDomyślnyAdresDostawy_MyAccountPage zakończono powodzeniem****");
				Assert.assertTrue(true);
			}else {
				
				logger.error("****Nie wyświetlono nagłówka 'Domyślny adres dostawy'****");
				logger.info("****TC_145_WalidacjaWyświetlaniaTekstuDomyślnyAdresDostawy_MyAccountPage zakończono niepowodzeniem****");
				Assert.fail();
				
				
				}
			
			
			
			
		}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
		}
		
	}
	
}
