package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.ContactPage;
import pages.FooterPage;

public class TC_125_ValidationOfDesignQueryTextDisplay_contactPage extends BaseTest {
	@Test(groups = {"functional","master"})
	public void ValidationOfDesignQueryTextDisplay_contactPage() {
		try {
		logger.info("****Starting TC_125_ValidationOfDesignQueryTextDisplay_contactPage****");
		FooterPage Fp = new FooterPage(driver);
		
		Fp.click_linkTxt_contact();
		logger.info("****Clicked contact us link****");
		ContactPage Cp = new ContactPage(driver);
		if(Cp.check_txt_DesignInquiries_Description()==true) {
			
			logger.info("****The Design Query Text text has not been displayed****");
			logger.info("****TC_125_ValidationOfDesignQueryTextDisplay_contactPage finished positive****");
			Assert.assertTrue(true);
		}else {
			

			logger.error("****The Design Query Text text has not been displayed****");
			logger.info("****TC_125_ValidationOfDesignQueryTextDisplay_contactPage finished negative****");
			Assert.fail("****The Design Query Text text has not been displayed****");
		}
}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
	}
		
	}
	
}
