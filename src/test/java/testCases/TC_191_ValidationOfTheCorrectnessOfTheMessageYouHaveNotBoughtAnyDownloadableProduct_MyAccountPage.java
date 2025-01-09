package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;


public class TC_191_ValidationOfTheCorrectnessOfTheMessageYouHaveNotBoughtAnyDownloadableProduct_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void ValidationOfTheCorrectnessOfTheMessageYouHaveNotBoughtAnyDownloadableProduct_MyAccountPage() {
		
		try {
			logger.info("****Starting ValidationOfTheCorrectnessOfTheMessageYouHaveNotBoughtAnyDownloadableProduct_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			logger.info("****Veronica demo account is logged in****");
			MyAccountPage Map = new MyAccountPage(driver);
			Map.click_tab_DownloadableProduct();
			logger.info("****Clicked donwloadable products tab****");
			String expTxt = "Nie kupowałeś jeszcze żadnych produktów do pobrania.";
			if(Map.get_msg_DidntBuyAnything().equalsIgnoreCase(expTxt)) {
			
				logger.info("****The validation message has been correctly displayed****");
				logger.info("****ValidationOfTheCorrectnessOfTheMessageYouHaveNotBoughtAnyDownloadableProduct_MyAccountPage finished positive****");
				Assert.assertTrue(true);
			}else {
				
				logger.error("****The validation message has not been correctly displayed****");
				logger.info("****ValidationOfTheCorrectnessOfTheMessageYouHaveNotBoughtAnyDownloadableProduct_MyAccountPage finished negative****");
				Assert.fail("****The validation message has not been correctly displayed****");
				
			}

			
			
	}catch(Exception e) {
				
				logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
				Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
			}
		
	}
	
}
