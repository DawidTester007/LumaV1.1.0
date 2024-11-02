package pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ProductPage  extends PageBase{
	JavascriptExecutor js;
	
	
	public ProductPage(WebDriver driver) {
		super(driver);
		
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//span[@class='base']")
	WebElement txt_Name_Product;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[3]/div[3]/div[1]/span[1]/span[1]/span[1]/span[1]")
	WebElement txt_Price_Product;
	
	@FindBy (xpath="//input[@title='Ilość']")
	WebElement box_amountOfProduct;
	
	@FindBy(xpath = "//div[@role='listbox'][contains(@aria-labelledby,'option-label-size-144')]/div")
	List<WebElement> List_sizesOfProduct;
	
	@FindBy(xpath="//div[@aria-labelledby='option-label-color-93']/div")
	List<WebElement> List_colorsOfProducts;
	
	@FindBy(xpath ="//span[text()='Dodaj do koszyka']")
	WebElement btn_addCart;
	
	@FindBy(xpath ="//div//a[text()='shopping cart']")
	WebElement msg_AddedToCart;
	
	@FindBy(xpath ="//div[@class='field qty']/div/div")
	WebElement msg_InvalidAmount;
	
	@FindBy(xpath="//div[@aria-label='Next']//div[@class='fotorama__arr__arr']")
	WebElement img_ArrowRight;
	
	@FindBy(xpath="//div[@class='fotorama__stage__shaft fotorama__grab']//img")
	WebElement img_Product;
	
	@FindBy(xpath="//div[contains(@class,'fotorama__nav-wrap')]//img")
	List<WebElement> List_img_ListOfImgProducts;
	
	@FindBy(xpath = "//div[@id='tab-label-description']")
	WebElement btn_details;
	
	@FindBy(xpath = "//div[@id='tab-label-additional']")
	WebElement btn_moreInfo;
	
	@FindBy(xpath = "//div[@id='tab-label-reviews']")
	WebElement btn_opinions;
	
	@FindBy(xpath = "//strong[@id='block-upsell-heading']")
	WebElement txt_anotherProducts1;
	
	@FindBy(xpath = "//strong[@id='block-related-heading']")
	WebElement txt_anotherProducts2;

	@FindBy(xpath = "//ol/li//img")
	List<WebElement> List_img_listOfProducts;
	
	@FindBy(xpath = "//ol/li//span[@class='price']")
	List<WebElement> List_PricesProducts;
	
	@FindBy(xpath = "//ol/li//a[@class='product-item-link']")
	List<WebElement> List_NamesProducts;
	
	@FindBy(xpath = "//div[@class='product-addto-links']//a[2]")
	WebElement btn_compare;
	
	@FindBy(xpath = "//div//a[text()='comparison list']")
	WebElement msg_succesfulAddedToComparison;
	
	@FindBy(xpath = "//a[@class='action towishlist']")
	WebElement btn_toWishList;
	
	@FindBy(xpath = "//span[text()='Opinie                ']")
	WebElement txtlink_Opinie;
	
	@FindBy(xpath = "//a[@class='action add']")
	WebElement txtlink_AddOpinion;
	
	@FindBy(xpath = "//div[@id='customer-reviews']/div/strong")
	WebElement txt_OpinionOfClients;
	
	@FindBy(xpath = "//legend[@class='legend review-legend']/span")
	WebElement txt_WriteSomethg;
	
	@FindBy(xpath = "//legend[@class='legend review-legend']/strong")
	WebElement txt_NameProductInOpinion;
	
	@FindBy(xpath = "//input[@id='nickname_field']")
	WebElement box_nick;
	
	@FindBy(xpath = "//input[@id='summary_field']")
	WebElement box_summary;
	
	@FindBy(xpath = "//textarea[@id='review_field']")
	WebElement box_review;
	
	@FindBy (xpath="//label[@id='Rating_1_label']")
	WebElement icon_oneStar;
	
	@FindBy (xpath="//label[@id='Rating_2_label']")
	WebElement icon_twoStar;
	
	@FindBy (xpath="//label[@id='Rating_3_label']")
	WebElement icon_threeStar;
	
	@FindBy (xpath="//label[@id='Rating_4_label']")
	WebElement icon_fourStar;
	
	@FindBy (xpath="//label[@id='Rating_5_label']")
	WebElement icon_fiveStar;
	
	@FindBy(xpath="//div[contains(@id,'ratings')]")
	WebElement msg_errorRating;
	
	@FindBy(xpath="//div[@id='nickname_field-error']")
	WebElement msg_errorNick;
	
	@FindBy(xpath="//div[@id='summary_field-error']")
	WebElement msg_errorSummary;
	
	@FindBy(xpath="//div[@id='review_field-error']")
	WebElement msg_errorReview;
	
	@FindBy (xpath="//button[@class='action submit primary']")
	WebElement btn_AddReview;
	
	@FindBy (xpath="//div[@aria-atomic='true']/div")
	WebElement msg_AddedView;

	public WebElement get_msg_AddedView() {
		
		return msg_AddedView;
	
	}
	
	public void click_btn_AddReview() {
		
		btn_AddReview.click();;
	}
	
	public boolean check_msg_errorRating() {
		try {
		return msg_errorRating.isDisplayed();
		}catch(Exception e) {
			
			return false;
		}
	}
	public boolean check_msg_errorNick() {
		try {
		return msg_errorNick.isDisplayed();
		}catch(Exception e) {
			
			return false;
		}
	}
	public boolean check_msg_errorSummary() {
		try {
		return msg_errorSummary.isDisplayed();
		}catch(Exception e) {
			
			return false;
		}
	}
	public boolean check_msg_errorReview() {
		try {
		return msg_errorReview.isDisplayed();
		}catch(Exception e) {
			
			return false;
		}
	}
	

	public void set_star(String numer) {
		//Actions act = new Actions(this.driver);
		this.js = (JavascriptExecutor) this.driver;
		switch(numer) {
		
		case "jedna" : //act.moveToElement(icon_oneStar).click().perform()
				js.executeScript("arguments[0].click();", icon_oneStar);
				
		break;
		case "dwie" ://act.moveToElement(icon_twoStar).click().perform()
		js.executeScript("arguments[0].click();", icon_twoStar);;
		break;
		case "trzy" : //act.moveToElement(icon_threeStar).click().perform()
		js.executeScript("arguments[0].click();", icon_threeStar);;
		break;
		case "cztery" ://act.moveToElement(icon_fourStar).click().perform()
		js.executeScript("arguments[0].click();", icon_fourStar);;
		break;
		case "pięć" :  //act.moveToElement(icon_fiveStar).click().perform()
		js.executeScript("arguments[0].click();", icon_fiveStar);;
		break;
		default : ; 
		}
		
	}
	
	public void set_box_nick(String nick) {
		
		box_nick.sendKeys(nick);
		
	}
	
	public void set_box_summary(String summary) {
			
		box_summary.sendKeys(summary);
			
		}
	
	public void set_box_review(String review) {
		
		box_review.sendKeys(review);
		
	}
	
	public String get_txt_NameProductInOpinion() {
		
		return txt_NameProductInOpinion.getText();
		
	}
	
	public String get_txt_WriteSomethg() {
		
		return txt_WriteSomethg.getText();
		
	}
	
	public String get_txt_OpinionOfClients() {
		
		return txt_OpinionOfClients.getText();
		
	}
	
	public void click_txtlink_DodajOpinie() {
		
		txtlink_AddOpinion.click();;
	}

	public WebElement get_btn_opinions() {
		
		
		return btn_opinions;
	}
	public void click_txtlink_Opinie () {
		
		txtlink_Opinie.click();
		
	}
	
	public void click_btn_toWishList () {
		
		btn_toWishList.click();
		
	}
	
	public String get_NameOfProduct () {
		
		return txt_Name_Product.getText();
		
	}
	
	public boolean check_msg_succesfulAddedToComparison () {
		try {
		return msg_succesfulAddedToComparison.isDisplayed();
		}catch(Exception e) {
			
			return false;
		}
	}
	
	public void set_AmountOfProduct (String amount) {
		
		 box_amountOfProduct.sendKeys(amount);
		
	}
	
	public void clear_AmountOfProduct () {
		
		 box_amountOfProduct.clear();
		
	}
	
	public String get_txt_Price_Product () {
		
		return txt_Price_Product.getText();
		
	}
	
	public boolean check_Price_Product () {
		try {
		return txt_Price_Product.isDisplayed();
		}catch(Exception e) {
			
			return false;
		}
	}
	public boolean check_NameOfProduct () {
		
		
		try {
			return txt_Name_Product.isDisplayed();
			}catch(Exception e) {
				
				return false;
			}
	}
	
	public void click_btn_addCart () {
		
		btn_addCart.click();
		
	}
	
	public void click_btn_compare () {
		
		btn_compare.click();
		
	}
	
	public WebElement get_WebElement_AddedCorrectly() {
		
		return msg_AddedToCart;
		
	}
	
	public WebElement get_WebElement_img_Product() {
		
		return img_Product;
		
	}
	
	public WebElement msg_InavlidAmount() {
		
		return msg_InvalidAmount;
		
	}
	
	public List<WebElement> List_sizesOfProduct() {
		
		return List_sizesOfProduct;
	}
	
	public List<WebElement> List_colorsOfProducts() {
		
		return List_colorsOfProducts;
	}
	
	public List<WebElement> List_img_ListOfImgProducts() {
		
		return List_img_ListOfImgProducts;
	}
	
	public List<WebElement> List_img_listOfProducts() {
			
			return List_img_listOfProducts;
		}
	
	public List<WebElement> List_PricesProducts() {
		
		return List_PricesProducts;
	}
	
	public List<WebElement> List_NamesProducts() {
		
		return List_NamesProducts;
	}
	
	
	public void click_img_ArrowRight (JavascriptExecutor js) {	
		
		//js.executeScript("arguments[0].click();", img_ArrowRight);
		//img_ArrowRight.click();
		
		Actions act = new Actions(this.driver);
		act.moveToElement(img_Product).perform();
		act.moveToElement(img_ArrowRight).click().perform();
		
			
	}
	
	public void click_btn_details() {
		
		btn_details.click();
		
	}
	
	public String get_attributeOf_btn_details(String atrybut) {
		
		
		return btn_details.getAttribute(atrybut);
		
	}
	
	public void click_btn_moreInfo() {
		
		btn_moreInfo.click();
		
	}
	
	public String get_attributeOf_btn_moreInfo(String atrybut) {
		
		
		return btn_moreInfo.getAttribute(atrybut);
		
	}
	
	public void click_btn_opinions() {
		
		btn_opinions.click();
		
	}
	
	public String get_attributeOf_btn_opinions(String atrybut) {
		
		
		return btn_opinions.getAttribute(atrybut);
		
	}
	
	public WebElement get_txt_anotherProducts1() {
			
			
				
			return txt_anotherProducts1;
		
		}
	
	public WebElement get_txt_anotherProducts2() {
		
		
			
			return txt_anotherProducts2;
			
	
		
	}
	

	
}
