package testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.MenTopsPage;

public class TC_217_WalidacjaOpcjiWKolorach_TopsPage_M extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void WalidacjaOpcjiWKolorach_TopsPage_M () {
		try {
		logger.info("****Rozpoczęto TC_217_WalidacjaOpcjiWKolorach_TopsPage_M****");
		MainMenuPage Mmp = new MainMenuPage(driver);
		Mmp.click_Men_Tops();
		logger.info("****Kliknięto Men ---> Tops****");
		MenTopsPage Mtp = new MenTopsPage(driver);
		int amountOfColors = Mtp.get_ListOfOptions_color().size();
		for(int i = 1 ;i<=amountOfColors ; i++) {
		Mtp.click_optionShopping_color();
		logger.info("****Kliknięto zakładkę: kolory****");
		driver.findElement(By.xpath("//div[@class='swatch-attribute swatch-layered color']//div[@class='swatch-attribute-options clearfix']/a["+i+"]/div")).click();
		logger.info("****Kliknięto kolor nr: "+i+"****");
		if(Mtp.check_txt_communicateOfAddedOption()) {
			
			logger.info("****Pojawił się komunikat o wybraniu koloru****");
			Mtp.click_btn_clearOption();
			logger.info("****Wyczyszczono opcje zakupów****");
		}else {
			logger.error("****Nie pojawił się komunikat o wybraniu koloru****");
			logger.info("****TC_217_WalidacjaOpcjiWKolorach_TopsPage_M zakończono niepowodzeniem****");
			Assert.fail();
		}
		
		
		}
		logger.info("****Wszystkie kolory zostały poprawnie wybrane i pojawiły się wymagane komunikaty****");
		logger.info("TC_217_WalidacjaOpcjiWKolorach_TopsPage_M zakończono powodzeniem");
		Assert.assertTrue(true);
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
		}
	}
	
}
