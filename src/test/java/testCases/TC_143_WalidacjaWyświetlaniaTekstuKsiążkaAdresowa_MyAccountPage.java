package testCases;

import org.testng.Assert;

import org.testng.annotations.Test;

import baseTest.BaseTest;

import pages.MyAccountPage;

public class TC_143_WalidacjaWyświetlaniaTekstuKsiążkaAdresowa_MyAccountPage extends BaseTest{
	@Test(groups = {"functional","regression","master"})
	public void WalidacjaWyświetlaniaTekstuKsiążkaAdresowa_MyAccountPage() {
		
		try {
			logger.info("****Rozpoczęto TC_143_WalidacjaWyświetlaniaTekstuKsiążkaAdresowa_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			MyAccountPage Map = new MyAccountPage(driver);
			
			
			if(Map.check_header_Adress()==true) {
				
				logger.info("****Wyświetlono nagłówek 'Książka adresowa'****");
				logger.info("****TC_143_WalidacjaWyświetlaniaTekstuKsiążkaAdresowa_MyAccountPage zakończono powodzeniem****");
				Assert.assertTrue(true);
			}else {
				
				logger.error("****Nie wyświetlono nagłówka 'Książka adresowa'****");
				logger.info("****TC_143_WalidacjaWyświetlaniaTekstuKsiążkaAdresowa_MyAccountPage zakończono niepowodzeniem****");
				Assert.fail();
				
				
				}
			
			
			
			
		}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
		}
		
	}
	
}
