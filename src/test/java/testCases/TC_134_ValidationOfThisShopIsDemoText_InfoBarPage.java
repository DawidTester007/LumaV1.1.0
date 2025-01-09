package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.InfoBarPage;

public class TC_134_ValidationOfThisShopIsDemoText_InfoBarPage extends BaseTest {
	@Test(groups = {"functional","master"})
	public void ValidationOfThisShopIsDemoText_InfoBarPage() {
		try {
		logger.info("****Starting TC_134_ValidationOfThisShopIsDemoText_InfoBarPage****");
		InfoBarPage Ibp = new InfoBarPage(driver);
		String expTxt ="To jest sklep demo, resetowany co 6 godzin. Złożone zamówienia nie będą procesowane. Panel Administracyjny login: demo_admin hasło: demo_admin123";
		
		if(Ibp.get_txt_InfoBar().equalsIgnoreCase(expTxt)) {
			logger.info("****The text is correct****");
			logger.info("****TC_134_ValidationOfThisShopIsDemoText_InfoBarPage finished positive****");
			Assert.assertTrue(true);
		}else {
			logger.error("****The text is incorrect****");
			logger.info("****TC_134_ValidationOfThisShopIsDemoText_InfoBarPage finished negative****");
			Assert.fail("****The text is incorrect****");
			
		}
}catch(Exception e) {
			
			logger.error("****An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
		}
	
		
	}
}
