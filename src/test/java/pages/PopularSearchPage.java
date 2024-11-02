package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PopularSearchPage extends PageBase{

	public PopularSearchPage(WebDriver driver){
		
		super(driver);
		
	}
	
	@FindBy(xpath="//span[@class='base']")
	WebElement txt_Name_Page;
	
	@FindBy(xpath="//div[text()='Brak dostępnych fraz wyszukiwania.']")
	WebElement msg_lack_AccessWords;
	
	@FindBy(xpath="//input[@id='name']")
	WebElement input_NameProduct;
	
	@FindBy(xpath="//input[@id='sku']")
	WebElement input_codeProduct;
	
	@FindBy(xpath="//input[@id='description']")
	WebElement input_describtion;
	
	@FindBy(xpath="//input[@id='short_description']")
	WebElement input_SDescribtion;
	
	@FindBy(xpath="//input[@id='price']")
	WebElement input_minPrice;
	
	@FindBy(xpath="//input[@id='price_to']")
	WebElement input_maxPrice;
	
	@FindBy(xpath="//button[@class='action search primary']//span[contains(text(),'Szukaj')]")
	WebElement btn_Search;
	
	@FindBy(xpath="//div[@class='search found']")
	WebElement msg_Finded_xnumber_products;
	
	@FindBy(xpath="//div[@id='price-error']")
	WebElement msg_Invalid_minPrice;
	
	@FindBy(xpath="//div[@id='price_to-error']")
	WebElement msg_Invalid_maxPrice;
	
	@FindBy(xpath="//div[@class='message error']/div")
	WebElement msg_DidntFindProducts;
	
	@FindBy(xpath="//div[@role='alert']")
	WebElement msg_TryAgain;
	
	public boolean check_msg_TryAgain() {
		try {
		return msg_TryAgain.isDisplayed();
		}catch(Exception e) {
			
			return false;
		}
	}

	
	public boolean check_msg_DidntFindProducts() {
		try {
		return msg_DidntFindProducts.isDisplayed();
		}catch(Exception e) {
			
			return false;
		}
	}

	public boolean check_msg_Invalid_maxPrice() {
		try {
		return msg_Invalid_maxPrice.isDisplayed();
		}catch(Exception e) {
			
			return false;
		}
	}

	public boolean check_msg_Invalid_minPrice() {
	try {	
		return msg_Invalid_minPrice.isDisplayed();
	}catch(Exception e) {
		
		return false;
	}
	}
	
	public void set_NameProduct(String name) {
		
		input_NameProduct.sendKeys(name);
		
	}
	
	public void set_codeProduct(String code) {
		
		input_codeProduct.sendKeys(code);
		
	}
	
	public void set_describtion(String desc) {
		
		input_describtion.sendKeys(desc);
		
	}
	
	public void set_SDescribtion(String Sdesc) {
		
		input_SDescribtion.sendKeys(Sdesc);
		
	}
	
	public void set_minPrice(String minPrice) {
		
		input_minPrice.sendKeys(minPrice);
		
	}
	
	public void set_maxPrice(String maxPrice) {
		
		input_maxPrice.sendKeys(maxPrice);
		
	}
	
	public void click_btn_Search() {
		
		btn_Search.click();
		
	}
	
	public boolean check_msg_Finded_xnumber_products() {
		try {
		return msg_Finded_xnumber_products.isDisplayed();
		}catch(Exception e) {
			
			return false;
		}
	}
	
	//=============================================================================
	
	public String get_txt_Name_Page () {

		return txt_Name_Page.getText();
		
	}
	
	public String get_msg_lack_AccessWords() {
		return msg_lack_AccessWords.getText();
		
		
		
	}
	
}
