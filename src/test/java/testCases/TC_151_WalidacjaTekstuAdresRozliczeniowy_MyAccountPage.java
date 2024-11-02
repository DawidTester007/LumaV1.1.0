package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_151_WalidacjaTekstuAdresRozliczeniowy_MyAccountPage extends BaseTest{
	@Test(groups = {"functional","master"})
	public void WalidacjaTekstuAdresRozliczeniowy_MyAccountPage() {
		
		try {
			
			logger.info("****Rozpoczęto TC_151_WalidacjaTekstuAdresRozliczeniowy_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			MyAccountPage Map = new MyAccountPage(driver);
			String expTxt = "Domyślny adres rozliczeniowy";
			if(Map.get_header_Settlement().equalsIgnoreCase(expTxt)) {
				
				logger.info("****Tekst jest poprawny****");
				logger.info("****TC_151_WalidacjaTekstuAdresRozliczeniowy_MyAccountPage zakończono powodzeniem****");
				Assert.assertTrue(true);
			}else {
				

				logger.error("****Tekst jest niepoprawny****");
				logger.info("****TC_151_WalidacjaTekstuAdresRozliczeniowy_MyAccountPage zakończono niepowodzeniem****");
				Assert.fail();
			}
			
		}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
		}
		
		
	}
	
}
