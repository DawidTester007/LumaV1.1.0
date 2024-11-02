package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.FooterPage;

public class TC_091_WalidacjaTekstu_LinkuAboutUs_FooterPage extends BaseTest {

	@Test(groups = {"functional","master"})
	public void WalidacjaTekstu_LinkuAboutUs_FooterPage(){
		try {
		logger.info("****Rozpoczęto TC_091_WalidacjaTekstu_LinkuAboutUs_FooterPage****");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Przewinięto stronę na dół****");
		
		FooterPage  Fp = new FooterPage(driver);
		String exptxt = "About us";
		if(Fp.gettxt_linkTxt_aboutUs().equals(exptxt)) {
			
			logger.info("****Tekst linku 'About us' jest poprawny****");
			logger.info("****TC_091_WalidacjaTekstu_LinkuAboutUs_FooterPage zakończył się powodzeniem****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****Tekst linku 'About us' jest niepoprawny****");
			logger.info("****TC_091_WalidacjaTekstu_LinkuAboutUs_FooterPage zakończył się niepowodzeniem****");
			Assert.fail();
			
		}
	}catch(Exception e) {
		
		logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
		Assert.fail();
	
		}
		
	}
	
}
