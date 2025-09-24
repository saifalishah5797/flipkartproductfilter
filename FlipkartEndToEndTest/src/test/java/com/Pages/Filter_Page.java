package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Liberary;
import com.ResusableFunctions.seleniumReusable;

public class Filter_Page extends Liberary{
	
	seleniumReusable se ;
	
	public Filter_Page(WebDriver driver) {
		
		
		PageFactory.initElements(driver,this);
		
		
		
	}
	@FindBy(xpath = "//div[@class='suthUA']//select[@class='Gn+jFg']")
	
	WebElement MinimumAmount;
    @FindBy(xpath = "//div[@class='tKgS7w']//select[@class='Gn+jFg']")
    
    WebElement MaximumAmount;
    
    @FindBy(xpath = "//div[contains(text(),'OPPO')]")
    
    WebElement Brand ;
    
    @FindBy(xpath = "//div[contains(text(),'8 GB and Above')]")
    
    WebElement Ram ;
    
   /* @FindBy(xpath = "//div[contains(text(),'Battery Capacity')]")
    WebElement Batteryarrow ;*/
    
    /*@FindBy(xpath = "//div[contains(text(),'4000 - 4999 mAh')]")
    WebElement BatteryCapacity ;*/
    
    public void min() {
    	
    	se  = new seleniumReusable(driver);
    	se.Dropdown(MinimumAmount, "10000");
    }
    public void max() {
    	
    	se.Dropdown(MaximumAmount, "20000");
    }
    public void brand() {
    	
    	se.Click(Brand);
    }
    public void ram() {
    	se.scrollDown(Ram);
    	se.Click(Ram);
    }
   /* public void batteryarrow() {
    	
    	se.scrollDown(Batteryarrow);
    	se.Click(Batteryarrow);
    	
    }
    public void batterycapacity() {
    	se.scrollDown(BatteryCapacity);
    	se.Click(BatteryCapacity);
    }*/
    
}
