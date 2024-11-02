package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_141_WalidacjaWyświetlaniaTekstuInformacjeKontaktowe_MyAccountPage extends BaseTest{
	@Test(groups = {"functional","regression","master"})
	public void WalidacjaWyświetlaniaTekstuInformacjeKontaktowe_MyAccountPage() {
		
		try {
			logger.info("****Rozpoczęto TC_141_WalidacjaWyświetlaniaTekstuInformacjeKontaktowe_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			MyAccountPage Map = new MyAccountPage(driver);
			if(Map.check_header_infoToContact()==true) {
				
				logger.info("****Wyświetlono nagłówek 'Informacje kontaktowe'****");
				logger.info("****TC_141_WalidacjaWyświetlaniaTekstuInformacjeKontaktowe_MyAccountPage zakończono powodzeniem****");
				Assert.assertTrue(true);
			}else {
				
				logger.error("****Nie wyświetlono nagłówka 'Informacje kontaktowe'****");
				logger.info("****TC_141_WalidacjaWyświetlaniaTekstuInformacjeKontaktowe_MyAccountPage zakończono niepowodzeniem****");
				Assert.fail();
				
				
				}
			
			
			
			
		}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
		}
		
	}
	
}
