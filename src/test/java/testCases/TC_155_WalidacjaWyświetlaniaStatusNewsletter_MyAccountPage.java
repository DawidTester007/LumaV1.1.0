package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;

import pages.MyAccountPage;


public class TC_155_WalidacjaWyświetlaniaStatusNewsletter_MyAccountPage extends BaseTest{
	@Test(groups = {"functional","master"})
	public void WalidacjaWyświetlaniaStatusNewsletter_MyAccountPage() {
		
		try {
			
			logger.info("****Rozpoczęto TC_155_WalidacjaWyświetlaniaStatusNewsletter_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			MyAccountPage Map = new MyAccountPage(driver);
			if(Map.check_txt_Status_newsletter()==true) {
				
				logger.info("****Status zapisu w Newsletter został wyświetlony****");
				logger.info("****TC_155_WalidacjaWyświetlaniaStatusNewsletter_MyAccountPage zakończono powodzeniem****");
				Assert.assertTrue(true);
			}else {
				

				logger.error("****Status zapisu w Newsletter nie został wyświetlony****");
				logger.info("****TC_155_WalidacjaWyświetlaniaStatusNewsletter_MyAccountPage zakończono niepowodzeniem****");
				Assert.fail();
			}
			
		}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
		}
		
		
	}
	
}
