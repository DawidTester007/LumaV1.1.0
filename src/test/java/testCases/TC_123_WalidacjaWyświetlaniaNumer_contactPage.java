package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.ContactPage;
import pages.FooterPage;

public class TC_123_WalidacjaWyświetlaniaNumer_contactPage extends BaseTest {
	@Test(groups = {"functional","master"})
	public void WalidacjaWyświetlaniaNumer_contactPage() {
		try {
		logger.info("****Rozpoczęto TC_123_WalidacjaWyświetlaniaNumer_contactPage****");
		FooterPage Fp = new FooterPage(driver);
		
		Fp.click_linkTxt_contact();
		logger.info("****Kliknięto link 'Skontaktuj się z nami'****");
		ContactPage Cp = new ContactPage(driver);
		if(Cp.check_txt_number()==true) {
			
			logger.info("****Wyświetlono pożądany tekst z numerem****");
			logger.info("****TC_123_WalidacjaWyświetlaniaNumer_contactPage zakończył się powodzeniem****");
			Assert.assertTrue(true);
		}else {
			

			logger.error("****Nie wyświetlono pożądanego tekstu****");
			logger.info("****TC_123_WalidacjaWyświetlaniaNumer_contactPage zakończył się niepowodzeniem****");
			Assert.fail();;
		}
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
	}
		
	}
	
}
