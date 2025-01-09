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
		
	  //Create a logger for this class
		logger = LogManager.getLogger(this.getClass()); 
		
	  //Determine a path for properties file
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\prop.properties");
		
	  //Create the properties obcject
		prop = new Properties();
		
	  //Load the file to the prop object
		prop.load(file);
		
		if(prop.getProperty("env_execution").toLowerCase().equalsIgnoreCase("local")) {
			
		  //Switch decision: choose a browser
			switch(browser.toLowerCase()) {
			
			case "chrome": driver = new ChromeDriver();break;
			case "edge": driver = new EdgeDriver();break;
			case "firefox": driver = new FirefoxDriver();break;
			default : System.out.println("The wrong browser value has been entered")
		  //return: zapobiega wykonaniu reszty kodu
			;return;
			}
		}
	  //Create WebDriver object 
		DriverWait = new WebDriverWait(driver , Duration.ofSeconds(4));
		
	  //Convert object driver to JavascriptExecutor variable and assign to js
		js = (JavascriptExecutor) driver;
		
	  //Delete saved coockies
		driver.manage().deleteAllCookies();
		
	  //Magnify Website
		driver.manage().window().maximize();
		
	  //Calling implicityWait method with specified duration
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	  //Open link from properties file
		driver.get(prop.getProperty("addresUrl"));
		
		logger.info("****The Luma website has been launched****");
		
	}
	
	@AfterMethod(groups ={"functional","regression","sanity","master","dataDriver"})
	public void close() {
		
	  //Close Website
		driver.close();

	}
	
	public void  LoginToVeronicaAccount() throws InterruptedException {
		
	  //Create MainPage object
		MainPage Mp = new MainPage(driver);
		
	  //Calling click login button method
		logger.info("****Button login has been clicked****");
		Mp.click_btnZaloguj();
		
	  //Create LoginPage object
		logger.info("****Login in button has been clicked****");
		LoginPage Lp = new LoginPage(driver);
		
	  //Sending email and password because of methods from LoginPage Object
		Lp.send_DataEmail(prop.getProperty("email"));
		Lp.send_DataPwd(prop.getProperty("pwd"));
		
	  //Calling click login button method in LoginPage
		logger.info("****Email and password entered****");
		Lp.click_btn_Zaloguj();
		
	  //Calling click my account button method in MainPage
		logger.info("****The login button was clicked****");
		Mp.click_btn_mojeKonto();
		
		logger.info("****The 'My Account' button was clicked****");
		
	}
//This method create random string with first upper letter
	public static String randomString() {
		
		return RandomStringUtils.randomAlphabetic(1).toUpperCase()+RandomStringUtils.randomAlphabetic(6);
		
	}
//This method create random digit of length 9 
	public static String randomNumber() {
		
		return RandomStringUtils.randomNumeric(9);
		
	}
//This method call 2 upper methods in one time
	public static String stringMix() {
		
		
		return randomNumber()+randomString();
		
	}
	
	public String captureScreen(String tName) {
	  //Create object SimpleDataFormat and set up format of date
	  //Wywołanie metody format który zwraca wartość typu String i potrzebuje obiekty Date
		String Sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		
	  //Covert driver to TakesScreenshot variable
		TakesScreenshot  ts = (TakesScreenshot ) driver;
		
	  //Do screenshots and save as OutputFile
		File screen = ts.getScreenshotAs(OutputType.FILE);
		
	  //Creating a dynamic file name with date
		String targetFilePath = System.getProperty("user.dir") + "\\screenshots\\"+ tName+"_"+Sdf+".png";
		
		
	  //Create file with dynamic name
		File filePath = new File(targetFilePath);
		
	  //Assign a screenshot to dynamic file
		screen.renameTo(filePath);
		
	  //Return a file name
		return targetFilePath;
		
		
		
	} 
	
}
