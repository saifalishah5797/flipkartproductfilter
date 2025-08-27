package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentDemoReport {
	
   private static	WebDriver driver =  null ;

	public static void main(String[] args) {
		
         ExtentSparkReporter htmlreport = new ExtentSparkReporter("extentreports.html");
         
         ExtentReports extent = new ExtentReports();
         
         extent.attachReporter(htmlreport);
         
         
         ExtentTest test1 = extent.createTest("souce lab Open and Login", "This is validate login page");
         
         WebDriverManager.chromedriver().setup();
         
         driver = new ChromeDriver();
         
         test1.log(Status.INFO, "Starting test case");
         
         driver.get("https://www.saucedemo.com/");
         test1.pass("Saucedemo page navvigated");
         
         driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
         
         test1.pass("Entered user name in the text field");
         
         driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
         
         test1.pass("Entered password in text field ");
         
         driver.findElement(By.xpath("//input[@id='login-button']")).click();
         
         test1.pass("Clicked on login button");
         
         test1.info("Test completed");
         extent.flush();
	}

}
