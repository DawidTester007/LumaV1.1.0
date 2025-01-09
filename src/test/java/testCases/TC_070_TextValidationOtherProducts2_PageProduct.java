package testCases;

import java.util.NoSuchElementException;

import org.openqa.selenium.NotFoundException;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainPage;
import pages.ProductPage;

public class TC_070_TextValidationOtherProducts2_PageProduct extends BaseTest{

	@Test(groups={"functional","master","master"})
	public void WalidacjaTekstuInneProdukty2_PageProduct() {
	
		try {
			MainPage Mp = new MainPage(driver);
			logger.info("**** Starting TC_070_TextValidationOtherProducts2_PageProduct ****");
			Mp.List_ImgProductOf_HSeller().get(1).click();
			logger.info("**** Clicked a product image ****");
			ProductPage Pp = new ProductPage(driver);
			String expTxt1 ="Znaleźliśmy inne produkty, które mogą Cię zainteresować!";
			String expTxt2 ="Produkty powiązane";
			
			try {
			if(Pp.get_txt_anotherProducts1().isDisplayed()) {
				
				if(Pp.get_txt_anotherProducts1().getText().equals(expTxt1)) {
					logger.info("**** The content of communicate is correct ****" );
					logger.info("**** TC_070_TextValidationOtherProducts2_PageProduct finished positive ****");
					Assert.assertTrue(true);
					
				}else {
					logger.error("**** The content of communicate is incorrect ****" );
					logger.info("**** TC_070_TextValidationOtherProducts2_PageProduct finished negative ****");
					Assert.fail("**** The content of communicate is incorrect ****");
					
				}
				
			}
		
			}catch(NoSuchElementException e) {
				
			if(Pp.get_txt_anotherProducts2().isDisplayed()) {
					
				if(Pp.get_txt_anotherProducts2().getText().equals(expTxt2)) {
					logger.info("**** The content of communicate is correct ****" );
					logger.info("**** TC_070_TextValidationOtherProducts2_PageProduct finished positive ****");
					Assert.assertTrue(true);
					
				}else {
					logger.error("**** The content of communicate is incorrect ****" );
					logger.info("**** TC_070_TextValidationOtherProducts2_PageProduct finished negative ****");
					Assert.fail("**** The content of communicate is incorrect ****");
					
				}
				
					
			}
				
			}catch(NotFoundException e) {
				if(Pp.get_txt_anotherProducts2().isDisplayed()) {
					
					if(Pp.get_txt_anotherProducts2().getText().equals(expTxt2)) {
						logger.info("**** The content of communicate is correct ****" );
						logger.info("**** TC_070_TextValidationOtherProducts2_PageProduct finished positive ****");
						Assert.assertTrue(true);
						
					}else {
						logger.error("**** The content of communicate is incorrect ****" );
						logger.info("**** TC_070_TextValidationOtherProducts2_PageProduct finished negative ****");
						Assert.fail("**** The content of communicate is incorrect ****");
						
					}
					
						
				}
				
			}
		
		}catch(Exception e) {
		
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
		}
}
}


