package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitInSelenium {

	public static void main(String[] args) {
		
       WebDriverManager.chromedriver().setup();
       
       WebDriver driver = new ChromeDriver();
       
       driver.manage().window().maximize();
       
       //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
       driver.get("https://fakestoreapi.com");
       
       driver.findElement(By.xpath("//span[contains(text(),'Read')]")).click();
       
       WebDriverWait wait = new WebDriverWait(driver,10);
       
       driver.findElement(By.xpath("ABDBD"));

	}

}
