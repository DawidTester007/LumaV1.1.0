package testCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.AboutUsPage;
import pages.CustomerServicePage;
import pages.FooterPage;

public class TC_114_WalidacjaWyświetlaniaDanychWTabeli_CustomerServicePage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void WalidacjaWyświetlaniaDanychWTabeli_CustomerServicePage(){
		logger.info("**** Rozpoczęto TC_114_WalidacjaWyświetlaniaDanychWTabeli_CustomerServicePage ****");
		FooterPage Fp = new FooterPage(driver);
		try {
		Fp.click_linkTxt_aboutUs();
		logger.info("**** Kliknięto link AboutUs ****");
		AboutUsPage Aup = new AboutUsPage(driver);
		String link = Aup.gettxt_serviceLink_AboutUs();
		Aup.click_serviceLink_AboutUs();
		logger.info("**** Kliknięto link : "+link+" ****");
		CustomerServicePage Csp = new CustomerServicePage(driver);
		int expAmount = 12;
		int i = 0;
		for(WebElement Data : Csp.get_List_DataOfTab()) {
			
			try {
				
				if(Data.isDisplayed()) {
					i++;
					logger.info("**** Wartość : "+Data.getText()+" została wyświetlona ****");
					
				}else {
					logger.error("**** Element tabeli nie został wyświetlony ****");
					logger.info("**** TC_114_WalidacjaWyświetlaniaDanychWTabeli_CustomerServicePage zakończono niepowodzeniem ****");
					Assert.fail();
					
				}
				
				
				
			}catch(Exception e) {
				
				logger.error("**** Wartość tabeli nie został wyświetlony ****");
				logger.info("**** TC_114_WalidacjaWyświetlaniaDanychWTabeli_CustomerServicePage zakończono niepowodzeniem ****");
				Assert.fail();
				}
			
		}
		if(i==expAmount) {
		logger.info("**** Wszystkie dane tabeli zostały wyświetlone ****");
		logger.info("**** TC_114_WalidacjaWyświetlaniaDanychWTabeli_CustomerServicePage zakończono powodzeniem ****");
		Assert.assertTrue(true);
		}else {
			
			logger.error("**** Liczba danych nie zgdadza się z oczekiwaną ilością ****");
			logger.info("**** TC_114_WalidacjaWyświetlaniaDanychWTabeli_CustomerServicePage zakończono niepowodzeniem ****");
			Assert.fail();
		}
		}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
			}
		
	}
	
}
