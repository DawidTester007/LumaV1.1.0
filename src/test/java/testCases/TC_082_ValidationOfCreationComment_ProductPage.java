package testCases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.ProductPage;

public class TC_082_ValidationOfCreationComment_ProductPage extends BaseTest {

	
	@Test(groups = {"functional","regression","master"})
	public void ValidationOfCreationComment_ProductPage()  {
		try {
		MainPage Mp = new MainPage(driver);
		logger.info("**** Starting TC_082_ValidationOfCreationComment_ProductPage ****");
		Mp.List_ImgProductOf_HSeller().get(0).click();
		logger.info("**** Clicked product image ****");
		ProductPage Pp = new ProductPage(driver);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****scroll down page****");
		Thread.sleep(1000);
		Pp.click_btn_opinions();
		logger.info("****Clicked opinion tab****");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****scroll up page****");
		Pp.set_star("trzy");
		logger.info("****The product has been evaluate****");
		Pp.set_box_nick(stringMix());
		Pp.set_box_summary(stringMix());
		Pp.set_box_review(stringMix());
		logger.info("****Fields has been filled in****");
		Pp.click_btn_AddReview();
		logger.info("****Clicked add opinion button****");
		WebElement msg = DriverWait.until(ExpectedConditions.visibilityOf(Pp.get_msg_AddedView()));
		if(msg.isDisplayed()) {
			logger.info("****Validation Message has been displayed****");
			logger.info("****TC_082_ValidationOfCreationComment_ProductPage finished positive ****");
			Assert.assertTrue(true);
			
		}else {
			logger.error("****Validation Message has not been displayed****");
			logger.info("****TC_082_ValidationOfCreationComment_ProductPage finished negative ****");
			Assert.fail("****Validation Message has not been displayed****");
			
			
		}
		
		
		
		
		}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
			}
	}
	
}
