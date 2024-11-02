package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_162_WalidacjaLinkuZarządzajAdresami_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void WalidacjaLinkuZarządzajAdresami_MyAccountPage() {
		try {
		logger.info("****Rozpoczęto TC_162_WalidacjaLinkuZarządzajAdresami_MyAccountPage****");
		BaseTest Bt = new BaseTest();
		Bt.LoginToVeronicaAccount();
		MyAccountPage Map = new MyAccountPage(driver);
		Map.click_link_ManageAdress();
		logger.info("****Kliknięto link 'Zarządzaj adresami'****");
		String expTxt = "Książka adresowa";
		if(Map.get_txt_nazwa().equalsIgnoreCase(expTxt)) {
			
			logger.info("****Zakładka została uruchomiona i pojawiła się nazwa zakładki:"+expTxt+" ****");
			logger.info("****TC_162_WalidacjaLinkuZarządzajAdresami_MyAccountPage zakończono powodzeniem****");
			Assert.assertTrue(true);
		}else {

			logger.error("****Zakładka nie została uruchomiona ****");
			logger.info("****TC_162_WalidacjaLinkuZarządzajAdresami_MyAccountPage zakończono niepowodzeniem****");
			Assert.fail();
		}
		
		
		
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
		}
	}
	
}
