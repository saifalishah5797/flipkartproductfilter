package test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.GoogleSearchPage;

public class testNG_Demo {
	
	WebDriver  driver = null ;
	
	@BeforeTest
	
	public void setUpTest() {
		
		driver = new ChromeDriver();
		
		
	}

	@Test
	public void googlesearch() throws InterruptedException {
		
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(3000);
		driver.get("https://www.saucedemo.com/");
		
		Thread.sleep(3000);
		
		GoogleSearchPage.Login_Text_Box(driver).sendKeys("standard_user");
		Thread.sleep(3000);

		GoogleSearchPage.Password_Test_Box(driver).sendKeys("secret_sauce");
		Thread.sleep(3000);

		GoogleSearchPage.login_Button(driver).sendKeys(Keys.RETURN);
		
		//driver.close();
		
	}
	
	@AfterTest
	public void teaeDownTest() {
		
		System.out.println("TestNg is Done");
		
	   //driver.close();
		
	}
	

}
