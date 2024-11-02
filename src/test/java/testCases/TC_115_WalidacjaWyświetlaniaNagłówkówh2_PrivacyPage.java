package testCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.FooterPage;
import pages.PrivacyPage;
@Test(groups = {"functional","master"})
public class TC_115_WalidacjaWyświetlaniaNagłówkówh2_PrivacyPage extends BaseTest{

	public void WalidacjaWyświetlaniaNagłówkówh2_PrivacyPage() {
	logger.info("**** ozpoczęto TC_115_WalidacjaWyświetlaniaNagłówkówh2_PrivacyPage ****");
	try {	
		FooterPage Fp = new FooterPage(driver);	
		String linkName = Fp.gettxt_linkTxt_privacy();
		Fp.click_linkTxt_privacy();
		logger.info("**** Kliknięto link : "+linkName+" ****");
		PrivacyPage Pp = new PrivacyPage(driver);
		int i = 0 ;
		int expAmount = 14;
		for(WebElement h2 : Pp.get_List_txth2()) {
			
			try {
				if(h2.isDisplayed()) {
					i++;
					logger.info("****Wyświetlono nagłówek : "+h2.getText()+"****");
					
				}else {
					logger.error("****Nie wyświetlono nagłówka****");
					logger.info("**** TC_115_WalidacjaWyświetlaniaNagłówkówh2_PrivacyPage zakończono niepowodzeniem ****");
					Assert.fail();
					
				}
				
				
				
			}catch(Exception e) {
				
				logger.error("****Nie wyświetlono nagłówka****");
				logger.info("**** TC_115_WalidacjaWyświetlaniaNagłówkówh2_PrivacyPage zakończono niepowodzeniem ****");
				Assert.fail();
			}
			
		}
		if(i == expAmount) {
		logger.info("**** Wyświetlono wszystkie 14 nagłówków****");
		logger.info("**** TC_115_WalidacjaWyświetlaniaNagłówkówh2_PrivacyPage zakończono powodzeniem ****");
		Assert.assertTrue(true);
		}else {
			
			logger.error("**** liczba nagłówków się nie zgadza ilość rzeczywista wynosi : "+i+"****");
			logger.info("**** TC_115_WalidacjaWyświetlaniaNagłówkówh2_PrivacyPage zakończono niepowodzeniem ****");
			Assert.fail();
		}
		
	}catch(Exception e) {
		
		logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
		Assert.fail();
	
		}
	
	
	}
	
}
