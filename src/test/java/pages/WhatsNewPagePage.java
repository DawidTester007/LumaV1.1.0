package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WhatsNewPagePage extends PageBase {

	
	
	public WhatsNewPagePage(WebDriver driver){
		
		super(driver);
		
	}
	
	@FindBy(xpath="//span[@class='base']")
	WebElement namePage;
	
	@FindBy(xpath="//main[@id='maincontent']//strong[1]//span[1]")
	WebElement txt_NewsWomen;
	
	@FindBy(xpath="//main[@id='maincontent']//ul[1]//li[1]//a[1]")
	WebElement cat_Women_HoodiesAndSweatshirts;
	
	@FindBy(xpath="//main[@id='maincontent']//ul[1]//li[2]//a[1]")
	WebElement cat_Women_Jacket;
	
	@FindBy(xpath="//main[@id='maincontent']//ul[1]//li[3]//a[1]")
	WebElement cat_Women_Tees;
	
	@FindBy(xpath="//main[@id='maincontent']//ul[1]//li[4]//a[1]")
	WebElement cat_Women_BrasAndTanks;
	
	@FindBy(xpath="//main[@id='maincontent']//ul[1]//li[5]//a[1]")
	WebElement cat_Women_Pants;
	
	@FindBy(xpath="//main[@id='maincontent']//ul[1]//li[6]//a[1]")
	WebElement cat_Women_Shorts;

	@FindBy(xpath="//strong[2]//span[1]")
	WebElement txt_NewsMen;

	@FindBy(xpath="//main[@id='maincontent']//ul[2]//li[1]//a[1]")
	WebElement cat_Men_HoodiesAndSweatshirts;
	
	@FindBy(xpath="//main[@id='maincontent']//ul[2]//li[2]//a[1]")
	WebElement cat_Men_Jacket;
	
	@FindBy(xpath="//main[@id='maincontent']//ul[2]//li[3]//a[1]")
	WebElement cat_Men_Tees;
	
	@FindBy(xpath="//main[@id='maincontent']//ul[2]//li[4]//a[1]")
	WebElement cat_Men_Tanks;
	
	@FindBy(xpath="//main[@id='maincontent']//ul[2]//li[5]//a[1]")
	WebElement cat_Men_Pants;
	
	@FindBy(xpath="//main[@id='maincontent']//ul[2]//li[6]//a[1]")
	WebElement cat_Men_Shorts;
	public boolean check_NamePage() {
		try {
			
		return namePage.isDisplayed();
		
		}catch(Exception e) {
			
			return false;
		}
	}
	
	public boolean check_txt_NewsWomen() {
		try {
			
		return txt_NewsWomen.isDisplayed();
		
		}catch(Exception e) {
			
			return false;
		}

	}
	
	public boolean check_txt_Men() {
		try {
			
		return txt_NewsMen.isDisplayed();
		
		}catch(Exception e) {
			
			return false;
		}

	}
	
	public void click_cat_Women_HoodiesAndSweatshirts() {
		
		cat_Women_HoodiesAndSweatshirts.click();
		
	}
	
	public void click_cat_Women_Jacket() {
			
		cat_Women_Jacket.click();
			
	}
	
	public void click_cat_Women_Tees() {
		
		cat_Women_Tees.click();
			
	}
	
	public void click_cat_Women_BrasAndTanks() {
		
		cat_Women_BrasAndTanks.click();
			
	}
	
	public void click_cat_Women_Pants() {
		
		cat_Women_Pants.click();
			
	}
	
	public void click_cat_Women_Shorts() {
		
		cat_Women_Shorts.click();
			
	}
	
	public void click_cat_Men_HoodiesAndSweatshirts() {
		
		cat_Men_HoodiesAndSweatshirts.click();
			
	}
	
	public void click_cat_Men_Jacket() {
		
		cat_Men_Jacket.click();
			
	}
	
	public void click_cat_Men_Tees() {
		
		cat_Men_Tees.click();
			
	}
	public void click_cat_Men_Tanks() {
		
		cat_Men_Tanks.click();
			
	}
	
	public void click_cat_Men_Pants() {
			
		cat_Men_Pants.click();
				
		}
	
	public void click_cat_Men_Shorts() {
		
		cat_Men_Shorts.click();
			
	}
	
}
