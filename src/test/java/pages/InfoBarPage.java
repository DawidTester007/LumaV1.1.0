package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InfoBarPage extends PageBase {

	
	
	public InfoBarPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		
	}

	
	@FindBy(xpath = "//p[@class='info-bar']")
	WebElement InfoBar;
	
	@FindBy(xpath = " //p[@class='info-bar']/a")
	WebElement link_AdminPanel;
	
	public String get_currentUrl() {
		return driver.getCurrentUrl();
	
	}
	
	public boolean check_InfoBar() {
		try {
		return InfoBar.isDisplayed();
		}catch(Exception e) {
			
			return false;
		}
	} 
	
	public String get_txt_InfoBar() {
		
		return InfoBar.getText();
		
	}
	
	public boolean check_link_AdminPanel() {
			try {
			return link_AdminPanel.isDisplayed();
		}catch(Exception e) {
			
			return false;
		}
		}
	
	public String get_txt_link_AdminPanel() {
			
			return link_AdminPanel.getText();
			
		}
	
	public void click_link_AdminPanel() {
		
		link_AdminPanel.click();
	}
	
}
