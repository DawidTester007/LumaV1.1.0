package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_175_WalidacjaTekstyBrakProduktówDoPorównania_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","master"})
	public void WalidacjaTekstyBrakProduktówDoPorównania_MyAccountPage() {
		
		try {
			logger.info("****Rozpoczęto TC_175_WalidacjaTekstyBrakProduktówDoPorównania_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			MyAccountPage Map = new MyAccountPage(driver);
			if(Map.check_txt_amountProductsToCompare()==true) {
				
				logger.info("****Tekst jest poprawnie wyświetlony"+" ****");
				logger.info("****TC_175_WalidacjaTekstyBrakProduktówDoPorównania_MyAccountPage zakończono powodzeniem****");
				Assert.assertTrue(true);
			}else {

				logger.error("****Tekst jest niepoprawnie wyświetlony ****");
				logger.info("****TC_175_WalidacjaTekstyBrakProduktówDoPorównania_MyAccountPage zakończono niepowodzeniem****");
				Assert.fail();
			}
			
			
			
	}catch(Exception e) {
				
				logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
				Assert.fail();
			
			}
		
	}
	
}
