package day5;

public class WhileLoopDemo {

	public static void main(String[] args) {
		
		//Example 1 (Print 1 to 10 number )
		
		/*int i = 1;            //init
		
		while (i<=10)         //condit
		{
		System.out.println(i);
		i++;                   // incre/decre
		
		}*/
		
		//Example 2 ( hello message 10 times print)
		
		/*int i = 1;
		
		while (i<=10)
		{
			System.out.println("hello");
			i++;
			
		}*/
		
		//Example 3 (print even numbers between 1 to 10)
		//Approach 1 
		
		/*int i = 2;
		
		while (i<=10)
		{
			System.out.println(i);
		
			i+=2;     //i=i+2;
		}*/
		//Approach 1

		/*int i = 1;
		
		while (i<=10)
		{
			if (i%2==0) {
			System.out.println(i);
			}
			
			i++;    
		}*/
		//Example 4 ( 1 to 10 print with odd or even)
		
		
		/*int i = 1;
		
		while (i<=10)
		{
			
			if (i%2==0)
			{
				System.out.println("This is even number:" +i);
			}
			else 
				System.out.println("This is odd number :" + i);
			i++;
			
		}*/
		//Example 5 ( print 10 to 1 )
		
		int i = 10;
		
		while (i>=1)   //while (i>0)
		{
        System.out.println(i);
        i--;
        
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}

	}

