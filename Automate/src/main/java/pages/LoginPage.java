package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	
	private WebDriver driver ;
	
	private By UserNameTextBox = By.xpath("//input[@id='username']");
	
	private By PasswordtextBox = By.xpath("//input[@id='password']");
	
	private By LoginButton  = By.xpath("//button[@id='submit']");
	
	
	public LoginPage(WebDriver driver) {
		
		
		this.driver = driver ;
	}
	public void enterUserName(String username) {
		
		driver.findElement(UserNameTextBox).clear();
		
		driver.findElement(UserNameTextBox).sendKeys(username);
	}
	public void enterPassword(String password) {
		
		driver.findElement(PasswordtextBox).clear();
		driver.findElement(PasswordtextBox).sendKeys(password);
		
	}
	public void clickOnLoginButton(){
		
		driver.findElement(LoginButton).click();
		
	}	
	
	

}
