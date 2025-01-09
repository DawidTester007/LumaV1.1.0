package testCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.AboutUsPage;
import pages.CustomerServicePage;
import pages.FooterPage;

public class TC_114_ValidationOfDisplayingTableData_CustomerServicePage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void ValidationOfDisplayingTableData_CustomerServicePage(){
		logger.info("**** Starting TC_114_ValidationOfDisplayingTableData_CustomerServicePage ****");
		FooterPage Fp = new FooterPage(driver);
		try {
		Fp.click_linkTxt_aboutUs();
		logger.info("**** Clicked about us link ****");
		AboutUsPage Aup = new AboutUsPage(driver);
		String link = Aup.gettxt_serviceLink_AboutUs();
		Aup.click_serviceLink_AboutUs();
		logger.info("**** Clicked : "+link+" link****");
		CustomerServicePage Csp = new CustomerServicePage(driver);
		int expAmount = 12;
		int i = 0;
		for(WebElement Data : Csp.get_List_DataOfTab()) {
			
			try {
				
				if(Data.isDisplayed()) {
					i++;
					logger.info("**** Value : "+Data.getText()+" has been displayed ****");
					
				}else {
					logger.error("**** Value : "+Data.getText()+" has not been displayed ****");
					logger.info("**** TC_114_ValidationOfDisplayingTableData_CustomerServicePage finished negative ****");
					Assert.fail("**** Value : "+Data.getText()+" has not been displayed ****");
					
				}
				
				
				
			}catch(Exception e) {
				
				logger.error("****Table data has not been displayed ****");
				logger.info("**** TC_114_ValidationOfDisplayingTableData_CustomerServicePage finished negative ****");
				Assert.fail("****Table data has not been displayed ****");
				}
			
		}
		if(i==expAmount) {
		logger.info("**** Each table data have been displayed ****");
		logger.info("**** TC_114_ValidationOfDisplayingTableData_CustomerServicePage finished positive ****");
		Assert.assertTrue(true);
		}else {
			
			logger.error("**** Not each table data have been displayed****");
			logger.info("**** TC_114_ValidationOfDisplayingTableData_CustomerServicePage finished negative ****");
			Assert.fail("**** Not each table data have been displayed****");
		}
		}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
			}
		
	}
	
}
