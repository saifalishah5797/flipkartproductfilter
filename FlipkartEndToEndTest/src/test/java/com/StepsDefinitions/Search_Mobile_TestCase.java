package com.StepsDefinitions;

import java.io.IOException;

import com.BaseClass.Liberary;
import com.Pages.SearchPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search_Mobile_TestCase  extends Liberary{
     
	SearchPage sp ;
	
	@Given("Launch the Flipkart Application")
	public void launch_the_flipkart_application() throws IOException {
		
		launchApplication();
	    

	}

	@When("close the popup")
	public void close_the_popup() {
	   
         System.out.println(driver.getTitle());
	}

	@Then("It should to Navigate to the Hpmepage")
	public void it_should_to_navigate_to_the_hpmepage() {
	   
        sp = new SearchPage(driver);
        
        sp.homescreen();
       
       
	}

	@Given("User enter the text in the Search field")
	public void user_enter_the_text_in_the_search_field() {
		
		sp.Search("mobile");
	   

	}

	@When("Click the Search button")
	public void click_the_search_button() {
		
		sp.clickSearch();
	  

	}

	@Then("It should navigate to the search result page and display relevant details")
	public void it_should_navigate_to_the_search_result_page_and_display_relevant_details() {
		
		sp.Result();
	    

	}
	@Then("Extract the result and print in console")
	public void extract_the_result_and_print_in_console() {
	    
		sp.printentireresult();
		System.out.println("*****************************");
	}

	@Then("Print the third result and keep it in the console")
	public void print_the_third_result_and_keep_it_in_the_console() {
	    

		sp.print3rdresult();
	}




}
