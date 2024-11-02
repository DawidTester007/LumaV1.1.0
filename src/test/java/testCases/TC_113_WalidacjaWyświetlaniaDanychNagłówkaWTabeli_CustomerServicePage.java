package testCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.AboutUsPage;
import pages.CustomerServicePage;
import pages.FooterPage;

public class TC_113_WalidacjaWyświetlaniaDanychNagłówkaWTabeli_CustomerServicePage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void WalidacjaWyświetlaniaDanychNagłówkaWTabeli_CustomerServicePage() {
		
		logger.info("**** Rozpoczęto TC_113_WalidacjaWyświetlaniaDanychNagłówkaWTabeli_CustomerServicePage ****");
		FooterPage Fp = new FooterPage(driver);
		try {
		Fp.click_linkTxt_aboutUs();
		logger.info("**** Kliknięto link AboutUs ****");
		AboutUsPage Aup = new AboutUsPage(driver);
		String link = Aup.gettxt_serviceLink_AboutUs();
		Aup.click_serviceLink_AboutUs();
		
		logger.info("**** Kliknięto link : "+link+" ****");
		CustomerServicePage Csp = new CustomerServicePage(driver);
		int expAmount = 8 ;
		int i = 0;
		for(WebElement header : Csp.get_List_DataOfHeaderTab()) {
			try {
			if(header.isDisplayed()) {
				i++;
				logger.info("**** Tekst: "+header.getText()+" został wyświetlony w nagłówku ****");
				
			}else {
				logger.error("**** Dane w nagłówku nr: "+i+" nie zostały wyświetlone ****");
				logger.info("**** TC_113_WalidacjaWyświetlaniaDanychNagłówkaWTabeli_CustomerServicePage zakończono niepowodzeniem ****");
				Assert.fail();
			}
			}catch(Exception e) {
				
				logger.error("**** Dane w nagłówku nr: "+i+" nie zostały wyświetlone ****");
				logger.info("**** TC_113_WalidacjaWyświetlaniaDanychNagłówkaWTabeli_CustomerServicePage zakończono niepowodzeniem ****");
				Assert.fail();
				}
		
		}	
		if(i == expAmount) {
		logger.info("**** Wszystkie dane zostały wyświetlone w nagłówku tabeli ****" );
		logger.info("**** TC_113_WalidacjaWyświetlaniaDanychNagłówkaWTabeli_CustomerServicePage zakończono powodzeniem ****");
		Assert.assertTrue(true);
		}else {
			logger.error("**** Liczba wyświetlonych elementów w tabeli nie zgdza się z oczekiwaną ****" );
			logger.info("**** TC_113_WalidacjaWyświetlaniaDanychNagłówkaWTabeli_CustomerServicePage zakończono powodzeniem ****");
			Assert.fail();
			
		}
		}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
			}
		
		
	}
	
}
