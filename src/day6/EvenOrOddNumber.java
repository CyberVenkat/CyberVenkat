package day6;

public class EvenOrOddNumber {

	public static void main(String[] args) {
		
		int a [] = new int [5];
		
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		
		for (int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("This is Even Number :" + a[i]);
			}
			else
			{
				System.out.println("This is Odd Number :" + a[i]);
			}
			
			
		}
		
		
		
		
		
		
		
	}
	
}
