package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;

public class TC_083_ValidationOfLogoDisplay_MainPage extends BaseTest{

	
	@Test(groups={"functional","master"})
	public void ValidationOfLogoDisplay_MainPage(){
		try {
		logger.info("****Starting TC_083_ValidationOfLogoDisplay_MainPage****");
		MainPage Mp = new MainPage(driver);

		
		if(	Mp.check_logo()==true) {
			
			logger.info("****Logo has been displayed****");
			logger.info("****TC_083_ValidationOfLogoDisplay_MainPage finished positive****");
			Assert.assertTrue(true);
		}else {
			

			logger.error("****Logo has not been displayed****");
			logger.info("****TC_083_ValidationOfLogoDisplay_MainPage finished negative****");
			Assert.fail("****Logo has not been displayed****");
			
		}
	}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
			}
	}
	
}
