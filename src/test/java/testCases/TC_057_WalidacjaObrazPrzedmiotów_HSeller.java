package testCases;



import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;

public class TC_057_WalidacjaObrazPrzedmiotów_HSeller extends BaseTest {
	@Test(groups ={"functional","regression","master"})
	public void WalidacjaObrazPrzedmiotów_HSeller() throws InterruptedException{
		try {
		logger.info("****Rozpoczęto TC_057_WalidacjaObrazPrzedmiotów_HSeller****");
		MainPage Mp = new MainPage(driver);
		driver.navigate().refresh();
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		
		for(WebElement img : Mp.List_ImgProductOf_HSeller()) {
	
			if(img.isDisplayed()) {
				
				logger.info("**** Zdjęcie przedmiotu zostało wyświetlone ****");
			
			}else {
				
				logger.error("****  Zdjęcie przedmiotu nie zostało wyświetlone ****");
				logger.info("**** TC_057_WalidacjaObrazPrzedmiotów_HSeller zakończył się niepowodzeniem ****");
				Assert.fail();
			}
			
		
		}	
		
		Assert.assertTrue(true);
		logger.info("**** TC_057_WalidacjaObrazPrzedmiotów_HSeller zakończył się powodzeniem ****");
		}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
			}
	}
}
