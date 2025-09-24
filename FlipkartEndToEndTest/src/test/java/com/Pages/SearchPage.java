package com.Pages;

import java.awt.SplashScreen;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Liberary;
import com.ResusableFunctions.seleniumReusable;

public class SearchPage extends Liberary{
	
	seleniumReusable se ;
	
	public SearchPage(WebDriver driver) {
		
		this.driver = driver ;
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//input[@placeholder='Search for Products, Brands and More']")
	WebElement Searchtext ;
	
	@FindBy(xpath = "//div[@class='_3sdu8W emupdz']")
	
	WebElement Homepage ;
	
	@FindBy(xpath = "//body/div[@id='container']/div/div[@class='nt6sNV JxFEK3 _48O0EI']/div[@class='DOjaWF YJG4Cf']/div[@class='DOjaWF gdgoEp']/div[2]/div[1]/div[1]/div[1]/a[1]/div[2]/div[1]")
	
	WebElement Searchresult ;
	
	@FindBy(xpath = "//div[@id='container']//div[contains(@class,'col') and contains(@class,'-12-12')]")
	
	List<WebElement> Entireresult ;
	
	@FindBy(xpath = "//div[text()= \"REDMI A3X (Ocean Green, 128 GB)\"]")
	
	WebElement Thirdresult ;
	
	public void Search(String Text) {
		
		se = new seleniumReusable(driver);
		se.EnterValue(Searchtext, Text);
	}
	public void clickSearch() {
		
		Searchtext.sendKeys(Keys.ENTER);
	}
	public void homescreen() {
		
		System.out.println(Homepage.isDisplayed());
	}
	public void Result() {
		
		System.out.println(Searchresult.isDisplayed());
		
		System.out.println(driver.getTitle());
		
	}
	public void printentireresult() {
		
		se.MultipleGettext(Entireresult);
	}
	public void print3rdresult() {
		
		
		se.GetValue(Thirdresult);
	}

}
