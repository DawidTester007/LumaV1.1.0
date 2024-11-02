package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.FooterPage;

public class TC_097_WalidacjaTekstu_LinkuKontakty_FooterPage extends BaseTest {

	@Test(groups = {"functional","master"})
	public void WalidacjaTekstu_Linkukontakty_FooterPage(){
		try {
		logger.info("****Rozpoczęto TC_097_WalidacjaTekstu_Linkukontakty_FooterPage****");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Przewinięto stronę na dół****");
		
		FooterPage  Fp = new FooterPage(driver);
		String exptxt = "Skontaktuj się z nami";
		if(Fp.gettxt_linkTxt_contact().equals(exptxt)) {
			
			logger.info("****Tekst linku 'Skontaktuj się z nami' jest poprawny****");
			logger.info("****TC_097_WalidacjaTekstu_Linkukontakty_FooterPage zakończył się powodzeniem****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****Tekst linku 'Skontaktuj się z nami' jest niepoprawny****");
			logger.info("****TC_097_WalidacjaTekstu_Linkukontakty_FooterPage zakończył się niepowodzeniem ****");
			Assert.fail();
			
		}
	}catch(Exception e) {
		
		logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
		Assert.fail();
	
		}
		
	}
	
}
