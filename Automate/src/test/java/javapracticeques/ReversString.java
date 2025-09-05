package javapracticeques;

public class ReversString {

	public static void main(String[] args) {
		
		
		
		// Using concatination of string 
		
		String str = "MobileTech";
		
		String rev = "";
		
		System.out.println("String brefore Reverse is: "+str);
		
		/*int len = str.length();
		
		for(int i = len - 1 ; i>=0;i--) {
			
			
			rev = rev + str.charAt(i);
		}*/
		
		char a[] = str.toCharArray();
		
		int len = a.length;
		
		for(int i = len -1 ; i>=0;i--) {
			
			
			rev = rev + a[i];
			
			
		}
		
		System.out.println("Reversed String is : "+rev);
	}

}
