package day6;
/*
 * Declare an array
 * add value into an array
 * find length of an array
 * read single value from an array
 * read multiple value from an array 
 */

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		//Declare an array
		
		//Approach 1 
		
		int a[][] = new int[3][2] ;
	//	int []a[] = new int[3][2] ;
	//  int [][]a = new int[3][2] ;
		
		a[0][0] = 100;
		a[0][1] = 200;
		
		a[1][0] = 300;
		a[1][1] = 400;
	    
		a[2][0] = 500;
	    a[2][1] = 600;

	    
	  //Approach 2
	    
	    int b[][] = { {100,200},
	    		      {300,400},
	    		      {500,600}
	    		              };
	    
	  //find length of an array
	    System.out.println("Length of rows : "+ b.length);
	    System.out.println("Length  of columns : "+ b[0].length);
	    
	  //read single value from an array
	    System.out.println(b[2][1]);
	    
	  // normal for loop
	 /*   for (int r=0;r<=2;r++)
	    {
	    	for (int c=0;c<=1;c++)          // 0 1 
	    	{
	    	 System.out.print(b[r][c] + "  ");
	    	}
	    	System.out.println();
	    	}*/
	    //enhanced for loop
	    for (int arr[] :b)
	    {
	    	for (int x : arr)
	    	{
	    		System.out.print(x + " ");
	    	}
	    	System.out.println();
	    }
	    
	    
	    
	    
	    }
	  
	}
