package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.MenTopsPage;

public class TC_213_WalidacjaOpcjiWNowy_TopsPage_M extends BaseTest{
	@Test(groups = {"functional","regression","master"})
	public void WalidacjaOpcjiWErinReccomends_TopsPage_M() throws InterruptedException {
		try {
			MainMenuPage Mmp = new MainMenuPage(driver);
			logger.info("****Rozpoczęto TC_213_WalidacjaOpcjiWNowy_TopsPage_M****");
			Mmp.click_Men_Tops();
			logger.info("****Kliknięto men ---> tops****");
			MenTopsPage Mtp = new MenTopsPage(driver);
			Mtp.click_optionShopping_new();
			js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
			logger.info("****Przewinięto stronę na górę****");
			int amountOfOptions = Mtp.get_ListOfOptions_categories().size();
			Mtp.click_optionShopping_new();
			js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
			logger.info("****Przewinięto stronę na górę****");
			
			
			for(int i = 1 ;i<=amountOfOptions ; i++) {
			js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
			logger.info("****Przewinięto stronę na górę****");
			Mtp.click_optionShopping_new();
			logger.info("****Kliknięto opcję : Nowy****");
			WebElement option = driver.findElement(By.xpath("//div[@class='filter-options-item allow active']//div[@role='tabpanel']//li["+i+"]/a"));
			logger.info("****Kliknięto opcje : "+option.getText()+" w Nowy****");
			option.click();
			if(Mtp.check_txt_communicateOfAddedOption()) {
				
				logger.info("****Pojawił się komunikat o poprawnym wybraniu Nowy****");
				Mtp.click_btn_clearOption();
				logger.info("****Kliknięto przycisk wyczyść wszystko****");
			}else {
				
				logger.error("****Nie pojawił się komunikat o poprawnym wybraniu w kategorii : Nowy****");
				logger.info("****TC_213_WalidacjaOpcjiWNowy_TopsPage_M zakończono niepowodzeniem****");
				Assert.fail();
			}
			
			
			}
			logger.info("****Wszystkie opcje w kategorii : Nowy, zostały poprawnie wybrane ****");
			logger.info("****TC_213_WalidacjaOpcjiWNowy_TopsPage_M zakończono powodzeniem****");
			Assert.assertTrue(true);
		}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
		}
	}
	
}
