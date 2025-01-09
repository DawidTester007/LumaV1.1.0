package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.InfoBarPage;

public class TC_133_ValidationOfDisplayingText_InfoBarPage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void ValidationOfDisplayingText_InfoBarPage() {
		try {
		logger.info("****Starting TC_133_ValidationOfDisplayingText_InfoBarPage****");
		InfoBarPage Ibp = new InfoBarPage(driver);
		if(Ibp.check_InfoBar()) {
			logger.info("****The text has been displayed in info bar****");
			logger.info("****TC_133_ValidationOfDisplayingText_InfoBarPage finished positive****");
			Assert.assertTrue(true);
		}else {
			logger.error("****The text has not been displayed in info bar****");
			logger.info("****TC_133_ValidationOfDisplayingText_InfoBarPage zakończono niepowodzeniem****");
			Assert.fail("****The text has not been displayed in info bar****");
			
		}
}catch(Exception e) {
			
			logger.error("****An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
		}
	
		
	}
}
