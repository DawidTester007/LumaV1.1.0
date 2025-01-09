package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.ProductPage;

public class TC_065_ValidationOfImageViewing_RightArrow_PageProduct extends BaseTest{

	@Test(groups={"functional","regression","master"})
	public void ValidationOfImageViewing_RightArrow_PageProduct() {
		try {
		MainPage Mp = new MainPage(driver);
		logger.info("**** Starting TC_065_ValidationOfImageViewing_RightArrow_PageProduct ****");
		Mp.List_ImgProductOf_HSeller().get(3).click();
		logger.info("**** Product Image has been clicked ****");
		ProductPage Pp = new ProductPage(driver);
		
		for(int i =1 ;i <Pp.List_img_ListOfImgProducts().size() ;i++ ) {
			
			Pp.click_img_ArrowRight(js);
			logger.info("**** Clicked a right arrow next to photo ****");
			
			
		}
		

		logger.info("**** TC_065_ValidationOfImageViewing_RightArrow_PageProduct finished positive ****");
		Assert.assertTrue(true);
		
	}catch(Exception e) {
		
		logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
		Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
	}
	
}
}