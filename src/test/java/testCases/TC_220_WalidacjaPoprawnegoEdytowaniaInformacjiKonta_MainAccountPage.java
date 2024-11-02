package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_220_WalidacjaPoprawnegoEdytowaniaInformacjiKonta_MainAccountPage extends BaseTest {
	@Test(groups = {"interface","master"})
	public void WalidacjaPoprawnegoEdytowaniaInformacjiKonta_MainAccountPage() throws InterruptedException  {
		try {
		logger.info("Rozpoczęto TC_220_WalidacjaPoprawnegoEdytowaniaInformacjiKonta_MainAccountPage");
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
		String name = BaseTest.randomString();
		String pwd = BaseTest.stringMix();
		System.out.println(name + " "+ pwd);
		Map.send_field_firstname(name);
		Map.send_field_lastname(BaseTest.randomString());
		Map.send_field_email(name+"@gmail.com");
		Map.send_field_CurrPwd(prop.getProperty("pwd"));
		Map.send_field_Pwd(pwd);
		Map.send_field_ConfPwd(pwd);
		logger.info("****Wypełniono pola danymi****");
		Map.click_btn_save();
		logger.info("****Kliknięto przycisk 'zapisz'****");
		if(Map.check_msg_tryAgainLater()==true) {
			
			logger.error("****Pojawił się komunikat: Unable to send mail. Please try again later.****");
			logger.info("****TC_220_WalidacjaPoprawnegoEdytowaniaInformacjiKonta_MainAccountPage zakończył się niepowodzeniem****");
			Assert.fail();
		}else {
			logger.info("****Nie pojawił się komunikat: Unable to send mail. Please try again later.****");
			logger.info("****TC_220_WalidacjaPoprawnegoEdytowaniaInformacjiKonta_MainAccountPage zakończył się powodzeniem****");
			Assert.assertTrue(true);;
			
		}
		}catch(Exception e ) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		}
	}
	
}
