package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.FooterPage;

public class TC_094_WalidacjaTekstu_LinkuMostSearch_FooterPage extends BaseTest {

	@Test(groups = {"functional","master"})
	public void WalidacjaTekstu_LinkuMostSearch_FooterPage(){
		try {
		logger.info("****Rozpoczęto TC_094_WalidacjaTekstu_LinkuMostSearch_FooterPage****");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Przewinięto stronę na dół****");
		
		FooterPage  Fp = new FooterPage(driver);
		String exptxt = "Wyszukiwane frazy";
		if(Fp.gettxt_linkTxt_PopularSearchItem().equals(exptxt)) {
			
			logger.info("****Tekst linku 'Wyszukiwane frazy' jest poprawny****");
			logger.info("****TC_094_WalidacjaTekstu_LinkuMostSearch_FooterPage zakończył się powodzeniem****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****Tekst linku 'Wyszukiwane frazy' jest niepoprawny****");
			logger.info("****TC_094_WalidacjaTekstu_LinkuMostSearch_FooterPage zakończył się niepowodzeniem ****");
			Assert.fail();
			
		}
	}catch(Exception e) {
		
		logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
		Assert.fail();
	
		}
		
	}
	
}
