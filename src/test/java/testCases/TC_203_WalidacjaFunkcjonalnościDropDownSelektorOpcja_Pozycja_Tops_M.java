package testCases;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.MenTopsPage;

public class TC_203_WalidacjaFunkcjonalnościDropDownSelektorOpcja_Pozycja_Tops_M extends BaseTest{
	@Test(groups = {"functional","regression","master"})
	public void WalidacjaFunkcjonalnościDropDownSelektorOpcja_Pozycja_Tops_M() {
		try {
		MainMenuPage Mmp = new MainMenuPage(driver);
		logger.info("****Rozpoczęto TC_203_WalidacjaFunkcjonalnościDropDownSelektorOpcja_Pozycja_Tops_M****");
		Mmp.click_Men_Tops();
		logger.info("****Kliknięto kategorię Men ----> Tops****");
		MenTopsPage Mtp = new MenTopsPage(driver);
		Select select = new Select(Mtp.get_select_sorter());
		String currTxt = select.getFirstSelectedOption().getText();
		
		if(currTxt.contains("Pozycja")) {
			
			logger.info("****Produkty posortowane są według pozycji****");
			logger.info("****TC_203_WalidacjaFunkcjonalnościDropDownSelektorOpcja_Pozycja_Tops_M zakończono powodzeniem****");
			Assert.assertTrue(true);
			
		}else {
			
			logger.error("****Wybraną wartością nie jest Pozycja****");
			logger.info("****TC_203_WalidacjaFunkcjonalnościDropDownSelektorOpcja_Pozycja_Tops_M zakończono niepowodzeniem****");
			Assert.fail();
		}
	
		

		}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getStackTrace()+" ****");
			Assert.fail();
		
		}
	}
	
}
