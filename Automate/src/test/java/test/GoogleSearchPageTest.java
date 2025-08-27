package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchObjects;

public class GoogleSearchPageTest {
	
	
	private static WebDriver driver = null ;

	public static void main(String[] args) {
		
		
		
		googleSearchTest();
	
		

	}
	public static void googleSearchTest() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		GoogleSearchObjects searchobj = new GoogleSearchObjects(driver);
		
		driver.get("https://www.youtube.com/");
		
		searchobj.searchBoxText("Test Automation");
		
		searchobj.searchButton();
		
		
		
		
	}

}
