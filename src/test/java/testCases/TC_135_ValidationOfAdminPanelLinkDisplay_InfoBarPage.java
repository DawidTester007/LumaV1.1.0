package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.InfoBarPage;

public class TC_135_ValidationOfAdminPanelLinkDisplay_InfoBarPage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void ValidationOfAdminPanelLinkDisplay_InfoBarPage() {
		try {
		logger.info("****Starting TC_135_ValidationOfAdminPanelLinkDisplay_InfoBarPage****");
		InfoBarPage Ibp = new InfoBarPage(driver);
		if(Ibp.check_link_AdminPanel()) {
			logger.info("****The link has been displayed****");
			logger.info("****TC_135_ValidationOfAdminPanelLinkDisplay_InfoBarPage finished positive****");
			Assert.assertTrue(true);
		}else {
			logger.error("****The link has not been displayed****");
			logger.info("****TC_135_ValidationOfAdminPanelLinkDisplay_InfoBarPage finished negative****");
			Assert.fail("****The link has not been displayed****");
			
		}
}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
		}
	
		
	}
}
