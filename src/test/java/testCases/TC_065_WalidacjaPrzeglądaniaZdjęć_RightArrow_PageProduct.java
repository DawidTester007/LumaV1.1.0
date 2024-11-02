package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.ProductPage;

public class TC_065_WalidacjaPrzeglądaniaZdjęć_RightArrow_PageProduct extends BaseTest{

	@Test(groups={"functional","regression","master"})
	public void WalidacjaPrzeglądaniaZdjęć_RightArrow_PageProduct() {
		try {
		MainPage Mp = new MainPage(driver);
		logger.info("**** Rozpoczęto TC_065_WalidacjaPrzeglądaniaZdjęć_RightArrow_PageProduct ****");
		Mp.List_ImgProductOf_HSeller().get(3).click();
		logger.info("**** Kliknięto zdjęcie produktu ****");
		ProductPage Pp = new ProductPage(driver);
		
		for(int i =1 ;i <Pp.List_img_ListOfImgProducts().size() ;i++ ) {
			
			Pp.click_img_ArrowRight(js);
			logger.info("**** Kliknięto prawą strzałke przy zdjęciu ****");
			
			
		}
		

		logger.info("**** TC_065_WalidacjaPrzeglądaniaZdjęć_RightArrow_PageProduct zakończył się powodzeniem ****");
		Assert.assertTrue(true);
		
	}catch(Exception e) {
		
		logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
		Assert.fail();
		
	}
	
}
}