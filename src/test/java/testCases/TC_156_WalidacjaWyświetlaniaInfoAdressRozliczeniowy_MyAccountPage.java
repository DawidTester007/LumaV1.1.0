package testCases;

import org.testng.Assert;

import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_156_WalidacjaWyświetlaniaInfoAdressRozliczeniowy_MyAccountPage extends BaseTest{
	@Test(groups = {"functional","regression","master"})
	public void WalidacjaWyświetlaniaInfoAdressRozliczeniowy_MyAccountPage() {
		
		try {
			
			logger.info("****Rozpoczęto TC_156_WalidacjaWyświetlaniaInfoAdressRozliczeniowy_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			MyAccountPage Map = new MyAccountPage(driver);
			if(Map.check_txt_InfoAdressSettlement()==true) {
				
				logger.info("****Adress rozliczeniowy został wyświetlony****");
				logger.info("****TC_156_WalidacjaWyświetlaniaInfoAdressRozliczeniowy_MyAccountPage zakończono powodzeniem****");
				Assert.assertTrue(true);
			}else {
				

				logger.error("****Adress rozliczeniowy nie został wyświetlony****");
				logger.info("****TC_156_WalidacjaWyświetlaniaInfoAdressRozliczeniowy_MyAccountPage zakończono niepowodzeniem****");
				Assert.fail();
			}
			
		}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
		}
		
		
	}
	
}
