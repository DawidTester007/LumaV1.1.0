package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends PageBase {

	
	
	public RegistrationPage(WebDriver driver){
		
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@id='firstname']")
	WebElement sBox_firstname;
	
	@FindBy(xpath="//input[@id='lastname']")
	WebElement sBox_lastname;
	
	@FindBy(xpath="//input[@id='email_address']")
	WebElement sBox_email_address;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement sBox_password;
	
	@FindBy(xpath="//input[@id='password-confirmation']")
	WebElement sBox_Confpassword;
	
	@FindBy(xpath="//button[@id='send2']//span[contains(text(),'Utwórz konto')]")
	WebElement btn_createAcc;
	
	@FindBy(xpath="//div[contains(@class,'firstname')]//div[contains(@id,'error')]")
	WebElement msg_firstnameError;
	
	@FindBy(xpath="//div[contains(@class,'lastname')]//div[contains(@id,'error')]")
	WebElement msg_lastnameError;
	
	@FindBy(xpath="//div[contains(@class,'field required')]//div[contains(@id,'error')]")
	WebElement msg_emailError;
	
	@FindBy(xpath="//div[contains(@class,'field password required')]//div[contains(@id,'error')]")
	WebElement msg_pwdError;
	
	@FindBy(xpath="//div[contains(@class,'field confirmation required')]//div[contains(@id,'error')]")
	WebElement msg_confPwdError;
	
	public void send_firstname(String name) {
		
		sBox_firstname.sendKeys(name);
	}


	public void send_lastname(String lastname) {
		
		sBox_lastname.sendKeys(lastname);
	}

	public void send_email(String email) {
		
		sBox_email_address.sendKeys(email);
	}

	public void send_password(String password) {
		
		sBox_password.sendKeys(password);
	}

	public void send_Confpassword(String confpwd) {
		
		sBox_Confpassword.sendKeys(confpwd);
	}

	public void click_createAcc() {
		
		btn_createAcc.click();
	}
	
	public boolean check_errorName() {
		
		try {
		return msg_firstnameError.isDisplayed();
		}
		catch(Exception e) {
			
			return false;
		}
	}
	
	public boolean check_errorLastName() {
			
			
		try {
			return msg_lastnameError.isDisplayed();
			}
			catch(Exception e) {
				
				return false;
			}
		
		}
	
	public boolean check_errorEmail() {
		
		
		try {
			return msg_emailError.isDisplayed();
			}
			catch(Exception e) {
				
				return false;
			}
	
	}
	
	public boolean check_errorPwd() {
		
		
		try {
			return msg_pwdError.isDisplayed();
			}
			catch(Exception e) {
				
				return false;
			}
	
	}
	
	public boolean check_errorCondPwd() {
		
		
		try {
			return msg_confPwdError.isDisplayed();
			}
			catch(Exception e) {
				
				return false;
			}
	
	}
}
