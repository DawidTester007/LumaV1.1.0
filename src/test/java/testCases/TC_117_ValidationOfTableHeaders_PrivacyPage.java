package testCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.FooterPage;
import pages.PrivacyPage;

public class TC_117_ValidationOfTableHeaders_PrivacyPage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void ValidationOfTableHeaders_PrivacyPage() {
		
		try {	
			FooterPage Fp = new FooterPage(driver);	
			String linkName = Fp.gettxt_linkTxt_privacy();
			Fp.click_linkTxt_privacy();
			logger.info("**** Clicked : "+linkName+" link****");
			PrivacyPage Pp = new PrivacyPage(driver);
			int i = 0;
			int expAmount = 24;
			
			for(WebElement header : Pp.get_List_TableHeaders()) {
				
				try {
					
					if(header.isDisplayed()) {
						i++;
						logger.info("****Header : "+header.getText()+" has been displayed****");
						
					}else {
						
						logger.error("****Header : "+header.getText()+" has not been displayed****");
						logger.info("****TC_117_ValidationOfTableHeaders_PrivacyPage finished negative****");
						Assert.fail("****Header : "+header.getText()+" has not been displayed****");
					}

					
				}catch(Exception e) {
					
					logger.error("****Header : "+header.getText()+" has not been displayed****");
					logger.info("****TC_117_ValidationOfTableHeaders_PrivacyPage finished negative****");
					Assert.fail("****Header : "+header.getText()+" has not been displayed****");
				}
				
			}
			
			if(i==expAmount) {
				
				logger.info("****Each header was displayed****");
				logger.info("****TC_117_ValidationOfTableHeaders_PrivacyPage finished positive****");
				Assert.assertTrue(true);
			}else {
				logger.error("****The number of headers:"+i+" doesn't match to expected quantity: "+expAmount+" ****");
				logger.info("****TC_117_ValidationOfTableHeaders_PrivacyPage finished negative****");
				Assert.fail("****The number of headers:"+i+" doesn't match to expected quantity: "+expAmount+" ****");
			}
		
			}catch(Exception e) {
				
				logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
				Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
		}
			
		
		
	}
	
}
