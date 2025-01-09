package testCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;

public class TC_055_ClickabilityValidationOfProductColor_HSeller extends BaseTest {
	@Test(groups ={"functional","regression","master"})
	public void ClickabilityValidationOfProductColor_HSeller(){
		try {
		logger.info("****Starting TC_055_ClickabilityValidationOfProductColor_HSeller****");
		MainPage Mp = new MainPage(driver);
		
		for(WebElement color : Mp.List_ColorsProductOf_HSeller()) {
			
			if(color.isEnabled()) {
				
				color.click();
				
				if(color.getAttribute("aria-checked").equals("true")) {
					
					logger.info("**** Product color has benn clicked :" + color.getAttribute("data-option-label")+ " ****");
				}else {
					logger.error("**** Color was not clicked ****");
					logger.info("****TC_055_ClickabilityValidationOfProductColor_HSeller finished negative****");
					Assert.fail("**** Color was not clicked ****");
					
				}
				
			}else {
				
				logger.error("**** Color was not accessible to click ****");
				logger.info("****TC_055_ClickabilityValidationOfProductColor_HSeller finished negative****");
				Assert.fail("**** Color was not accessible to click ****");
			}
			
			
			
		}	
		logger.info("****All the colors has been clicked****");
		logger.info("****TC_055_ClickabilityValidationOfProductColor_HSeller finished positive****");
		Assert.assertTrue(true);
		
		}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
			}
		
	
		
		
	}
	
}
