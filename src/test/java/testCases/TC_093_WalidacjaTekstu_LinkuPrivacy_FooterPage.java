package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.FooterPage;

public class TC_093_WalidacjaTekstu_LinkuPrivacy_FooterPage extends BaseTest {

	@Test(groups = {"functional","master"})
	public void WalidacjaTekstu_LinkuPrivacy_FooterPage(){
		try {
		logger.info("****Rozpoczęto TC_093_WalidacjaTekstu_LinkuPrivacy_FooterPage****");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Przewinięto stronę na dół****");
		
		FooterPage  Fp = new FooterPage(driver);
		String exptxt = "Polityka prywatności i pliki cookie";
		if(Fp.gettxt_linkTxt_privacy().equals(exptxt)) {
			
			logger.info("****Tekst linku 'Polityka prywatności i pliki cookie' jest poprawny****");
			logger.info("****TC_093_WalidacjaTekstu_LinkuPrivacy_FooterPage zakończył się powodzeniem****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****Tekst linku 'Polityka prywatności i pliki cookie' jest niepoprawny****");
			logger.info("****TC_093_WalidacjaTekstu_LinkuPrivacy_FooterPage zakończył się niepowodzeniem ****");
			Assert.fail();
			
		}
	}catch(Exception e) {
		
		logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
		Assert.fail();
	
		}
		
	}
	
}
