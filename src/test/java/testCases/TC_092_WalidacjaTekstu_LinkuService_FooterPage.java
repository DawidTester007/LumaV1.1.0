package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.FooterPage;

public class TC_092_WalidacjaTekstu_LinkuService_FooterPage extends BaseTest {

	@Test(groups = {"functional","master"})
	public void WalidacjaTekstu_LinkuService_FooterPage(){
		try {
		logger.info("****Rozpoczęto TC_092_WalidacjaTekstu_LinkuService_FooterPage****");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Przewinięto stronę na dół****");
		
		FooterPage  Fp = new FooterPage(driver);
		String exptxt = "Customer Service";
		if(Fp.gettxt_linkTxt_service().equals(exptxt)) {
			
			logger.info("****Tekst linku 'Customer Service' jest poprawny****");
			logger.info("****TC_092_WalidacjaTekstu_LinkuService_FooterPage zakończył się powodzeniem****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****Tekst linku 'Customer Service' jest niepoprawny****");
			logger.info("****TC_092_WalidacjaTekstu_LinkuService_FooterPage zakończył się niepowodzeniem****");
			Assert.fail();
			
		}
	}catch(Exception e) {
		
		logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
		Assert.fail();
	
		}
		
	}
	
}
