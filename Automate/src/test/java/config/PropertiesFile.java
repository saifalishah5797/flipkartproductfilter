package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {
	
	   static Properties prop =  new Properties();

	public static void main(String[] args) throws IOException {
		
           getProperties();
           setProperties();
           getProperties();
	}
	public static void getProperties() throws IOException {
		
        
		
		try {
			
			
		
			InputStream input = new FileInputStream("/Users/saifalishah/Desktop/Automation/Automate/src/test/java/config/config.properties");
			
			prop.load(input);
			
			String  browser  = prop.getProperty("browser");
			System.out.println(browser);
			
			
		} catch (FileNotFoundException e) {
			

			e.printStackTrace();
			
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	public static void setProperties() {
		
		try {
			
			
			OutputStream output = new FileOutputStream("/Users/saifalishah/Desktop/Automation/Automate/src/test/java/config/config.properties");
			prop.setProperty("browser", "firefox");
			prop.store(output, null);
		} catch (Exception e) {
			
            e.printStackTrace();
			
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}

}
