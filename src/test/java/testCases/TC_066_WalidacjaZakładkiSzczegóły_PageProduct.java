package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.ProductPage;

public class TC_066_WalidacjaZakładkiSzczegóły_PageProduct extends BaseTest{

	@Test(groups={"functional","regression","master"})
	public void WalidacjaZakładkiSzczegóły_PageProduct() {
		try {
		MainPage Mp = new MainPage(driver);
		logger.info("**** Rozpoczęto TC_066_WalidacjaModułuSzczegóły_PageProduct ****");
		Mp.List_ImgProductOf_HSeller().get(2).click();
		logger.info("**** Kliknięto zdjęcie produktu ****");
		ProductPage Pp = new ProductPage(driver);
		String attributeOfdetails =  Pp.get_attributeOf_btn_details("class");
		if(attributeOfdetails.contains("active")==true) {
			
			logger.info("**** Zakładka 'Szczegóły' jest aktywna****");
			logger.info("**** TC_066_WalidacjaModułuSzczegóły_PageProduct zakończył się powodzeniem ****");
			Assert.assertTrue(true);
		}else {
			
			logger.error("**** Zakładka 'Szczegóły' nie jest aktywna ****");
			logger.info("**** TC_066_WalidacjaModułuSzczegóły_PageProduct zakończył się niepowodzeniem ****");
			Assert.fail();
			
		}
		
		
		
	}catch(Exception e) {
		
		logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
		Assert.fail();
		
	}
	
}
}