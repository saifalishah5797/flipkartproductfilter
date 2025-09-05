package javapracticeques;

import java.util.Scanner;

public class CountNumberOfdigits {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number: ");
      
		  int num = sc.nextInt();
		  
		  int counts  = 0;
		  
		  
		  while(num>0) {
			  
			  num = num/10 ;
			  
			  counts++ ;
		  }
		  
		  System.out.println("Number of digits :"+counts);

	}

}
