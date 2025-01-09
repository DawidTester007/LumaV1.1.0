package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.FooterPage;
import utilities.DataProv;

public class TC_138_ValidationOfVolidationMessageDisplayInMailBox_FooterPage_TDD extends BaseTest{
	@Test (dataProvider = "DataToMailBoxSubscribe", dataProviderClass = DataProv.class , groups = {"dataDriver","master"})
	public void ValidationOfVolidationMessageDisplayInMailBox_FooterPage_TDD(String mail , String res) {
		
		try {
		logger.info("****Starting TC_138_ValidationOfVolidationMessageDisplayInMailBox_FooterPage_TDD****");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Scrolled page down****");
		FooterPage Fp = new FooterPage(driver);
		Fp.send_input_mail(mail);
		logger.info("****In footer field has been filled in ****");
		Fp.click_btn_subscribe();
		logger.info("****Clicked subscribe button****");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		if(res.equalsIgnoreCase("Invalid")) {
			
			if(Fp.check_msg_reqField() || Fp.check_msg_tryAgain()) {
				logger.info("****Validation message has been displayed****");
				logger.info("****TC_138_ValidationOfVolidationMessageDisplayInMailBox_FooterPage_TDD finished postive****");
				
				Assert.assertTrue(true);
			}else {
				logger.error("****Validation message has not been displayed****");
				logger.info("****TC_138_ValidationOfVolidationMessageDisplayInMailBox_FooterPage_TDD finished negative****");
				Assert.fail("****Validation message has not been displayed****");
				
				
			}
			
		}else if(res.equalsIgnoreCase("Valid")) {
			
			if(Fp.check_msg_succesfulSub()) {
				logger.info("****Validation message has been displayed****");
				logger.info("****TC_138_ValidationOfVolidationMessageDisplayInMailBox_FooterPage_TDD finished postive****");
				
				Assert.assertTrue(true);
				
			}else {
				logger.error("****Validation message has not been displayed****");
				logger.info("****TC_138_ValidationOfVolidationMessageDisplayInMailBox_FooterPage_TDD finished negative****");
				Assert.fail("****Validation message has not been displayed****");
				
				
			}
			
			
			
		}
		}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
		}
	}
	
}
