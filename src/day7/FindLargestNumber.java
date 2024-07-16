package day7;

public class FindLargestNumber {

	public static void main(String[] args) {
		
		int []a = {50,20,40,10,100};
		
		// Assume the first element is the largest
        int largest = a[0];
        
        // Iterate through the array
        for (int i = 1; i < a.length; i++) {
            if (a[i] > largest) {
                largest = a[i];
            }
        }
        
        // Print the largest number
        System.out.println("The largest number is: " + largest);
    


	}

}
