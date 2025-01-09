package testCases;

import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MyAccountPage;

public class TC_158_ValidationOfDataOfTableHeaders_MyAccountPage extends BaseTest{
	@Test(groups = {"functional","master"})
	public void ValidationOfDataOfTableHeaders_MyAccountPage() {
		
		try {
			
			logger.info("****Starting TC_158_ValidationOfDataOfTableHeaders_MyAccountPage****");
			BaseTest Bt = new BaseTest();
			Bt.LoginToVeronicaAccount();
			logger.info("****Veronica demo account is logged in****");
			MyAccountPage Map = new MyAccountPage(driver);
			int i=1;
			for(WebElement x : Map.get_List_NameOfColums()) {
				
				if(x.isDisplayed()) {
					
					logger.info("****Header number:"+i+" has been displayed ****");
					i++;
				}else {
					
					logger.error("****Header number:"+i+" has not been displayed ****");
					logger.info("****TC_158_ValidationOfDataOfTableHeaders_MyAccountPage finished negative****");
					Assert.fail("****Header number:"+i+" has not been displayed ****");
					break;
				}
				
			}
			logger.info("****Each data of headers have been displayed****");
			logger.info("****TC_158_ValidationOfDataOfTableHeaders_MyAccountPage finished positive****");
			Assert.assertTrue(true);
		}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
		}
		
		
	}
	
}
