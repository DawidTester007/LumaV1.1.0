package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.ProductPage;

public class TC_067_ValidationOfMoreInformationTab_PageProduct extends BaseTest{

	@Test(groups={"functional","regression","master"})
	public void ValidationOfMoreInformationTab_PageProduct() {
		try {
		MainPage Mp = new MainPage(driver);
		logger.info("**** Starting TC_067_ValidationOfMoreInformationTab_PageProduct ****");
		Mp.List_ImgProductOf_HSeller().get(2).click();
		logger.info("**** Clicked a product image ****");
		ProductPage Pp = new ProductPage(driver);
		Pp.click_btn_moreInfo();
		logger.info("**** Clicked a more informatio tab ****");
		String attributeOfMoreInfo =  Pp.get_attributeOf_btn_moreInfo("class");
		if(attributeOfMoreInfo.contains("active")==true) {

			logger.info("**** More information tab was active****");
			logger.info("**** TC_067_ValidationOfMoreInformationTab_PageProduct finished positive ****");
		}else {
			
			logger.error("**** More information tab was inactive ****");
			logger.info("**** TC_067_ValidationOfMoreInformationTab_PageProduct finished negative ****");
			Assert.fail("**** More information tab was inactive ****");
			
		}
		
		
		
	}catch(Exception e) {
		
		logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
		Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
	}
	
}
}