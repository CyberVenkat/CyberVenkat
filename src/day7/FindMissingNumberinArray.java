package day7;

public class FindMissingNumberinArray {

	public static void main(String[] args) {
		
		int [] a = {1,2,3,5,6,7};
		
		int n = a.length+1;
		int expectedsum = n*(n+1)/2;
		
		int actualsum = 0;
		
		for (int i=0;i<a.length;i++)
		{
			actualsum += a[i];
			
		}
		int missingnumber = expectedsum - actualsum ;
		
		System.out.println("The Missing Number is : " + missingnumber);

	}

}
