package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_185_ValidationOfProductCounter_MyAccountPage extends BaseTest {
	@Test(groups = {"functional","master"})
	public void ValidationOfProductCounter_MyAccountPage() {
		
		try {
			logger.info("****Starting TC_185_ValidationOfProductCounter_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			logger.info("****Veronica demo account is logged in****");
			MyAccountPage Map = new MyAccountPage(driver);
			Map.click_tab_Orders();
			logger.info("****Clicked orders tab****");
			Integer currAmountOfProduct = Map.get_List_ProductOfOrder().size();
			String showedCount = Map.get_txt_countOfProduct();
			
			if(showedCount.contains(currAmountOfProduct.toString())) {
				
				logger.info("****Number Of Products:"+currAmountOfProduct+" Equals The Value Of The Counter :"+showedCount+"****");
				logger.info("****TC_185_ValidationOfProductCounter_MyAccountPage finished positive****");
				Assert.assertTrue(true);
			}else {
				logger.error("****Number Of Products:"+currAmountOfProduct+" Not Equals The Value Of The Counter :"+showedCount+"****");
				logger.info("****TC_185_ValidationOfProductCounter_MyAccountPage finished negative****");
				Assert.fail("****Number Of Products:"+currAmountOfProduct+" Not Equals The Value Of The Counter :"+showedCount+"****");
				
			}
			
			
			
			
			
	}catch(Exception e) {
				
				logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
				Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
			}
		
	}
	
}
