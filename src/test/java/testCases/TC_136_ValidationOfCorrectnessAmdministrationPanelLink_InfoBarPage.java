package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.InfoBarPage;

public class TC_136_ValidationOfCorrectnessAmdministrationPanelLink_InfoBarPage extends BaseTest {
	@Test(groups = {"functional","master"})
	public void WalidacjaLinkTekstu_InfoBar() {
		try {
		logger.info("****Starting TC_136_ValidationOfCorrectnessAmdministrationPanelLink_InfoBarPage****");
		InfoBarPage Ibp = new InfoBarPage(driver);
		String expTxt ="Panel Administracyjny";
		
		if(Ibp.get_txt_link_AdminPanel().equalsIgnoreCase(expTxt)) {
			logger.info("****Text of link is correct****");
			logger.info("****TC_136_ValidationOfCorrectnessAmdministrationPanelLink_InfoBarPage finished positive****");
			Assert.assertTrue(true);
		}else {
			logger.error("****Text of link is not correct****");
			logger.info("****TC_136_ValidationOfCorrectnessAmdministrationPanelLink_InfoBarPage finished negative****");
			Assert.fail("****Text of link is not correct****");
			
		}
}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
		}
	
		
	}
}
