package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_160_ValidationOfFunctionalityOfChangePasswordLink_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void ValidationOfFunctionalityOfChangePasswordLink_MyAccountPage() {
		try {
		logger.info("****Starting TC_160_ValidationOfFunctionalityOfChangePasswordLink_MyAccountPage****");
		BaseTest Bt = new BaseTest();
		Bt.LoginToVeronicaAccount();
		logger.info("****Veronica demo account is logged in****");
		MyAccountPage Map = new MyAccountPage(driver);
		Map.click_link_changePwd();
		logger.info("****Clicked in contact information the change password link****");
		String expTxt = "Edytuj informacje o koncie";
		if(Map.get_txt_nazwa().equalsIgnoreCase(expTxt)) {
			
			logger.info("****The correct tab is active : "+expTxt+"****");
			logger.info("****TC_160_ValidationOfFunctionalityOfChangePasswordLink_MyAccountPage finished positve****");
			Assert.assertTrue(true);
		}else {

			logger.error("****The incorrect tab is active : "+Map.get_txt_nazwa()+"****");
			logger.info("****TC_160_ValidationOfFunctionalityOfChangePasswordLink_MyAccountPage finished negative****");
			Assert.fail("****The incorrect tab is active : "+Map.get_txt_nazwa()+"****");
		}
		
		
		
}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
		}
	}
	
}
