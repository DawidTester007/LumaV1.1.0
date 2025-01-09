package testCases;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.ProductPage;

public class TC_063_ValidationOfCorrectnessAddingProductToCart_ProductPage extends BaseTest{
	@Test(groups ={"functional","regression","master"})
	public void ValidationOfCorrectnessAddingProductToCart_ProductPage()  {
		try {
		logger.info("**** Starting TC_063_ValidationOfCorrectnessAddingProductToCart_ProductPage ****");
		MainPage Mp = new MainPage(driver);
		Random ran = new Random();
		WebElement addCart = Mp.List_BtnCartProductOf_HSeller().get(0);
		js.executeScript("arguments[0].click();", addCart);
		logger.info("**** Clicked a button 'Add to cart'****");
		ProductPage Pp = new ProductPage(driver);
		int amountOfSize = Pp.List_sizesOfProduct().size();
		int ranSize = ran.nextInt(amountOfSize);
		Pp.List_sizesOfProduct().get(ranSize).click();
		logger.info("**** Selected product size : " + Pp.List_sizesOfProduct().get(ranSize).getText()+ " ****");
		
		int sizeColors = Pp.List_colorsOfProducts().size();
		int ranColor = ran.nextInt(sizeColors);
		Pp.List_colorsOfProducts().get(ranColor).click();
		logger.info("**** Selected product color : " + Pp.List_colorsOfProducts().get(ranColor).getAttribute("aria-label")+ " ****");
	
		Integer amount = ran.nextInt(10)+1;
		Pp.clear_AmountOfProduct();;
		Pp.set_AmountOfProduct(amount.toString());
		logger.info("**** Product quantity has been set: "+ amount+" ****");
		Pp.click_btn_addCart();
		logger.info("**** Clicked a button 'Add to cart' ****");
		if(Pp.get_WebElement_AddedCorrectly().isDisplayed()==true) {
			
			Assert.assertTrue(true);
			logger.info("**** Validation message has been displayed****");
			logger.info("**** TC_063_ValidationOfCorrectnessAddingProductToCart_ProductPage finished positive ****");
		}else {
			logger.error("**** Validation message has not been displayed ****");
			logger.info("**** TC_063_ValidationOfCorrectnessAddingProductToCart_ProductPage finished negative ****");
			Assert.fail("**** Validation message has not been displayed ****");
		}
		
		

		
	}catch(Exception e) {
		
		logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
		Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
	
		}

	}
	
}