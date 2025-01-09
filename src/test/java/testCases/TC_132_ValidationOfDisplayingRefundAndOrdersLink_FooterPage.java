package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.FooterPage;
import pages.LoginPage;
import pages.MainPage;

public class TC_132_ValidationOfDisplayingRefundAndOrdersLink_FooterPage extends BaseTest{
	@Test(groups = {"functional","regression","master"})
	public void ValidationOfFunctionalityRefundAndOrdersLink_FooterPage() throws InterruptedException {
		try {
		logger.info("****Starting TC_132_ValidationOfFunctionalityRefundAndOrdersLink_FooterPage ****");
		FooterPage Fp = new FooterPage(driver);
		MainPage Mp = new MainPage(driver);
		Mp.click_btnZaloguj();
		logger.info("****Clicked login button****");
		LoginPage Lp = new LoginPage(driver);
		Lp.send_DataEmail(prop.getProperty("email"));
		Lp.send_DataPwd(prop.getProperty("pwd"));
		logger.info("****The fields have been filled in****");
		Lp.click_btn_Zaloguj();
		logger.info("****Clicked login button****");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		if(Fp.check_linkTxt_refund()) {
			logger.info("****Refund and orders link has been displayed****");
			logger.info("****TC_132_ValidationOfDisplayingRefundAndOrdersLink_FooterPage finished positive****");
			Assert.assertTrue(true);
		}else {
			logger.error("****Refund and orders link has not been displayed****");
			logger.info("****TC_132_ValidationOfDisplayingRefundAndOrdersLink_FooterPage finished negative****");
			Assert.fail("****Refund and orders link has not been displayed****");
			
		}
		
		
		
}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
	}
		
	}
	
}
