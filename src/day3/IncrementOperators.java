package day3;

public class IncrementOperators {

	public static void main(String[] args) {
		
		// ++ is called as increment operators
		//case 1 
		int a =10;
		System.out.println(a);
		
		a++;          //a=a+1;
		System.out.println(a);
		
		//case 2 Post Increment
		int b =20;
		int res = b++;
		System.out.println(res); //20
		System.out.println(b); //21
		
		//case 3 Pre Increment
		
		int c =30;
		int resu = ++c;
		System.out.println(resu); //31
		System.out.println(c);  //31
		
	
	}

}
