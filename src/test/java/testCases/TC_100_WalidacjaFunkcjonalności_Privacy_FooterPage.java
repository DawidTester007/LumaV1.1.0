package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.FooterPage;
import pages.PrivacyPage;

public class TC_100_WalidacjaFunkcjonalności_Privacy_FooterPage extends BaseTest {

	@Test(groups = {"functional","regression","master"})
	public void WalidacjaFunkcjonalności_Privacy_FooterPage(){
		try {
		logger.info("****Rozpoczęto TC_100_WalidacjaFunkcjonalności_Privacy_FooterPage****");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Przewinięto stronę na dół****");
		
		FooterPage  Fp = new FooterPage(driver);
		Fp.click_linkTxt_service();;
		logger.info("****Kliknięto link Polityka prywatności i pliki cookie****");
		PrivacyPage Pp = new PrivacyPage(driver);
		String expTxt = "Polityka prywatności";
		if(Pp.get_txt_Name_Page().equals(expTxt)) {
			
			logger.info("****Nazwa strony 'Polityka prywatności'jest poprawna****");
			logger.info("****TC_100_WalidacjaFunkcjonalności_Privacy_FooterPages zakończył się powodzeniem****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****Nazwa strony 'Polityka prywatności'jest niepoprawna****");
			logger.info("****TC_100_WalidacjaFunkcjonalności_Privacy_FooterPage zakończył się niepowodzeniem ****");
			Assert.fail();
			
		}
	}catch(Exception e) {
		
		logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
		Assert.fail();
	
		}
		
	}
	
}
