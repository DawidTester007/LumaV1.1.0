package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.MainMenuPage;
import pages.MenTopsPage;

public class TC_201_ValidationOptionOfShoppingTextDisplay_Tops_M extends BaseTest{
	@Test(groups = {"functional","master"})
	public void ValidationOptionOfShoppingTextDisplay_Tops_M() {
		try {
		MainMenuPage Mmp = new MainMenuPage(driver);
		logger.info("****Starting TC_201_ValidationOptionOfShoppingTextDisplay_Tops_M****");
		Mmp.click_Men_Tops();
		logger.info("****Clicked a category Men ----> Tops****");
		MenTopsPage Mtp = new MenTopsPage(driver);
		String expTxt = "Opcje zakupów";
		if(Mtp.get_txt_OptionOfShopping().equalsIgnoreCase(expTxt)) {
			
			logger.info("****Text : "+expTxt+" has been displayed****");
			logger.info("****TC_201_ValidationOptionOfShoppingTextDisplay_Tops_M finished positive****");
			Assert.assertTrue(true);
		}else {
			logger.error("****Text : "+expTxt+" has not been displayed****");
			logger.info("****TC_201_ValidationOptionOfShoppingTextDisplay_Tops_M finished negative****");
			Assert.fail("****Text : "+expTxt+" has not been displayed****");
			
		}
		}catch(Exception e) {
			
			logger.error("**** An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
		
		}
	}
	
}
