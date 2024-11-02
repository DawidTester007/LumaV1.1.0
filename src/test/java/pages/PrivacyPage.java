package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PrivacyPage extends PageBase{

	public PrivacyPage(WebDriver driver){
		
		super(driver);
		
	}
	
	@FindBy(xpath="//span[@class='base']")
	WebElement txt_Name_Page;
	
	@FindBy(xpath="//div[@class='privacy-policy-content']//h2")
	List<WebElement> List_txth2;
	

	@FindBy(xpath="//div[@class='privacy-policy-content']//p")
	List<WebElement> List_txtp;
	
	@FindBy(xpath="//table//th")
	List<WebElement> List_TableHeaders;
	
	@FindBy(xpath="//table//td")
	List<WebElement> List_TableData;
	
	
	@FindBy(xpath="//a[text()='Contact Us']")
	WebElement link_ContactUs;
	
	public void click_link_ContactUs(){
		
		link_ContactUs.click();

	}
	
	public String get_txt_Name_Page () {
		

		return txt_Name_Page.getText();
		
	}
	
	public List<WebElement> get_List_TableData(){
		
		return List_TableData;

	}
	
	public List<WebElement> get_List_txth2(){
		
		return List_txth2;

	}
	
	public List<WebElement> get_List_TableHeaders(){
		
		return List_TableHeaders;

	}
	
	public List<WebElement> List_txtp(){
		
		return List_txtp;

	}
	

	
}
