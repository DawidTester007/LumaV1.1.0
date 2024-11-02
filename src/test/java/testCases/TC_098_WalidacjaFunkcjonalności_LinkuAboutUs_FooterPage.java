package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.AboutUsPage;
import pages.FooterPage;

public class TC_098_WalidacjaFunkcjonalności_LinkuAboutUs_FooterPage extends BaseTest {

	@Test(groups = {"functional","regression","master"})
	public void WalidacjaFunkcjonalności_LinkuAboutUs_FooterPage(){
		try {
		logger.info("****Rozpoczęto TC_098_WalidacjaFunkcjonalności_LinkuAboutUs_FooterPage****");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Przewinięto stronę na dół****");
		
		FooterPage  Fp = new FooterPage(driver);
		Fp.click_linkTxt_aboutUs();
		logger.info("****Kliknięto link About us****");
		AboutUsPage Aup = new AboutUsPage(driver);
		String expTxt = "O nas";
		if(Aup.get_txt_Name_Page().equals(expTxt)) {
			
			logger.info("****Nazwa strony 'O nas'jest poprawna****");
			logger.info("****TC_098_WalidacjaFunkcjonalności_LinkuAboutUs_FooterPage zakończył się powodzeniem****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****Nazwa strony 'O nas'jest niepoprawna****");
			logger.info("****TC_098_WalidacjaFunkcjonalności_LinkuAboutUs_FooterPage zakończył się niepowodzeniem ****");
			Assert.fail();
			
		}
	}catch(Exception e) {
		
		logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
		Assert.fail();
	
		}
		
	}
	
}
