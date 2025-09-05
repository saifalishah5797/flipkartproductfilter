package javapracticeques;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("Enter your number : ");
		
		int num = sc.nextInt();
		
		/*int rev = 0 ;
		
		while(num!=0) {
			
			rev = rev*10 + num%10 ;
			
			num = num/10 ;
			
		}*/
		
		/*StringBuffer sb = new StringBuffer(String.valueOf(num));
		
		StringBuffer rev =   sb.reverse();
		System.out.println("Reverse number is : "+rev);*/
		
		StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		
		   StringBuilder rev = sbl.reverse();
		   
		   System.out.println("Reverse number is : "+rev);

	}

}
