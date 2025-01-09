package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_151_ValidationOfCorrectnessSettlementAdressHeader_MyAccountPage extends BaseTest{
	@Test(groups = {"functional","master"})
	public void ValidationOfCorrectnessSettlementAdressHeader_MyAccountPage() {
		
		try {
			
			logger.info("****Starting TC_151_ValidationOfCorrectnessSettlementAdressHeader_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			logger.info("****Veronica demo account is logged in****");
			MyAccountPage Map = new MyAccountPage(driver);
			String expTxt = "Domyślny adres rozliczeniowy";
			if(Map.get_header_Settlement().equalsIgnoreCase(expTxt)) {
				
				logger.info("****The header is correct****");
				logger.info("****TC_151_ValidationOfCorrectnessSettlementAdressHeader_MyAccountPage finished positive****");
				Assert.assertTrue(true);
			}else {
				

				logger.error("****The header is incorrect****");
				logger.info("****TC_151_ValidationOfCorrectnessSettlementAdressHeader_MyAccountPage finished negative****");
				Assert.fail("****The header is incorrect****");
			}
			
		}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
		}
		
		
	}
	
}
