package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_197_WalidacjaCheckBoxZmieńAdressEmail_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void WalidacjaCheckBoxZmieńAdressEmail_MyAccountPage() {
		try {
		BaseTest Bt = new BaseTest();
		Bt.LoginToVeronicaAccount();
		MyAccountPage Map = new MyAccountPage(driver);
		Map.click_tab_AccountData();
		logger.info("****Kliknięto zakładkę Dane konta****");
		Map.click_checkBox_changeEmail();
		logger.info("****Zaznaczono checkBox  Zmień adres email****");
		String expTxt = "Zmień adres email";
		if(Map.get_txt_changeEmail().equalsIgnoreCase(expTxt)) {
			logger.info("****Pojawił się tekst i pola pozwalający zmienić email****");
			logger.info("****TC_197_WalidacjaCheckBoxZmieńAdressEmail_MyAccountPage zakończono powodzeniem****");
			Assert.assertTrue(true);
		}else {
			logger.error("****Nie pojawił się tekst i pola pozwalający zmienić email****");
			logger.info("****TC_197_WalidacjaCheckBoxZmieńAdressEmail_MyAccountPage zakończono niepowodzeniem****");
			Assert.fail();
		}
		
	}catch(Exception e) {
		
		logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
		Assert.fail();
	
	}
	}
	
}
