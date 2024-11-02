package utilities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import baseTest.BaseTest;

public class ExtentReportsManager implements ITestListener{
	
	public ExtentSparkReporter SparkReporter;
	public ExtentReports Reporter;
	public ExtentTest Test;
	static String RepName;
	
	
	 public void onStart(ITestContext context) {
	   //Stworzenie obiektu oraz ustalenie formatu daty
		 SimpleDateFormat Sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
		 
	   //Stworzenie obiektu date 
		 Date dt = new Date();
		 
	   //Wywołanie metody format i przypisanie parametru dt i przypisanie rezultatu do zmiennej String
		 String time = Sdf.format(dt);
		 
	   //Stworzenie dynamicznej nazwy z wykorzystaniem daty
		 RepName ="TestReport-"+time+".html"; 
		 
	   //Stworzenie obiektu extentSparkReporter i przekazanie scieżki
		 SparkReporter = new ExtentSparkReporter(".\\reports\\"+RepName);
		 
	   //Ustawienie tytułu zakładki : "Automation Test"
		 SparkReporter.config().setDocumentTitle("Automation Test");
	   //Nazwa dokumentu 
		 SparkReporter.config().setReportName(context.getCurrentXmlTest().getName());
	   //Ustawienie motywu na ciemny
		 SparkReporter.config().setTheme(Theme.DARK);
		 
	   //Stworzenie obiektu ExtentReports
		 Reporter = new ExtentReports();
		 
	   //Dołączenie ExtentReports do SparkReporter
		 Reporter.attachReporter(SparkReporter);
		 
	   //Ustalenie podstawowych informacji raportu i dodanie grup, które wchodzą w skład
	   //Testów
		 Reporter.setSystemInfo("Obiekt Testów", "LumaDemo");
		 Reporter.setSystemInfo("Creator", System.getProperty("user.name"));
		 Reporter.setSystemInfo("Environment", "QA");
		 Reporter.setSystemInfo("Browser", context.getCurrentXmlTest().getParameter("browser"));
		 Reporter.setSystemInfo("System", context.getCurrentXmlTest().getParameter("system"));
		 List<String> groups = context.getCurrentXmlTest().getIncludedGroups();
		 if(!groups.isEmpty()) {
			 Reporter.setSystemInfo("Groups", groups.toString());
		 }
		 
		 }
	 
	 public void onFinish(ITestContext context) {
		 
		  //Metoda która zapisuję raport
		    Reporter.flush();
		   
		  }
	 
	 
	 public void onTestSuccess(ITestResult result) {
		  //Stworzenie nowego testu o nazwie klasy
		 	Test = Reporter.createTest(result.getTestClass().getName());
		 	
		  //Dodanie do testu grup, które zawierał 
		 	Test.assignCategory(result.getMethod().getGroups());
		 	
		  //Wyświetlenie statusu i komunikatu
		    Test.log(Status.PASS, "Test "+result.getName() + " zakończył się pozytywnie");
		
		  }
	 
	 public void onTestFailure(ITestResult result) {
		  //Stworzenie nowego testu o nazwie klasy
		    Test = Reporter.createTest(result.getTestClass().getName());
		  //Dodanie do testu grup, które zawierał 
		    Test.assignCategory(result.getMethod().getGroups());
		    
		  //Wyświetlenie statusu i komunikatu
		    Test.log(Status.FAIL, "Test "+result.getName()+ " zakończył się niepowodzeniem");
		    
		  //Wyświetlenie statusu i komunikatu wraz z wyjątkiem
		    Test.log(Status.INFO , "Test zakończył się niepowodzeniem z powodu: " + result.getThrowable());
		    
		  //Wywołanie metody wykonującej screenshot i dostarczający path do screena
		    String path = new BaseTest().captureScreen(result.getName());
		    
		  //Dodanie do raportu screenshot
		    Test.addScreenCaptureFromPath(path);
		  }
	 
	 public void onTestSkipped(ITestResult result) {
		 
		  //Stworzenie nowego testu o nazwie klasy
		    Test = Reporter.createTest(result.getTestClass().getName());
		    
		  //Dodanie do testu grup, które zawierał 
		    Test.assignCategory(result.getMethod().getGroups());
		    
		  //Wyświetlenie statusu i komunikatu
		    Test.log(Status.SKIP, "Test " + result.getName() + " został pominięty");
		    
		  //Wyświetlenie statusu i komunikatu wraz z wyjątkiem
		    Test.log(Status.INFO , "Test został pominięty z powodu :" + result.getThrowable());
		  }
	 

}
