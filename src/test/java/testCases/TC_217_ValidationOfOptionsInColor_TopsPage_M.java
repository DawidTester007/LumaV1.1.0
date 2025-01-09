package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.MenTopsPage;

public class TC_217_ValidationOfOptionsInColor_TopsPage_M extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void ValidationOfOptionsInColor_TopsPage_M () {
		try {
			MainMenuPage Mmp = new MainMenuPage(driver);
			logger.info("****Starting TC_217_ValidationOfOptionsInColor_TopsPage_M****");
			Mmp.click_Men_Tops();
			logger.info("****Clicked a category Men ----> Tops****");
			MenTopsPage Mtp = new MenTopsPage(driver);
			Mtp.click_optionShopping_color();
			logger.info("****Clicked color tab in shopping options****");
			int numberOfCategories = Mtp.get_ListOfOptions_color().size();
			js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
			logger.info("****Scrolled page up****");
			for(int i =1 ;i<=numberOfCategories ; i++) {
				
				WebElement subCat = driver.findElement(By.xpath("//div[@class='swatch-attribute swatch-layered color']//div[@class='swatch-attribute-options clearfix']/a["+i+"]/div"));
				String subCatName = subCat.getAttribute("data-option-label");
				DriverWait.until(ExpectedConditions.visibilityOf(subCat)).click();
				logger.info("****"+subCatName+" color has been selected****");
				
				
				if(Mtp.check_txt_communicateOfAddedOption()==true) {
					
					logger.info("****Products have been displayed in color "+subCatName+"****");
					Mtp.click_btn_clearOption();
					logger.info("****Clear button has been clicked****");
					Mtp.click_optionShopping_color();
					logger.info("****Clicked color tab in shopping options****");
					
				}else {
					logger.error("****Products have not been displayed in color "+subCatName+"****");
					logger.info("TC_217_ValidationOfOptionsInColor_TopsPage_M finished negative");
					Assert.fail("****Products have not been sorted  ****");
				}
			}
			
			logger.info("****Products have been sorted by each option in color****");
			logger.info("****TC_217_ValidationOfOptionsInColor_TopsPage_M finished positive****");
			Assert.assertTrue(true);
		}
			
			catch(Exception e) {
				logger.error("****An exception was thrown during test "+e.getMessage()+" ****");
				Assert.fail("****An exception was thrown during test "+e.getMessage()+" ****");
			}
	}
	
}
