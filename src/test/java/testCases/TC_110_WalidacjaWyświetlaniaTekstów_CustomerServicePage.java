package testCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.CustomerServicePage;
import pages.FooterPage;

public class TC_110_WalidacjaWyświetlaniaTekstów_CustomerServicePage extends BaseTest {
	@Test(groups={"functional","master"})
	public void WalidacjaWyświetlaniaTekstów_CustomerServicePage() {
		
		logger.info("****Rozpoczęto WalidacjaWyświetlaniaTekstów_CustomerServicePage****");
		try {
		FooterPage Fp = new FooterPage(driver);
		String link = Fp.gettxt_linkTxt_service();
		Fp.click_linkTxt_service();
		logger.info("****Kliknięto link: "+link+"****");
		CustomerServicePage Csp = new CustomerServicePage(driver);
		int expAmount = 10;
		int i = 0;
		for(WebElement texts : Csp.get_List_txt_Tag_p()) {
			try {
			if(texts.isDisplayed()) {
			i++;
			logger.info("**** Wyświetlono opis nr: "+i+" ****");
			
			}else {
			logger.error("**** Nie wyświetlono opisu nr: "+i+" ****");
			logger.info("**** TC_110_WalidacjaWyświetlaniaTekstów_CustomerServicePage zakończono niepowodzeniem ****");
			Assert.fail();	
			}
			
			}catch(Exception e) {
				
			logger.error("**** Nie wyświetlono opisu nr: "+i+" ****");
			logger.info("**** TC_110_WalidacjaWyświetlaniaTekstów_CustomerServicePage zakończono niepowodzeniem ****");
			Assert.fail();	
			}
			
		}
		if(i==expAmount) {
			
			logger.info("**** Wyświetlono każdy pożądany tekst ****");
			logger.info("**** TC_110_WalidacjaWyświetlaniaTekstów_CustomerServicePage zakończono powodzeniem ****");
			
		}else {
			
			logger.error("**** Nie wyświetlono wszystkich pożądanych tekstów****");
			logger.info("**** TC_110_WalidacjaWyświetlaniaTekstów_CustomerServicePage zakończono niepowodzeniem ****");
			Assert.fail();	
			
		}	}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
			}
	}
	
}
