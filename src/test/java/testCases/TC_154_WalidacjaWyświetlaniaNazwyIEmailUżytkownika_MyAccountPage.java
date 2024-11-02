package testCases;

import org.testng.Assert;

import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_154_WalidacjaWyświetlaniaNazwyIEmailUżytkownika_MyAccountPage extends BaseTest{
	@Test(groups = {"functional","master"})
	public void WalidacjaWyświetlaniaNazwyIEmailUżytkownika_MyAccountPage() {
		
		try {
			
			logger.info("****Rozpoczęto TC_154_WalidacjaWyświetlaniaNazwyIEmailUżytkownika_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			MyAccountPage Map = new MyAccountPage(driver);
			if(Map.check_txt_infoNameAndEmail()==true) {
				
				logger.info("****Nazwa użytkownika oraz email zostały wyświetlone****");
				logger.info("****TC_154_WalidacjaWyświetlaniaNazwyIEmailUżytkownika_MyAccountPage zakończono powodzeniem****");
				Assert.assertTrue(true);
			}else {
				

				logger.error("****Nazwa użytkownika oraz email nie zostały wyświetlone****");
				logger.info("****TC_154_WalidacjaWyświetlaniaNazwyIEmailUżytkownika_MyAccountPage zakończono niepowodzeniem****");
				Assert.fail();
			}
			
		}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
		}
		
		
	}
	
}
