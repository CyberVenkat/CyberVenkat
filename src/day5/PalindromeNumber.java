package day5;

public class PalindromeNumber {
	
	public static void main (String[] args) {
		
		int num = 123;
		int originalnumber = num;
		int reversed = 0;
		
		while (num != 0 )
		{
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num = num /10 ;
		}
		if (originalnumber == reversed)
		{
			System.out.println("The given number is palindrome");
		}
		else 
		{
			System.out.println("The given number is not a palindrome");
		}
		
		
		
		
		
		
	}

}
