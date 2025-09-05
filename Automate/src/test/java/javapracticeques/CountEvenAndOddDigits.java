package javapracticeques;

public class CountEvenAndOddDigits {

	public static void main(String[] args) {
		
         int num = 5758349;
         
         int Evencount = 0;
         int Oddcount = 0 ;
         
         while(num>0) {
        	 
        	  num = num/10 ;
        	  
        	 if(num%2==0) {
        		 
        		 Evencount++;
        	 }
        	 else {
        		 
        		 Oddcount++ ;
        	 }
         }
         System.out.println("Even number digits : "+Evencount);
         System.out.println("Odd number digits: "+Oddcount);
	}

}
