package testCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.FooterPage;
import pages.PrivacyPage;

public class TC_118_WalidacjaDanychTabeli_PrivacyPage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void WalidacjaDanychTabeli_PrivacyPage() {
		
		try {	
			FooterPage Fp = new FooterPage(driver);	
			String linkName = Fp.gettxt_linkTxt_privacy();
			Fp.click_linkTxt_privacy();
			logger.info("**** Kliknięto link : "+linkName+" ****");
			PrivacyPage Pp = new PrivacyPage(driver);
			int i = 0;
			int expAmount = 22;
			
			for(WebElement data : Pp.get_List_TableData()) {
				
				try {
					
					if(data.isDisplayed()) {
						i++;
						logger.info("****Wartość : "+data.getText()+" została wyświetlony****");
						
					}else {
						
						logger.error("****Wartość nie została wyświetlona****");
						logger.info("****TC_118_WalidacjaDanychTabeli_PrivacyPage zakończono niepowodzeniem****");
						Assert.fail();
					}

					
				}catch(Exception e) {
					
					logger.error("****Wartość nie została wyświetlona****");
					logger.info("****TC_118_WalidacjaDanychTabeli_PrivacyPage zakończono niepowodzeniem****");
					Assert.fail();
					
				}
				
			}
			
			if(i==expAmount) {
				
				logger.info("****Wszyskie dane zostały wyświetlone****");
				logger.info("****TC_118_WalidacjaDanychTabeli_PrivacyPage zakończono powodzeniem****");
				Assert.assertTrue(true);
			}else {
				logger.error("****Ilość danych : "+i+" nie zgadza się z pożądaną ilością : "+expAmount+"****");
				logger.info("****TC_118_WalidacjaDanychTabeli_PrivacyPage zakończono niepowodzeniem****");
				Assert.fail();
			}
		
			}catch(Exception e) {
				
				logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
				Assert.fail();
			
		}
			
		
		
	}
	
}
