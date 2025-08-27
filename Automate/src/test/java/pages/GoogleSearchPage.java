package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
	
	
	private static WebElement  element = null ;
	
	
	public static WebElement Login_Text_Box(WebDriver driver) {
		
		
		   element = driver.findElement(By.xpath("//input[@id='user-name']"));
		
		    return element ;
		
		
	}
	
	public static WebElement Password_Test_Box(WebDriver driver) {
		
		element  =  driver.findElement(By.xpath("//input[@id='password']"));
		return element ;
	}
	public static WebElement login_Button(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//input[@id='login-button']"));
		
		return element ;
	}

}
