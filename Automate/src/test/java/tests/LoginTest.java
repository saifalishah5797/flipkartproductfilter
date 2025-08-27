package tests;

import org.junit.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {
	
	@Test
	public void testValidationLogin() {
		
		LoginPage loginpage = new LoginPage(driver);
		
		loginpage.enterUserName("student");
		loginpage.enterPassword("Password123");
		loginpage.clickOnLoginButton();
		
		System.out.println("title of the Page : "+ driver.getTitle());
		
		Assert.assertEquals(driver.getTitle(), "Logged In Successfully | Practice Test Automation");
	}

}
