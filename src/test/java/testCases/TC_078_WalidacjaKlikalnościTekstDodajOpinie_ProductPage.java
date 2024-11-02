package testCases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.ProductPage;

public class TC_078_WalidacjaKlikalnościTekstDodajOpinie_ProductPage extends BaseTest{
	@Test(groups = {"functional","regression","master"})
	public void WalidacjaKlikalnościTekstDodajOpinie_ProductPage() {
		try {
			logger.info("****Rozpoczęto TC_078_WalidacjaKlikalnościTekstDodajOpinie_ProductPage****");
			MainPage Mp = new MainPage(driver);
			Mp.List_ImgProductOf_HSeller().get(0).click();
			logger.info("****Kliknięto obrazek produktu****");
			ProductPage Pp = new ProductPage(driver);
			Pp.click_txtlink_DodajOpinie();
			logger.info("****Kliknięto link 'Dodaj swoją opinię'****");
			
			DriverWait.until(ExpectedConditions.attributeContains(Pp.get_btn_opinions(), "class", "active"));
			if(Pp.get_attributeOf_btn_opinions("class").contains("active")) {
				
				logger.info("****Zakładka opinie jest aktywna****");
				logger.info("**** TC_078_WalidacjaKlikalnościTekstDodajOpinie_ProductPage zakończył się powodzeniem ****");
				Assert.assertTrue(true);
				
			}else {
				logger.error("****Zakładka opinie nie jest aktywna****");
				logger.info("**** TC_078_WalidacjaKlikalnościTekstDodajOpinie_ProductPage zakończył się niepowodzeniem ****");
				Assert.fail();
			}
			
			
		}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
			
		}
	}
	
}
