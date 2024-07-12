package day5;

public class CountEvenOddDigits {
	
	    public static void main(String[] args) {
	        int num = 23456;
	        int evenCount = 0;
	        int oddCount = 0;

	        while (num != 0) {
	            int digit = num % 10; // Extract the last digit
	            if (digit % 2 == 0) {
	                evenCount++; // Increment even digit count
	            } else {
	                oddCount++; // Increment odd digit count
	            }
	            num = num / 10; // Remove the last digit
	        }

	        System.out.println("The number of even digits is: " + evenCount);
	        System.out.println("The number of odd digits is: " + oddCount);
	    }
	}
