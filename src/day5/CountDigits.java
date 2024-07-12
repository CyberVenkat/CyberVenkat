package day5;

public class CountDigits {

	public static void main(String[] args) {

		        int num = 123456;
		        int count = 0;

		        while (num != 0) {
		            num = num / 10; // Remove the last digit from the number
		            count++; // Increment the digit count
		        }

		        System.out.println("The number of digits is: " + count);
		    }
		}


	