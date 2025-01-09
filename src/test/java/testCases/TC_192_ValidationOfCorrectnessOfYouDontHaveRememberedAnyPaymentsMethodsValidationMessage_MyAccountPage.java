package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_192_ValidationOfCorrectnessOfYouDontHaveRememberedAnyPaymentsMethodsValidationMessage_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","master"})
	public void ValidationOfCorrectnessOfYouDontHaveRememberedAnyPaymentsMethodsValidationMessage_MyAccountPage() {
		
		try {
			logger.info("****Starting TC_192_ValidationOfCorrectnessOfYouDontHaveRememberedAnyPaymentsMethodsValidationMessage_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			logger.info("****Veronica demo account is logged in****");
			MyAccountPage Map = new MyAccountPage(driver);
			Map.click_tab_RememberedMethodsOfPay();
			logger.info("****Clicked Remembered Methods of Pay****");
			String expTxt = "Nie masz zapisanych metod płatności.";
			if(Map.get_msg_DidntSaveAnyMethods().equalsIgnoreCase(expTxt)) {
			
				logger.info("****You don't have saved payment methods message has been displayed****");
				logger.info("****TC_192_ValidationOfCorrectnessOfYouDontHaveRememberedAnyPaymentsMethodsValidationMessage_MyAccountPage finished positive****");
				Assert.assertTrue(true);
			}else {
				
				logger.error("****You don't have saved payment methods message has not been displayed****");
				logger.info("****TC_192_ValidationOfCorrectnessOfYouDontHaveRememberedAnyPaymentsMethodsValidationMessage_MyAccountPage finished negative****");
				Assert.fail("****You don't have saved payment methods message has not been displayed****");
				
			}
			
			
	}catch(Exception e) {
				
				logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
				Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
			}
		
	}
	
}
