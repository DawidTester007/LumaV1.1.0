package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_149_WalidacjaTekstuNewslettery_MyAccountPage extends BaseTest{
	@Test(groups = {"functional","master"})
	public void WalidacjaTekstuNewslettery_MyAccountPage() {
		
		try {
		
			logger.info("****Rozpoczęto TC_149_WalidacjaTekstuNewslettery_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			MyAccountPage Map = new MyAccountPage(driver);
			String expTxt = "Newslettery";
			if(Map.get_header_Newslettery().equalsIgnoreCase(expTxt)) {
				
				logger.info("****Tekst jest poprawny****");
				logger.info("****TC_149_WalidacjaTekstuNewslettery_MyAccountPage zakończono powodzeniem****");
				Assert.assertTrue(true);
			}else {
				

				logger.error("****Tekst jest niepoprawny****");
				logger.info("****TC_149_WalidacjaTekstuNewslettery_MyAccountPage zakończono niepowodzeniem****");
				Assert.fail();
			}
			
		}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
		}
		
		
	}
	
}
