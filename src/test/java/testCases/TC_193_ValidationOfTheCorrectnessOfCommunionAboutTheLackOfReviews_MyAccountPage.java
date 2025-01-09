package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_193_ValidationOfTheCorrectnessOfCommunionAboutTheLackOfReviews_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","master"})
	public void ValidationOfTheCorrectnessOfCommunionAboutTheLackOfReviews_MyAccountPage() {
		
		try {
			logger.info("****Starting ValidationOfTheCorrectnessOfCommunionAboutTheLackOfReviews_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			logger.info("****Veronica demo account is logged in****");
			MyAccountPage Map = new MyAccountPage(driver);
			Map.click_tab_MyOpinion();
			logger.info("****Clicked my opinion tab****");
			String expTxt = "Nie masz jeszcze zgłoszonych żadnych recenzji.";
			if(Map.get_msg_NoOpinion().equalsIgnoreCase(expTxt)) {
			
				logger.info("****Validation Communicate has been correctly displayed****");
				logger.info("****TC_193_ValidationOfTheCorrectnessOfCommunionAboutTheLackOfReviews_MyAccountPage finished positive****");
				Assert.assertTrue(true);
			}else {
				
				logger.error("****Validation Communicate has not been correctly displayed****");
				logger.info("****TC_193_ValidationOfTheCorrectnessOfCommunionAboutTheLackOfReviews_MyAccountPage finished negative****");
				Assert.fail("****Validation Communicate has not been correctly displayed****");
				
			}
			
			
	}catch(Exception e) {
				
				logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
				Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
			}
		
	}
	
}
