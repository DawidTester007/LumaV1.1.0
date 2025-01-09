package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.AboutUsPage;
import pages.FooterPage;
import pages.MainPage;


public class TC_109_ValidationOfClickabilityShopLumaLink_AboutUsPage extends BaseTest{
	@Test(groups={"functional","regression","master"})
	public void ValidationOfClickabilityShopLumaLink_AboutUsPage() {
		try {
		logger.info("**** Starting TC_109_ValidationOfClickabilityShopLumaLink_AboutUsPage ****");
		FooterPage Fp = new FooterPage(driver);
		Fp.click_linkTxt_aboutUs();
		logger.info("**** Clicked about us link ****");
		AboutUsPage Aup = new AboutUsPage(driver);
		String linkName = Aup.gettxt_lumaMainPageLink_AboutUs();
		Aup.click_lumaMainPageLink_AboutUs();;
		logger.info("****Clicked : "+linkName+" link****");
		MainPage Mp = new MainPage(driver);
		String currTxt = Mp.get_titleMainPage();
		String ExpTxt = "Home Page";
		if(ExpTxt.equals(currTxt)) {
			
			logger.info("****Page name is correct****");
			logger.info("****TC_109_ValidationOfClickabilityShopLumaLink_AboutUsPage finished positive****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****Page name is incorrect****");
			logger.info("****TC_109_ValidationOfClickabilityShopLumaLink_AboutUsPage finished negative****");
			Assert.fail("****Page name is incorrect****");
			
		}
		
		}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
			}
		
	}
	
}
