package testCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.FooterPage;
import pages.PrivacyPage;

public class TC_118_ValidationOfTableData_PrivacyPage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void ValidationOfTableData_PrivacyPage() {
		
		try {	
			FooterPage Fp = new FooterPage(driver);	
			String linkName = Fp.gettxt_linkTxt_privacy();
			Fp.click_linkTxt_privacy();
			logger.info("**** Clicked: "+linkName+" link ****");
			PrivacyPage Pp = new PrivacyPage(driver);
			int i = 0;
			int expAmount = 22;
			
			for(WebElement data : Pp.get_List_TableData()) {
				
				try {
					
					if(data.isDisplayed()) {
						i++;
						logger.info("****Value : "+data.getText()+" has been displayed****");
						
					}else {
						
						logger.error("****Value has not been displayed ****");
						logger.info("****TC_118_ValidationOfTableData_PrivacyPage finished negative****");
						Assert.fail("****Value has not been displayed ****");
					}

					
				}catch(Exception e) {
					
					logger.error("****Value has not been displayed ****");
					logger.info("****TC_118_ValidationOfTableData_PrivacyPage finished negative****");
					Assert.fail("****Value has not been displayed ****");
				}
				
			}
			
			if(i==expAmount) {
				
				logger.info("****Each data has been displayed****");
				logger.info("****TC_118_ValidationOfTableData_PrivacyPage finished positive****");
				Assert.assertTrue(true);
			}else {
				logger.error("****Each data has not been displayed****");
				logger.info("****TC_118_ValidationOfTableData_PrivacyPage finished negative****");
				Assert.fail("****Each data has not been displayed****");
			}
		
			}catch(Exception e) {
				
				logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
				Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
		}
			
		
		
	}
	
}
