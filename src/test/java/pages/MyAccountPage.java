package pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PageBase {
	
	JavascriptExecutor js;
	public MyAccountPage(WebDriver driver) {
		super(driver);
		
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//legend/span[text()='Zmień adres email']")
	WebElement txt_changeEmail;
	
	@FindBy(xpath="//legend/span[text()='Zmień adres E-mail i hasło']")
	WebElement txt_changeEmailAndPwd;
	
	@FindBy(xpath="//legend/span[text()='Zmień hasło']")
	WebElement txt_changePwd;

	@FindBy(xpath="//span[normalize-space()='Opcje subskrypcji']")
	WebElement txt_optionOfSubscription;
	
	@FindBy(xpath="//input[@id='change-email']")
	WebElement checkBox_changeEmail;
	
	@FindBy(xpath="//input[@id='change-password']")
	WebElement checkBox_changePwd;
	
	@FindBy(xpath="//input[@id='assistance_allowed_checkbox']")
	WebElement checkBox_RemoteShopping;
	
	@FindBy(xpath="//input[@id='subscription']")
	WebElement checkbox_MainNewsletter;
	
	@FindBy(xpath="//span[normalize-space()='Zapisz']")
	WebElement btn_saveNewsletter;
	
	@FindBy(xpath="//div[text()='We have updated your subscription.']")
	WebElement msg_UpdatedSubscription;
	
	@FindBy(xpath="//div[text()='We have saved your subscription.']")
	WebElement msg_SavedSub;
	
	@FindBy(xpath="//div[text()='We have removed your newsletter subscription.']")
	WebElement msg_RemoveSub;
	
	@FindBy(xpath="//span[text()='Nie kupowałeś jeszcze żadnych produktów do pobrania.']")
	WebElement msg_DidntBuyAnything;
	
	@FindBy(xpath="//span[text()='Nie masz zapisanych metod płatności.']")
	WebElement msg_DidntSaveAnyMethods;
	
	@FindBy(xpath="//span[text()='Nie masz jeszcze zgłoszonych żadnych recenzji.']")
	WebElement msg_NoOpinion;
	
	@FindBy(xpath="//div[@role='alert']/div/div[text()]")
	WebElement msg_AddedToCart;
	
	@FindBy(xpath="//strong[@id='block-compare-heading']")
	WebElement txt_compareProducts;
	
	@FindBy(xpath="//div[@class='block block-compare']//div[2]")
	WebElement txt_amountProductsToCompare;
	
	@FindBy(xpath="//strong[@id='block-reorder-heading']")
	WebElement txt_lastOrders;
	
	@FindBy(xpath="//div[@class='secondary']//span[contains(text(),'Zobacz wszystkie')]")
	WebElement link_ShowAllProducts;
	
	@FindBy(xpath="//button[@title='Dodaj do koszyka']//span[contains(text(),'Dodaj do koszyka')]")
	WebElement btn_addToCart;
	
	@FindBy(xpath="//strong[contains(text(),'Moja lista życzeń')]")
	WebElement txt_wishList;
	
	@FindBy(xpath="//div[contains(text(),'Nie masz żadnych produktów na liście życzeń.')]")
	WebElement txt_infoWishList;
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement checkBox_FirstProduct;
	
	@FindBy(xpath="//div[text()='Dziękujemy za rejestrację w Main Website Store.']")
	WebElement msg_thanks;
	
	@FindBy(xpath="//span[@class='base']")
	WebElement header_MyAccount;
	
	@FindBy(xpath="//h1[@data-bind='visible: !addNewCardVM.visible()']")
	WebElement title_RememberedMethods;
	
	@FindBy(xpath="//div//a[text()='tutaj']")
	WebElement msg_addedToWishList;
	
	@FindBy(xpath="//strong[normalize-space()='Dane konta']")
	WebElement header_DataOfAccount;
	
	@FindBy(xpath="//span[normalize-space()='Informacje kontaktowe']")
	WebElement header_infoToContact;
	
	@FindBy(xpath="//span[normalize-space()='Newslettery']")
	WebElement header_Newslettery;
	
	@FindBy(xpath="//strong[contains(text(),'Książka adresowa')]")
	WebElement header_Adress;
	
	@FindBy(xpath="//span[contains(text(),'Domyślny adres rozliczeniowy')]")
	WebElement header_AdressSettlement;
	
	@FindBy(xpath="//span[contains(text(),'Domyślny adres dostawy')]")
	WebElement header_DeriveryAddress;
	
	@FindBy(xpath="//strong[normalize-space()='Ostatnie zamówienia']")
	WebElement header_LastOrders;

	@FindBy(xpath="//div[@class='box box-information']//div[@class='box-content']/p")
	WebElement txt_infoNameAndEmail;
	
	@FindBy(xpath="//div[@class='box box-newsletter']//div[@class='box-content']/p")
	WebElement txt_Status_newsletter;
	
	@FindBy(xpath="//div[@class='box box-billing-address']//address")
	WebElement txt_InfoAdressSettlement;
	
	@FindBy(xpath="//div[@class='box box-shipping-address']//address")
	WebElement txt_InfoAdressDerivery;

	@FindBy(xpath="//thead/tr//th")
	List<WebElement> List_NameOfColums;
	//=======
	@FindBy(xpath="//div[@class='box box-information']//span[contains(text(),'Zmień')]")
	WebElement link_changeDataAccount;
	
	@FindBy(xpath="//a[contains(text(),'Zmień hasło')]")
	WebElement link_changePwd;
	
	@FindBy(xpath="//div[@class='box box-newsletter']//span[contains(text(),'Zmień')]")
	WebElement link_chooseNewsletter;

	@FindBy(xpath="//div[@class='box box-billing-address']//span[contains(text(),'Zmień adres')]")
	WebElement link_changeBillingAdress;
	
	@FindBy(xpath="//span[text()='Zarządzaj adresami']")
	WebElement link_ManageAdress;
	
	@FindBy(xpath="//div[@class='box box-shipping-address']//span[contains(text(),'Zmień adres')]")
	WebElement link_changeShoppingAdress;

	@FindBy(xpath="//div[@class='block-title order']//span[contains(text(),'Zobacz wszystkie')]")
	WebElement link_showOrders;
	//================================
	@FindBy(xpath="//ul/li/a[text()='Zamówienia']")
	WebElement tab_Orders;
	
	@FindBy(xpath="//ul/li/a[text()='Produkty do pobrania']")
	WebElement tab_DownloadableProduct;
	
	@FindBy(xpath="//ul/li/a[text()='Moja lista życzeń']")
	WebElement tab_WishList;
	
	@FindBy(xpath="//ul/li/a[text()='Książka adresowa']")
	WebElement tab_AdressBook;
	
	@FindBy(xpath="//ul/li/a[text()='Dane konta']")
	WebElement tab_AccountData;
	
	@FindBy(xpath="//ul/li/a[text()='Zapamiętane metody płatności']")
	WebElement tab_RememberedMethodsOfPay;
	
	@FindBy(xpath="//ul/li/a[text()='Moje opinie o produktach']")
	WebElement tab_MyOpinion;
	
	@FindBy(xpath="//ul/li/a[text()='Subskrypcje newslettera']")
	WebElement tab_NewsletterSub;
	
	@FindBy(xpath="//span[text()='Nie masz żadnych produktów na liście życzeń.']")
	WebElement msg_NoProducts;
	
	@FindBy(xpath="//ol[@class='product-items']/li[1]")
	WebElement firstProduct_MyWishList;
	
	@FindBy(xpath="//a[@title='Usuń produkt']")
	WebElement btn_deleteProuctFromWishList;
	
	@FindBy(xpath="//span[normalize-space()='Dodaj wszystko do koszyka']")
	WebElement btn_AddToCart;
	
	@FindBy(xpath="//span[contains(text(),'Podziel się listą życzeń')]")
	WebElement btn_shareYourWishList;
	
	@FindBy(xpath="//span[contains(text(),'Aktualizacja listy życzeń')]")
	WebElement btn_refreshWishList;
	
	@FindBy(xpath="//div[text()='Musisz wybrać opcje produktu na \"Radiant Tee\".']")
	WebElement msg_chooseOptionOfProduct;
	
	@FindBy(xpath="//tbody/tr[1]")
	WebElement row_firstOrder;
	
	@FindBy(xpath="//tbody/tr[2]")
	WebElement row_secondOrder;
	
	@FindBy(xpath="//select")
	WebElement select_dropDown;
	
	@FindBy(xpath="//span[@class='toolbar-number']")
	WebElement txt_countOfProduct;
	
	@FindBy(xpath="//tbody/tr")
	List<WebElement> List_ProductOfOrder;
	
	@FindBy(xpath="//input[@id='firstname']")
	WebElement field_firstname;
	
	@FindBy(xpath="//input[@id='lastname']")
	WebElement field_lastname;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement field_email;
	
	@FindBy(xpath="//input[@id='current-password']")
	WebElement field_CurrPwd;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement field_Pwd;
	
	@FindBy(xpath="//input[@id='password-confirmation']")
	WebElement field_ConfPwd;
	
	@FindBy(xpath="//div[text()='Unable to send mail. Please try again later.']")
	WebElement msg_tryAgainLater;
	
	@FindBy(xpath="//span[text()='Zapisz']")
	WebElement btn_save;
	
	@FindBy(xpath="//div[@id='firstname-error']")
	WebElement msg_firstname;
	
	@FindBy(xpath="//div[@id='lastname-error']")
	WebElement msg_lastname;
	
	@FindBy(xpath="//div[@id='email-error']")
	WebElement msg_email;
	
	@FindBy(xpath="//div[@id='current-password-error']")
	WebElement msg_currPwd;
	
	@FindBy(xpath="//div[@id='password-error']")
	List<WebElement> msg_Pwd;
	
	@FindBy(xpath="//div[@id='password-confirmation-error']")
	WebElement msg_confPwd;
	
	@FindBy(xpath="//div[contains(text(),\"The password doesn't match\")]")
	WebElement msg_pwdDoesntMatch;
	
	
	public void click_btn_save() {
			
		btn_save.click();
		
		}
	
	public boolean check_msg_tryAgainLater() {
		try {
		return msg_tryAgainLater.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	
	public void clear_field_firstname() {
		
		field_firstname.clear();
	}
	
	public void clear_field_lastname() {
		
		field_lastname.clear();
	}
	
	public void clear_field_email() {
		
		field_email.clear();
	}
	
	public void clear_field_CurrPwd() {
		
		field_CurrPwd.clear();
	}
	
	public void clear_field_ConfPwd() {
		
		field_ConfPwd.clear();
	}
	
	public void clear_field_Pwd() {
		
		field_Pwd.clear();
	}
	
	
	
	public void send_field_firstname(String firstname) {
		
		field_firstname.sendKeys(firstname);
	}
	
	public void send_field_lastname(String lastname) {
			
			field_lastname.sendKeys(lastname);
		}
	
	public void send_field_email(String email) {
		
		field_email.sendKeys(email);
	}
	
	public void send_field_CurrPwd(String CurrPwd) {
		
		field_CurrPwd.sendKeys(CurrPwd);
	}
	
	public void send_field_Pwd(String Pwd) {
		
		field_Pwd.sendKeys(Pwd);
	}
	
	public void send_field_ConfPwd(String ConfPwd) {
			
			field_ConfPwd.sendKeys(ConfPwd);
		}
	

	public boolean check_msg_firstname() {
		try {
		return field_ConfPwd.isDisplayed();
		}catch(Exception e) {
			
			return false;
		}
	}
	
	public boolean check_msg_lastname() {
		try {
		return msg_lastname.isDisplayed();
		}catch(Exception e) {
			
			return false;
		}
	}
	
	
	public boolean check_msg_pwdDoesntMatch() {
		try {
		return msg_pwdDoesntMatch.isDisplayed();
		}catch(Exception e) {
			
			return false;
		}
	}
	
	public boolean check_msg_email() {
		try {
		return msg_email.isDisplayed();
		}catch(Exception e) {
			
			return false;
		}
	}
	
	public boolean check_msg_currPwd() {
		try {
		return msg_currPwd.isDisplayed();
		}catch(Exception e) {
			
			return false;
		}
	}
	
	public boolean check_msg_Pwd() {
		try {
		List<WebElement> List_msg_Pwd = msg_Pwd;
		for(WebElement x : List_msg_Pwd) {
			
			if(x.isDisplayed()==true) {
				
				return x.isDisplayed();
				
			}
		}
		return false;
		}catch(Exception e) {
			return false;
		}
	}
	
	public boolean check_msg_confPwd() {
		try {
		return msg_confPwd.isDisplayed();
		}catch(Exception e) {
			
			return false;
		}
	}
	
	
	public boolean check_row_firstOrder() {
		try {
		return row_firstOrder.isDisplayed();
		}catch(Exception e) {
			
			return false;
		}
	}
	
	public boolean check_row_secondOrder() {
		try {
		return row_secondOrder.isDisplayed();
		}catch(Exception e) {
			
			return false;
		}
	}
	
	public String get_txt_select_dropDown() {
		
		return select_dropDown.getText();
	
	}
	
	public String get_txt_countOfProduct() {
		
		return txt_countOfProduct.getText();
	
	}
	
	public List<WebElement> get_List_ProductOfOrder(){
		
		return List_ProductOfOrder;
		
	}
	
	public WebElement get_select_dropDown(){
		
		return select_dropDown;
		
	}
	
	
	public void click_tab_Orders() {
		tab_Orders.click();
		
	}
	public void click_tab_DownloadableProduct() {
		tab_DownloadableProduct.click();
		
	}
	public void click_tab_WishList() {
		tab_WishList.click();
		
	}
	public void click_tab_AdressBook() {
		tab_AdressBook.click();
		
	}
	public void click_tab_AccountData() {
		tab_AccountData.click();
		
	}
	public void click_tab_RememberedMethodsOfPay() {
		tab_RememberedMethodsOfPay.click();
		
	}
	
	public void click_tab_MyOpinion() {
		tab_MyOpinion.click();
		
	}
	
	public void click_tab_NewsletterSub() {
		tab_NewsletterSub.click();
		
	}
	
	public String get_txt_nazwa() {
		
		return header_MyAccount.getText();
	}
	
	public String get_txt_RememberedMethods() {
		
		return title_RememberedMethods.getText();
	}
	
	public void click_link_ManageAdress() {
		
		link_ManageAdress.click();
	}
	
	public void click_link_changeDataAccount() {
		
		link_changeDataAccount.click();
	}
	
	public void click_link_changePwd() {
			
		link_changePwd.click();
		}
	
	public void click_link_chooseNewsletter() {
		
		link_chooseNewsletter.click();
	}
	
	public void click_link_changeBillingAdress() {
		
		link_changeBillingAdress.click();
	}
	
	public void click_link_changeShoppingAdress() {
		
		link_changeShoppingAdress.click();
	}
	
	public void click_link_showOrders() {
		
		link_showOrders.click();
	}



	public List<WebElement> get_List_NameOfColums(){
		
		return List_NameOfColums;
	}
	
	public boolean check_txt_InfoAdressDerivery() {
		try {
		return txt_InfoAdressDerivery.isDisplayed();
		}catch(Exception e) {
			
			return false;
		}
	}
	
	public boolean check_txt_InfoAdressSettlement() {
		try {
		return txt_InfoAdressSettlement.isDisplayed();
		}catch(Exception e) {
			
			return false;
		}
	}
	
	public boolean check_txt_Status_newsletter() {
		try {
		return txt_Status_newsletter.isDisplayed();
		}catch(Exception e) {
			
			return false;
		}
	}
	
	public boolean check_txt_infoNameAndEmail() {
		try {
		return txt_infoNameAndEmail.isDisplayed();
		}catch(Exception e) {
			
			return false;
		}
	}
	
	public boolean check_header_DataOfAccount() {
		try {
		return header_DataOfAccount.isDisplayed();
		}catch(Exception e) {
			
			return false;
		}
	}
	
	public String get_header_DataOfAccount() {
		
		return header_DataOfAccount.getText();
		
	}
	//-----------
	public boolean check_header_infoToContact() {
		try {
		return header_infoToContact.isDisplayed();
		}catch(Exception e) {
			
			return false;
		}
	}
	
	public String get_header_infoToContact() {
		
		return header_infoToContact.getText();
		
	}
	//--------
	public boolean check_header_Newslettery() {
		try {
		return header_Newslettery.isDisplayed();
		}catch(Exception e) {
			
			return false;
		}
	}
	
	public String get_header_Newslettery() {
		
		return header_Newslettery.getText();
		
	}
	//---------
	
	public boolean check_header_Adress() {
		try {
		return header_Adress.isDisplayed();
		}catch(Exception e) {
			
			return false;
		}
	}
	
	public String get_header_Adress() {
		
		return header_Adress.getText();
		
	}
	//---------
	public boolean check_header_Settlement() {
		try {
		return header_AdressSettlement.isDisplayed();
		}catch(Exception e) {
			
			return false;
		}
	}
	
	public String get_header_Settlement() {
		
		return header_AdressSettlement.getText();
		
	}
	//---------
	public boolean check_header_DeriveryAddress() {
		try {
		return header_DeriveryAddress.isDisplayed();
		}catch(Exception e) {
			
			return false;
		}
	}
	
	public String get_header_DeriveryAddress() {
		
		return header_DeriveryAddress.getText();
		
	}
	//---------
	public boolean check_header_LastOrders() {
		try {
		return header_LastOrders.isDisplayed();
		}catch(Exception e) {
			
			return false;
		}
	}
	
	public String get_header_LastOrders() {
		
		return header_LastOrders.getText();
		
	}
	//---------
	
	public boolean check_msg_addedToWishList() {
		
		try {
		return msg_addedToWishList.isDisplayed();
		}catch(Exception e) {
			
			return false;
			
		}
	}
	
	public boolean check_thanks() {
		
		try {
		return msg_thanks.isDisplayed();
		}catch(Exception e) {
			
			return false;
			
		}
		
		
	}
		public boolean check_msg_MojeKonto() {
			try {
			return header_MyAccount.isDisplayed();
			}catch(Exception e) {
				
				return false;
				
			}
		}
		
		public void click_checkBox_FirstProduct() {
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", checkBox_FirstProduct);
		}
		

		
		public String get_txt_compareProducts() {
			
			return txt_compareProducts.getText();
		}
		
		public boolean check_msg_AddedToCart() {
			try {
			return msg_AddedToCart.isDisplayed();
			}catch(Exception e) {
				
				return false;
			}
		}
		
		public boolean check_txt_amountProductsToCompare() {
				try {
				return txt_compareProducts.isDisplayed();
				}catch(Exception e) {
					
					return false;
				}
			}
		
		public boolean check_txt_lastOrders() {
			try {
			return txt_lastOrders.isDisplayed();
	}catch(Exception e) {
				
				return false;
			}
		}
		
		public void click_link_ShowAllProducts() {
			
			link_ShowAllProducts.click();
		}
		
		public void click_btn_addToCart() {
			
			btn_addToCart.click();
		}	
		
		public String get_txt_wishList() {
			
			return txt_wishList.getText();
		}	
		
		public boolean check_txt_infoWishList() {
			try {
			return txt_infoWishList.isDisplayed();
			}catch(Exception e) {
				
				return false;
			}
		}	
		
		public String get_msg_chooseOptionOfProduct() {
			
			return msg_chooseOptionOfProduct.getText();
		
		}
		
		
		public boolean check_btn_refreshWishList() {
			try {
			return btn_refreshWishList.isDisplayed();
			}catch(Exception e) {
				return false;
			}
		}
		
		public void click_btn_shareYourWishList() {
			btn_shareYourWishList.click();
			
		}
		
		public void click_btn_AddToCart() {
			btn_AddToCart.click();
			
		}
		
		public void click_btn_deleteProuctFromWishList() {

			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", btn_deleteProuctFromWishList);
			
		}
		public boolean check_firstProduct_MyWishList() {
			try {
			return firstProduct_MyWishList.isDisplayed();
			}catch(Exception e) {
				return false;
			}
		}
		
		public String check_msg_NoProducts() {
			
			return msg_NoProducts.getText();
		}
	
		
		public String get_msg_NoOpinion() {
			
			return msg_NoOpinion.getText();
		}
		
		public String get_msg_DidntSaveAnyMethods() {
			
			return msg_DidntSaveAnyMethods.getText();
		}
		
		public String get_msg_DidntBuyAnything() {
			
			return msg_DidntBuyAnything.getText();
		}
		
		public String get_msg_SavedSub() {
			
			return msg_SavedSub.getText();
			
		}
		
		public String get_msg_RemoveSub() {
			
			return msg_RemoveSub.getText();
			
		}
		
		public String get_msg_UpdatedSubscription() {
			
			return msg_UpdatedSubscription.getText();
			
		}
		
		public String get_txt_optionOfSubscription() {
			
			return txt_optionOfSubscription.getText();
			
		}
		
		public void click_btn_saveNewsletter() {
				
			btn_saveNewsletter.click();
				
			}
		
		public void click_checkbox_MainNewsletter() {
			
			checkbox_MainNewsletter.click();
			
		}
		
		public boolean check_checkbox_MainNewsletter() {
			try {
			return checkbox_MainNewsletter.isSelected();
			}catch(Exception e) {
				return false;
			}
		}
		

		
		public void click_checkBox_changeEmail() {
			
			checkBox_changeEmail.click();
			
		}
		
		public void click_checkBox_changePwd() {
			
			checkBox_changePwd.click();
			
		}
		
		public void click_checkBox_RemoteShopping() {
			
		checkBox_RemoteShopping.click();
			
		}
		
		public boolean check_checkBox_RemoteShopping() {
			
			return checkBox_RemoteShopping.isSelected();
				
			}
		
		public String get_txt_changePwd() {
			
			return txt_changePwd.getText();
			
		}
		
		public String get_txt_changeEmail() {
			
			return txt_changeEmail.getText();
			
		}
		
		public String get_txt_changeEmailAndPwd() {
				
				return txt_changeEmailAndPwd.getText();
				
			}
}
