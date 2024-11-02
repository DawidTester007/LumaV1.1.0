package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_159_WalidacjaLinkuPozwalającyZmienićDaneKonta_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void WalidacjaLinkuPozwalającyZmienićDaneKonta() {
		try {
		logger.info("****Rozpoczęto TC_159_WalidacjaLinkuPozwalającyZmienićDaneKonta****");
		BaseTest Bt = new BaseTest();
		Bt.LoginToVeronicaAccount();
		MyAccountPage Map = new MyAccountPage(driver);
		Map.click_link_changeDataAccount();
		logger.info("****Kliknięto link 'zmień' w Informacje kontaktowe****");
		String expTxt = "Edytuj informacje o koncie";
		if(Map.get_txt_nazwa().equalsIgnoreCase(expTxt)) {
			
			logger.info("****Zakładka została uruchomiona i pojawiła się nazwa zakładki:"+expTxt+" ****");
			logger.info("****TC_159_WalidacjaLinkuPozwalającyZmienićDaneKonta zakończono powodzeniem****");
			Assert.assertTrue(true);
		}else {

			logger.error("****Zakładka nie została uruchomiona ****");
			logger.info("****TC_159_WalidacjaLinkuPozwalającyZmienićDaneKonta zakończono niepowodzeniem****");
			Assert.fail();
		}
		
		
		
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
		}
	}
	
}
