package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.ProductPage;

public class TC_079_ValidationOfTabOpinionName_ProductPage extends BaseTest {
	@Test(groups = {"functional","master"})
	public void ValidationOfTabOpinionName_ProductPage() throws InterruptedException {
		try {
		MainPage Mp = new MainPage(driver);
		logger.info("**** Starting TC_079_ValidationOfTabOpinionName_ProductPage ****");
		Mp.List_ImgProductOf_HSeller().get(0).click();
		logger.info("**** Clicked a product image ****");
		ProductPage Pp = new ProductPage(driver);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Scroll down the page****");
		Thread.sleep(750);
		Pp.click_btn_opinions();
		logger.info("****Clicked opinion tab****");
		
		String currTxt = Pp.get_txt_OpinionOfClients();
		String expTxt = "Opinie klientów";
		
		if(currTxt.equals(expTxt)) {
			
			logger.info("****Tab name is correct :"+currTxt+" ****");
			logger.info("****TC_079_ValidationOfTabOpinionName_ProductPage finished positive****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****Tab name is incorrect  ****");
			logger.info("****TC_079_ValidationOfTabOpinionName_ProductPage finished negative****");
			Assert.fail("****Tab name is incorrect  ****");
			
		}
		
		
		}catch(Exception e) {
			logger.error("****An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		}
		
		
	}
	
}
