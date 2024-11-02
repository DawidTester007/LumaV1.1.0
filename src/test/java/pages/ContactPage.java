package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage extends PageBase {

	public ContactPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//span[@class='base']")
	WebElement txt_Name_Page;
	
	@FindBy(xpath="//p[@class='cms-content-important']")
	WebElement txt_We_Love_Hearing;
	
	@FindBy(xpath="//span[@class='contact-info-number']")
	WebElement txt_number;
	
	@FindBy(xpath="//span[normalize-space()='Apparel Design Inquiries']")
	WebElement txt_DesignInquiries;
	
	@FindBy(xpath="//p[contains(text(),'Are you an independent clothing designer? Feature ')]")
	WebElement txt_DesignInquiries_Description;
	
	@FindBy(xpath="//p[contains(text(),'Call the Luma Helpline for concerns, product quest')]")
	WebElement txt_WeAreAvalaible24h7;
	
	@FindBy(xpath="//div/p[contains(text(),'Please direct all media')]")
	WebElement txt_ShowEmail;
	
	@FindBy(xpath="//span[normalize-space()='Press Inquiries']")
	WebElement txt_PressInquiries;
	
	@FindBy(xpath="//span[normalize-space()='Napisz do nas']")
	WebElement txt_WriteToUs;
	
	@FindBy(xpath="//div[@class='field note no-label']")
	WebElement txt_LeaveMsg;
	
	@FindBy(xpath="//input[@id='name']")
	WebElement input_name;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement input_email;
	
	@FindBy(xpath="//input[@id='telephone']")
	WebElement input_number;
	
	@FindBy(xpath="//textarea[@id='comment']")
	WebElement input_comment;
	
	@FindBy(xpath="//button/span[text()='Wyślij']")
	WebElement btn_Send;
	
	@FindBy(xpath = "//div[@id='name-error']")
	WebElement msg_nameError;
	
	@FindBy(xpath = "//div[@id='email-error']")
	WebElement msg_emailError;
	
	@FindBy(xpath = "//div[@id='comment-error']")
	WebElement msg_commentError;
	
	@FindBy(xpath = "//div[@role='alert']/div")
	WebElement msg_failedSend;
	
	public boolean check_msg_nameError() {
		try {
		return msg_nameError.isDisplayed();
		}catch(Exception e) {
			
			return false;
		} 
	}
	
	public boolean check_msg_emailError() {
		try {
		return msg_emailError.isDisplayed();
		}catch(Exception e) {
			
			return false;
		} 
	}
	
	public boolean check_msg_commentError() {
		try {
		return msg_commentError.isDisplayed();
		}catch(Exception e) {
			
			return false;
		} 
	}
	
	public boolean check_msg_failedSend() {
		try {
		return msg_failedSend.isDisplayed();
		}catch(Exception e) {
			
			return false;
		} 
	}
	
	
	public void click_btn_Send() {
		
		btn_Send.click();
	}
	
	
	public void set_input_name(String name) {
		
		input_name.sendKeys(name);
	
	}
	
	public void set_input_email(String email) {
		
		input_email.sendKeys(email);
	
	}
	
	public void set_input_number(String number) {
		
		input_number.sendKeys(number);
	
	}
	
	public void set_input_comment(String com) {
		
		input_comment.sendKeys(com);
	
	}
	
	public boolean check_txt_WriteToUs() {
		try {
		return txt_WriteToUs.isDisplayed();
		}catch(Exception e) {
			
			return false;
		}
	}
	
	public boolean check_txt_LeaveMsg() {
		try {
		return txt_LeaveMsg.isDisplayed();
		}catch(Exception e) {
			
			return false;
		}
	}
	

	
	public boolean check_txt_We_Love_Hearing() {
		try {
		return txt_We_Love_Hearing.isDisplayed();
		}catch(Exception e) {
			
			return false;
		}
	}
	
	public boolean check_txt_number() {
		try {
		return txt_number.isDisplayed();
		}catch(Exception e) {
			
			return false;
		}
	}
	
	public boolean check_txt_DesignInquiries() {
		try {
		return txt_DesignInquiries.isDisplayed();
		}catch(Exception e) {
			
			return false;
		}
	}
	
	public boolean check_txt_DesignInquiries_Description() {
		try {
		return txt_DesignInquiries_Description.isDisplayed();
		}catch(Exception e) {
			
			return false;
		}
	}
	
	public boolean check_txt_WeAreAvalaible24h7() {
		try {
		return txt_WeAreAvalaible24h7.isDisplayed();
		}catch(Exception e) {
			
			return false;
		}
	}
	
	public boolean check_txt_ShowEmail() {
		try {
		return txt_ShowEmail.isDisplayed();
		}catch(Exception e) {
			
			return false;
		}
	}
	
	public boolean check_txt_PressInquiries() {
		try {
		return txt_PressInquiries.isDisplayed();
		}catch(Exception e) {
			
			return false;
		}
	}
	
	public String get_txt_Name_Page () {
		

		return txt_Name_Page.getText();
		
	}
	
	public WebElement get_Name_Page () {
			
	
			return txt_Name_Page;
			
		}
}
