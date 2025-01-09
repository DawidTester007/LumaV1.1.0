package testCases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.ProductPage;

public class TC_068_ValidationOpinionTab_PageProduct extends BaseTest{

	@Test(groups={"functional","regression","master"})
	public void ValidationOpinionTab_PageProduct() {
		try {
		MainPage Mp = new MainPage(driver);
		logger.info("**** Starting TC_068_ValidationOpinionTab_PageProduct ****");
		Mp.List_ImgProductOf_HSeller().get(1).click();
		logger.info("**** Clicked a product image ****");
		ProductPage Pp = new ProductPage(driver);
		Pp.click_btn_opinions();
		logger.info("**** Clicked the opinion tab  ****");
		DriverWait.until(ExpectedConditions.attributeContains(Pp.get_btn_opinions(),"class", "active"));
		String attributeOfOpinions =  Pp.get_attributeOf_btn_opinions("class");
		if(attributeOfOpinions.contains("active")==true) {

			logger.info("**** Opinion tab is active ****");
			logger.info("**** TC_068_ValidationOpinionTab_PageProduct finished positive ****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****  Opinion tab is inactive ****");
			logger.info("**** TC_068_ValidationOpinionTab_PageProduct finished negative****");
			Assert.fail("****  Opinion tab is inactive ****");
			
		}
		
		
		
	}catch(Exception e) {
		
		logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
		Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
	}
	
}
}