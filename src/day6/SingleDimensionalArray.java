package day6;
/*
 * Declare an array
 * add value into an array
 * find length of an array
 * read single value from an array
 * read multiple value from an array 
 */

public class SingleDimensionalArray {

	public static void main(String[] args) {
		//Declaring array 
			
		//approach1 := already know fixed values and can't add more in future
		
		int a [] = new int [5];
	//	int [] a = new int [5];
		
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		System.out.println(a [1]);
		
		//approach2 := don't know values and can add more in future
		
		int b[]= {100,200,300,400,500};
		
		//find length of an array
		
		System.out.println("Length of an array: " + b.length);
		
		//read single value from an array
		
		System.out.println(a[4]); //here 4 is an index
		
		//reading all the value from an array using normal for loop
		
		for (int i=0;i<a.length;i++)   // i<=4   i<5  i<=a.length-1  i<a.length
		{
			System.out.println(a[i]); // 100 200 300 400 500
		}
		// using enhanced for loop or for each loop
		
		for (int x:a)
		{
			System.out.println(x);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
