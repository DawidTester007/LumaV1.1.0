package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;

public class TC_083_WalidacjaLoga_MainPage extends BaseTest{

	
	@Test(groups={"functional","master"})
	public void WalidacjaLoga_MainPage(){
		try {
		logger.info("****Rozpoczęto TC_083_WalidacjaLoga_MainPage****");
		MainPage Mp = new MainPage(driver);

		
		if(	Mp.check_logo()==true) {
			
			logger.info("****Logo zostało wyświetlone****");
			logger.info("****TC_083_WalidacjaLoga_MainPage zakończyło się powodzeniem****");
			Assert.assertTrue(true);
		}else {
			

			logger.error("****Logo nie zostało wyświetlone****");
			logger.info("****TC_083_WalidacjaLoga_MainPage zakończyło się niepowodzeniem****");
			Assert.fail();
			
		}
	}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
			}
	}
	
}
