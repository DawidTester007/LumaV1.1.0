package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;
import utilities.DataProv;

public class TC_219_WalidacjaZakładkiEdytujInformacjeKontaTDD_MainAccountPage extends BaseTest {
	@Test(groups = {"dataDriver","master"} , dataProvider = "InvalidDataEditAccountInfo", dataProviderClass = DataProv.class)
	public void WalidacjaZakładkiEdytujInformacjeKontaTDD_MainAccountPage(String name , String lastname , String email , String currPwd, String newPwd, String confPwd, String res) throws InterruptedException {
		try {
		logger.info("****Rozpoczęto TC_219_WalidacjaZakładkiEdytujInformacjeKontaTDD_MainAccountPage****");
		BaseTest Bt = new BaseTest();
		Bt.LoginToVeronicaAccount();
		MyAccountPage Map = new MyAccountPage(driver);
		Map.click_tab_AccountData();
		logger.info("****Kliknięto przycisk zakładkę : Dane Konta****");
		Map.click_checkBox_changeEmail();
		logger.info("****Kliknięto przycisk : Zmień adres email****");
		Map.click_checkBox_changePwd();
		logger.info("****Kliknięto przycisk : Zmień hasło****");
		Map.clear_field_firstname();
		logger.info("****Wyczyszczono pole Imię****");
		Map.clear_field_lastname();
		logger.info("****Wyczyszczono pole Nazwisko****");
		Map.clear_field_email();
		logger.info("****Wyczyszczono pole Email****");
		Map.send_field_firstname(name);
		Map.send_field_lastname(lastname);
		Map.send_field_email(email);
		Map.send_field_CurrPwd(currPwd);
		Map.send_field_Pwd(newPwd);
		Map.send_field_ConfPwd(confPwd);
		logger.info("****Wypełniono pola danymi z arkusza****");
		Map.click_btn_save();
		logger.info("****Kliknięto przycisk 'zapisz'****");
		if(Map.check_msg_pwdDoesntMatch() || Map.check_msg_firstname() || Map.check_msg_lastname() || Map.check_msg_email() || Map.check_msg_confPwd() || Map.check_msg_currPwd() || Map.check_msg_Pwd() ) {
			
			logger.info("****Pojawił się komunikat walidacyjny****");
			logger.info("****TC_219_WalidacjaZakładkiEdytujInformacjeKontaTDD_MainAccountPage zakończono powodzeniem****");
			Assert.assertTrue(true);
		}else {
			logger.error("****Nie pojawił się komunikat walidacyjny****");
			logger.info("****TC_219_WalidacjaZakładkiEdytujInformacjeKontaTDD_MainAccountPage zakończono niepowodzeniem****");
			Assert.fail();
			
		}
		
		
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
		}
	}
	
}
