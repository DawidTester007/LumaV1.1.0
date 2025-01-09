package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_171_NameValidationOfRememberedMethodsOfPayTab_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void NameValidationOfRememberedMethodsOfPayTab_MyAccountPage() {
		
		try {
			logger.info("****Starting TC_171_NameValidationOfRememberedMethodsOfPayTab_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			logger.info("****Veronica demo account is logged in****");
			MyAccountPage Map = new MyAccountPage(driver);
			Map.click_tab_RememberedMethodsOfPay();
			logger.info("****Clicked remembered methods of pay link****");
			String expTxt = "Zapamiętane metody płatności";
			
			if(Map.get_txt_RememberedMethods().equalsIgnoreCase(expTxt)) {
				
				logger.info("****The correct tab is active : "+expTxt+"****");
				logger.info("****TC_171_NameValidationOfRememberedMethodsOfPayTab_MyAccountPage finished negative****");
				Assert.assertTrue(true);
			}else {

				logger.error("****The incorrect tab is active : "+Map.get_txt_nazwa()+"****");
				logger.info("****TC_171_NameValidationOfRememberedMethodsOfPayTab_MyAccountPage finished positive****");
				Assert.fail("****The incorrect tab is active : "+Map.get_txt_nazwa()+"****");
			}
			
			
			
	}catch(Exception e) {
				
				logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
				Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
			}
		
	}
	
}
