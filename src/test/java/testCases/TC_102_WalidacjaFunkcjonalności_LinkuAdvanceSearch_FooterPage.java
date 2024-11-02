package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.AdvanceSearchPage;
import pages.FooterPage;


public class TC_102_WalidacjaFunkcjonalności_LinkuAdvanceSearch_FooterPage extends BaseTest {

	@Test(groups = {"functional","regression","master"})
	public void WalidacjaFunkcjonalności_LinkuAdvanceSearch_FooterPage(){
		try {
		logger.info("****Rozpoczęto TC_102_WalidacjaFunkcjonalności_LinkuAdvanceSearch_FooterPage****");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Przewinięto stronę na dół****");
		
		FooterPage  Fp = new FooterPage(driver);
		Fp.click_linkTxt_advancedSearch();
		logger.info("****Kliknięto link Wyszukiwanie zaawansowane****");
		AdvanceSearchPage Asp = new AdvanceSearchPage(driver);
		String expTxt = "Wyszukiwanie zaawansowane";
		if(Asp.get_txt_Name_Page().equals(expTxt)) {
			
			logger.info("****Nazwa strony 'Wyszukiwanie zaawansowane'jest poprawna****");
			logger.info("****TC_102_WalidacjaFunkcjonalności_LinkuAdvanceSearch_FooterPage zakończył się powodzeniem****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****Nazwa strony 'Wyszukiwanie zaawansowane'jest niepoprawna****");
			logger.info("****TC_102_WalidacjaFunkcjonalności_LinkuAdvanceSearch_FooterPage zakończył się niepowodzeniem ****");
			Assert.fail();
			
		}
	}catch(Exception e) {
		
		logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
		Assert.fail();
	
		}
		
	}
	
}
