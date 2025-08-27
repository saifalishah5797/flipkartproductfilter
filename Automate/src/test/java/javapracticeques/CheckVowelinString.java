package javapracticeques;

public class CheckVowelinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(checkVowelInString("HelloWorld"));
		System.out.println(checkVowelInString("HW"));
		
		

	}
	public static boolean checkVowelInString(String input) {
		return input.toLowerCase().matches(".*[aeiou].*");
		
		
		
		
	}

}
