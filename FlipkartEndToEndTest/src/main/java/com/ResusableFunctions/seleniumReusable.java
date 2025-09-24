package com.ResusableFunctions;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.BaseClass.Liberary;

public class seleniumReusable extends Liberary {
	
	
	public seleniumReusable(WebDriver driver) {
		
		this.driver = driver ;
		
		
	}
	
	//Enter the value
	public void EnterValue(WebElement element ,String text) {
		
		try {
			
			element.sendKeys(text);
			
		} catch (Exception e) {
			
              System.out.println("No Such ELement Exception");
		}
	}
	// Click on the button
	public void Click(WebElement element) {
		
		try {
			element.click();
			
		} catch (Exception e) {
			
			System.out.println("No Such ELement Exception");
		}
		
	}
	//get title of the page
	public void getTitle() {
		
		try {
			
			System.out.println(driver.getTitle());
			
		} catch (Exception e) {
			
			System.out.println("could not get title");
			
		}
	}
	
	//Get screenshot 
	public void screenshot(String path) {
		
		TakesScreenshot TS = (TakesScreenshot)driver ;
		File source = TS.getScreenshotAs(OutputType.FILE);
		
		try {
			
			FileUtils.copyFile(source, new File(path));
			
		} catch (Exception e) {
			
			System.out.println("ScreenShot Not Found");

		}
	}
	public void MultipleGettext(List<WebElement> element) {
		
		List<WebElement> text = element ;
		System.out.println(text.size());
		for(WebElement textcount : text) {
			
			   String totallist = textcount.getText();
			   System.out.println("*******************************************");
			   System.out.println(totallist);
			
			
		}
		
	}
	public void GetValue(WebElement element) {
		
		     String Text = element.getText();
		     System.out.println(Text);
	}
	public void Dropdown(WebElement element ,String Text) {
		
		
		Select drp = new Select(element);
		drp.selectByValue(Text);
	}
	public void scrollDown(WebElement element) {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    // Scroll down by 500 pixels
	    js.executeScript("window.scrollBy(0, 500);");

	    // Wait a bit to ensure scroll is complete (optional but recommended)
	    try {
	        Thread.sleep(500);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }

	    // Click the element
	    js.executeScript("arguments[0].click();", element);
	}

	public void waits() throws InterruptedException {
		 
		Thread.sleep(5000);
	}

}
