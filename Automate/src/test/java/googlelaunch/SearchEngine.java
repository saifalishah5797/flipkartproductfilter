package googlelaunch;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchEngine {
	
	
	
   public static void main(String[] args) throws InterruptedException {
	   
	   WebDriverManager.chromedriver().setup();
	   
	   WebDriver driver = new ChromeDriver();
	   
	   driver.manage().window().maximize();
	   
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   
	   driver.get("https://www.youtube.com/");
	   
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("@Saif07867");
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//button[@title='Search']//div")).click();
	   Thread.sleep(3000);
	   
	   driver.findElement(By.xpath("//ytd-channel-name[@id='channel-title']//yt-formatted-string[@id='text']")).click();
	   
	   Thread.sleep(3000);
	   
	   driver.findElement(By.xpath("//ytd-grid-video-renderer[1]//div[1]//ytd-thumbnail[1]//a[1]//yt-image[1]//img[1]")).click();
	   
	   System.out.println("Saif Youtube Channel is open");
	   
	   
	   //driver.close();
	   
	   System.out.println("Run code done");
	
}

}
