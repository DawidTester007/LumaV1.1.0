package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_174_ValidationOfCorrectnessCompareProductsText_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","master"})
	public void TC_174_ValidationOfCorrectnessCompareProductsText_MyAccountPagealidationOfCorrectnessCompareProductsText_MyAccountPage() {
		
		try {
			logger.info("****Starting TC_174_ValidationOfCorrectnessCompareProductsText_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			logger.info("****Veronica demo account is logged in****");
			MyAccountPage Map = new MyAccountPage(driver);
			String expTxt = "Porównaj produkty";
			if(Map.get_txt_compareProducts().equalsIgnoreCase(expTxt)) {
				
				logger.info("****The text is correct ****");
				logger.info("****TC_174_ValidationOfCorrectnessCompareProductsText_MyAccountPage finished positive****");
				Assert.assertTrue(true);
			}else {

				logger.error("****The text is not correct  ****");
				logger.info("****TC_174_ValidationOfCorrectnessCompareProductsText_MyAccountPage finished negative****");
				Assert.fail("****The text is not correct  ****");
			}
			
			
			
	}catch(Exception e) {
				
				logger.error("****  An exception was thrown during test:"+ e.getMessage()+" ****");
				Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
			}
		
	}
	
}
