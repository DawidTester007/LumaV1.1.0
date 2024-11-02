package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.FooterPage;

public class TC_084_WalidacjaWyświetlaniaLinkuAboutUs_FooterPage extends BaseTest {

	@Test(groups = {"functional","regression","master"})
	public void WalidacjaWyświetlaniaLinkuAboutUs_FooterPage(){
		try {
		logger.info("****Rozpoczęto TC_084_WalidacjaWyświetlaniaLinkuAboutUs_FooterPage****");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Przewinięto stronę na dół****");
		
		FooterPage  Fp = new FooterPage(driver);
	
		if(Fp.check_linkTxt_aboutUs()==true) {
			
			logger.info("****Tekst link 'About us' został wyświetlony****");
			logger.info("****TC_084_WalidacjaWyświetlaniaLinkuAboutUs_FooterPage zakończył się powodzeniem****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****Tekst link 'About us' nie został wyświetlony****");
			logger.info("****TC_084_WalidacjaWyświetlaniaLinkuAboutUs_FooterPage zakończył się niepowodzeniem****");
			Assert.fail();
			
		}
	}catch(Exception e) {
		
		logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
		Assert.fail();
	
		}
		
	}
	
}
