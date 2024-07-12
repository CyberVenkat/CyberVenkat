package day3;

public class SwappingNumbers {

	public static void main(String[] args) {
		
		
		int a = 5;
		int b = 10;

		// Swapping using arithmetic operations
		
		a = a + b;   // a now becomes 15
		b = a - b;   // b now becomes 5
		a = a - b;   // a now becomes 10

		System.out.println("After swapping:");
			
		System.out.println("a value is :"+a);
		
		System.out.println("b Value is :"+b);

	   // Swapping using a single line expression
	   b = (a + b) - (a = b);

       System.out.println("After swapping:");
	   System.out.println("a value is: " + a);
	   System.out.println("b value is: " + b);
		    
        // Swapping using multiplication and division
        a = a * b;   // a now becomes 50
        b = a / b;   // b now becomes 5
        a = a / b;   // a now becomes 10

        System.out.println("After swapping:");
        System.out.println("a value is: " + a);
        System.out.println("b value is: " + b);


	    // Swapping using bitwise XOR
	     a = a ^ b;
	     b = a ^ b;
	     a = a ^ b;

		   System.out.println("After swapping:");
		   System.out.println("a value is: " + a);
		   System.out.println("b value is: " + b);
	




	}

}
