package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_185_WalidacjaLicznikaProduktówWZamówienia_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","master"})
	public void WalidacjaLicznikaProduktówWZamówienia_MyAccountPage() {
		
		try {
			logger.info("****Rozpoczęto TC_185_WalidacjaLicznikaProduktówWZamówienia_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			MyAccountPage Map = new MyAccountPage(driver);
			Map.click_tab_Orders();
			logger.info("****Kliknięto zakładkę zamówienia****");
			Integer currAmountOfProduct = Map.get_List_ProductOfOrder().size();
			String showedCount = Map.get_txt_countOfProduct();
			
			if(showedCount.contains(currAmountOfProduct.toString())) {
				
				logger.info("****Ilość produktów w tabeli wynosi : "+currAmountOfProduct+", która zgadza się z licznikiem: "+showedCount+"****");
				logger.info("****TC_185_WalidacjaLicznikaProduktówWZamówienia_MyAccountPage zakończono powodzeniem****");
				Assert.assertTrue(true);
			}else {
				logger.error("****Ilość produktów w tabeli wynosi : "+currAmountOfProduct+", która nie zgadza się z licznikiem: "+showedCount+"****");
				logger.info("****TC_185_WalidacjaLicznikaProduktówWZamówienia_MyAccountPage zakończono powodzeniem****");
				Assert.fail();
				
			}
			
			
			
			
			
	}catch(Exception e) {
				
				logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
				Assert.fail();
			
			}
		
	}
	
}
