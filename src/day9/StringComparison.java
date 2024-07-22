package day9;

public class StringComparison {

	public static void main(String[] args) {
		
		//case 1:=
		String s1 = "Welcome";
		String s2 = "Welcome";
		System.out.println(s1==s2);        //true
		System.out.println(s1.equals(s2)); //true
		
		
		//case 2:=
		String s3 = new String("Welcome");
		String s4 = new String("Welcome");
		System.out.println(s3);
		System.out.println(s4);  
		System.out.println(s3==s4);        //false due to compare the objects
		System.out.println(s3.equals(s4)); //true  due to compare the values of the objects
		
		//case 3:=
		String s5 = "Welcome";
		String s6 = new String("Welcome");
		System.out.println(s5==s6);        //false due to compare the objects
		System.out.println(s5.equals(s6)); //true  due to compare the values of the objects
				
		//case 4:=
		String s7 = "Welcome";
		String s8 = new String("Welcome");
		String s9 = s8;
		System.out.println(s7==s8);        //false due to compare the objects
		System.out.println(s7.equals(s8)); //true  due to compare the values of the objects	
		System.out.println(s8==s9);        //true  bcoz objects are same/equal
		System.out.println(s8.equals(s9)); //true  due to compare the values of the objects
						
		System.out.println(s7==s9);        //false due to compare the objects
		System.out.println(s7.equals(s9)); //true  due to compare the values of the objects
		
		
		
		
		
		
		
		
	}

}
