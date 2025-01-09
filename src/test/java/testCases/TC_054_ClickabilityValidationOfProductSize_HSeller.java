package testCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;

public class TC_054_ClickabilityValidationOfProductSize_HSeller extends BaseTest {
	@Test(groups ={"functional","regression","master"})
	public void ClickabilityValidationOfProductSize_HSeller(){
		try {
		logger.info("****Starting TC_054_ClickabilityValidationOfProductSize_HSeller****");
		MainPage Mp = new MainPage(driver);
		
		for(WebElement size : Mp.List_SizeProductOf_HSeller()) {
			
			if(size.isEnabled()) {
				
				size.click();
				
				if(size.getAttribute("aria-checked").equals("true")) {
					
					logger.info("**** Clicked a product size :" + size.getAttribute("data-option-label")+ "****");
				}else {
					logger.error("**** size has not been clicked ****");
					logger.info("****TC_054_ClickabilityValidationOfProductSize_HSeller finished negative****");
					Assert.fail("**** size has not been clicked ****");
					
				}
				
			}else {
				
				logger.error("**** Size cannot to be click ****");
				logger.info("****TC_054_ClickabilityValidationOfProductSize_HSeller finished negative****");
				Assert.fail("**** Size cannot to be click ****");
			}
			
			
			
		}	
		logger.info("****All the displayed products size has been clicked****");
		logger.info("****TC_054_WalidacjaKlikalnościRozmiarPrzedmiotów_HSeller finished positive****");
		Assert.assertTrue(true);
		
		}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
			}
		
	
		
		
	}
	
}
