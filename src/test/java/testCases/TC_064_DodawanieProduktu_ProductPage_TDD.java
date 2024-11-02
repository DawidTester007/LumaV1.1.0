package testCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.ProductPage;
import utilities.DataProv;

public class TC_064_DodawanieProduktu_ProductPage_TDD extends BaseTest{
	@Test(groups ={"dataDriver","master"}, dataProvider = "AmountToCart" , dataProviderClass = DataProv.class)
	public void DodawanieProduktu_KartaZProduktem_TDD(String amount , String res)  {
		try {
		logger.info("**** Rozpoczęto WalidacjaCenyProduktu ****");
		MainPage Mp = new MainPage(driver);
		WebElement addCart = Mp.List_BtnCartProductOf_HSeller().get(0);
		js.executeScript("arguments[0].click();", addCart);
		logger.info("**** Kliknięto przycisk 'Dodaj do koszyka'****");
		ProductPage Pp = new ProductPage(driver);
		
		js.executeScript("arguments[0].click();", Pp.List_sizesOfProduct().get(0));
		logger.info("**** Kliknięto rozmiar : " + Pp.List_sizesOfProduct().get(0).getText()+ " ****");
		
		js.executeScript("arguments[0].click();", Pp.List_colorsOfProducts().get(0));
		logger.info("****Kliknięto kolor : " + Pp.List_colorsOfProducts().get(0).getAttribute("aria-label")+" ****");
		Pp.clear_AmountOfProduct();
		logger.info("**** Wyczyszczono pole 'ilość' ****");
		if(amount.contains(".")) {
			Pp.set_AmountOfProduct(amount.substring(0, amount.indexOf(".")));
		}else {
			
			Pp.set_AmountOfProduct(amount);
		}
		logger.info("**** Ustawiono ilość ****");
		Pp.click_btn_addCart();
		logger.info("**** Kliknięto przycisk 'Dodaj do koszyka' ****");
		
	
		
		if(res.equalsIgnoreCase("Valid")) {
			
			if(Pp.get_WebElement_AddedCorrectly().isDisplayed()==true) {
				logger.info("**** Pojawił się komunikat o dodaniu przedmiotu, DodawanieProduktu_KartaZProduktem_TDD zakończyło się pozytywnie **** ");
				logger.info("**** TC_064_DodawanieProduktu_KartaZProduktem_TDD zakończono");
				Assert.assertTrue(true);
				
			}else {
				logger.error("**** Nie pojawił się komunikat o dodaniu przedmiotu, DodawanieProduktu_KartaZProduktem_TDD zakończyło się pozytywnie **** ");
				logger.info("**** TC_064_DodawanieProduktu_KartaZProduktem_TDD zakończono");
				
				Assert.fail();
				
			}
		}else if(res.equalsIgnoreCase("Invalid")) {
			
			if(Pp.msg_InavlidAmount().isDisplayed()==true) {
				
				logger.info("**** Pojawił się komunikat o dodaniu przedmiotu, DodawanieProduktu_KartaZProduktem_TDD zakończyło się pozytywnie **** ");
				logger.info("**** TC_064_DodawanieProduktu_KartaZProduktem_TDD zakończono");
				Assert.assertTrue(true);
				
			}else {
				logger.error("**** Nie pojawił się komunikat o dodaniu przedmiotu, DodawanieProduktu_KartaZProduktem_TDD zakończyło się pozytywnie **** ");
				logger.info("**** TC_064_DodawanieProduktu_KartaZProduktem_TDD zakończono");
				
				Assert.fail();
				
				
			}
			
		}
		
		

		
	}catch(Exception e) {
		
		logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
		Assert.fail();
	
		}

	}
	
}