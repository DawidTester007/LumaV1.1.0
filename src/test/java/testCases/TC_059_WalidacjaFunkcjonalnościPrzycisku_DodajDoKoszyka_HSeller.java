package testCases;


import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.ProductPage;

public class TC_059_WalidacjaFunkcjonalnościPrzycisku_DodajDoKoszyka_HSeller extends BaseTest{
	@Test(groups ={"functional","regression","master"})
	public void WalidacjaFunkcjonalnościPrzycisku_DodajDoKoszyka_HSeller()  {
		try {
		logger.info("**** Rozpoczęto TC_059_WalidacjaFunkcjonalnościPrzycisku_DodajDoKoszyka_HSeller ****");
		MainPage Mp = new MainPage(driver);
		
		String NameOfProduct = Mp.List_NameProductOf_HSeller().get(0).getText();
		
		WebElement button = Mp.List_BtnCartProductOf_HSeller().get(0);
		
		js.executeScript("arguments[0].click()", button);
		logger.info("**** Kliknięcie przycisku 'Dodaj do koszyka' **** ");
		
		ProductPage Pp = new ProductPage(driver);
		if(Pp.get_NameOfProduct().equalsIgnoreCase(NameOfProduct)) {
			
			logger.info("**** Produkt został wyświetlony poprawnie****");
			logger.info("**** TC_059_WalidacjaFunkcjonalnościPrzycisku_DodajDoKoszyka_HSeller zakończył się powodzeniem****");
			Assert.assertTrue(true);
		}else {
			logger.error("**** Produkt został wyświetlony niepoprawnie****");
			logger.info("**** TC_059_WalidacjaFunkcjonalnościPrzycisku_DodajDoKoszyka_HSeller zakończył się niepowodzeniem****");
			Assert.fail();
			
		}

		
	}catch(Exception e) {
		
		logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
		Assert.fail();
	
		}

	}
	
}