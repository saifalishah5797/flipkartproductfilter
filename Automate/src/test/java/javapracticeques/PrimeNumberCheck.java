
// Write a java program to check  if the given number is a prime number

package javapracticeques;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		System.out.println(isPrime(19)); // true
		System.out.println(isPrime(49)); // false
		
		
	}
	public static boolean isPrime(int n) {
		
		if(n == 0 || n == 1) {
			
			return false ;
		}
		if(n == 2) {
			
			return true ;
		}
		for(int i = 2 ; i<=n/2;i++) {
			
			if(n%i == 0) {
				
				return false ;
			}
		}
		return true;
			
	}

}
