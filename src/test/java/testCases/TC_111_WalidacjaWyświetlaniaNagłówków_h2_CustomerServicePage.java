package testCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.CustomerServicePage;
import pages.FooterPage;

public class TC_111_WalidacjaWyświetlaniaNagłówków_h2_CustomerServicePage extends BaseTest {
	@Test(groups={"functional","master"})
	public void WalidacjaWyświetlaniaNagłówków_h2_CustomerServicePage() {
		
		logger.info("****Rozpoczęto TC_111_WalidacjaWyświetlaniaNagłówków_h2_CustomerServicePage****");
		
		FooterPage Fp = new FooterPage(driver);
		String link = Fp.gettxt_linkTxt_service();
		Fp.click_linkTxt_service();
		logger.info("****Kliknięto link: "+link+"****");
		CustomerServicePage Csp = new CustomerServicePage(driver);
		int expAmount = 3;
		int i = 0;
		for(WebElement h2 : Csp.get_List_txt_Tag_h2()) {
			try {
			if(h2.isDisplayed()) {
			i++;
			logger.info("**** Wyświetlono nagłówek h2 nr: "+i+" ****");
			
			}else {
			logger.error("**** Nie wyświetlono nagłówka h2 nr: "+i+" ****");
			logger.info("**** TC_111_WalidacjaWyświetlaniaNagłówków_h2_CustomerServicePage zakończono niepowodzeniem ****");
			Assert.fail();	
			}
			}catch(Exception e) {
				
				logger.error("**** Nie wyświetlono nagłówka h2 nr: "+i+" ****");
				logger.info("**** TC_111_WalidacjaWyświetlaniaNagłówków_h2_CustomerServicePage zakończono niepowodzeniem ****");
				Assert.fail();
				}
			
		}
		if(i==expAmount) {
			
			logger.info("**** Wyświetlono każdy pożądany nagłówek h2****");
			logger.info("**** TC_111_WalidacjaWyświetlaniaNagłówków_h2_CustomerServicePage zakończono powodzeniem ****");
			
		}else {
			
			logger.error("**** Nie wyświetlono wszystkich pożądanych nagłówków h2****");
			logger.info("**** TC_111_WalidacjaWyświetlaniaNagłówków_h2_CustomerServicePage zakończono niepowodzeniem ****");
			Assert.fail();	
			
		}
	}
	
}
