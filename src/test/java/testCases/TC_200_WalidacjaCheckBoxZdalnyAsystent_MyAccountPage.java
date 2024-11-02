package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_200_WalidacjaCheckBoxZdalnyAsystent_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void WalidacjaCheckBoxZdalnyAsystent_MyAccountPage() {
		try {
		BaseTest Bt = new BaseTest();
		Bt.LoginToVeronicaAccount();
		MyAccountPage Map = new MyAccountPage(driver);
		Map.click_tab_AccountData();
		logger.info("****Kliknięto zakładkę Dane konta****");
		Map.click_checkBox_RemoteShopping();
		logger.info("****Zaznaczono checkBox Allow remote shopping assistance****");
		if(Map.check_checkBox_RemoteShopping()) {
			logger.info("****CheckBox poprawnie został zaznaczony****");
			logger.info("****TC_200_WalidacjaCheckBoxZdalnyAsystent_MyAccountPage zakończono powodzeniem****");
			Assert.assertTrue(true);
		}else {
			logger.error("****CheckBox nie został zaznaczony****");
			logger.info("****TC_200_WalidacjaCheckBoxZdalnyAsystent_MyAccountPage zakończono niepowodzeniem****");
			Assert.fail();
			
		}
		}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
		}
	}
	
}
