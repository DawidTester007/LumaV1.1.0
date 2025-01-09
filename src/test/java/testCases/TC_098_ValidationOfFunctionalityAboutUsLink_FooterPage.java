package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.AboutUsPage;
import pages.FooterPage;

public class TC_098_ValidationOfFunctionalityAboutUsLink_FooterPage extends BaseTest {

	@Test(groups = {"functional","regression","master"})
	public void ValidationOfFunctionalityAboutUsLink_FooterPage(){
		try {
		logger.info("****Starting TC_098_ValidationOfFunctionalityAboutUsLink_FooterPage****");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Scrolled page down****");
		
		FooterPage  Fp = new FooterPage(driver);
		Fp.click_linkTxt_aboutUs();
		logger.info("****Clicked About us link****");
		AboutUsPage Aup = new AboutUsPage(driver);
		String expTxt = "O nas";
		if(Aup.get_txt_Name_Page().equals(expTxt)) {
			
			logger.info("****Page name 'About us'is correct****");
			logger.info("****TC_098_ValidationOfFunctionalityAboutUsLink_FooterPage finished positive****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****Page name 'About us'is incorrect****");
			logger.info("****TC_098_ValidationOfFunctionalityAboutUsLink_FooterPage finished negative ****");
			Assert.fail("****Page name 'About us'is incorrect****");
			
		}
	}catch(Exception e) {
		
		logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
		Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
	
		}
		
	}
	
}
