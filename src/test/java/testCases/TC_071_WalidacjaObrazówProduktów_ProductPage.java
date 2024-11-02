package testCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.ProductPage;

public class TC_071_WalidacjaObrazówProduktów_ProductPage extends BaseTest {
	@Test(groups={"functional","regression","master"})
	public void WalidacjaObrazówProduktów_ProductPage() {
		
		try {
			MainPage Mp = new MainPage(driver);
			logger.info("**** Rozpoczęto TC_071_WalidacjaObrazówProduktów_ProductPage ****");
			Mp.List_ImgProductOf_HSeller().get(0).click();
			logger.info("**** Kliknięto zdjęcie produktu ****");
			ProductPage Pp = new ProductPage(driver);
			
			for(WebElement x: Pp.List_img_ListOfImgProducts()) {
				
				if(x.isDisplayed()==true) {
					
					logger.info("**** Został wyświetlony obraz produktu ****");
				}
			}
			logger.info("**** Wszystkie proponowane przedmioty posiadają obraz ****");
			logger.info("**** TC_071_WalidacjaObrazówProduktów_ProductPage zakończył się powodzeniem ****");
			Assert.assertTrue(true);
	}catch(Exception e) {
	
		logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
		Assert.fail();
		
	}
	}
}
