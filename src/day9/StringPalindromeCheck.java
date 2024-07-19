package day9;

public class StringPalindromeCheck {
	
	
	public static void main (String args[]) {
		
		/*Assignments
		1.Check the string is palindrome or not
		String s = "MADAM";
		output is palindrome
		String t = "Welcome";
		output is not palindrome
		*/
		
	  //Case 1 :=
	/*	String s  ="MADAM";
		String s1 = "welcome";
		checkpalindrome(s);
		checkpalindrome(s1);
	}
		public static void checkpalindrome (String str) {
		String rev ="";
		for (int i =str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if (str.equals(rev))		
		{
			System.out.println("The String is palindrome: " + str);
		}
		else
		{
			System.out.println("The String is not palindrome: " + str);
		}*/
		
		//Case 2 :=
		String s2  ="MADAM";
		String s3  ="welcome";
		
		
		String rev1 ="";
		String rev2 ="";
		
		for (int i =s2.length()-1;i>=0;i--)
		{
			rev1=rev1+s2.charAt(i);
		}
		if (s2.equals(rev1))		
		{
			System.out.println("The String is palindrome: " + s2);
		}
		else
		{
			System.out.println("The String is not palindrome: " + s2);
		}
	
		for (int i =s3.length()-1;i>=0;i--)
		{
			rev2=rev2+s3.charAt(i);
		}
		if (s3.equals(rev2))		
		{
			System.out.println("The String is palindrome: " + s3);
		}
		else
		{
			System.out.println("The String is not palindrome: " + s3);
		}
		
		
		
		
		
		
		
		
		
		
	}
	

}
