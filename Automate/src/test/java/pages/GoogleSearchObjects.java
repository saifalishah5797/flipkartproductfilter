package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchObjects {
	
	WebDriver driver = null ;
	
	
	By textbox_search =  By.xpath("//input[@placeholder='Search']");
	
	By search_button = By.xpath("//button[@title='Search']//div");
	
	
	public GoogleSearchObjects(WebDriver driver) {
		
		this.driver  = driver ;
		
		
	}
	
	public void searchBoxText(String text) {
		 
		 
		 driver.findElement(textbox_search).sendKeys(text);
		 
		 
		 
	 }
	public void searchButton() {
		
		
		driver.findElement(search_button).click();
		System.out.println("Test Automation Done");
	}


 }
 

