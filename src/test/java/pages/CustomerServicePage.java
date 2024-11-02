package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerServicePage extends PageBase{

	public CustomerServicePage(WebDriver driver){
		
		super(driver);
		
	}
	
	@FindBy(xpath="//span[@class='base']")
	WebElement txt_Name_Page;
	
	@FindBy(xpath = "//div[@class='customer-service cms-content']//p")
	List<WebElement> List_txt_Tag_p;
	
	@FindBy(xpath = "//div[@class='customer-service cms-content']//h2")
	List<WebElement> List_txt_Tag_h2;
	
	@FindBy(xpath = "//div[@class='customer-service cms-content']//h3")
	List<WebElement> List_txt_Tag_h3;
	
	@FindBy (xpath="//tr/th")
	List<WebElement> List_DataOfHeaderTab;
	
	@FindBy (xpath="//tr/td")
	List<WebElement> List_DataOfTab;
	
	public String get_txt_Name_Page () {
		

		return txt_Name_Page.getText();
		
	}
	
		public List<WebElement> get_List_txt_Tag_p(){
			
			return List_txt_Tag_p;
			
		}
		
		public List<WebElement> get_List_DataOfHeaderTab(){
				
			return List_DataOfHeaderTab;
				
		}
		
		public List<WebElement> get_List_DataOfTab(){
			
			return List_DataOfTab;
				
		}
		
	
	
	public List<WebElement> get_List_txt_Tag_h2(){
		
		return List_txt_Tag_h2;
		
	}
	
	
	
	public List<WebElement> get_List_txt_Tag_h3(){
		
		return List_txt_Tag_h3;
		
	}
}
