package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenTopsPage extends PageBase {
	JavascriptExecutor js;
	WebDriverWait wait;

	public MenTopsPage(WebDriver driver) {
		super(driver);
		
		
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//span[@class='base']")
	WebElement txt_Name_Category;
	
	@FindBy(xpath="//strong[text()='Opcje zakupów']")
	WebElement txt_OptionOfShopping;
	
	@FindBy(xpath="//p[@id='toolbar-amount']")
	WebElement txt_counterOfProducts;
	
	@FindBy(xpath="//select[@class='sorter-options']")
	WebElement select_sorter;
	
	@FindBy(xpath="//div[text()='Kategoria']")
	WebElement optionShopping_category;
	
	@FindBy(xpath="//div[text()='Style']")
	WebElement optionShopping_style;
	
	@FindBy(xpath="//div[text()='Rozmiar']")
	WebElement optionShopping_size;
	
	@FindBy(xpath="//div[text()='Cena']")
	WebElement optionShopping_price;
	
	@FindBy(xpath="//div[text()='Color']")
	WebElement optionShopping_color;
	
	@FindBy(xpath="//div[text()='Material']")
	WebElement optionShopping_material;
	
	@FindBy(xpath="//div[text()='Eco Collection']")
	WebElement optionShopping_ecoCollection;
	
	@FindBy(xpath="//div[text()='Performance Fabric']")
	WebElement optionShopping_PFabric;
	
	@FindBy(xpath="//div[text()='Erin Recommends']")
	WebElement optionShopping_RecErin;
	
	@FindBy(xpath="//div[text()='Nowy']")
	WebElement optionShopping_new;
	
	@FindBy(xpath="//div[text()='Sprzedaż']")
	WebElement optionShopping_sale;
	
	@FindBy(xpath="//div[text()='Pattern']")
	WebElement optionShopping_pattern;
	
	@FindBy(xpath="//div[text()='Climate']")
	WebElement optionShopping_climate;
	
	@FindBy(xpath="//div[@class='filter-options-item allow active']//div[@role='tabpanel']//li/a")
	List<WebElement> ListOfOptions_categories;
	
	@FindBy(xpath="//div[@class='swatch-option text ']")
	List<WebElement> ListOfOptions_size;
	
	@FindBy(xpath="//div[@class='swatch-option color ']")
	List<WebElement> ListOfOptions_color;

	@FindBy(xpath="//ol[@class='items']/li/span[@class='filter-label']")
	WebElement txt_communicateOfAddedOption;
	
	@FindBy(xpath="//span[text()='Wyczyść wszystko']")
	WebElement btn_clearOption;
	
	public void click_btn_clearOption() {
		
		btn_clearOption.click();
	}
	
	public boolean check_txt_communicateOfAddedOption() {
		try {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOf(txt_communicateOfAddedOption)).isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	
	public List<WebElement> get_ListOfOptions_categories(){
		
		return ListOfOptions_categories;
	}
	
	public List<WebElement> get_ListOfOptions_size(){
			
			return ListOfOptions_size;
		}
	
	public List<WebElement> get_ListOfOptions_color(){
		
		return ListOfOptions_color;
	}

	public void click_optionShopping_category() {
		
		js.executeScript("arguments[0].click()", optionShopping_category);
	}
	
	public void click_optionShopping_style() throws InterruptedException {
		
		optionShopping_style.click();
		}
	
	public void click_optionShopping_size() {
		
		optionShopping_size.click();
	}
	
	public void click_optionShopping_price() {
		
		optionShopping_price.click();
	}
	
	public void click_optionShopping_color() {
		
		optionShopping_color.click();
	}
	
	public void click_optionShopping_material() {
		
		optionShopping_material.click();
	}
	
	public void click_optionShopping_ecoCollection() {
		
		optionShopping_ecoCollection.click();
	}
	
	public void click_optionShopping_PFabric() {
		
		optionShopping_PFabric.click();
	}
	
	public void click_optionShopping_RecErin() {
		
		optionShopping_RecErin.click();
	}
	
	public void click_optionShopping_new() {
		
		optionShopping_new.click();
	}
	
	public void click_optionShopping_sale() {
		
		optionShopping_sale.click();
	}
	
	public void click_optionShopping_pattern() {
		
		optionShopping_pattern.click();
	}
	
	public void click_optionShopping_climate() {
		
		optionShopping_climate.click();
	}
	
	public WebElement get_select_sorter() {
		try {
		return select_sorter;
		}catch(Exception e) {
			
			return null;
		}
	}
	
	
	public boolean check_txt_counterOfProducts() {
		try {
		return txt_counterOfProducts.isDisplayed();
		}catch(Exception e) {
			
			return false;
		}
	}
	
	public String get_txt_OptionOfShopping() {
		
		return txt_OptionOfShopping.getText();
	}
	
	
	public String get_txt_Name_Category () {
		
		txt_Name_Category.getText();
		
		return txt_Name_Category.getText();
		
	}
	
}
