package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.CustomerServicePage;
import pages.FooterPage;

public class TC_099_WalidacjaFunkcjonalności_LinkuService_FooterPage extends BaseTest {

	@Test(groups = {"functional","regression","master"})
	public void WalidacjaFunkcjonalności_LinkuService_FooterPage(){
		try {
		logger.info("****Rozpoczęto TC_099_WalidacjaFunkcjonalności_LinkuService_FooterPage****");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Przewinięto stronę na dół****");
		
		FooterPage  Fp = new FooterPage(driver);
		Fp.click_linkTxt_service();
		logger.info("****Kliknięto link Customer Service****");
		CustomerServicePage Cs = new CustomerServicePage(driver);
		String expTxt = "Obsługa klienta";
		if(Cs.get_txt_Name_Page().equals(expTxt)) {
			
			logger.info("****Nazwa strony 'Customer Service'jest poprawna****");
			logger.info("****TC_099_WalidacjaFunkcjonalności_LinkuService_FooterPage zakończył się powodzeniem****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****Nazwa strony 'Customer Service'jest niepoprawna****");
			logger.info("****TC_099_WalidacjaFunkcjonalności_LinkuService_FooterPage zakończył się niepowodzeniem ****");
			Assert.fail();
			
		}
	}catch(Exception e) {
		
		logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
		Assert.fail();
	
		}
		
	}
	
}
