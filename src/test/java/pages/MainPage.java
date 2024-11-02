package pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends PageBase{
	
	  
	   JavascriptExecutor js;
	    public MainPage(WebDriver driver) {
	        
	        super(driver);
	       
	    }
	
	
	
	
	 
	@FindBy (xpath="/html[1]/body[1]/div[2]/header[1]/div[1]/div[1]/ul[1]/li[2]/div[1]/ul[1]/li[1]/a[1]")
	WebElement btn_mojeKonto;
	
	@FindBy(xpath="//a[@class='logo']/img")
	WebElement logo;
	
	@FindBy(xpath="//div[@class='panel header']//a[text()='Utwórz konto']")
	WebElement btn_Zarejestruj;
	
	@FindBy(xpath="//div[@class='panel header']//a[contains(text(),'Zaloguj się')]")
	WebElement btn_Zaloguj;

	@FindBy(xpath="//div[@class='panel header']//span[@class='logged-in'][normalize-space()='Witaj, Veronica Costello!']")
	WebElement msg_Witaj;
	
	@FindBy(xpath="//span[normalize-space()='Shop Tees']")
	WebElement txtLink_ShopTees;
	
	@FindBy(xpath="//span[normalize-space()='Shop Pants']")
	WebElement txtLink_ShopPants;
	
	@FindBy(xpath="//span[normalize-space()='Shop Erin Recommends']")
	WebElement txtLink_ShopErin;
	
	@FindBy(xpath="//span[normalize-space()='Shop Performance']")
	WebElement txtLink_ShopPerformance;
	
	@FindBy(xpath="//span[normalize-space()='Shop Eco-Friendly']")
	WebElement txtLink_EcoFriendly;
	
	@FindBy(xpath="//span[@class='action more button']")
	WebElement txt_Link_Yoga;
	
	@FindBy(xpath="//div[@class='content-heading']/h2")
	WebElement txt_HSellers;
	
	@FindBy(xpath="//div[@class='content-heading']/p")
	WebElement txt_Description_HSellers;
	
	@FindBy(xpath="//ol/li")
	List<WebElement> ListProductsOf_HSeller;
	
	@FindBy(xpath="//ol/li//a[@class='product-item-link']")
	List<WebElement> ListNameProductOf_HSeller;
	
	@FindBy(xpath="//ol/li//div[@class='swatch-attribute size']//div[@class='swatch-option text']")
	List<WebElement> ListSizeProductOf_HSeller;
	
	@FindBy(xpath="//div[@class='swatch-attribute color']//div[@class='swatch-option color']")
	List<WebElement> ListColorsProductOf_HSeller;
	
	
	@FindBy(xpath="//span[@class='price-container price-final_price tax weee']//span[@class='price']")
	List<WebElement> ListPricesProductOf_HSeller;
	
	@FindBy(xpath="//ol/li//img")
	List<WebElement> ListImgProductOf_HSeller;
	

	@FindBy(xpath="//span[text()='Dodaj do koszyka']")
	List<WebElement> ListBtnCartProductOf_HSeller;
	
	@FindBy(xpath="//div[@id='switcher-language-trigger']")
	WebElement btn_switcherLang;

	@FindBy(xpath="//div[@id='switcher-language']//li[@class='view-en switcher-option']/a")
	WebElement btn_switcherLang_En;
	
	@FindBy(xpath="//div[@id='switcher-language']//li//a")
	WebElement btn_switcherLang_PL;
	
	@FindBy(xpath="//div[@class='panel header']//a[contains(text(),'Sign In')]")
	WebElement btn_SignIn;
	
	public void click_btn_mojeKonto() {
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", btn_mojeKonto);
			
		}
	public String get_Txt_btn_SignIn() {
		
		return btn_SignIn.getText();
		
	}
	public String get_Txt_btn_Zaloguj() {
			
			return btn_Zaloguj.getText();
			
		}
	public void click_btn_switcherLang() {
		
		btn_switcherLang.click();
		
	}
	
	public void click_btn_switcherLang_En() {
		
		btn_switcherLang_En.click();
		
	}
	
	public void click_btn_switcherLang_PL() {
		
		btn_switcherLang_PL.click();
		
	}
	public boolean check_logo() {
		try {
		return logo.isDisplayed();
		}catch(Exception e) {
			
			return false;
		}
	}
	
	
	public void click_logo() {
		
		logo.click();
		
	}
	
	public void click_btnZaloguj() {
		
		btn_Zaloguj.click();
		
	}
	public void click_btnZarejestruj() {
			
		btn_Zarejestruj.click();
			
	}
	
	public void click_txtLink_Yoga() {
		
		txt_Link_Yoga.click();
			
	}

	public void click_txtLink_ShopTees() {
			
		txtLink_ShopTees.click();
			
	}
	
	
	public void click_txtLink_ShopPants() {
			
		txtLink_ShopPants.click();
			
	}
	
	
	public void click_txtLink_ShopErin() {
			
		txtLink_ShopErin.click();
			
	}
	
	
	public void click_txtLink_ShopPerformance() {
			
		txtLink_ShopPerformance.click();
			
	}
	
	
	public void click_txtLink_EcoFriendly() {
			
		txtLink_EcoFriendly.click();
			
	}
	
	public boolean check_msg_Witaj() {
		try {
		return msg_Witaj.isDisplayed();
		}catch(Exception e) {
			
			return false;
		}
	}
	
	public String text_HSeller() {
		
		return txt_HSellers.getText();
		
	
	}
	
	public String get_textDesc_HSeller() {
			
			return txt_Description_HSellers.getText();
			
		
		}
	
	public String get_titleMainPage() {
		
		return driver.getTitle();
		
	
	}
	
	public List<WebElement> ListOf_Products_HSellerList() {
		
		return ListProductsOf_HSeller;
		
	
	}
	
	public List<WebElement> List_NameProductOf_HSeller() {
		
		return ListNameProductOf_HSeller;
		
	
	}
	
	public List<WebElement> List_SizeProductOf_HSeller() {
		
		return ListSizeProductOf_HSeller;
		
	
	}
	
	public List<WebElement> List_ColorsProductOf_HSeller() {
		
		return ListColorsProductOf_HSeller;
		
	
	}
	
	public List<WebElement> List_PricesProductOf_HSeller() {
		
		return ListPricesProductOf_HSeller;
		
	
	}
	
	public List<WebElement> List_ImgProductOf_HSeller() {
		
		return ListImgProductOf_HSeller;
		
	
	}
	
	public List<WebElement> List_BtnCartProductOf_HSeller() {
			
			return ListBtnCartProductOf_HSeller;
			
		
		}
	
}
