package testCases;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;

import pages.MyAccountPage;

public class TC_184_WalidacjaFunkcjonalnościOpcjiWyświetlaniaIlościProduktówWZakładceZamówieniaOpcja50_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void WalidacjaFunkcjonalnościOpcjiWyświetlaniaIlościProduktówWZakładceZamówieniaOpcja50_MyAccountPage() {
		
		try {
			logger.info("****Rozpoczęto TC_184_WalidacjaFunkcjonalnościOpcjiWyświetlaniaIlościProduktówWZakładceZamówieniaOpcja50_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			MyAccountPage Map = new MyAccountPage(driver);
			Map.click_tab_Orders();
			logger.info("****Kliknięto zakładkę zamówienia****");
			Select select = new Select(Map.get_select_dropDown());
			String amountVisibleProducts = "50";
			select.selectByVisibleText(amountVisibleProducts);
			logger.info("****Kliknięto opcje wyświetlania 50-stu produktów****");
			if(select.getFirstSelectedOption().getText().equalsIgnoreCase(amountVisibleProducts)) {
				
				logger.info("**** Poprawnie wybrano opcje wyświetlania : "+amountVisibleProducts+" przedmiotów****");
				logger.info("**** TC_184_WalidacjaFunkcjonalnościOpcjiWyświetlaniaIlościProduktówWZakładceZamówieniaOpcja50_MyAccountPage zakończono powodzeniem****");
				Assert.assertTrue(true);
			}else {
				
				logger.error("**** Nie wybrano opcji wyświetlania : "+amountVisibleProducts+" przedmiotów****");
				logger.info("**** TC_184_WalidacjaFunkcjonalnościOpcjiWyświetlaniaIlościProduktówWZakładceZamówieniaOpcja50_MyAccountPage zakończono niepowodzeniem****");
				Assert.fail();
				
			}
			
			
			
			
	}catch(Exception e) {
				
				logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
				Assert.fail();
			
			}
		
	}
	
}
