package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.FooterPage;

public class TC_086_WalidacjaWyświetlaniaLinkuPrivacy_FooterPage extends BaseTest {

	@Test(groups = {"functional","regression","master"})
	public void WalidacjaWyświetlaniaLinkuPrivacy_FooterPage(){
		try {
		logger.info("****Rozpoczęto TC_086_WalidacjaWyświetlaniaLinkuPrivacy_FooterPage****");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Przewinięto stronę na dół****");
		
		FooterPage  Fp = new FooterPage(driver);
	
		if(Fp.check_linkTxt_privacy()==true) {
			
			logger.info("****Tekst link 'Polityka prywatności i pliki cookie' został wyświetlony****");
			logger.info("****TC_086_WalidacjaWyświetlaniaLinkuPrivacy_FooterPage zakończył się powodzeniem****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****Tekst link 'Polityka prywatności i pliki cookie' nie został wyświetlony****");
			logger.info("****TC_086_WalidacjaWyświetlaniaLinkuPrivacy_FooterPage zakończył się niepowodzeniem****");
			Assert.fail();
			
		}
	}catch(Exception e) {
		
		logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
		Assert.fail();
	
		}
		
	}
	
}
