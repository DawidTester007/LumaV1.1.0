package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.FooterPage;
import pages.PrivacyPage;

public class TC_100_ValidationOfFunctionalityPrivacyLink_FooterPage extends BaseTest {

	@Test(groups = {"functional","regression","master"})
	public void ValidationOfFunctionalityPrivacyLink_FooterPage(){
		try {
		logger.info("****Starting TC_100_ValidationOfFunctionalityPrivacyLink_FooterPage****");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Scrolled page down****");
		
		FooterPage  Fp = new FooterPage(driver);
		Fp.click_linkTxt_service();;
		logger.info("****Clicked Privacy and cookies****");
		PrivacyPage Pp = new PrivacyPage(driver);
		String expTxt = "Polityka prywatności";
		if(Pp.get_txt_Name_Page().equals(expTxt)) {
			
			logger.info("****Page name is correct****");
			logger.info("****TC_100_ValidationOfFunctionalityPrivacyLink_FooterPage finished positive****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****Page name is incorrect****");
			logger.info("****TC_100_ValidationOfFunctionalityPrivacyLink_FooterPage finished negative ****");
			Assert.fail("****Page name is incorrect****");
			
		}
	}catch(Exception e) {
		
		logger.error("****An exception was thrown during test:"+ e.getMessage()+" ****");
		Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
	
		}
		
	}
	
}
