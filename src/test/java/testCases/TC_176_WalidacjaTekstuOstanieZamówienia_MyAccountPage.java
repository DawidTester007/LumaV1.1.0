package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_176_WalidacjaTekstuOstanieZamówienia_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","master"})
	public void WalidacjaTekstuOstanieZamówienia_MyAccountPage() {
		
		try {
			logger.info("****Rozpoczęto TC_176_WalidacjaTekstuOstanieZamówienia_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			MyAccountPage Map = new MyAccountPage(driver);
			String expTxt = "Ostatnio zamówione";
			if(Map.check_txt_lastOrders()) {
				
				logger.info("****Tekst :"+expTxt+" jest poprawnie wyświetlony"+" ****");
				logger.info("****TC_176_WalidacjaTekstuOstanieZamówienia_MyAccountPage zakończono powodzeniem****");
				Assert.assertTrue(true);
			}else {

				logger.error("****Tekst :"+expTxt+" jest niepoprawnie wyświetlony ****");
				logger.info("****TC_176_WalidacjaTekstuOstanieZamówienia_MyAccountPage zakończono niepowodzeniem****");
				Assert.fail();
			}
			
			
			
	}catch(Exception e) {
				
				logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
				Assert.fail();
			
			}
		
	}
	
}
