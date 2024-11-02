package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.AdvanceSearchPage;
import pages.FooterPage;


public class TC_103_WalidacjaFunkcjonalności_LinkuZwroty_FooterPage extends BaseTest {

	@Test(groups = {"functional","regression","master"})
	public void WalidacjaFunkcjonalności_LinkuZwroty_FooterPage(){
		try {
		logger.info("****Rozpoczęto TC_103_WalidacjaFunkcjonalności_LinkuZwroty_FooterPage****");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Przewinięto stronę na dół****");
		
		FooterPage  Fp = new FooterPage(driver);
		Fp.click_linkTxt_refund();
		logger.info("****Kliknięto link Zamówienia i zwroty****");
		AdvanceSearchPage Asp = new AdvanceSearchPage(driver);
		String expTxt = "Zamówienia i zwroty";
		if(Asp.get_txt_Name_Page().equals(expTxt)) {
			
			logger.info("****Nazwa strony 'Zamówienia i zwroty'jest poprawna****");
			logger.info("****TC_103_WalidacjaFunkcjonalności_LinkuZwroty_FooterPage zakończył się powodzeniem****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****Nazwa strony 'Zamówienia i zwroty'jest niepoprawna****");
			logger.info("****TC_103_WalidacjaFunkcjonalności_LinkuZwroty_FooterPage zakończył się niepowodzeniem ****");
			Assert.fail();
			
		}
	}catch(Exception e) {
		
		logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
		Assert.fail();
	
		}
		
	}
	
}
