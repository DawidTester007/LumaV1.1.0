package testCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.ProductPage;

public class TC_071_ValidationOfProductsImage_ProductPage extends BaseTest {
	@Test(groups={"functional","regression","master"})
	public void ValidationOfProductsImage_ProductPage() {
		
		try {
			MainPage Mp = new MainPage(driver);
			logger.info("**** Starting TC_071_ValidationOfProductsImage_ProductPage ****");
			Mp.List_ImgProductOf_HSeller().get(0).click();
			logger.info("**** Clicked a product image ****");
			ProductPage Pp = new ProductPage(driver);
			
			for(WebElement x: Pp.List_img_ListOfImgProducts()) {
				
				if(x.isDisplayed()==true) {
					
					logger.info("**** The image was displayed ****");
				}else {
					
					logger.error("**** The image was not displayed****");
					logger.info("**** TC_071_ValidationOfProductsImage_ProductPage finished negative ****");
					Assert.fail("**** The image was not displayed****");
				}
			}
			logger.info("**** Each of recommend products has an image ****");
			logger.info("**** TC_071_ValidationOfProductsImage_ProductPage finished positive ****");
			Assert.assertTrue(true);
	}catch(Exception e) {
	
		logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
		Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
	}
	}
}
