package testCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.FooterPage;
import pages.PrivacyPage;

public class TC_117_WalidacjaNagłówkówTabeli_PrivacyPage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void WalidacjaNagłówkówTabeli_PrivacyPage() {
		
		try {	
			FooterPage Fp = new FooterPage(driver);	
			String linkName = Fp.gettxt_linkTxt_privacy();
			Fp.click_linkTxt_privacy();
			logger.info("**** Kliknięto link : "+linkName+" ****");
			PrivacyPage Pp = new PrivacyPage(driver);
			int i = 0;
			int expAmount = 24;
			
			for(WebElement header : Pp.get_List_TableHeaders()) {
				
				try {
					
					if(header.isDisplayed()) {
						i++;
						logger.info("****Nagłówek : "+header.getText()+" został wyświetlony****");
						
					}else {
						
						logger.error("****Nagłówek nie został wyświetlony****");
						logger.info("****TC_117_WalidacjaNagłówkówTabeli_PrivacyPage zakończono niepowodzeniem****");
						Assert.fail();
					}

					
				}catch(Exception e) {
					
					logger.error("****Nagłówek nie został wyświetlony****");
					logger.info("****TC_117_WalidacjaNagłówkówTabeli_PrivacyPage zakończono niepowodzeniem****");
					Assert.fail();
					
				}
				
			}
			
			if(i==expAmount) {
				
				logger.info("****Wszyskie nagłówki zostały wyświetlone****");
				logger.info("****TC_117_WalidacjaNagłówkówTabeli_PrivacyPage zakończono powodzeniem****");
				Assert.assertTrue(true);
			}else {
				logger.error("****Ilość nagłówków : "+i+" nie zgadza się z pożądaną ilością : "+expAmount+"****");
				logger.info("****TC_117_WalidacjaNagłówkówTabeli_PrivacyPage zakończono niepowodzeniem****");
				Assert.fail();
			}
		
			}catch(Exception e) {
				
				logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
				Assert.fail();
			
		}
			
		
		
	}
	
}
