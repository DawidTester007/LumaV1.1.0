package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_198_WalidacjaCheckBoxZmieńHasło_MyAccountPage extends BaseTest {
	@Test(groups ={"functional","regression","master"})
	public void WalidacjaCheckBoxZmieńHasło_MyAccountPage() {
		try {
		BaseTest Bt = new BaseTest();
		Bt.LoginToVeronicaAccount();
		MyAccountPage Map = new MyAccountPage(driver);
		Map.click_tab_AccountData();
		logger.info("****Kliknięto zakładkę Dane konta****");
		Map.click_checkBox_changePwd();
		logger.info("****Zaznaczono checkBox  Zmień hasło****");
		String expTxt = "Zmień hasło";
		if(Map.get_txt_changePwd().equalsIgnoreCase(expTxt)) {
			logger.info("****Pojawił się tekst i pola pozwalający zmienić hasło****");
			logger.info("****TC_198_WalidacjaCheckBoxZmieńHasło_MyAccountPage zakończono powodzeniem****");
			Assert.assertTrue(true);
		}else {
			logger.error("****Nie pojawił się tekst i pola pozwalający zmienić hasło****");
			logger.info("****TC_198_WalidacjaCheckBoxZmieńHasło_MyAccountPage zakończono niepowodzeniem****");
			Assert.fail();
		}
		
	}catch(Exception e) {
		
		logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
		Assert.fail();
	
	}
	}
	
}
