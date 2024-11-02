package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.FooterPage;
import pages.PopularSearchPage;
import utilities.DataProv;


public class TC_121_WalidacjaFunkcjonalnościAdvanceSearch_TDD extends BaseTest {

	@Test(dataProvider = "DataAdvanceSearch",dataProviderClass = DataProv.class, groups ={"dataDriver","master"})
	public void WalidacjaFunkcjonalnościAdvanceSearch_TDD(String nameProduct , String codeProduct , String desc , String SDesc , String minPrice , String maxPrice, String res) {
		try {
			logger.info("****Rozpoczęto TC_121_WalidacjaFunkcjonalnościAdvanceSearch_TDD****");
			FooterPage Fp = new FooterPage(driver);
			Fp.click_linkTxt_advancedSearch();
			logger.info("****Kliknięto link 'Wyszukiwanie zaawansowane'****");
			PopularSearchPage Psp = new PopularSearchPage(driver);
			Psp.set_NameProduct(nameProduct);
			Psp.set_codeProduct(codeProduct);
			Psp.set_describtion(desc); 			
			Psp.set_SDescribtion(SDesc);
			Psp.set_minPrice(minPrice);
			Psp.set_maxPrice(maxPrice);
			logger.info("****Wypełniono pola danymi****");
			Psp.click_btn_Search();
			logger.info("****Kliknięto przycisk szukaj****");
			
			if(res.equalsIgnoreCase("Valid")) {
				
				if(Psp.check_msg_Finded_xnumber_products()) {
					
					logger.info("****Wyświetlono komunikat o odnaleznieniu produktów****");
					logger.info("****TC_121_WalidacjaFunkcjonalnościAdvanceSearch_TDD zakończono powodzeniem****");
					Assert.assertTrue(true);
				}else{
					
					logger.error("****Nie wyświetlono komunikat o odnaleznieniu produktów****");
					logger.info("****TC_121_WalidacjaFunkcjonalnościAdvanceSearch_TDD zakończono niepowodzeniem****");
					Assert.fail();
					
				}
				
				
			}else if(res.equalsIgnoreCase("Invalid")) {
				
				if(Psp.check_msg_TryAgain() ||Psp.check_msg_Invalid_minPrice() || Psp.check_msg_Invalid_maxPrice() || Psp.check_msg_DidntFindProducts()) {
					
					logger.info("****Pojawił się komunikat walidacyjny****");
					logger.info("****TC_121_WalidacjaFunkcjonalnościAdvanceSearch_TDD zakończono powodzeniem****");
					Assert.assertTrue(true);
				}else {
					
					logger.error("****Nie pojawił się komunikat walidacyjny****");
					logger.info("****TC_121_WalidacjaFunkcjonalnościAdvanceSearch_TDD zakończono powodzeniem****");
					Assert.fail();
					
				}
				
			}
			
			}catch(Exception e) {
				
				logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
				Assert.fail();
			
			}
		
	}
	
}
	

