package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.FooterPage;
import pages.PopularSearchPage;


public class TC_101_WalidacjaFunkcjonalności_LinkuSearch_FooterPage extends BaseTest {

	@Test(groups = {"functional","regression","master"})
	public void WalidacjaFunkcjonalności_LinkuSearch_FooterPage(){
		try {
		logger.info("****Rozpoczęto TC_101_WalidacjaFunkcjonalności_LinkuSearch_FooterPage****");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Przewinięto stronę na dół****");
		
		FooterPage  Fp = new FooterPage(driver);
		Fp.click_linkTxt_PopularSearchItem();
		logger.info("****Kliknięto link Wyszukiwane frazy****");
		PopularSearchPage Msp = new PopularSearchPage(driver);
		String expTxt = "Popularne wyszukiwane frazy";
		if(Msp.get_txt_Name_Page().equals(expTxt)) {
			
			logger.info("****Nazwa strony 'Popularne wyszukiwane frazy'jest poprawna****");
			logger.info("****TC_101_WalidacjaFunkcjonalności_LinkuSearch_FooterPage zakończył się powodzeniem****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****Nazwa strony 'Popularne wyszukiwane frazy'jest niepoprawna****");
			logger.info("****TC_101_WalidacjaFunkcjonalności_LinkuSearch_FooterPage zakończył się niepowodzeniem ****");
			Assert.fail();
			
		}
	}catch(Exception e) {
		
		logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
		Assert.fail();
	
		}
		
	}
	
}
