package testCases;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.MenTopsPage;

public class TC_203_ValidationOfDropdownItemOptionByPosition_Tops_M extends BaseTest{
	@Test(groups = {"functional","regression","master"})
	public void ValidationOfDropdownItemOptionByPosition_Tops_M() {
		try {
		MainMenuPage Mmp = new MainMenuPage(driver);
		logger.info("****Starting TC_203_ValidationOfDropdownItemOptionByPosition_Tops_M****");
		Mmp.click_Men_Tops();
		logger.info("****Clicked a category Men ----> Tops****");
		MenTopsPage Mtp = new MenTopsPage(driver);
		Select select = new Select(Mtp.get_select_sorter());
		String currTxt = select.getFirstSelectedOption().getText();
		
		if(currTxt.contains("Pozycja")) {
			
			logger.info("****Products have been sorted by position****");
			logger.info("****TC_203_ValidationOfDropdownItemOptionByPosition_Tops_M finished positive****");
			Assert.assertTrue(true);
			
		}else {
			
			logger.error("****Products have not been sorted by position****");
			logger.info("****TC_203_ValidationOfDropdownItemOptionByPosition_Tops_M finished negative****");
			Assert.fail("****Products have not been sorted by position****");
		}
	
		

		}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getStackTrace()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
		}
	}
	
}
