package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_199_WalidacjaCheckBoxZmieńAdressEmailIHasło_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void WalidacjaCheckBoxZmieńAdressEmailIHasło_MyAccountPage() {
		try {
		BaseTest Bt = new BaseTest();
		Bt.LoginToVeronicaAccount();
		MyAccountPage Map = new MyAccountPage(driver);
		Map.click_tab_AccountData();
		logger.info("****Kliknięto zakładkę Dane konta****");
		Map.click_checkBox_changeEmail();
		logger.info("****Zaznaczono checkBox  Zmień adres email****");
		Map.click_checkBox_changePwd();
		logger.info("****Zaznaczono checkBox  Zmień hasło****");
		String expTxt = "Zmień adres E-mail i hasło";
		if(Map.get_txt_changeEmailAndPwd().equalsIgnoreCase(expTxt)) {
			logger.info("****Pojawił się tekst i pola pozwalający zmienić email i hasło****");
			logger.info("****TC_199_WalidacjaCheckBoxZmieńAdressEmailIHasło_MyAccountPage zakończono powodzeniem****");
			Assert.assertTrue(true);
		}else {
			logger.error("****Nie pojawił się tekst i pola pozwalający zmienić email i hasło****");
			logger.info("****TC_199_WalidacjaCheckBoxZmieńAdressEmailIHasło_MyAccountPage zakończono niepowodzeniem****");
			Assert.fail();
		}
		}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
		}
	}
	
}
