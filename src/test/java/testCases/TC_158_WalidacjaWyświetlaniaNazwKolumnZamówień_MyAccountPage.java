package testCases;

import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_158_WalidacjaWyświetlaniaNazwKolumnZamówień_MyAccountPage extends BaseTest{
	@Test(groups = {"functional","master"})
	public void WalidacjaWyświetlaniaNazwKolumnZamówień_MyAccountPage() {
		
		try {
			
			logger.info("****Rozpoczęto TC_158_WalidacjaWyświetlaniaNazwKolumnZamówień_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			MyAccountPage Map = new MyAccountPage(driver);
			int i=1;
			for(WebElement x : Map.get_List_NameOfColums()) {
				
				if(x.isDisplayed()) {
					
					logger.info("****Wyświetlono nazwe kolumny nr:"+i+" ****");
					i++;
				}else {
					
					logger.error("****Nie wyświetlono nazwe kolumny nr:"+i+" ****");
					logger.info("****TC_158_WalidacjaWyświetlaniaNazwKolumnZamówień_MyAccountPage zakończono niepowodzeniem****");
					Assert.fail();
					break;
				}
				
			}
			logger.info("****Wyświetlono wszystkie nazwy kolumn tabeli 'Ostatnie zamówienia'****");
			logger.info("****TC_158_WalidacjaWyświetlaniaNazwKolumnZamówień_MyAccountPage zakończono powodzeniem****");
			Assert.assertTrue(true);
		}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
		}
		
		
	}
	
}
