package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_177_WalidacjaLinkuZobaczWszystkieWOstnioZamówione_MyAccountPage extends BaseTest {
	@Test(groups ={"functional","regression","master"})
	public void WalidacjaLinkuZobaczWszystkieWOstnioZamówione_MyAccountPage() {
		
		try {
			logger.info("****Rozpoczęto TC_177_WalidacjaLinkuZobaczWszystkieWOstnioZamówione_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			MyAccountPage Map = new MyAccountPage(driver);
			Map.click_link_ShowAllProducts();
			logger.info("****Kliknięto link 'Zobacz wszystkie'****");
			String expTxt = "Ostatnie zamówienia";
			if(Map.check_header_LastOrders()) {
				
				logger.info("****Wyświetlił się nagłówek "+expTxt+" ****");
				logger.info("****TC_177_WalidacjaLinkuZobaczWszystkieWOstnioZamówione_MyAccountPage zakończono powodzeniem****");
				Assert.assertTrue(true);
			}else {

				logger.error("Nie wyświetlono nagłówka "+expTxt+" ****");
				logger.info("****TC_177_WalidacjaLinkuZobaczWszystkieWOstnioZamówione_MyAccountPage zakończono niepowodzeniem****");
				Assert.fail();
			}
			
			
			
	}catch(Exception e) {
				
				logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
				Assert.fail();
			
			}
		
	}
	
}
