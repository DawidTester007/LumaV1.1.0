package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.ProductPage;

public class TC_066_ValidationOfDetailTab_PageProduct extends BaseTest{

	@Test(groups={"functional","regression","master"})
	public void ValidationOfDetailTab_PageProduct() {
		try {
		MainPage Mp = new MainPage(driver);
		logger.info("**** Starting TC_066_ValidationOfDetailTab_PageProduct ****");
		Mp.List_ImgProductOf_HSeller().get(2).click();
		logger.info("**** Clicked a product image ****");
		ProductPage Pp = new ProductPage(driver);
		String attributeOfdetails =  Pp.get_attributeOf_btn_details("class");
		if(attributeOfdetails.contains("active")==true) {
			
			logger.info("**** Detail tab is active****");
			logger.info("**** TC_066_ValidationOfDetailTab_PageProduct finished positive ****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("****Detail tab is inactive ****");
			logger.info("**** TC_066_ValidationOfDetailTab_PageProduct finished negative ****");
			Assert.fail("****Detail tab is inactive ****");
			
		}
		
		
		
	}catch(Exception e) {
		
		logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
		Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
	}
	
}
}