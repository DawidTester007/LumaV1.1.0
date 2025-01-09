package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.FooterPage;
import pages.PopularSearchPage;
@Test(groups = {"functional","regression","master"})
public class TC_120_ValidationOfDisplayingMessage_PopularSearchPage extends BaseTest{

	public void ValidationOfDisplayingMessage_PopularSearchPage() {
		try {
		logger.info("****Starting TC_120_ValidationOfDisplayingMessage_PopularSearchPage****");
		FooterPage Fp = new FooterPage(driver);
		Fp.click_linkTxt_PopularSearchItem();
		logger.info("****Clicked Advance Search link****");
		PopularSearchPage Psp = new PopularSearchPage(driver);
		String expMsg = "Brak dostępnych fraz wyszukiwania.";
		if(Psp.get_msg_lack_AccessWords().equals(expMsg)) {
			
			logger.info("****Validate message has been displayed****");
			logger.info("**** TC_120_ValidationOfDisplayingMessage_PopularSearchPage finished positive ****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****Validate message has not been displayed****");
			logger.info("**** TC_120_ValidationOfDisplayingMessage_PopularSearchPage finished negative ****");
			Assert.fail("****Validate message has not been displayed****");
		}
	}catch(Exception e) {
		
		logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
		Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
	
}
	}
	
}
