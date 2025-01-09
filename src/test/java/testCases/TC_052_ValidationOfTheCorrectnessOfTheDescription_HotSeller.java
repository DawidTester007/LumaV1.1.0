package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;

public class TC_052_ValidationOfTheCorrectnessOfTheDescription_HotSeller extends BaseTest {
	@Test(groups ={"functional","master"})
	public void ValidationOfTheCorrectnessOfTheDescription_HotSeller() {
		try {
		logger.info("****Starting TC_052_ValidationOfTheCorrectnessOfTheDescription_HotSeller****");
		MainPage Mp = new MainPage(driver);
		
		String expTitle = "Here is what`s trending on Luma right now";
		if(Mp.get_textDesc_HSeller().equals(expTitle)) {
			
			Assert.assertTrue(true);
			logger.info("**** Describe is correct ****");
			logger.info("***TC_052_ValidationOfTheCorrectnessOfTheDescription_HotSeller finished positive****");
		}else {
			logger.error("**** Describe is incorrect ****");
			logger.info("****TC_052_ValidationOfTheCorrectnessOfTheDescription_HotSeller finished negative****");
			Assert.fail("**** Describe is incorrect ****");
		
		}
		
}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
		}
	}
	
}
