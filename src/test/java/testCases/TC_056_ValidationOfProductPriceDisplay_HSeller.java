package testCases;



import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;

public class TC_056_ValidationOfProductPriceDisplay_HSeller extends BaseTest {
	@Test(groups ={"functional","regression","master"})
	public void ValidationOfProductPriceDisplay_HSeller() throws InterruptedException{
		try {
		logger.info("****Starting TC_056_ValidationOfProductPriceDisplay_HSeller****");
		MainPage Mp = new MainPage(driver);
		driver.navigate().refresh();
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(500);
		
		for(WebElement price : Mp.List_PricesProductOf_HSeller()) {
	
			if(price.isDisplayed()) {
				
				logger.info("**** Price of product has been displayed : "+ price.getText()+" ****");
			
			}else {
				
				logger.error("**** Price of product has not been displayed  ****");
				logger.info("**** TC_056_ValidationOfProductPriceDisplay_HSeller finished negative ****");
				Assert.fail("**** Price of product has not been displayed  ****");
			}
			
			
		}
		logger.info("**** All product prices are displayed****");
		logger.info("**** TC_056_ValidationOfProductPriceDisplay_HSeller finished postive ****");
		Assert.assertTrue(true);
		
		}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
			}
	}
}
