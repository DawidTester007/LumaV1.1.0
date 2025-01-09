package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.LoginPage;
import pages.MainPage;
import utilities.DataProv;

public class TC_004_ValidationOfIncorrectLogin_TDD extends BaseTest {

	@Test (dataProvider = "DataLogin" , dataProviderClass = DataProv.class , groups ={"dataDriver","master"})
	public void ValidationOfIncorrectLogin_TDD(String email , String pwd , String res) {
		logger.info("**** Staritng TC_004_ValidationOfIncorrectLogin_TDD **** ");
		MainPage Mp = new MainPage(driver);
		try {
		Mp.click_btnZaloguj();
		logger.info("*** Clicked button 'login in'  **** ");
		LoginPage Lp = new LoginPage(driver);
		
		Lp.send_DataEmail(email);
		Lp.send_DataPwd(pwd);
		logger.info("*** Fields have been filled in **** ");
		Lp.click_btn_Zaloguj();
		logger.info("*** Clicked button 'login' **** ");
		
		if(res.equalsIgnoreCase("Invalid")) {
			
			if(Mp.check_msg_Witaj()==true) {
				logger.error("**** The data was incorrect, the user should not have been logged in ****");
				logger.info("**** TC_004_ValidationOfIncorrectLogin_TDD finished negative **** ");
				Assert.fail("**** The data was incorrect, the user should not have been logged in ****");
				
			}else if(Mp.check_msg_Witaj()==false) {
				logger.info("**** The user has not logged in **** ");
				logger.info("**** TC_004_ValidationOfIncorrectLogin_TDD finished positive **** ");
				Assert.assertTrue(true);
				
				
			}
			
			if(res.equalsIgnoreCase("Valid")) {
				
				
				if(Mp.check_msg_Witaj()==true) {
					logger.info("**** The user has logged in **** ");
					logger.error("**** TC_004_ValidationOfIncorrectLogin_TDD finished positive **** ");
					Assert.assertTrue(true);
					
				}
				
				else if(Mp.check_msg_Witaj()==false) {
					logger.info("**** The user has not logged in **** ");
					logger.error("**** TC_004_ValidationOfIncorrectLogin_TDD finished negative **** ");
					Assert.fail("**** The user has not logged in **** ");
					
				}
			
			}
			
		}
		
		
}catch(Exception e) {
			
			logger.error("****An exception was thrown during test:"+ e.getMessage()+" ****");
			Assert.fail("****An exception was thrown during test:"+ e.getMessage()+" ****");
			
		}
		
	}
	
}
