package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.ContactPage;
import pages.FooterPage;


public class TC_104_WalidacjaFunkcjonalności_LinkuKontakt_FooterPage extends BaseTest {

	@Test(groups = {"functional","regression","master"})
	public void WalidacjaFunkcjonalności_LinkuKontakt_FooterPage(){
		try {
		logger.info("****Rozpoczęto TC_104_WalidacjaFunkcjonalności_LinkuKontakt_FooterPage****");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Przewinięto stronę na dół****");
		
		FooterPage  Fp = new FooterPage(driver);
		Fp.click_linkTxt_contact();
		logger.info("****Kliknięto link Skontaktuj się z nami****");
		ContactPage Cp = new ContactPage(driver);
		String expTxt = "Skontaktuj się z nami";
		if(Cp.get_txt_Name_Page().equals(expTxt)) {
			
			logger.info("****Nazwa strony 'Skontaktuj się z nami'jest poprawna****");
			logger.info("****TC_104_WalidacjaFunkcjonalności_LinkuKontakt_FooterPage zakończył się powodzeniem****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****Nazwa strony 'Skontaktuj się z nami'jest niepoprawna****");
			logger.info("****TC_104_WalidacjaFunkcjonalności_LinkuKontakt_FooterPage zakończył się niepowodzeniem ****");
			Assert.fail();
			
		}
	}catch(Exception e) {
		
		logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
		Assert.fail();
	
		}
		
	}
	
}
