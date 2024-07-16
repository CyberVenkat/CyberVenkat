package day7;

public class FindSmallestNumber {

	public static void main(String[] args) {
		
		int []a = {50,20,40,10,100};
		
		// Assume the first element is the smallest
        int smallest = a[0];
        
        // Iterate through the array
        for (int i = 1; i < a.length; i++) {
            if (a[i] < smallest) {
                smallest = a[i];
            }
        }
        
        // Print the smallest number
        System.out.println("The smallest number is: " + smallest);
    }

	}


