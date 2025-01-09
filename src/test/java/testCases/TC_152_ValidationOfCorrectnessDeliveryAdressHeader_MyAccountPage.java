package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_152_ValidationOfCorrectnessDeliveryAdressHeader_MyAccountPage extends BaseTest{
	@Test(groups = {"functional","master"})
	public void ValidationOfCorrectnessDeliveryAdressHeader_MyAccountPage() {
		
		try {
			
			logger.info("****Starting TC_152_ValidationOfCorrectnessDeliveryAdressHeader_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			logger.info("****Veronica demo account is logged in****");
			MyAccountPage Map = new MyAccountPage(driver);
			String expTxt = "Domyślny adres dostawy";
			if(Map.get_header_DeriveryAddress().equalsIgnoreCase(expTxt)) {
				
				logger.info("****The Header is correct****");
				logger.info("****TC_152_ValidationOfCorrectnessDeliveryAdressHeader_MyAccountPage finished positive****");
				Assert.assertTrue(true);
			}else {
				

				logger.error("****The Header is incorrect****");
				logger.info("****TC_152_ValidationOfCorrectnessDeliveryAdressHeader_MyAccountPage finished negative****");
				Assert.fail("****The Header is incorrect ****");
			}
			
		}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("**** An exception was thrown during test:"+ e.getMessage()+" ****");
		
		}
		
		
	}
	
}
