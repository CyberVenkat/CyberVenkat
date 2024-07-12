package day5;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 1234;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10; // Extract the last digit
            sum += digit;         // Add the digit to the sum
            num = num / 10;       // Remove the last digit
        }

        System.out.println("The sum of digits is: " + sum);
    }
}
