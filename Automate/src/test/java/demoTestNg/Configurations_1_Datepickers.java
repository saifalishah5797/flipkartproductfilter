package demoTestNg;

import org.testng.annotations.*;

public class Configurations_1_Datepickers {
	
@Test
	
	public  void test1_BootstrapDatePicker() {
		
		System.out.println("     (1)Test Method 1 : Bootstrap date picker");
	}
@Test
	
	public void test2_JQueryDatePicker() {
		
		System.out.println("     (2)Test Method 2: JQuery date picker");
	}

@BeforeMethod

public  void BeforeMethod() {
	
	System.out.println("    (4)Execute before method Each test Date Picker");
	
	
}

@AfterMethod
   

    public  void AfterMethod() {
	
	System.out.println("    (4)Execute After method Each test Date Picker");
}
@BeforeClass
  public void beforeClass() {
	
	System.out.println("   (3)Excute Before Class Each test Date Picker ");
}
@AfterClass
public void AfterClass() {
	
	System.out.println("   (3)Excute After Class Each test Date Picker ");
}

}
