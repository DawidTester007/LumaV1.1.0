package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.FooterPage;

public class TC_095_WalidacjaTekstu_LinkuAdvancedSearch_FooterPage extends BaseTest {

	@Test(groups = {"functional","master"})
	public void WalidacjaTekstu_LinkuAdvancedSearch_FooterPage(){
		try {
		logger.info("****Rozpoczęto TC_095_WalidacjaTekstu_LinkuAdvancedSearch_FooterPage****");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Przewinięto stronę na dół****");
		
		FooterPage  Fp = new FooterPage(driver);
		String exptxt = "Wyszukiwanie zaawansowane";
		if(Fp.gettxt_linkTxt_advancedSearch().equals(exptxt)) {
			
			logger.info("****Tekst linku 'Wyszukiwanie zaawansowane' jest poprawny****");
			logger.info("****TC_095_WalidacjaTekstu_LinkuAdvancedSearch_FooterPage zakończył się powodzeniem****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****Tekst linku 'Wyszukiwanie zaawansowane' jest niepoprawny****");
			logger.info("****TC_095_WalidacjaTekstu_LinkuAdvancedSearch_FooterPage zakończył się niepowodzeniem ****");
			Assert.fail();
			
		}
	}catch(Exception e) {
		
		logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
		Assert.fail();
	
		}
		
	}
	
}
