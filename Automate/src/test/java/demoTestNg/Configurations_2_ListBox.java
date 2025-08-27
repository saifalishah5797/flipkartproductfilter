package demoTestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Configurations_2_ListBox {
	
@Test
	
	public  void test1_JQueyListBox() {
		
		System.out.println("     (6)Test Method 1 : JQery List Box");
	}
@Test
	
	public void test2_JQueryListBox() {
		
		System.out.println("     (7)Test Method 2: JQuery List B0x");
	}

@BeforeMethod

public  void BeforeMethod() {
	
	System.out.println("    (4)Execute before method Each test List Box");
	
	
}

@AfterMethod
   

    public  void AfterMethod() {
	
	System.out.println("    (4)Execute After method Each test List Box");
}
@BeforeClass
  public void beforeClass() {
	
	System.out.println("   (3)Excute Before Class Each test List Box");
}
@AfterClass
public void AfterClass() {
	
	System.out.println("   (3)Excute After Class Each test List Box ");
}

}
