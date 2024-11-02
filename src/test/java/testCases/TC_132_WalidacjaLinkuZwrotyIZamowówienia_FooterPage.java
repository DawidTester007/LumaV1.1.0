package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.FooterPage;
import pages.LoginPage;
import pages.MainPage;

public class TC_132_WalidacjaLinkuZwrotyIZamowówienia_FooterPage extends BaseTest{
	@Test(groups = {"functional","regression","master"})
	public void WalidacjaLinkuZwrotyIZamowówienia_FooterPage() throws InterruptedException {
		try {
		logger.info("****Rozpoczęto TC_132_WalidacjaLinkuZwrotyIZamowówienia_FooterPage ****");
		FooterPage Fp = new FooterPage(driver);
		MainPage Mp = new MainPage(driver);
		Mp.click_btnZaloguj();
		logger.info("****Kliknięto link 'zaloguj się'****");
		LoginPage Lp = new LoginPage(driver);
		Lp.send_DataEmail(prop.getProperty("email"));
		Lp.send_DataPwd(prop.getProperty("pwd"));
		logger.info("****Wypełniono pola poprawnymi danymi****");
		Lp.click_btn_Zaloguj();
		logger.info("****Kliknięto przycisk zaloguj****");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		if(Fp.check_linkTxt_refund()) {
			logger.info("****Wyświetlono link zwroty i zamówienia po zalogowaniu****");
			logger.info("****TC_132_WalidacjaLinkuZwrotyIZamowówienia_FooterPage zakończono powodzeniem****");
			Assert.assertTrue(true);
		}else {
			logger.error("****Nie wyświetlono linku zwroty i zamówienia po zalogowaniu****");
			logger.info("****TC_132_WalidacjaLinkuZwrotyIZamowówienia_FooterPage zakończono niepowodzeniem****");
			Assert.fail();
			
		}
		
		
		
}catch(Exception e) {
			
			logger.error("**** Podczas testu rzucony został wyjątek:"+ e.getMessage()+" ****");
			Assert.fail();
		
	}
		
	}
	
}
