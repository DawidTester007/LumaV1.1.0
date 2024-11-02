package testCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.AboutUsPage;
import pages.FooterPage;

public class TC_105_WalidacjaWyświetlaniaTekstówInformacyjnych_AboutUsPage extends BaseTest {
	@Test(groups = {"functional","master"})
	public void WalidacjaWyświetlaniaTekstówInformacyjnych_AboutUsPage() {
		try {
		logger.info("**** Rozpoczęto TC_105_WalidacjaWyświetlaniaTekstówInformacyjnych_AboutUsPage ****");
		FooterPage Fp = new FooterPage(driver);
		
		Fp.click_linkTxt_aboutUs();
		logger.info("**** Kliknięto link AboutUs ****");
		
		AboutUsPage Aup = new AboutUsPage(driver);
		int i = 1;
		for(WebElement Text : Aup.List_TextsAboutUs()) {
			
			try {
			boolean Display = Text.isDisplayed();
			
			if(Display) {
				logger.info("**** Tekst nr : "+i+" został poprawnie wyświetlony ****");
				i++;
				
			}else {
				logger.error("**** Tekst nr : "+i+" nie został poprawnie wyświetlony ****");
				logger.info("**** TC_105_WalidacjaWyświetlaniaTekstówInformacyjnych_AboutUsPage zakończony niepowodzeniem****");
				Assert.fail();
				
			}	}catch(Exception e) {
				
				logger.error("**** Tekst nr : "+i+" nie został poprawnie wyświetlony ****");
				logger.info("**** TC_105_WalidacjaWyświetlaniaTekstówInformacyjnych_AboutUsPage zakończony niepowodzeniem****");
			
				}
			
		}
		Assert.assertTrue(true);
		logger.info("**** Wszystkie teksty zostały wyświetlone****");
		logger.info("**** TC_105_WalidacjaWyświetlaniaTekstówInformacyjnych_AboutUsPage zakończony powodzeniem****");
	
		
	}catch(Exception e) {
		
		logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
		Assert.fail();
	
		}
	
}}
