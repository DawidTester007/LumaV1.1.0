package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Women_TeesPage extends PageBase {

	public Women_TeesPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//span[@class='base']")
	WebElement txt_Name_Category;
	
	public String get_txt_Name_Category () {
		
		txt_Name_Category.getText();
		
		return txt_Name_Category.getText();
		
	}
}
