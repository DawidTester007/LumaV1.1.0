package testCases;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.MenTopsPage;

public class TC_204_ValidationOfDropdownItemOptionByName_Tops_M extends BaseTest {
	@Test(groups = {"functional","regression","master"})
	public void ValidationOfDropdownItemOptionByName_Tops_M() {
		
		
		try {
			MainMenuPage Mmp = new MainMenuPage(driver);
			logger.info("****Starting TC_204_ValidationOfDropdownItemOptionByName_Tops_M****");
			Mmp.click_Men_Tops();
			logger.info("****clicked a category Men ----> Tops****");
			MenTopsPage Mtp = new MenTopsPage(driver);
			Select select = new Select(Mtp.get_select_sorter());
			String expValue = "name";
			select.selectByValue(expValue);
			logger.info("**** Sorting option has been selected: sort by name ****");
			
			if(select.getFirstSelectedOption().getAttribute("value").equalsIgnoreCase(expValue)) {
				
				logger.info("****Products have been sorted by name****");
				logger.info("****TC_204_ValidationOfDropdownItemOptionByName_Tops_M finished positive****");
				Assert.assertTrue(true);
			}else {
				
				logger.error("****Products have not been sorted by name****");
				logger.info("****TC_204_ValidationOfDropdownItemOptionByName_Tops_M finished negative****");
				Assert.fail("****Products have not been sorted by name****");
				
			}
			

			}catch(Exception e) {
				
				logger.error("**** An exception was thrown during test:"+ e.getStackTrace()+" ****");
				Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
			}
	}
	
	
}
