package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//input[@id='email']")
	WebElement sBox_email;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement sBox_pwd;

	@FindBy(xpath="//fieldset[@class='fieldset login']//span[contains(text(),'Zaloguj się')]")
	WebElement btn_Zaloguj;
	
	@FindBy(xpath="//div[@role='alert'][1]")
	WebElement com_youHaveToLoginIn;
	
	public boolean isDisplayed_com_youHaveToLoginIn() {
		try {
		return com_youHaveToLoginIn.isDisplayed();
		}catch(Exception e) {
			
			return false;
		}
	}
	
	public void send_DataEmail(String email) {
		
		sBox_email.sendKeys(email);
		
	}
	
	public void send_DataPwd(String password) {
			
		sBox_pwd.sendKeys(password);
			
		}
	
	public void click_btn_Zaloguj() {
		
		btn_Zaloguj.click();
		
	}
	



}
