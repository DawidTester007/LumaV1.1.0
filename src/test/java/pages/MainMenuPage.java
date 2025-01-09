package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.interactions.Actions;
public class MainMenuPage extends PageBase {

	Actions act;
	
	public MainMenuPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	@FindBy(xpath="//li[@class='level0 nav-1 category-item first level-top ui-menu-item']//span[1]")
	WebElement cat_WhatsNew;
	
	@FindBy(xpath="//a[@id='ui-id-3']")
	WebElement cat_Women;
	
	@FindBy(xpath="//span[normalize-space()='Men']")
	WebElement cat_Men;
	
	@FindBy(xpath="//span[normalize-space()='Gear']")
	WebElement cat_Gear;
	
	@FindBy(xpath="//span[normalize-space()='Training']")
	WebElement cat_Training;

	@FindBy(xpath="//span[normalize-space()='Sale']")
	WebElement cat_Sale;
	
	//-----------------------------------------------------------------------------
	
	@FindBy(xpath="//a[@id='ui-id-4']//span")
	WebElement subCat_Women_Tops;
	
	@FindBy(xpath="//a[@id='ui-id-9']//span[contains(text(),'Bottoms')]")
	WebElement subCat_Women_Bottom;
	
	@FindBy(xpath="//a[@id='ui-id-13']")
	WebElement subCat_Men_Tops;

	@FindBy(xpath="//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]")
	WebElement subCat_Men_Bottom;
	
	//-----------------------------------------------------------------------------
	
	@FindBy(xpath="//a[@id='ui-id-5']//span[contains(text(),'Jackets')]")
	WebElement subCat_Women_Jacket;
	
	@FindBy(xpath="//a[@id='ui-id-6']//span[contains(text(),'Hoodies & Sweatshirts')]")
	WebElement subCat_Women_Hoodies;
	
	@FindBy(xpath="//a[@id='ui-id-7']//span[contains(text(),'Tees')]")
	WebElement subCat_Women_Tees;
	
	@FindBy(xpath="//span[normalize-space()='Bras & Tanks']")
	WebElement subCat_Women_BrasAndTanks;
	
	@FindBy(xpath="//a[@id='ui-id-10']//span[contains(text(),'Pants')]")
	WebElement subCat_Women_Pants;
	
	@FindBy(xpath="//a[@id='ui-id-11']//span[contains(text(),'Shorts')]")
	WebElement subCat_Women_Shorts;
	
	//------------------------------------------------------------------------
	

	
	@FindBy(xpath="//a[@id='ui-id-14']//span[contains(text(),'Jackets')]")
	WebElement subCat_Men_Jacket;
	
	@FindBy(xpath="//a[@id='ui-id-15']//span[contains(text(),'Hoodies & Sweatshirts')]")
	WebElement subCat_Men_Hoodies;
	
	@FindBy(xpath="//a[@id='ui-id-16']//span[contains(text(),'Tees')]")
	WebElement subCat_Men_Tees;
	
	@FindBy(xpath="//span[normalize-space()='Tanks']")
	WebElement subCat_Men_Tanks;
	
	@FindBy(xpath="//a[@id='ui-id-19']//span[contains(text(),'Pants')]")
	WebElement subCat_Men_Pants;
	
	@FindBy(xpath="//a[@id='ui-id-20']//span[contains(text(),'Shorts')]")
	WebElement subCat_Men_Shorts;
	
	
	//---------------------------------------------------------------------------
	
	@FindBy(xpath="//span[normalize-space()='Bags']")
	WebElement subCat_Gear_Bags;

	@FindBy(xpath="//span[normalize-space()='Fitness Equipment']")
	WebElement subCat_Gear_FitnessEquipment;
	
	@FindBy(xpath="//span[normalize-space()='Watches']")
	WebElement subCat_Gear_Watches;
	
	@FindBy(xpath="//span[normalize-space()='Video Download']")
	WebElement subCat_Training_Video;
	
	
	public void click_WhatsNew() {
		
		cat_WhatsNew.click();
		
	}
	
	public void click_Women() {
		
		cat_Women.click();
		
	}
	
	public void click_Men() {
			
		cat_Men.click();
			
		}
	
	public void click_Gear() {
			
		cat_Gear.click();
			
		}
	
	public void click_Training() {
		
		cat_Training.click();
		
	}

	public void click_Sale() {
		
		cat_Sale.click();
		
	}
	
	public void click_Women_Tops() {

		//act = new Actions(this.driver);
		//act.moveToElement(cat_Women);
		//subCat_Women_Tops.click();
		
		JavascriptExecutor js = (JavascriptExecutor) this.driver;
		js.executeScript("arguments[0].click()", subCat_Women_Tops);
		
	}
	
	public void click_Women_Bottom() {

		//act = new Actions(this.driver);
		//act.moveToElement(cat_Women);
		//subCat_Women_Tops.click();
		
		JavascriptExecutor js = (JavascriptExecutor) this.driver;
		js.executeScript("arguments[0].click()", subCat_Women_Bottom);
		
	}
	
	public void click_Women_Jacket() {

		//act = new Actions(this.driver);
		//act.moveToElement(cat_Women);
		//subCat_Women_Tops.click();
		
		JavascriptExecutor js = (JavascriptExecutor) this.driver;
		js.executeScript("arguments[0].click()", subCat_Women_Jacket);
		
	}
	
	public void click_Women_HoodiesAndSweatshirts() {

		//act = new Actions(this.driver);
		//act.moveToElement(cat_Women);
		//subCat_Women_Tops.click();
		
		JavascriptExecutor js = (JavascriptExecutor) this.driver;
		js.executeScript("arguments[0].click()", subCat_Women_Hoodies);
		
	}
	
	public void click_Women_Tees() {

		//act = new Actions(this.driver);
		//act.moveToElement(cat_Women);
		//subCat_Women_Tops.click();
		
		JavascriptExecutor js = (JavascriptExecutor) this.driver;
		js.executeScript("arguments[0].click()", subCat_Women_Tees);
		
	}

	public void click_Women_BrasAndTanks() {

		//act = new Actions(this.driver);
		//act.moveToElement(cat_Women);
		//subCat_Women_Tops.click();
		
		JavascriptExecutor js = (JavascriptExecutor) this.driver;
		js.executeScript("arguments[0].click()", subCat_Women_BrasAndTanks);
		
	}
	
	public void click_Women_Pants() {

		//act = new Actions(this.driver);
		//act.moveToElement(cat_Women);
		//subCat_Women_Tops.click();
		
		JavascriptExecutor js = (JavascriptExecutor) this.driver;
		js.executeScript("arguments[0].click()", subCat_Women_Pants);
		
	}
	
	public void click_Women_Shorts() {

		//act = new Actions(this.driver);
		//act.moveToElement(cat_Women);
		//subCat_Women_Tops.click();
		
		JavascriptExecutor js = (JavascriptExecutor) this.driver;
		js.executeScript("arguments[0].click()", subCat_Women_Shorts);
		
	}
	
	public void click_Men_Tops() {

		//act = new Actions(this.driver);
		//act.moveToElement(cat_Women);
		//subCat_Women_Tops.click();
		
		JavascriptExecutor js = (JavascriptExecutor) this.driver;
		js.executeScript("arguments[0].click()", subCat_Men_Tops);
		
	}
	
	public void click_Men_Bottom() {

		//act = new Actions(this.driver);
		//act.moveToElement(cat_Women);
		//subCat_Women_Tops.click();
		
		JavascriptExecutor js = (JavascriptExecutor) this.driver;
		js.executeScript("arguments[0].click()", subCat_Men_Bottom);
		
	}
	
	public void click_Men_Jacket() {

		//act = new Actions(this.driver);
		//act.moveToElement(cat_Women);
		//subCat_Women_Tops.click();
		
		JavascriptExecutor js = (JavascriptExecutor) this.driver;
		js.executeScript("arguments[0].click()", subCat_Men_Jacket);
		
	}
	
	public void click_Men_HoodiesAndSweatshirts() {

		//act = new Actions(this.driver);
		//act.moveToElement(cat_Women);
		//subCat_Women_Tops.click();
		
		JavascriptExecutor js = (JavascriptExecutor) this.driver;
		js.executeScript("arguments[0].click()", subCat_Men_Hoodies);
		
	}
	
	public void click_Men_Tees() {

		//act = new Actions(this.driver);
		//act.moveToElement(cat_Women);
		//subCat_Women_Tops.click();
		
		JavascriptExecutor js = (JavascriptExecutor) this.driver;
		js.executeScript("arguments[0].click()", subCat_Men_Tees);
		
	}

	public void click_Men_Tanks() {

		//act = new Actions(this.driver);
		//act.moveToElement(cat_Women);
		//subCat_Women_Tops.click();
		
		JavascriptExecutor js = (JavascriptExecutor) this.driver;
		js.executeScript("arguments[0].click()", subCat_Men_Tanks);
		
	}
	
	public void click_Men_Pants() {

		//act = new Actions(this.driver);
		//act.moveToElement(cat_Women);
		//subCat_Women_Tops.click();
		
		JavascriptExecutor js = (JavascriptExecutor) this.driver;
		js.executeScript("arguments[0].click()", subCat_Men_Pants);
		
	}
	
	public void click_Men_Shorts() {

		//act = new Actions(this.driver);
		//act.moveToElement(cat_Women);
		//subCat_Women_Tops.click();
		
		JavascriptExecutor js = (JavascriptExecutor) this.driver;
		js.executeScript("arguments[0].click()", subCat_Men_Shorts);
		
	}
	
	public void click_subCat_Gear_Bags() {

		//act = new Actions(this.driver);
		//act.moveToElement(cat_Women);
		//subCat_Women_Tops.click();
		
		JavascriptExecutor js = (JavascriptExecutor) this.driver;
		js.executeScript("arguments[0].click()", subCat_Gear_Bags);
		
	}
	
	public void click_subCat_Gear_FitnessEquipment() {

		//act = new Actions(this.driver);
		//act.moveToElement(cat_Women);
		//subCat_Women_Tops.click();
		
		JavascriptExecutor js = (JavascriptExecutor) this.driver;
		js.executeScript("arguments[0].click()", subCat_Gear_FitnessEquipment);
		
	}
	
	public void click_subCat_Gear_Watches() {

		//act = new Actions(this.driver);
		//act.moveToElement(cat_Women);
		//subCat_Women_Tops.click();
		
		JavascriptExecutor js = (JavascriptExecutor) this.driver;
		js.executeScript("arguments[0].click()", subCat_Gear_Watches);
		
	}
	
	public void click_subCat_Training_Video() {

		//act = new Actions(this.driver);
		//act.moveToElement(cat_Women);
		//subCat_Women_Tops.click();
		
		JavascriptExecutor js = (JavascriptExecutor) this.driver;
		js.executeScript("arguments[0].click()", subCat_Training_Video);
		
	}
}
