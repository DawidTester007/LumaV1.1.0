package testCases;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.MenTopsPage;

public class TC_205_ValidationOfDropdownItemOptionByPrice_Tops_M extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void ValidationOfDropdownItemOptionByPrice_Tops_M() {
		
		
		try {
			MainMenuPage Mmp = new MainMenuPage(driver);
			logger.info("****Rozpoczęto TC_205_ValidationOfDropdownItemOptionByPrice_Tops_M****");
			Mmp.click_Men_Tops();
			logger.info("****Clicked a category Men ----> Tops****");
			MenTopsPage Mtp = new MenTopsPage(driver);
			Select select = new Select(Mtp.get_select_sorter());
			String expValue = "price";
			select.selectByValue(expValue);
			logger.info("**** Sorting option has been selected: sort by price ****");
			
			if(select.getFirstSelectedOption().getAttribute("value").equalsIgnoreCase(expValue)) {
				
				logger.info("****Products have been sorted by price****");
				logger.info("****TC_205_ValidationOfDropdownItemOptionByPrice_Tops_M finished positive****");
				Assert.assertTrue(true);
			}else {
				
				logger.error("****Products have not been sorted by price****");
				logger.info("****TC_205_ValidationOfDropdownItemOptionByPrice_Tops_M finished negative****");
				Assert.fail("****Products have not been sorted by price****");
				
			}
			

			}catch(Exception e) {
				
				logger.error("**** An exception was thrown during test:"+ e.getStackTrace()+" ****");
				Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
			}
	}
	
	
}
