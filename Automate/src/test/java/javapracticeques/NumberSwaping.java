package javapracticeques;

public class NumberSwaping {
	
	
	public static void main(String[] args) {
	   
		
		int a =10 ;
		int b = 20 ;
		
		System.out.println("before swapping value of a and b is :"+a +" "+  b );
		
		// Logic with help of third variable .
		/*int t = a ;
		
		a =b;
		b= t ;*/
		
		// Logic without help of third variable 
		
		a = a + b ;
		
		b = a - b ;
		
		a = a - b ;
		
		
		
		
		
		System.out.println("After swapping value of a and b is :"+a +" "+  b);
	}
	
	
}
