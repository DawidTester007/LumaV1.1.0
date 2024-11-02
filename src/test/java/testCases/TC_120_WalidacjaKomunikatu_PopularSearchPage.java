package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.FooterPage;
import pages.PopularSearchPage;
@Test(groups = {"functional","regression","master"})
public class TC_120_WalidacjaKomunikatu_PopularSearchPage extends BaseTest{

	public void WalidacjaKomunikatu_PopularSearchPage() {
		try {
		logger.info("****Rozpoczęto TC_120_WalidacjaKomunikatu_PopularSearchPage****");
		FooterPage Fp = new FooterPage(driver);
		Fp.click_linkTxt_PopularSearchItem();
		logger.info("****Kliknięto link 'Wyszukiwanie zaawansowane'****");
		PopularSearchPage Psp = new PopularSearchPage(driver);
		String expMsg = "Brak dostępnych fraz wyszukiwania.";
		if(Psp.get_msg_lack_AccessWords().equals(expMsg)) {
			
			logger.info("****Pojawił się komunikat****");
			logger.info("**** TC_120_WalidacjaKomunikatu_PopularSearchPage zakończono powodzeniem ****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****Nie pojawił się komunikat****");
			logger.info("**** TC_120_WalidacjaKomunikatu_PopularSearchPage zakończono niepowodzeniem ****");
			Assert.fail();
		}
	}catch(Exception e) {
		
		logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
		Assert.fail();
	
}
	}
	
}
