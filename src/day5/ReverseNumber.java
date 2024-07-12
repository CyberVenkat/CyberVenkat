package day5;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int i = 1234;
		int reversed = 0;
		
		while (i!=0)
		{
			int digit = i % 10;                  // to find the last digit
			reversed = reversed * 10+ digit;    // to assign the reverse number
			i = i /10;                         // to remove the last digit
				
		}

		System.out.println("Reversed nuber is : " + reversed);
	}

}
