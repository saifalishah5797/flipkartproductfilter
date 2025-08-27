

// how do you swap two numbers without using a third variable in java?




package javapracticeques;

public class NumberSwap {

	public static void main(String[] args) {
		
      int a = 10 ;
      int b = 20 ;
      
      System.out.println("a is " +a+ " b is " +b);
      
      a  = a + b ;
      b = a - b ;
      a = a - b ;
      
      System.out.println("After swaping a is " +a+ " and  b is " +b);
      

	}

}
