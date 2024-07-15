package day6;

public class SumofArray {

	public static void main(String[] args) {
		/*int a [] = new int [5];
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		int sum = 0;
		for (int i =0; i<a.length;i++)
		{
			sum += a[i];
		
		}
			
		System.out.println("Sum of the Array is: " + sum); 
		
		int a []= {10,20,30,40,50};
		
		int sum = 0;
		
		for (int i=0;i<a.length;i++)
		{
			sum += a[i];
		}
		System.out.println("Sum of the Array is: " + sum);  */
		
		int a[][] = new int[3][2] ;
			
			a[0][0] = 100;
			a[0][1] = 200;
			
			a[1][0] = 300;
			a[1][1] = 400;
		    
			a[2][0] = 500;
		    a[2][1] = 600;
		    
		    int sum = 0;
		    
		    for (int i=0;i<a.length;i++)
		    {
		    	for (int j=0;j<a[i].length;j++)
		    {
		     sum += a[i][j];
		    }
		    }
		    System.out.println("Sum of the Array is: " + sum);
		
		
		
		
		

	}

}
