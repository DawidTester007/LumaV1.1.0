package testCases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.ProductPage;

public class TC_077_ValidationOfClickThroughRateOfTabOpinion_ProductPage extends BaseTest{
	@Test(groups = {"functional","regression","master"})
	public void ValidationOfClickThroughRateOfTabOpinion_ProductPage() {
		try {
			logger.info("****Starting TC_077_ValidationOfClickThroughRateOfTabOpinion_ProductPage****");
			MainPage Mp = new MainPage(driver);
			Mp.List_ImgProductOf_HSeller().get(0).click();
			logger.info("****Clicked product image****");
			ProductPage Pp = new ProductPage(driver);
			Pp.click_txtlink_Opinie();
			logger.info("****Clicked opinion tab****");
			
			DriverWait.until(ExpectedConditions.attributeContains(Pp.get_btn_opinions(), "class", "active"));
			if(Pp.get_attributeOf_btn_opinions("class").contains("active")) {
				
				logger.info("****Opinion tab is active****");
				logger.info("**** TC_077_ValidationOfClickThroughRateOfTabOpinion_ProductPage finished positive ****");
				Assert.assertTrue(true);
				
			}else {
				logger.error("****Opinion tab is inactive****");
				logger.info("**** TC_077_ValidationOfClickThroughRateOfTabOpinion_ProductPage finished negative ****");
				Assert.fail("****Opinion tab is inactive****");
			}
			
			
		}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
		}
	}
	
}
