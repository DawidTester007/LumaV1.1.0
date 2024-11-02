package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.FooterPage;
import utilities.DataProv;

public class TC_138_WalidacjaMailBox_FooterPage_TDD extends BaseTest{
	@Test (dataProvider = "DataToMailBoxSubscribe", dataProviderClass = DataProv.class , groups = {"dataDriver","master"})
	public void WalidacjaMailBox_FooterPage(String mail , String res) {
		
		try {
		logger.info("****Rozpoczęto TC_138_WalidacjaMailBox_FooterPage****");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Przesunięto stronę na sam dół****");
		FooterPage Fp = new FooterPage(driver);
		Fp.send_input_mail(mail);
		logger.info("****Usupełniono pole 'email' w Footer****");
		Fp.click_btn_subscribe();
		logger.info("****Kliknięto przycisk subskrybuj****");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		if(res.equalsIgnoreCase("Invalid")) {
			
			if(Fp.check_msg_reqField() || Fp.check_msg_tryAgain()) {
				logger.info("****Pojawił się komunikat walidacyjny****");
				logger.info("****TC_138_WalidacjaMailBox_FooterPage zakończył się powodzeniem****");
				
				Assert.assertTrue(true);
			}else {
				logger.error("****Nie pojawił się komunikat walidacyjny****");
				logger.info("****TC_138_WalidacjaMailBox_FooterPage zakończył się niepowodzeniem****");
				Assert.fail();
				
				
			}
			
		}else if(res.equalsIgnoreCase("Valid")) {
			
			if(Fp.check_msg_succesfulSub()) {
				logger.info("****Pojawił się komunikat walidacyjny****");
				logger.info("****TC_138_WalidacjaMailBox_FooterPage zakończył się powodzeniem****");
				Assert.assertTrue(true);
				
			}else {
				logger.error("****Nie pojawił się komunikat walidacyjny****");
				logger.info("****TC_138_WalidacjaMailBox_FooterPage zakończył się niepowodzeniem****");
				Assert.fail();
				
				
			}
			
			
			
		}
		}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
		}
	}
	
}
