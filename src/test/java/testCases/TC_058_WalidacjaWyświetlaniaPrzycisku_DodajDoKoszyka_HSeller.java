package testCases;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;

public class TC_058_WalidacjaWyświetlaniaPrzycisku_DodajDoKoszyka_HSeller extends BaseTest{
	@Test(groups ={"functional","regression","master"})
	public void WalidacjaWyświetlaniaPrzycisku_DodajDoKoszyka_HSeller() throws InterruptedException {
		try {
		logger.info("**** Rozpoczęto TC_058_WalidacjaWyświetlaniaPrzycisku_DodajDoKoszyka_HSeller ****");
		MainPage Mp = new MainPage(driver);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("**** Przesunięto stronę na dół ****");
		int i =0;
		for(WebElement product : Mp.List_ImgProductOf_HSeller()) {
			
			Actions act = new Actions(driver);
			
			act.moveToElement(product).perform();
			logger.info("**** Przesunięto kursor na produkt ****");
			WebElement btnCart = Mp.List_BtnCartProductOf_HSeller().get(i);
				
				if(btnCart.isDisplayed()) {
					
					logger.info("**** Wyświetlono przycisk 'Dodaj do koszyka' ****");
					i++;
				}else {
					
					logger.error("**** Nie wyświetlono przycisku 'Dodaj do koszyka'****");
					logger.info("****TC_058_WalidacjaWyświetlaniaPrzycisku_DodajDoKoszyka_HSeller zakończył się niepowodzeniem****");
					Assert.fail();
					
				}
				
				
				
			
			
			
			
		}
		logger.info("****Każdy przedmiot ma opcję 'Dodaj do koszyka'****");
		logger.info("****TC_058_WalidacjaWyświetlaniaPrzycisku_DodajDoKoszyka_HSeller zakończył się powodzeniem ****");
		Assert.assertTrue(true);
		
		}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
			}
		
	}
	
}
