package testCases;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;

public class TC_058_ValidationOfButtonDisplayAddToCart_HSeller extends BaseTest{
	@Test(groups ={"functional","regression","master"})
	public void ValidationOfButtonDisplayAddToCart_HSeller() throws InterruptedException {
		try {
		logger.info("**** Starting TC_058_ValidationOfButtonDisplayAddToCart_HSeller ****");
		MainPage Mp = new MainPage(driver);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		logger.info("**** Scrolled website down ****");
		int i =0;
		for(WebElement product : Mp.List_ImgProductOf_HSeller()) {
			
			Actions act = new Actions(driver);
			
			act.moveToElement(product).perform();
			logger.info("**** The cursor moved on product  ****");
			WebElement btnCart = Mp.List_BtnCartProductOf_HSeller().get(i);
				
				if(btnCart.isDisplayed()) {
					
					logger.info("**** Button 'add to cart' has been displayed ****");
					i++;
				}else {
					
					logger.error("**** Button 'add to cart' has not been displayed****");
					logger.info("****TC_058_ValidationOfButtonDisplayAddToCart_HSeller finished negative****");
					Assert.fail("**** Button 'add to cart' has not been displayed****");
					
				}
				
				
				
			
			
			
			
		}
		logger.info("****Each product has a button 'add to cart'****");
		logger.info("****TC_058_ValidationOfButtonDisplayAddToCart_HSeller finished positive ****");
		Assert.assertTrue(true);
		
		}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
			}
		
	}
	
}
