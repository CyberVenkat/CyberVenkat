package day7;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingandWritingdataintoArray {

	public static void main(String[] args) {
		
		int []a = new int [5];
		Scanner sc =new Scanner(System.in);
		
		for (int i=0;i<a.length;i++)
		{
			System.out.println("Enter the Value for the Position : " + i + " ");
		    a[i]=sc.nextInt();
		}
		System.out.println("Printing Array Elements: ");
		
		System.out.println(Arrays.toString(a));
		
		
		/*sorting elements using for loop
		 * a={50,20,40,10,100}
		 * after sorting { 10,20,40,50,100}
		 * 
		 * Find missing number in array
		 * a={1245}
		 * number should be in range
		 * should not have duplicates
		 * 
		 * find largest number in array
		 * 
		 * find smallest number in array
		 */
		
		
		
		
		

	}

}
