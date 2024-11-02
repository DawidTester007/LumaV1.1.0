package testCases;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.ProductPage;

public class TC_063_PoprawneDodawanieProduktu_ProductPage extends BaseTest{
	@Test(groups ={"functional","regression","master"})
	public void PoprawneDodawanieProduktu_ProductPage()  {
		try {
		logger.info("**** Rozpoczęto WalidacjaCenyProduktu ****");
		MainPage Mp = new MainPage(driver);
		Random ran = new Random();
		WebElement addCart = Mp.List_BtnCartProductOf_HSeller().get(0);
		js.executeScript("arguments[0].click();", addCart);
		logger.info("**** Kliknięto przycisk 'Dodaj do koszyka'****");
		ProductPage Pp = new ProductPage(driver);
		int amountOfSize = Pp.List_sizesOfProduct().size();
		int ranSize = ran.nextInt(amountOfSize);
		Pp.List_sizesOfProduct().get(ranSize).click();
		logger.info("**** Wybrano rozmiar : " + Pp.List_sizesOfProduct().get(ranSize).getText()+ " ****");
		
		int sizeColors = Pp.List_colorsOfProducts().size();
		int ranColor = ran.nextInt(sizeColors);
		Pp.List_colorsOfProducts().get(ranColor).click();
		logger.info("**** Wybrano kolort : " + Pp.List_colorsOfProducts().get(ranColor).getAttribute("aria-label")+ " ****");
	
		Integer amount = ran.nextInt(10)+1;
		Pp.clear_AmountOfProduct();;
		Pp.set_AmountOfProduct(amount.toString());
		logger.info("**** Ustawiono ilość produktu na : "+ amount+" ****");
		Pp.click_btn_addCart();
		logger.info("**** Kliknięto przycisk 'Dodaj do koszyka' ****");
		if(Pp.get_WebElement_AddedCorrectly().isDisplayed()==true) {
			
			Assert.assertTrue(true);
			logger.info("**** Pojawił się komunikat walidacyjny****");
			logger.info("**** TC_063_PoprawneDodawanieProduktu_KartaZProduktem zakończył się powodzeniem ****");
		}else {
			logger.error("**** nie pojawił się komunikat walidacyjny ****");
			logger.info("**** TC_063_PoprawneDodawanieProduktu_KartaZProduktem zakończył się niepowodzeniem ****");
			Assert.fail();
		}
		
		

		
	}catch(Exception e) {
		
		logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
		Assert.fail();
	
		}

	}
	
}