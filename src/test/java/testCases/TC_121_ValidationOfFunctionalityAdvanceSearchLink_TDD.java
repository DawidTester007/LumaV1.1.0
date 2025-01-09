package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.FooterPage;
import pages.PopularSearchPage;
import utilities.DataProv;


public class TC_121_ValidationOfFunctionalityAdvanceSearchLink_TDD extends BaseTest {

	@Test(dataProvider = "DataAdvanceSearch",dataProviderClass = DataProv.class, groups ={"dataDriver","master"})
	public void alidationOfFunctionalityAdvanceSearchLink_TDD(String nameProduct , String codeProduct , String desc , String SDesc , String minPrice , String maxPrice, String res) {
		try {
			logger.info("****Starting TC_121_ValidationOfFunctionalityAdvanceSearchLink_TDD****");
			FooterPage Fp = new FooterPage(driver);
			Fp.click_linkTxt_advancedSearch();
			logger.info("****Clicked Advance Search link****");
			PopularSearchPage Psp = new PopularSearchPage(driver);
			Psp.set_NameProduct(nameProduct);
			Psp.set_codeProduct(codeProduct);
			Psp.set_describtion(desc); 			
			Psp.set_SDescribtion(SDesc);
			Psp.set_minPrice(minPrice);
			Psp.set_maxPrice(maxPrice);
			logger.info("****Fields has been filled in****");
			Psp.click_btn_Search();
			logger.info("****Clicked search button****");
			
			if(res.equalsIgnoreCase("Valid")) {
				
				if(Psp.check_msg_Finded_xnumber_products()) {
					
					logger.info("****A message about “found products” is displayed****");
					logger.info("****TC_121_ValidationOfFunctionalityAdvanceSearchLink_TDD finished positive****");
					Assert.assertTrue(true);
				}else{
					
					logger.error("****A message about “found products” is not displayed****");
					logger.info("****TC_121_ValidationOfFunctionalityAdvanceSearchLink_TDD finished negative****");
					Assert.fail("****A message about “found products” is not displayed****");
					
				}
				
				
			}else if(res.equalsIgnoreCase("Invalid")) {
				
				if(Psp.check_msg_TryAgain() ||Psp.check_msg_Invalid_minPrice() || Psp.check_msg_Invalid_maxPrice() || Psp.check_msg_DidntFindProducts()) {
					
					logger.info("****A message about “found products” is displayed****");
					logger.info("****TC_121_ValidationOfFunctionalityAdvanceSearchLink_TDD finished positive****");
					Assert.assertTrue(true);
				}else {
					
					logger.error("****A message about “found products” is not displayed****");
					logger.info("****TC_121_ValidationOfFunctionalityAdvanceSearchLink_TDD finished negative****");
					Assert.fail("****A message about “found products” is not displayed****");
					
				}
				
			}
			
			}catch(Exception e) {
				
				logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
				Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
			}
		
	}
	
}
	

