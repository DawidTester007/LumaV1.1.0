package testCases;

import org.openqa.selenium.support.ui.Select;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;

import pages.MyAccountPage;

public class TC_183_ValidationOfTheFunctionalityOfTheOptionToDisplayTheQuantityOfProductsInTheOrdersTabOption20_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void ValidationOfTheFunctionalityOfTheOptionToDisplayTheQuantityOfProductsInTheOrdersTabOption20_MyAccountPage() {
		
		try {
			logger.info("****Starting TC_183_ValidationOfTheFunctionalityOfTheOptionToDisplayTheQuantityOfProductsInTheOrdersTabOption20_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			logger.info("****Veronica demo account is logged in****");
			MyAccountPage Map = new MyAccountPage(driver);
			Map.click_tab_Orders();
			logger.info("****Clicked the orders tab****");
			Select select = new Select(Map.get_select_dropDown());
			String amountVisibleProducts = "20";
			select.selectByVisibleText(amountVisibleProducts);
			logger.info("****The option show 20 products has been selected****");
			if(select.getFirstSelectedOption().getText().equalsIgnoreCase(amountVisibleProducts)) {
				
				logger.info("**** The option show 20 products has been selected****");
				logger.info("**** TC_183_ValidationOfTheFunctionalityOfTheOptionToDisplayTheQuantityOfProductsInTheOrdersTabOption20_MyAccountPage finished positive****");
				Assert.assertTrue(true);
			}else {
				
				logger.error("**** The option show 20 products has not been selected****");
				logger.info("**** TC_183_ValidationOfTheFunctionalityOfTheOptionToDisplayTheQuantityOfProductsInTheOrdersTabOption20_MyAccountPage finished negative****");
				Assert.fail("**** The option show 20 products has not been selected****");
				
			}
			
			
			
			
	}catch(Exception e) {
				
				logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
				Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
			}
		
	}
	
}
