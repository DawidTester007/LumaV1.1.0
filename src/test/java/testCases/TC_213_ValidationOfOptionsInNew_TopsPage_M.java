package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.MenTopsPage;

public class TC_213_ValidationOfOptionsInNew_TopsPage_M extends BaseTest{
	@Test(groups = {"functional","regression","master"})
	public void ValidationOfOptionsInNew_TopsPage_M() throws InterruptedException {
		try {
			MainMenuPage Mmp = new MainMenuPage(driver);
			logger.info("****Starting TC_213_ValidationOfOptionsInNew_TopsPage_M****");
			Mmp.click_Men_Tops();
			logger.info("****Clicked a category Men ----> Tops****");
			MenTopsPage Mtp = new MenTopsPage(driver);
			Mtp.click_optionShopping_new();
			logger.info("****Clicked New tab in shopping options****");
			int numberOfCategories = Mtp.get_ListOfOptions_categories().size();
			js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
			logger.info("****Scrolled page up****");
			for(int i =1 ;i<=numberOfCategories ; i++) {
				
				WebElement subCat = driver.findElement(By.xpath("//div[@class='filter-options-item allow active']//div[@role='tabpanel']//li["+i+"]/a"));
				String subCatName = subCat.getText();
				DriverWait.until(ExpectedConditions.visibilityOf(subCat)).click();
				logger.info("**** "+subCatName+" option of new has been selected****");
				
				
				if(Mtp.check_txt_communicateOfAddedOption()==true) {
					
					logger.info("****Products have been sorted by "+subCatName+"****");
					Mtp.click_btn_clearOption();
					logger.info("****Clear button has been clicked****");
					Mtp.click_optionShopping_new();
					logger.info("****Clicked New tab in shopping options****");
					
				}else {
					logger.error("****Products have not been sorted by "+subCatName+" ****");
					logger.info("TC_213_ValidationOfOptionsInNew_TopsPage_M finished negative");
					Assert.fail("****Products have not been sorted  ****");
				}
			}
			
			logger.info("****Products have been sorted by each option in new****");
			logger.info("****TC_213_ValidationOfOptionsInNew_TopsPage_M finished positive****");
			Assert.assertTrue(true);
		}
			
			catch(Exception e) {
				logger.error("****An exception was thrown during test "+e.getMessage()+" ****");
				Assert.fail("****An exception was thrown during test "+e.getMessage()+" ****");
			}
	}
	
}
