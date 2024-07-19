package day9;

import java.util.Arrays;

public class MutablevsImmutable {

	public static void main(String[] args) {
		
		
		//Mutable -- can change
		int a [] = {20,10,30,40,50};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);  //mutable
		System.out.println(Arrays.toString(a));
		
		//Immutable -- can not change
		String s = new String("Welcome");
		s.concat("to Java");
		System.out.println(s); 
		
		String s1 = new String("Welcome");
		System.out.println(s1.concat("to Java"));
		System.out.println(s);
		
		String s2 = new String("Welcome");
		String concatstring=  s2.concat("to Java");
		
		System.out.println(s);
		System.out.println(concatstring);
		
		
		
		
	}

}
