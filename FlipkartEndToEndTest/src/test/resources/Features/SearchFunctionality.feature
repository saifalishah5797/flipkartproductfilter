 Feature: To validate Flipkart Application
 Background:
 Given Launch the Flipkart Application
 When close the popup
 Then It should to Navigate to the Hpmepage
 Scenario: To validate the search functionality
 Given User enter the text in the Search field
 When Click the Search button
 Then It should navigate to the search result page and display relevant details
 And Select Minimum and Maximum Amount
 And Select the Brand
 And Select the Ram 
 Then It should display relevant result