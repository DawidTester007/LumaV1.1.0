package pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutUsPage extends PageBase{
	
	
	
	public AboutUsPage(WebDriver driver){
		
		super(driver);
		
	}
	
	@FindBy(xpath="//span[@class='base']")
	WebElement txt_Name_Page;
	
	@FindBy(xpath = "//div[@class='about-info cms-content']/p")
	List<WebElement> List_txt_AboutUs;
	
	@FindBy(xpath = "//div[@class='about-info cms-content']/ul/li[1]/a")
	WebElement link_contact;
	
	@FindBy(xpath = "//div[@class='about-info cms-content']/ul/li[2]/a")
	WebElement link_service;
	
	@FindBy(xpath = "//div[@class='about-info cms-content']/ul/li[3]/a")
	WebElement link_privacy;
	
	@FindBy(xpath = "//div[@class='about-info cms-content']/ul/li[4]/a")
	WebElement link_lumaMainPage;
	
	public String get_txt_Name_Page () {
		

		return txt_Name_Page.getText();
		
	}
	
	public List<WebElement> List_TextsAboutUs(){
		
		
		return List_txt_AboutUs;
		
	}
	
	public void click_contactLink_AboutUs() {
		
		link_contact.click();
		
	}
	
	public void click_serviceLink_AboutUs() {
			
			
		link_service.click();
		}
	
	public void click_privacyLink_AboutUs() {
		
		
		link_privacy.click();
	}
	
	public void click_lumaMainPageLink_AboutUs() {
		
		link_lumaMainPage.click();
	}

	
	public String gettxt_contactLink_AboutUs() {
		
		
		return link_contact.getText();
	}
	
	public String gettxt_serviceLink_AboutUs() {
			
			
			return link_service.getText();
		}
	
	public String gettxt_privacyLink_AboutUs() {
		
		
		return link_privacy.getText();
	}
	
	public String gettxt_lumaMainPageLink_AboutUs() {
		
	
		return link_lumaMainPage.getText();
	}
	
	
}
