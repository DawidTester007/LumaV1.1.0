package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdvanceSearchPage extends PageBase{
	public AdvanceSearchPage(WebDriver driver){
		
		super(driver);
		
	}
	
	@FindBy(xpath="//span[@class='base']")
	WebElement txt_Name_Page;
	
	public String get_txt_Name_Page () {
		

		return txt_Name_Page.getText();
		
	}
}
