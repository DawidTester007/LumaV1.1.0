package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.ProductPage;
import utilities.DataProv;

public class TC_081_MessageValidationAboutCreatingAComment_ProductPage_TDD extends BaseTest {

	
	@Test(dataProvider ="InvalidDataWriteComment", dataProviderClass = DataProv.class , groups ={"dataDriver","master"})
	public void MessageValidationAboutCreatingAComment_ProductPage_TDD(String rating, String nick, String summary, String opinion , String res)  {
		try {
		MainPage Mp = new MainPage(driver);
		logger.info("**** Starting TC_081_MessageValidationAboutCreatingAComment_ProductPage_TDD ****");
		Mp.List_ImgProductOf_HSeller().get(0).click();
		logger.info("**** Clicked product image ****");
		ProductPage Pp = new ProductPage(driver);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Scroll the page down****");
		Thread.sleep(750);
		Pp.click_btn_opinions();
		logger.info("****Clicked opinion tab****");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Scroll the page up****");
		Pp.set_star(rating);
		logger.info("****Product has been Evaluated****");
		Pp.set_box_nick(nick);
		Pp.set_box_summary(summary);
		Pp.set_box_review(opinion);
		logger.info("****Fields has been filled in****");
		Pp.click_btn_AddReview();
		logger.info("****Clicked add review button****");
		
		if(res.equalsIgnoreCase("Invalid")) {
			
			if(Pp.check_msg_errorNick() || Pp.check_msg_errorRating() || Pp.check_msg_errorReview() || Pp.check_msg_errorSummary()) {

				logger.info("****Validation message has been displayed****");
				
				
			}else {
				
				logger.error("****Validation message has not been displayed****");
				logger.info("****TC_081_MessageValidationAboutCreatingAComment_ProductPage_TDD finished negative****");
				Assert.fail("****Validation message has not been displayed****");
			}
			
			
		}else {
			
			logger.error("****TC_081_MessageValidationAboutCreatingAComment_ProductPage_TDD contains only invalid data ****");
			logger.info("****TC_081_MessageValidationAboutCreatingAComment_ProductPage_TDD finished negative****");
			Assert.fail("****TC_081_MessageValidationAboutCreatingAComment_ProductPage_TDD contains only invalid data ****");
		}
		
		logger.info("****TC_081_MessageValidationAboutCreatingAComment_ProductPage_TDD finished positive ****");
		Assert.assertTrue(true);
		
}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
			}
	}
	
}
