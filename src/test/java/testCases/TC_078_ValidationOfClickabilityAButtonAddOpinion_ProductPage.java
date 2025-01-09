package testCases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.ProductPage;

public class TC_078_ValidationOfClickabilityAButtonAddOpinion_ProductPage extends BaseTest{
	@Test(groups = {"functional","regression","master"})
	public void ValidationOfClickabilityAButtonAddOpinion_ProductPage() {
		try {
			logger.info("****Starting TC_078_ValidationOfClickabilityAButtonAddOpinion_ProductPage****");
			MainPage Mp = new MainPage(driver);
			Mp.List_ImgProductOf_HSeller().get(0).click();
			logger.info("****Clicked a product image****");
			ProductPage Pp = new ProductPage(driver);
			Pp.click_txtlink_DodajOpinie();
			logger.info("****clicked text add opinions****");
			
			DriverWait.until(ExpectedConditions.attributeContains(Pp.get_btn_opinions(), "class", "active"));
			if(Pp.get_attributeOf_btn_opinions("class").contains("active")) {
				
				logger.info("****The opinion tab is active****");
				logger.info("**** TC_078_ValidationOfClickabilityAButtonAddOpinion_ProductPage finished positive ****");
				Assert.assertTrue(true);
				
			}else {
				logger.error("****The opinion tab is inactive****");
				logger.info("**** TC_078_ValidationOfClickabilityAButtonAddOpinion_ProductPage finished ****");
				Assert.fail("****The opinion tab is inactive****");
			}
			
			
		}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
		}
	}
	
}
