package testCases;



import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;

public class TC_056_WalidacjaCenaPrzedmiotów_HSeller extends BaseTest {
	@Test(groups ={"functional","regression","master"})
	public void WalidacjaRozmiarPrzedmiotów_HSelle() throws InterruptedException{
		try {
		logger.info("****Rozpoczęto TC_056_WalidacjaCenaPrzedmiotów_HSeller****");
		MainPage Mp = new MainPage(driver);
		driver.navigate().refresh();
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(500);
		
		for(WebElement price : Mp.List_PricesProductOf_HSeller()) {
	
			if(price.isDisplayed()) {
				
				logger.info("**** Cena przedmiotu została wyświetlona : "+ price.getText()+" ****");
			
			}else {
				
				logger.error("**** Cena przedmiotu nie została wyświetlona ****");
				logger.info("**** TC_056_WalidacjaCenaPrzedmiotów_HSeller zakończył się niepowodzeniem ****");
				Assert.fail();
			}
			
			
		}
		
		Assert.assertTrue(true);
		logger.info("****Wszystkie przedmioty mają wyświetloną cene****");
		logger.info("**** TC_056_WalidacjaCenaPrzedmiotów_HSeller zakończył się powodzeniem ****");
		}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
			}
	}
}
