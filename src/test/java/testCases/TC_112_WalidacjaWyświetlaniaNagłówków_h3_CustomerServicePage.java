package testCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.CustomerServicePage;
import pages.FooterPage;

public class TC_112_WalidacjaWyświetlaniaNagłówków_h3_CustomerServicePage extends BaseTest {
	@Test(groups={"functional","master"})
	public void WalidacjaWyświetlaniaNagłówków_h3_CustomerServicePage() {
		try {
		logger.info("****Rozpoczęto TC_111_WalidacjaWyświetlaniaNagłówków_h2_CustomerServicePage****");
		
		FooterPage Fp = new FooterPage(driver);
		String link = Fp.gettxt_linkTxt_service();
		Fp.click_linkTxt_service();
		logger.info("****Kliknięto link: "+link+"****");
		CustomerServicePage Csp = new CustomerServicePage(driver);
		int i = 0;
		int expAmount = 2;
		for(WebElement h3 : Csp.get_List_txt_Tag_h3()) {
			try {
			if(h3.isDisplayed()) {
			i++;
			logger.info("**** Tekst "+h3.getText()+" został wyświetlony ****");
			
			}else {
			logger.error("**** Nie wyświetlono nagłówka h3 nr: "+i+" ****");
			logger.info("**** TC_112_WalidacjaWyświetlaniaNagłówków_h3_CustomerServicePage zakończono niepowodzeniem ****");
			Assert.fail();	
			}
			}catch(Exception e) {
							
			logger.error("**** Nie wyświetlono nagłówka h3 nr: "+i+" ****");
			logger.info("**** TC_112_WalidacjaWyświetlaniaNagłówków_h3_CustomerServicePage zakończono niepowodzeniem ****");
			Assert.fail();
			}
			
		}
		if(i==expAmount) {
			
			logger.info("**** Wyświetlono każdy pożądany nagłówek h3****");
			logger.info("**** TC_112_WalidacjaWyświetlaniaNagłówków_h3_CustomerServicePage zakończono powodzeniem ****");
			
		}else {
			
			logger.error("**** Nie wyświetlono wszystkich pożądanych nagłówków h3****");
			logger.info("**** TC_112_WalidacjaWyświetlaniaNagłówków_h3_CustomerServicePage zakończono niepowodzeniem ****");
			Assert.fail();	
			
		}	}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
			}
	}
	
}
