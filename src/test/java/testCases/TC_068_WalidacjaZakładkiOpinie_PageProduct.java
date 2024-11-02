package testCases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.ProductPage;

public class TC_068_WalidacjaZakładkiOpinie_PageProduct extends BaseTest{

	@Test(groups={"functional","regression","master"})
	public void WalidacjaModułuWięcejInfo_PageProduct() {
		try {
		MainPage Mp = new MainPage(driver);
		logger.info("**** Rozpoczęto TC_068_WalidacjaZakładkiOpinie_PageProduct ****");
		Mp.List_ImgProductOf_HSeller().get(1).click();
		logger.info("**** Kliknięto zdjęcie produktu ****");
		ProductPage Pp = new ProductPage(driver);
		Pp.click_btn_opinions();
		logger.info("**** Kliknięto zakładkę 'Opinie' ****");
		DriverWait.until(ExpectedConditions.attributeContains(Pp.get_btn_opinions(),"class", "active"));
		String attributeOfOpinions =  Pp.get_attributeOf_btn_opinions("class");
		if(attributeOfOpinions.contains("active")==true) {

			logger.info("**** Zakładka 'Więcej informacji' jest aktywna ****");
			logger.info("**** TC_068_WalidacjaZakładkiOpinie_PageProduct zakończył się powodzeniem ****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("**** Zakładka 'Więcej informacji' nie jest aktywna ****");
			logger.info("**** TC_068_WalidacjaZakładkiOpinie_PageProduct zakończył się niepowodzeniem ****");
			Assert.fail();
			
		}
		
		
		
	}catch(Exception e) {
		
		logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
		Assert.fail();
		
	}
	
}
}