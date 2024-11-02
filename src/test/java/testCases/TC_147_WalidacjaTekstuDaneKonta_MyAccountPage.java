package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_147_WalidacjaTekstuDaneKonta_MyAccountPage extends BaseTest{
	@Test(groups = {"functional","master"})
	public void WalidacjaTekstuDaneKonta_MyAccountPage() {
		
		try {
		
			logger.info("****Rozpoczęto TC_147_WalidacjaTekstuDaneKonta_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			MyAccountPage Map = new MyAccountPage(driver);
			String expTxt = "Dane konta";
			if(Map.get_header_DataOfAccount().equalsIgnoreCase(expTxt)) {
				
				logger.info("****Tekst jest poprawny****");
				logger.info("****TC_147_WalidacjaTekstuDaneKonta_MyAccountPage zakończono powodzeniem****");
				Assert.assertTrue(true);
			}else {
				

				logger.error("****Tekst jest niepoprawny****");
				logger.info("****TC_147_WalidacjaTekstuDaneKonta_MyAccountPage zakończono niepowodzeniem****");
				Assert.fail();
			}
			
		}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
		}
		
		
	}
	
}
