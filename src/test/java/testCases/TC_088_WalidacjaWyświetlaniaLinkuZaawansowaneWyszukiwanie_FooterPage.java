package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.FooterPage;

public class TC_088_WalidacjaWyświetlaniaLinkuZaawansowaneWyszukiwanie_FooterPage extends BaseTest {

	@Test(groups = {"functional","regression","master"})
	public void WalidacjaWyświetlaniaLinkuZaawansowaneWyszukiwanie_FooterPage(){
		try {
		logger.info("****Rozpoczęto TC_088_WalidacjaWyświetlaniaLinkuZaawansowaneWyszukiwanie_FooterPage****");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Przewinięto stronę na dół****");
		
		FooterPage  Fp = new FooterPage(driver);
	
		if(Fp.checklinkTxt_advancedSearch()==true) {
			
			logger.info("****Tekst link 'Wyszukiwanie zaawansowane' został wyświetlony****");
			logger.info("****TC_088_WalidacjaWyświetlaniaLinkuZaawansowaneWyszukiwanie_FooterPage zakończył się powodzeniem****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****Tekst link 'Wyszukiwanie zaawansowane' nie został wyświetlony****");
			logger.info("****TC_088_WalidacjaWyświetlaniaLinkuZaawansowaneWyszukiwanie_FooterPage zakończył się niepowodzeniem****");
			Assert.fail();
			
		}
	}catch(Exception e) {
		
		logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
		Assert.fail();
	
		}
		
	}
	
}
