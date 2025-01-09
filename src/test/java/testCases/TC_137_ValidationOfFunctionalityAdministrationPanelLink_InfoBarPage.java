package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.InfoBarPage;

public class TC_137_ValidationOfFunctionalityAdministrationPanelLink_InfoBarPage extends BaseTest{
	@Test(groups = {"functional","regression","master"})
	public void ValidationOfFunctionalityAdministrationPanelLink_InfoBarPage() {
		try {
		logger.info("**** Rozpoczęto TC_137_WalidacjaFunkcjonalnościLinku_InfoBarPage ****");
		InfoBarPage Ibp = new InfoBarPage(driver);
		String textLink = Ibp.get_txt_link_AdminPanel();
		Ibp.click_link_AdminPanel();
		logger.info("****Clicked :"+textLink+" link****");
		String expUrl = "https://demo-magento-2.auroracreation.com/admin_panel/";
		if(Ibp.get_currentUrl().equalsIgnoreCase(expUrl)) {
			logger.info("****Link works correctly****");
			logger.info("****TC_137_ValidationOfFunctionalityAdministrationPanelLink_InfoBarPage finished positive****");
			Assert.assertTrue(true);
		}else {
			logger.error("****Link works incorrectly****");
			logger.info("****TC_137_ValidationOfFunctionalityAdministrationPanelLink_InfoBarPage finished negative****");
			Assert.fail("****Link works incorrectly****");
			
			
		}
	}catch(Exception e) {
		
		logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
		Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
	
	}
		
		
	}
	
}
