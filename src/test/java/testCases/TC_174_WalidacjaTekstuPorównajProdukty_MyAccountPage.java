package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_174_WalidacjaTekstuPorównajProdukty_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","master"})
	public void WalidacjaTekstuPorównajProduktyMyAccountPage() {
		
		try {
			logger.info("****Rozpoczęto TC_174_WalidacjaTekstuPorównajProduktyMyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			MyAccountPage Map = new MyAccountPage(driver);
			String expTxt = "Porównaj produkty";
			if(Map.get_txt_compareProducts().equalsIgnoreCase(expTxt)) {
				
				logger.info("****Tekst :"+expTxt+" jest poprawnie wyświetlony"+" ****");
				logger.info("****TC_174_WalidacjaTekstuPorównajProduktyMyAccountPage zakończono powodzeniem****");
				Assert.assertTrue(true);
			}else {

				logger.error("****Tekst :"+expTxt+" jest niepoprawnie wyświetlony ****");
				logger.info("****TC_174_WalidacjaTekstuPorównajProduktyMyAccountPage zakończono niepowodzeniem****");
				Assert.fail();
			}
			
			
			
	}catch(Exception e) {
				
				logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
				Assert.fail();
			
			}
		
	}
	
}
