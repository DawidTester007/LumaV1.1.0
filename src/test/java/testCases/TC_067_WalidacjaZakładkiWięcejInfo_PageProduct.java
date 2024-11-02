package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.ProductPage;

public class TC_067_WalidacjaZakładkiWięcejInfo_PageProduct extends BaseTest{

	@Test(groups={"functional","regression","master"})
	public void WalidacjaModułuWięcejInfo_PageProduct() {
		try {
		MainPage Mp = new MainPage(driver);
		logger.info("**** Rozpoczęto TC_067_WalidacjaModułuWięcejInfo_PageProduct ****");
		Mp.List_ImgProductOf_HSeller().get(2).click();
		logger.info("**** Kliknięto zdjęcie produktu ****");
		ProductPage Pp = new ProductPage(driver);
		Pp.click_btn_moreInfo();
		logger.info("**** Kliknięto zakładkę 'Więcej informacji' ****");
		String attributeOfMoreInfo =  Pp.get_attributeOf_btn_moreInfo("class");
		if(attributeOfMoreInfo.contains("active")==true) {

			logger.info("**** Zakładka 'Więcej informacji' jest aktywna****");
			logger.info("**** TC_067_WalidacjaModułuWięcejInfo_PageProduct zakończył się powodzeniem ****");
		}else {
			
			logger.error("**** Zakładka 'Więcej informacji' nie jest aktywna ****");
			logger.info("**** TC_067_WalidacjaModułuWięcejInfo_PageProduct zakończył się niepowodzeniem ****");
			Assert.fail();
			
		}
		
		
		
	}catch(Exception e) {
		
		logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
		Assert.fail();
		
	}
	
}
}