package day3;

public class DecrementOperators {

	public static void main(String[] args) {
			
		// -- is called as decrement operators
	
		//case 1 
				int a =10;
				System.out.println(a);
				
				a--;          //a=a-1;
				System.out.println(a);
				
				//case 2 Post Decrement
				int b =20;
				int res = b--;
				System.out.println(res); //20
				System.out.println(b); //19
				
				//case 3 Pre Decrement
				
				int c =30;
				int resu = --c;
				System.out.println(resu); //29
				System.out.println(c);  //29
				
			
	
	
	
	}

}
