package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FooterPage extends PageBase {

	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	public FooterPage(WebDriver driver) {
		
		super(driver);
		
		
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(xpath = "//a[normalize-space()='About us']")
	WebElement linkTxt_aboutUs;
	@FindBy(xpath = "//a[contains(text(),'Polityka prywatności i pliki cookie')]")
	WebElement linkTxt_privacy;
	@FindBy(xpath = "//a[normalize-space()='Wyszukiwane frazy']")
	WebElement linkTxt_mostSearchItem;
	@FindBy(xpath = "//li[@class='nav item']//a[contains(text(),'Wyszukiwanie zaawansowane')]")
	WebElement linkTxt_advancedSearch;
	@FindBy(xpath = "//a[normalize-space()='Zamówienia i zwroty']")
	WebElement linkTxt_refund;
	@FindBy(xpath = "//a[contains(text(),'Skontaktuj się z nami')]")
	WebElement linkTxt_contact;
	@FindBy(xpath = "//li[@class='nav item']//a[contains(text(),'Customer Service')]")
	WebElement linkTxt_service;
	@FindBy(xpath = "//input[@name='email']")
	WebElement input_mail;
	@FindBy(xpath = "//span[text()='Subskrybuj']")
	WebElement btn_subscribe;
	@FindBy(xpath="//div[@id='newsletter-error']")
	WebElement msg_reqField;
	@FindBy(xpath="//div[text()='Dziękujemy za twoją subskrypcję']")
	WebElement msg_succesfulSub;
	@FindBy(xpath="//div[text()='Prosimy wpisać poprawny adres e-mail']")
	WebElement msg_tryAgain;
	
	public boolean check_msg_tryAgain() {
		try {
		return  wait.until(ExpectedConditions.visibilityOf(msg_tryAgain)).isDisplayed();
		
		}catch(Exception e) {
		
		return false;
		}
		
	}
	
	
	public boolean check_msg_reqField() {
		try {
		return  wait.until(ExpectedConditions.visibilityOf(msg_reqField)).isDisplayed();
		
		}catch(Exception e) {
		
		return false;
		}
		
	}
	
	public boolean check_msg_succesfulSub() {
		try {
			boolean succesfulSub = wait.until(ExpectedConditions.visibilityOf(msg_succesfulSub)).isDisplayed();
			
		return succesfulSub;
		
		}catch(Exception e) {
		
		return false;
		}
		
	}
	
	public void send_input_mail(String email) {
		
		input_mail.sendKeys(email);
	}
	
	public void click_btn_subscribe() {
		
		
		
		wait.until(ExpectedConditions.elementToBeClickable(btn_subscribe));
		btn_subscribe.click();
	}
	
	public boolean check_linkTxt_aboutUs() {
		try {
		return linkTxt_aboutUs.isDisplayed();
		
		}catch(Exception e) {
		
		return false;
		}
		
	}
	
	public boolean check_linkTxt_privacy() {
		try {
		return linkTxt_privacy.isDisplayed();
		
		}catch(Exception e) {
		
		return false;
		}
		
	}
	
	public boolean check_linkTxt_PopularSearchItem() {
		try {
		return linkTxt_mostSearchItem.isDisplayed();
		
		}catch(Exception e) {
		
		return false;
		}
		
	}
	
	public boolean checklinkTxt_advancedSearch() {
		try {
		return linkTxt_advancedSearch.isDisplayed();
		
		}catch(Exception e) {
		
		return false;
		}
		
	}
	
	public boolean check_linkTxt_refund() {
		try {
		return linkTxt_refund.isDisplayed();
		
		}catch(Exception e) {
		
		return false;
		}
		
	}
	
	
	public boolean check_linkTxt_contact() {
		try {
		return linkTxt_contact.isDisplayed();
		
		}catch(Exception e) {
		
		return false;
		}
		
	}
	
	public boolean check_linkTxt_service() {
		try {
		return linkTxt_service.isDisplayed();
		
		}catch(Exception e) {
		
		return false;
		}
		
	}
	
	
	public void click_linkTxt_aboutUs() {
		
		linkTxt_aboutUs.click();
		
	}
	
	public void click_linkTxt_privacy() {
			
		linkTxt_privacy.click();
			
		}
	
	public void click_linkTxt_PopularSearchItem() {
		
		linkTxt_mostSearchItem.click();
		
	}
	
	public void click_linkTxt_advancedSearch() {
		
		linkTxt_advancedSearch.click();
		
	}
	
	public void click_linkTxt_refund() {
		
		linkTxt_refund.click();
		
	}
	
	public void click_linkTxt_contact() {
		
		linkTxt_contact.click();
		
	}
	
	public void click_linkTxt_service() {
		
		linkTxt_service.click();
		
	}
	
	public String gettxt_linkTxt_aboutUs() {
			
		
		return linkTxt_aboutUs.getText();
			
		}
	
public String gettxt_linkTxt_privacy() {
			
		
		return linkTxt_privacy.getText();
			
		}

public String gettxt_linkTxt_service() {
	
	
	return linkTxt_service.getText();
		
	}

public String gettxt_linkTxt_PopularSearchItem() {
	
	
	return linkTxt_mostSearchItem.getText();
		
	}

public String gettxt_linkTxt_refund() {
	
	
	return linkTxt_refund.getText();
		
	}

public String gettxt_linkTxt_advancedSearch() {
	
	
	return linkTxt_advancedSearch.getText();
		
	}

public String gettxt_linkTxt_contact() {
	
	
	return linkTxt_contact.getText();
		
	}
}
