package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.ContactPage;
import pages.FooterPage;
import utilities.DataProv;


public class TC_131_WalidacjaWysyłaniaWiadomości_contactPage_TDD extends BaseTest {

@Test(groups = {"dataDriver","master"} , dataProvider = "DataContact" , dataProviderClass = DataProv.class)
	
	public void WalidacjaWysyłaniaWiadomości_contactPage_TDD(String name, String email, String number, String comment, String res) {
		try {
		logger.info("****Rozpoczęto TC_131_WalidacjaWysyłaniaWiadomości_contactPage ****");
		
		FooterPage Fp = new FooterPage(driver);
		
		Fp.click_linkTxt_contact();
		logger.info("****Kliknięto link 'Skontaktuj się z nami'****");
		
		ContactPage Cp = new ContactPage(driver);
		Cp.set_input_name(name);
		Cp.set_input_email(email);
		Cp.set_input_number(number);
		Cp.set_input_comment(comment);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Wprowadzono dane do pól****");
		
		Cp.click_btn_Send();
		
		logger.info("****Kliknięto przycisk wyślij****");
		
		if(res.equalsIgnoreCase("Invalid")) {
			
			if(Cp.check_msg_nameError() || Cp.check_msg_emailError() || Cp.check_msg_commentError() || Cp.check_msg_failedSend()) {
				
				logger.info("****Pojawił się komunikat walidacyjny, nie udało się wysłać wiadomości****");
				logger.info("****TC_131_WalidacjaWysyłaniaWiadomości_contactPage zakończono powodzeniem****");
				Assert.assertTrue(true);
			}else {
				logger.error("****Nie pojawił się komunikat walidacyjny, udało się wysłać wiadomości****");
				logger.info("****TC_131_WalidacjaWysyłaniaWiadomości_contactPage zakończono niepowodzeniem****");
				Assert.fail();
				
			}
			
		}else if(res.equalsIgnoreCase("Valid")) {
			
			if(Cp.check_msg_nameError() || Cp.check_msg_emailError() || Cp.check_msg_commentError() || Cp.check_msg_failedSend()) {
				
				logger.error("****Pojawił się komunikat walidacyjny, nie udało się wysłać wiadomości****");
				logger.info("****TC_131_WalidacjaWysyłaniaWiadomości_contactPage zakończono niepowodzeniem****");
				Assert.fail();
				
			}else {
				
				logger.info("****Nie pojawił się komunikat walidacyjny, udało się wysłać wiadomości****");
				logger.info("****TC_131_WalidacjaWysyłaniaWiadomości_contactPage zakończono powodzeniem****");
				Assert.assertTrue(true);
				
			}
			
		}
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
	}
		
	}
	
}
	

