package testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.MenTopsPage;

public class TC_218_WalidacjaOpcjiWRozmiar_TopsPage_M extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void WalidacjaOpcjiWRozmiar_TopsPage_M () {
		try {
		logger.info("****Rozpoczęto TC_218_WalidacjaOpcjiWRozmiar_TopsPage_M****");
		MainMenuPage Mmp = new MainMenuPage(driver);
		Mmp.click_Men_Tops();
		logger.info("****Kliknięto Men ---> Tops****");
		MenTopsPage Mtp = new MenTopsPage(driver);
		int amountOfSize = Mtp.get_ListOfOptions_size().size();
		for(int i = 1 ;i<=amountOfSize ; i++) {
		Mtp.click_optionShopping_size();
		logger.info("****Kliknięto zakładkę: Rozmiary****");
		driver.findElement(By.xpath("//div[@class='swatch-attribute swatch-layered size']//div[@class='swatch-attribute-options clearfix']/a["+i+"]/div")).click();
		logger.info("****Kliknięto rozmiar nr: "+i+"****");
		if(Mtp.check_txt_communicateOfAddedOption()) {
			
			logger.info("****Pojawił się komunikat o wybraniu rozmiaru****");
			Mtp.click_btn_clearOption();
			logger.info("****Wyczyszczono opcje zakupów****");
		}else {
			logger.error("****Nie pojawił się komunikat o wybraniu rozmiaru****");
			logger.info("****TC_218_WalidacjaOpcjiWRozmiar_TopsPage_M zakończono niepowodzeniem****");
			Assert.fail();
		}
		
		
		}
		logger.info("****Wszystkie rozmiary zostały poprawnie wybrane i pojawiły się wymagane komunikaty****");
		logger.info("TC_218_WalidacjaOpcjiWRozmiar_TopsPage_M zakończono powodzeniem");
		Assert.assertTrue(true);
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
		}
	}
	
}
