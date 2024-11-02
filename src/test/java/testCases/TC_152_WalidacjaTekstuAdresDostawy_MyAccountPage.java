package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_152_WalidacjaTekstuAdresDostawy_MyAccountPage extends BaseTest{
	@Test(groups = {"functional","master"})
	public void WalidacjaTekstuAdresDostawy_MyAccountPage() {
		
		try {
			
			logger.info("****Rozpoczęto TC_152_WalidacjaTekstuAdresDostawy_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			MyAccountPage Map = new MyAccountPage(driver);
			String expTxt = "Domyślny adres dostawy";
			if(Map.get_header_DeriveryAddress().equalsIgnoreCase(expTxt)) {
				
				logger.info("****Tekst jest poprawny****");
				logger.info("****TC_152_WalidacjaTekstuAdresDostawy_MyAccountPage zakończono powodzeniem****");
				Assert.assertTrue(true);
			}else {
				

				logger.error("****Tekst jest niepoprawny****");
				logger.info("****TC_152_WalidacjaTekstuAdresDostawy_MyAccountPage zakończono niepowodzeniem****");
				Assert.fail();
			}
			
		}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
		}
		
		
	}
	
}
