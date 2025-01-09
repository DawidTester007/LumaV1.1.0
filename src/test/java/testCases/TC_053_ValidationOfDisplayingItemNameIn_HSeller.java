package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;

public class TC_053_ValidationOfDisplayingItemNameIn_HSeller extends BaseTest {

	@Test(groups ={"functional","master"})
	public void ValidationOfDisplayingItemNameIn_HSeller() {
		try {
		MainPage Mp = new MainPage(driver);
		logger.info("****StartingTC_053_ValidationOfDisplayingItemNameIn_HSeller****");
		for(int i = 1 ;i<=Mp.ListOf_Products_HSellerList().size(); i++) {
			if(Mp.List_NameProductOf_HSeller().get(i-1).isDisplayed()==true) {
				
				logger.info("****Product name number: "+i+" has been displayed****");
			}else
			{
				logger.error("****Product name number: "+i+" has not been displayed****");
				logger.info("****TC_053_ValidationOfDisplayingItemNameIn_HSeller finished negative****");
				Assert.fail("****Product name number: "+i+" has not been displayed****");
			}
		
		}
		logger.info("****Each products name have been displayed****");
		logger.info("****TC_053_ValidationOfDisplayingItemNameIn_HSeller finished positive****");
		Assert.assertTrue(true);
		
		
		
		}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
		}
		
	}
	
}
