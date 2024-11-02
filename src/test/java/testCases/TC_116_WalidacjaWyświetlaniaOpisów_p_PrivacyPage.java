package testCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.FooterPage;
import pages.PrivacyPage;
@Test(groups = {"functional","master"})
public class TC_116_WalidacjaWyświetlaniaOpisów_p_PrivacyPage extends BaseTest{

	public void WalidacjaWyświetlaniaOpisów_p_PrivacyPage() {
	logger.info("**** ozpoczęto TC_116_WalidacjaWyświetlaniaOpisów_p_PrivacyPage ****");
	try {	
		FooterPage Fp = new FooterPage(driver);	
		String linkName = Fp.gettxt_linkTxt_privacy();
		Fp.click_linkTxt_privacy();
		logger.info("**** Kliknięto link : "+linkName+" ****");
		PrivacyPage Pp = new PrivacyPage(driver);
		int i = 0;
		int expAmount = 32;
		for(WebElement h2 : Pp.List_txtp()) {
			
			try {
				if(!h2.getText().isEmpty()) {
				if(h2.isDisplayed()) {
					i++;
					logger.info("**** Wyświetlono opis nr : "+i+"****");
					
				}else {
					logger.error("****Nie wyświetlono opisu :"+i+"****");
					logger.info("**** TC_116_WalidacjaWyświetlaniaOpisów_p_PrivacyPage zakończono niepowodzeniem ****");
					Assert.fail();
					
				}}else {
					
					logger.error("****Opis nr : "+i+" jest pusty...****");
					
				}
				
				
				
			}catch(Exception e) {
				
				logger.error("****Nie wyświetlono opisu :"+i+"****");
				logger.info("**** TC_116_WalidacjaWyświetlaniaOpisów_p_PrivacyPage zakończono niepowodzeniem ****");
				Assert.fail();
			}
			
		}
		if(i==expAmount) {
		logger.info("****Wyświetlono wszystkie "+i+" Opisy****");
		logger.info("**** TC_116_WalidacjaWyświetlaniaOpisów_p_PrivacyPage zakończono powodzeniem ****");
		Assert.assertTrue(true);
		}else {
			
			logger.error("****Ilość opisów nie zgadza się z oczekiwaną ilością****");
			logger.info("**** TC_116_WalidacjaWyświetlaniaOpisów_p_PrivacyPage zakończono niepowodzeniem ****");
			Assert.fail();
			
			
		}
		
	}catch(Exception e) {
		
		logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
		Assert.fail();
	
		}
	
	
	}
	
}
