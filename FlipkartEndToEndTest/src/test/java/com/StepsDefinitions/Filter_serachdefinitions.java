package com.StepsDefinitions;

import org.openqa.selenium.By;

import com.BaseClass.Liberary;
import com.Pages.Filter_Page;
import com.ResusableFunctions.seleniumReusable;

import io.cucumber.java.en.Then;

public class Filter_serachdefinitions extends Liberary{
     Filter_Page fp;
     seleniumReusable se ;
	
	@Then("Select Minimum and Maximum Amount")
	public void select_minimum_and_maximum_amount() throws InterruptedException {
	    
       fp = new Filter_Page(driver);
       fp.min();
       se = new seleniumReusable(driver);
       se.waits();
       fp.max();
       se.waits();
       
	}

	@Then("Select the Brand")
	public void select_the_brand() throws InterruptedException {
		
		fp.brand();
		se.waits();
	    

	}

	@Then("Select the Ram")
	public void select_the_ram() throws InterruptedException {
		
		fp.ram();
		se.waits();
	   

	}

	/*@Then("Select the Battary Capacity")
	public void select_the_battary_capacity() throws InterruptedException {
		
		fp.batteryarrow();
		se.waits();
		fp.batterycapacity();
		se.waits();
		
	    

	}*/

	@Then("It should display relevant result")
	public void it_should_display_relevant_result() {
		
	   driver.findElement(By.xpath("//div[normalize-space()='OPPO F27 Pro+ (Midnight Navy, 128 GB)']"));

	}



}
