package testCases;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.MenTopsPage;

public class TC_204_WalidacjaFunkcjonalnościDropDownSelektor_Nazwa_Tops_M extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void WalidacjaFunkcjonalnościDropDownSelektor_Nazwa_Tops_M() {
		
		
		try {
			MainMenuPage Mmp = new MainMenuPage(driver);
			logger.info("****Rozpoczęto TC_204_WalidacjaFunkcjonalnościDropDownSelektor_Nazwa_Tops_M****");
			Mmp.click_Men_Tops();
			logger.info("****Kliknięto kategorię Men ----> Tops****");
			MenTopsPage Mtp = new MenTopsPage(driver);
			Select select = new Select(Mtp.get_select_sorter());
			String expValue = "name";
			select.selectByValue(expValue);
			logger.info("****Wybrano sortowanie według nazwy****");
			
			if(select.getFirstSelectedOption().getAttribute("value").equalsIgnoreCase(expValue)) {
				
				logger.info("****Produkty posortowane są według nazwy****");
				logger.info("****TC_204_WalidacjaFunkcjonalnościDropDownSelektor_Nazwa_Tops_M zakończono powodzeniem****");
				Assert.assertTrue(true);
			}else {
				
				logger.error("****Produkty nie posortowane są według nazwy****");
				logger.info("****TC_204_WalidacjaFunkcjonalnościDropDownSelektor_Nazwa_Tops_M zakończono niepowodzeniem****");
				Assert.fail();
				
			}
			

			}catch(Exception e) {
				
				logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getStackTrace()+" ****");
				Assert.fail();
			
			}
	}
	
	
}
