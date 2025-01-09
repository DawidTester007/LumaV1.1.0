package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.ProductPage;

public class TC_080_TextValidationComments_ProductPage extends BaseTest {
	@Test(groups = {"functional","master"})
	public void TextValidationComments_ProductPage() throws InterruptedException {
		try {
		MainPage Mp = new MainPage(driver);
		logger.info("**** Starting TC_080_TextValidationComments_ProductPage ****");
		Mp.List_ImgProductOf_HSeller().get(0).click();
		logger.info("**** Clicked a product image ****");
		ProductPage Pp = new ProductPage(driver);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("****Scrolled page down****");
		Thread.sleep(750);
		Pp.click_btn_opinions();
		logger.info("****Clicked opinion tab****");
		String currTxt = Pp.get_txt_WriteSomethg();
		String expTxt = "Napisz opinię o produkcie:";
		
		if(currTxt.equals(expTxt)) {
			
			logger.info("****The name of tab is correct :"+currTxt+" ****");
			
			String expName = Pp.get_NameOfProduct();
			String currName = Pp.get_txt_NameProductInOpinion();
			if(currName.equals(expName)) {
				
				logger.info("****Product name is correctly displayed in opinion tab:"+currName+" ****");
				logger.info("****TC_080_TextValidationComments_ProductPage finished positive****");
				Assert.assertTrue(true);
			}else {
				
				logger.error("****Product name is incorrectly displayed in opinion tab :"+currName+" ****");
				logger.info("****TC_080_TextValidationComments_ProductPage finished negative****");
				Assert.fail("****Product name is incorrectly displayed in opinion tab :"+currName+" ****");
				
				
			}
		}else {
			
			logger.error("****Tab name is incorrect  ****");
			logger.info("****TC_080_TextValidationComments_ProductPage finished negative****");
			Assert.fail("****Tab name is incorrect  ****");
			
		}
		
		
		}catch(Exception e) {
			
			logger.error("****An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
		}
		
		
	}
	
}
