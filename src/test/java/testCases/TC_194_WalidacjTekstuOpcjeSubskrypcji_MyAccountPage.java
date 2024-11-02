package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_194_WalidacjTekstuOpcjeSubskrypcji_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","master"})
	public void WalidacjTekstuOpcjeSubskrypcji_MyAccountPage() {
		
		try {
			logger.info("****Rozpoczęto TC_194_WalidacjTekstuOpcjeSubskrypcji_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			MyAccountPage Map = new MyAccountPage(driver);
			Map.click_tab_NewsletterSub();
			logger.info("****Kliknięto zakładkę : Subskrypcja newsletter'a****");
			String expTxt = "Opcje subskrypcji";
			if(Map.get_txt_optionOfSubscription().equalsIgnoreCase(expTxt)) {
			
				logger.info("****Pojawił się tekst : "+expTxt+"****");
				logger.info("****TC_194_WalidacjTekstuOpcjeSubskrypcji_MyAccountPage zakończono powodzeniem****");
				Assert.assertTrue(true);
			}else {
				
				logger.error("****Nie pojawił się tekst : "+expTxt+"****");
				logger.info("****TC_194_WalidacjTekstuOpcjeSubskrypcji_MyAccountPage zakończono niepowodzeniem****");
				Assert.fail();
				
			}
			
			
	}catch(Exception e) {
				
				logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
				Assert.fail();
			
			}
		
	}
	
}
