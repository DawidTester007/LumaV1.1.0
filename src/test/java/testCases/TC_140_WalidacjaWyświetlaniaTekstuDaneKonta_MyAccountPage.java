package testCases;

import org.testng.Assert;

import org.testng.annotations.Test;

import baseTest.BaseTest;

import pages.MyAccountPage;

public class TC_140_WalidacjaWyświetlaniaTekstuDaneKonta_MyAccountPage extends BaseTest{
	@Test(groups = {"functional","regression","master"})
	public void WalidacjaWyświetlaniaTekstuDaneKonta_MyAccountPage() {
		
		try {
			logger.info("****Rozpoczęto TC_140_WalidacjaWyświetlaniaTekstuDaneKonta_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			MyAccountPage Map = new MyAccountPage(driver);
			if(Map.check_header_DataOfAccount()==true) {
				
				logger.info("****Wyświetlono nagłówek 'Dane konta'****");
				logger.info("****TC_140_WalidacjaWyświetlaniaTekstuDaneKonta_MyAccountPage zakończono powodzeniem****");
				Assert.assertTrue(true);
			}else {
				
				logger.error("****Nie wyświetlono nagłówka 'Dane konta'****");
				logger.info("****TC_140_WalidacjaWyświetlaniaTekstuDaneKonta_MyAccountPage zakończono niepowodzeniem****");
				Assert.fail();
				
				
				}
			
			
			
		}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
		}
		
	}
	
}
