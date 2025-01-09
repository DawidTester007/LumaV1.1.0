package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.ContactPage;
import pages.FooterPage;
import utilities.DataProv;


public class TC_131_ValidationOfSendingMessage_contactPage_TDD extends BaseTest {

@Test(groups = {"dataDriver","master"} , dataProvider = "DataContact" , dataProviderClass = DataProv.class)
	
	public void ValidationOfSendingMessage_contactPage_TDD(String name, String email, String number, String comment, String res) {
		try {
		logger.info("****Starting TC_131_ValidationOfSendingMessage_contactPage_TDD ****");
		
		FooterPage Fp = new FooterPage(driver);
		
		Fp.click_linkTxt_contact();
		logger.info("****Clicked contact us link****");
		
		ContactPage Cp = new ContactPage(driver);
		Cp.set_input_name(name);
		Cp.set_input_email(email);
		Cp.set_input_number(number);
		Cp.set_input_comment(comment);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Scrolled page down****");
		
		Cp.click_btn_Send();
		
		logger.info("****Clicked send button****");
		
		if(res.equalsIgnoreCase("Invalid")) {
			
			if(Cp.check_msg_nameError() || Cp.check_msg_emailError() || Cp.check_msg_commentError() || Cp.check_msg_failedSend()) {
				
				logger.info("****A validation message has been displayed, message sending ended unsuccesful****");
				logger.info("****TC_131_ValidationOfSendingMessage_contactPage_TDD finished positive****");
				Assert.assertTrue(true);
			}else {
				logger.error("****A validation message has not been displayed, message sending ended succesful****");
				logger.info("****TC_131_ValidationOfSendingMessage_contactPage_TDD finished negative****");
				Assert.fail("****A validation message has not been displayed, message sending ended succesful****");
				
			}
			
		}else if(res.equalsIgnoreCase("Valid")) {
			
			if(Cp.check_msg_nameError() || Cp.check_msg_emailError() || Cp.check_msg_commentError() || Cp.check_msg_failedSend()) {
				
				logger.error("****A validation message has been displayed, message sending ended unsuccesful****");
				logger.info("****TC_131_ValidationOfSendingMessage_contactPage_TDD finished negative****");
				Assert.fail("****A validation message has been displayed, message sending ended unsuccesful****");
				
			}else {
				
				logger.info("****A validation message has not been displayed, message sending ended succesful****");
				logger.info("****TC_131_ValidationOfSendingMessage_contactPage_TDD finished positive****");
				Assert.assertTrue(true);
				
			}
			
		}
}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
	}
		
	}
	
}
	

