package day5;

public class ForLoopDemo {

	public static void main(String[] args) {
		
	//	Ex := print 1 to 10
		
		for (int i=1; i<=10; i++)
		{
			System.out.println(i);
		}
				
	//  Ex2 : Print even number fron 1 to 10
		
		for (int j=2; j<=10; j+=2)
		{
			System.out.println(j);
		}
		
	// Ex3 := print 1 to 10 with text of even or odd
		
		for (int k=1;k<=10;k++)
		{
			if (k%2==0)
			{
				System.out.println("It is even number : " + k);
			}
			else 
			{
				System.out.println("It is odd Number : " + k);
			}
		}
		//Example print 10 to 1
		
		for (int l=10;l>0;l--)
		{
			System.out.println(l);
		}
		
		
		
		
		
		
		
		
		

	}

}
