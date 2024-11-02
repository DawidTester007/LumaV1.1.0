package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;

import pages.MyAccountPage;

public class TC_142_WalidacjaWyświetlaniaTekstuNewslettery_MyAccountPage extends BaseTest{
	@Test(groups = {"functional","regression","master"})
	public void WalidacjaWyświetlaniaTekstuNewslettery_MyAccountPage() {
		
		try {
			logger.info("****Rozpoczęto TC_142_WalidacjaWyświetlaniaTekstuNewslettery_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			MyAccountPage Map = new MyAccountPage(driver);
			
			if(Map.check_header_Newslettery()==true) {
				
				logger.info("****Wyświetlono nagłówek 'Newslettery'****");
				logger.info("****TC_142_WalidacjaWyświetlaniaTekstuNewslettery_MyAccountPage zakończono powodzeniem****");
				Assert.assertTrue(true);
			}else {
				
				logger.error("****Nie wyświetlono nagłówka 'Newslettery'****");
				logger.info("****TC_142_WalidacjaWyświetlaniaTekstuNewslettery_MyAccountPage zakończono niepowodzeniem****");
				Assert.fail();
				
				
				}
			
			
			
			
		}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
		}
		
	}
	
}
