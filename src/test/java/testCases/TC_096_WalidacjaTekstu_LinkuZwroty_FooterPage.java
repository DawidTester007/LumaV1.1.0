package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.FooterPage;

public class TC_096_WalidacjaTekstu_LinkuZwroty_FooterPage extends BaseTest {

	@Test(groups = {"functional","master"})
	public void WalidacjaTekstu_LinkuZwroty_FooterPage(){
		try {
		logger.info("****Rozpoczęto TC_096_WalidacjaTekstu_LinkuZwroty_FooterPage****");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Przewinięto stronę na dół****");
		
		FooterPage  Fp = new FooterPage(driver);
		String exptxt = "Zamówienia i zwroty";
		if(Fp.gettxt_linkTxt_refund().equals(exptxt)) {
			
			logger.info("****Tekst linku 'Zamówienia i zwroty' jest poprawny****");
			logger.info("****TC_096_WalidacjaTekstu_LinkuZwroty_FooterPage zakończył się powodzeniem****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****Tekst linku 'Zamówienia i zwroty' jest niepoprawny****");
			logger.info("****TC_096_WalidacjaTekstu_LinkuZwroty_FooterPage zakończył się niepowodzeniem ****");
			Assert.fail();
			
		}
	}catch(Exception e) {
		
		logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
		Assert.fail();
	
		}
		
	}
	
}
