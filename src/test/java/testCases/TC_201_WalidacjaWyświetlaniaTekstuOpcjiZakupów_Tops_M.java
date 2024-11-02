package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.MenTopsPage;

public class TC_201_WalidacjaWyświetlaniaTekstuOpcjiZakupów_Tops_M extends BaseTest{
	@Test(groups = {"functional","master"})
	public void WalidacjaWyświetlaniaTekstuOpcjiZakupów_Tops_M() {
		try {
		MainMenuPage Mmp = new MainMenuPage(driver);
		logger.info("****Rozpoczęto TC_201_WalidacjaWyświetlaniaTekstuOpcjiZakupów_Tops_M****");
		Mmp.click_Men_Tops();
		logger.info("****Kliknięto kategorię Men ----> Tops****");
		MenTopsPage Mtp = new MenTopsPage(driver);
		String expTxt = "Opcje zakupów";
		if(Mtp.get_txt_OptionOfShopping().equalsIgnoreCase(expTxt)) {
			
			logger.info("****Pojawił się tekst: "+expTxt+"****");
			logger.info("****TC_201_WalidacjaWyświetlaniaTekstuOpcjiZakupów_Tops_M zakończono powodzeniem****");
			Assert.assertTrue(true);
		}else {
			logger.error("****Nie pojawił się tekst: "+expTxt+"****");
			logger.info("****TC_201_WalidacjaWyświetlaniaTekstuOpcjiZakupów_Tops_M zakończono niepowodzeniem****");
			Assert.fail();
			
		}
		}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
		}
	}
	
}
