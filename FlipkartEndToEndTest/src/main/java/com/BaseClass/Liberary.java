package com.BaseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Liberary {
	
	
	public static WebDriver driver;
	
	public static Properties prop ;
	
	public void launchApplication() throws IOException  {
		
		
		
         FileInputStream input = new FileInputStream("src/test/resources/Properties/Config.Property");
         
         prop = new Properties();
         prop.load(input);
         
         try {
        	 
        	 if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
        		 
        		 WebDriverManager.chromedriver().setup();
        		 
        		 driver = new ChromeDriver() ;
				
			}
        	driver.manage().window().maximize();
        	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        	driver.get(prop.getProperty("url"));
			
		} catch (Exception e) {
			
			System.out.println("Browser did Not launch");
			

		}

	}
	public void teaDown() {
		
		driver.close();
	}

}
