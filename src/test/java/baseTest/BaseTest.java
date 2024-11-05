package baseTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Properties;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import pages.LoginPage;
import pages.MainPage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.commons.lang3.RandomStringUtils;
public class BaseTest {

	public static Logger logger;
	public static WebDriver driver;
	public static Properties prop;
	public JavascriptExecutor js;
	public WebDriverWait DriverWait;
	
	
	@BeforeMethod(groups ={"functional","regression","sanity","master","dataDriver"})
	@Parameters({"system","browser"})
	public void setUp(String system , String browser) throws IOException {
		
	  //Stworzenie loggera dla tej klasy
		logger = LogManager.getLogger(this.getClass()); 
		
	  //Określenie scieżki do pliku properties, w celu odczytywania danych
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\prop.properties");
		
	  //Stworzenie obiektu properties
		prop = new Properties();
		
	  //Załadowanie pliku properties aby zmienna mogła odczytywać dane
		prop.load(file);
		
		if(prop.getProperty("env_execution").toLowerCase().equalsIgnoreCase("local")) {
			
		  //Decyzja typu switch, wybranie typu przeglądarki
			switch(browser.toLowerCase()) {
			
			case "chrome": driver = new ChromeDriver();break;
			case "edge": driver = new EdgeDriver();break;
			case "firefox": driver = new FirefoxDriver();break;
			default : System.out.println("Wprowadzono złą wartość przeglądarki")
		  //return: zapobiega wykonaniu reszty kodu
			;return;
			}
		}
	  //Stworzenie obiektu WebDriverWait 
		DriverWait = new WebDriverWait(driver , Duration.ofSeconds(4));
		
	  //Przypisanie do zmiennej js przekonwertowanego sterownika
		js = (JavascriptExecutor) driver;
		
	  //Usunięcie zapisanych danych
		driver.manage().deleteAllCookies();
		
	  //Powiększenie strony
		driver.manage().window().maximize();
		
	  //Ukryty licznik, którego długość wynosi 10s
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	  //Pobranie adresu z pliku properties
		driver.get(prop.getProperty("addresUrl"));
		
		logger.info("****Uruchomiono stronę główną 'Luma'****");
		
	}
	
	@AfterMethod(groups ={"functional","regression","sanity","master","dataDriver"})
	public void close() {
		
	  //zamknięcie strony
		driver.close();

	}
	
	public void  LoginToVeronicaAccount() throws InterruptedException {
		
	  //Stworzenie obiektu MainPage
		MainPage Mp = new MainPage(driver);
		
	  //Wywołanie metody z MainPage
		Mp.click_btnZaloguj();
		
	  //Wywołanie metody z LoginPage
		logger.info("****Kliknięto przycisk zaloguj się****");
		LoginPage Lp = new LoginPage(driver);
		
	  //Wysałenie inforamcji email, password do pól
		Lp.send_DataEmail(prop.getProperty("email"));
		Lp.send_DataPwd(prop.getProperty("pwd"));
		
	  //Wywołanie metody z LoginPage
		logger.info("****Wprowadzono email i hasło****");
		Lp.click_btn_Zaloguj();
		
	  //Wywołanie metody z MainPage
		logger.info("****Kliknięto przycisk zaloguj****");
		Mp.click_btn_mojeKonto();
		
		logger.info("****Kliknięto przycisk 'Moje konto'****");
		
	}
//Metoda stworzona w celu tworzenia randomowych liter, które zaczynają się z dużej litery
	public static String randomString() {
		
		return RandomStringUtils.randomAlphabetic(1).toUpperCase()+RandomStringUtils.randomAlphabetic(6);
		
	}
//Metoda stworzona w celu tworzenia randomowych cyfr
	public static String randomNumber() {
		
		return RandomStringUtils.randomNumeric(9);
		
	}
//Metoda stworzona w celu tworzenia randomowych liter i cyfr
	public static String stringMix() {
		
		
		return randomNumber()+randomString();
		
	}
	
	public String captureScreen(String tName) {
	  //Stworzenie obiektu SimpleDateFormat i ustalenie formatu preferowanej daty
	  //Wywołanie metody format który zwraca wartość typu String i potrzebuje obiekty Date
		String Sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		
	  //Przekonwertowanie sterownika na TakesScreenshot i przypisanie jej do zmiennej ts
		TakesScreenshot  ts = (TakesScreenshot ) driver;
		
	  //Zrobienie screenshota i zapisanie go jako plik
		File screen = ts.getScreenshotAs(OutputType.FILE);
		
	  //Dynamiczne tworzenie nazwy aby się nie powtarzały
		String targetFilePath = System.getProperty("user.dir") + "\\screenshots\\"+ tName+"_"+Sdf+".png";
		
		
	  //Tworzenie pliku o dynamicznej nazwie
		File filePath = new File(targetFilePath);
		
	  //Przypisanie screenshota do pliku :filePath
		screen.renameTo(filePath);
		
	  //Zwrócenie dynamicznej nazwy
		return targetFilePath;
		
		
		
	} 
	
}
