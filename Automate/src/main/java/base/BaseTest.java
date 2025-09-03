package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	protected WebDriver driver ;
	
	@BeforeMethod 
	
	public void setup() {
		
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		
	}
	public void tearDown() {
		
		if(driver != null) {
			
			driver.quit();
			
			
		}
	}
	

}
