package day7;

public class DuplicatesInArray {
	
	public static void main (String args[]) {
		
		int a [] = {10,20,10,10,20};
		int num = 10;
		int count = 0;
		
		for (int value:a)
		{
			if (value == num)
			{
				count++;                 //1 2 3
			}
		}
		
	    System.out.println(count);

}
}
