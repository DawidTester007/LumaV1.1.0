package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_165_ValidationOfFunctionalityShowOrdersLink_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void ValidationOfFunctionalityShowOrdersLink_MyAccountPage() {
		try {
		logger.info("****Starting TC_165_ValidationOfFunctionalityShowOrdersLink_MyAccountPage****");
		BaseTest Bt = new BaseTest();
		Bt.LoginToVeronicaAccount();
		logger.info("****Veronica demo account is logged in****");
		MyAccountPage Map = new MyAccountPage(driver);
		Map.click_link_showOrders();
		logger.info("****Clicked show all link****");
		String expTxt = "Zamówienia";
		if(Map.get_txt_nazwa().equalsIgnoreCase(expTxt)) {
			
			logger.info("****The correct tab is active : "+expTxt+"****");
			logger.info("****TC_165_ValidationOfFunctionalityShowOrdersLink_MyAccountPage finished positive****");
			Assert.assertTrue(true);
		}else {

			logger.error("****The incorrect tab is active : "+Map.get_txt_nazwa()+"****");
			logger.info("****TC_165_ValidationOfFunctionalityShowOrdersLink_MyAccountPage finished negative****");
			Assert.fail("****The incorrect tab is active : "+Map.get_txt_nazwa()+"****");
		}
		
		
		
}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
		}
	}
	
}
