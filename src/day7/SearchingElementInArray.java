package day7;

public class SearchingElementInArray {    //Linear search

	public static void main(String[] args) {
		int a [] = new int [5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		int search_element = 100;
		boolean status = false;   // false = not found         true = found 
		/*for (int i=0;i<a.length;i++)
		{
		 if (a[i]==search_element)
		 {
			 System.out.println("Element is Found");
			 status = true;
			 break;
		}
		}
		if (status == false)
		{
			System.out.println("Element is not found");
		}*/
		
		
		for (int x:a)	
		{
			 if (x==search_element)
			 {
				 System.out.println("Element is Found");
				 status = true;
				 break;
			}
			}
			if (status == false)
			{
				System.out.println("Element is not found");
			}
		
		
		

	}

}
