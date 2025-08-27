package googlelaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EngineLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Hello");
       
       WebDriver driver = new ChromeDriver();
       
       driver.manage().window().maximize();
       
       driver.get("https://mvnrepository.com");
       
       System.out.println("Hello");
	}

}
