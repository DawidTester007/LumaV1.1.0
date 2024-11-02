package testCases;

import org.testng.Assert;

import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_157_WalidacjaWyświetlaniaInfoAdressDostawy_MyAccountPage extends BaseTest{
	@Test(groups = {"functional","regression","master"})
	public void WalidacjaWyświetlaniaInfoAdressDostawy_MyAccountPage() {
		
		try {
			
			logger.info("****Rozpoczęto TC_157_WalidacjaWyświetlaniaInfoAdressDostawy_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			MyAccountPage Map = new MyAccountPage(driver);
			if(Map.check_txt_InfoAdressDerivery()==true) {
				
				logger.info("****Adress dostawy został wyświetlony****");
				logger.info("****TC_157_WalidacjaWyświetlaniaInfoAdressDostawy_MyAccountPage zakończono powodzeniem****");
				Assert.assertTrue(true);
			}else {
				

				logger.error("****Adress dostawy  nie został wyświetlony****");
				logger.info("****TC_157_WalidacjaWyświetlaniaInfoAdressDostawy_MyAccountPage zakończono niepowodzeniem****");
				Assert.fail();
			}
			
		}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
		}
		
		
	}
	
}
