package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.ContactPage;
import pages.FooterPage;

public class TC_129_ValidationOfDisplayHeader_WriteToUs_contactPage extends BaseTest {
	@Test(groups = {"functional","master"})
	public void ValidationOfDisplayHeader_WriteToUs_contactPage() {
		try {
		logger.info("****Starting TC_129_ValidationOfDisplayHeader_WriteToUs_contactPage****");
		FooterPage Fp = new FooterPage(driver);
		
		Fp.click_linkTxt_contact();
		logger.info("****Clicked contact us link****");
		ContactPage Cp = new ContactPage(driver);
		if(Cp.check_txt_WriteToUs()==true) {
			
			logger.info("****The text has been displayed****");
			logger.info("****TC_129_ValidationOfDisplayHeader_WriteToUs_contactPage finished positive****");
			Assert.assertTrue(true);
		}else {
			

			logger.error("****The text has not been displayed****");
			logger.info("****TC_129_ValidationOfDisplayHeader_WriteToUs_contactPage finished negative****");
			Assert.fail("****The text has not been displayed****");
		}
}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
	}
		
	}
	
}
