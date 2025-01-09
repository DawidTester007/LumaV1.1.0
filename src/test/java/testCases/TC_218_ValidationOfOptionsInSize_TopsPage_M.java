package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.MenTopsPage;

public class TC_218_ValidationOfOptionsInSize_TopsPage_M extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void ValidationOfOptionsInSize_TopsPage_M () {
		try {
			MainMenuPage Mmp = new MainMenuPage(driver);
			logger.info("****Starting TC_218_ValidationOfOptionsInSize_TopsPage_M****");
			Mmp.click_Men_Tops();
			logger.info("****Clicked a category Men ----> Tops****");
			MenTopsPage Mtp = new MenTopsPage(driver);
			Mtp.click_optionShopping_size();
			logger.info("****Clicked size tab in shopping options****");
			int numberOfCategories = Mtp.get_ListOfOptions_size().size();
			js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
			logger.info("****Scrolled page up****");
			for(int i =1 ;i<=numberOfCategories ; i++) {
				
				WebElement subCat = driver.findElement(By.xpath("//div[@class='swatch-attribute swatch-layered size']//div[@class='swatch-attribute-options clearfix']/a["+i+"]/div"));
				String subCatName = subCat.getText();
				DriverWait.until(ExpectedConditions.visibilityOf(subCat)).click();
				logger.info("****"+subCatName+" size has been selected****");
				
				
				if(Mtp.check_txt_communicateOfAddedOption()==true) {
					
					logger.info("****Products have been displayed in size "+subCatName+"****");
					Mtp.click_btn_clearOption();
					logger.info("****Clear button has been clicked****");
					Mtp.click_optionShopping_size();
					logger.info("****Clicked size tab in shopping options****");
					
				}else {
					logger.error("****Products have not been displayed in size "+subCatName+"****");
					logger.info("TC_218_ValidationOfOptionsInSize_TopsPage_M finished negative");
					Assert.fail("****Products have not been sorted  ****");
				}
			}
			
			logger.info("****Products have been sorted by each option in size****");
			logger.info("****TC_218_ValidationOfOptionsInSize_TopsPage_M finished positive****");
			Assert.assertTrue(true);
		}
			
			catch(Exception e) {
				logger.error("****An exception was thrown during test "+e.getMessage()+" ****");
				Assert.fail("****An exception was thrown during test "+e.getMessage()+" ****");
			}
	}
	
}
