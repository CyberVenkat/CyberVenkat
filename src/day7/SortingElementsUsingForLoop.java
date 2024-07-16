package day7;

public class SortingElementsUsingForLoop {

	public static void main(String[] args) {
		
		int []a = {50,20,40,10,100};

		        // Bubble Sort Algorithm
		        for (int i = 0; i < a.length - 1; i++) {
		            for (int j = 0; j < a.length - 1 - i; j++) {
		                if (a[j] > a[j + 1]) {
		                    // Swap elements
		                    int temp = a[j];
		                    a[j] = a[j + 1];
		                    a[j + 1] = temp;
		                }
		            }
		        }

		        // Print sorted array
		        System.out.println("Sorted array:");
		        for (int i = 0; i < a.length; i++) {
		            System.out.print(a[i] + " ");
		        }
		    
		

		

	}

}
