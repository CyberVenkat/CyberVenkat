package day9;

public class ReverseAString {

	public static void main(String[] args) {

		// Approach 1:= by using length() and charAt()

		/*
		 * String s="Welcome to cyber"; String rev = ""; for (int
		 * i=s.length()-1;i>=0;i--) { //System.out.print(s.charAt(i));
		 * 
		 * rev =rev+s.charAt(i); } System.out.println("Reverse String is : "+ rev);
		 * 
		 */
		// Approach 2:= converting string to char array type (without using string
		// methods)

		/*
		 * String s1 = "Welcome"; String rev1 = ""; char a [] = s1.toCharArray();
		 * 
		 * for (int i=a.length-1;i>=0;i--) { //System.out.print(a[i]); rev1=rev1+a[i]; }
		 * System.out.println("Reverse String is : "+ rev1);
		 */

		// Approach 3:= Using StringBuffer class
		/*
		 * StringBuffer s = new StringBuffer("Welcome"); //StringBuffer s = "Welcome";
		 * /not possible bcoz mutable System.out.println("Reverse String is : "
		 * +s.reverse());
		 */

		// Approach 4:= Using StringBuilder class
		StringBuilder s = new StringBuilder("Welcome");
		// StringBuilder s = "Welcome"; /not possible bcoz mutable
		System.out.println("Reverse String is : " + s.reverse());

		// immutable - we cannot change
		// mutable - we can change

	}

}
