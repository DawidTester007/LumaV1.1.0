package testCases;



import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;

public class TC_057_ValidationOfProductImageDisplay_HSeller extends BaseTest {
	@Test(groups ={"functional","regression","master"})
	public void ValidationOfProductImageDisplay_HSeller() throws InterruptedException{
		try {
		logger.info("****Starting TC_057_ValidationOfProductImageDisplay_HSeller****");
		MainPage Mp = new MainPage(driver);
		driver.navigate().refresh();
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		
		for(WebElement img : Mp.List_ImgProductOf_HSeller()) {
	
			if(img.isDisplayed()) {
				
				logger.info("**** Product image was displayed****");
			
			}else {
				
				logger.error("****  Product image was not displayed ****");
				logger.info("**** TC_057_ValidationOfProductImageDisplay_HSeller finished negative ****");
				Assert.fail("****  Product image was not displayed ****");
			}
			
		
		}	
		
		Assert.assertTrue(true);
		logger.info("**** Each products image has been displayed ****");
		logger.info("**** TC_057_ValidationOfProductImageDisplay_HSeller finished positive ****");
		}catch(Exception e) {
			
			logger.error("****An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
			}
	}
}
