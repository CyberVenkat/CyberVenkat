package day8;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		
		
		   String s = "Welcome" ;            //approach 1
		// String s = new String ("Welcome");  //approach 2

		 
		 System.out.println(s);
		 
		 //length() --  return length of a String (Number of characters)
		 int l = s.length();
		 System.out.println(l);
		 System.out.println("Welcome".length());
		 
		 //Concat() -- Joining Strings
		 String s1 ="to india";
		 System.out.println(s+" " +s1); //normal approach
		 System.out.println(s.concat(" "+s1)); // concat method approach
		 
		 String s2 = "Guys";
		 System.out.println(s+" "+s1+" " + s2);
		 System.out.println(s.concat(" "+s1+" "+s2));
		 
		 System.out.println(s.concat(s1).concat(s2));
		 
		 System.out.println("welcome".concat("to").concat("India"));
		 
		 //trim -- it will remove spaces right and left side
		 
		 String s5= "   Welcome   ";
		 
		 System.out.println(s5);
		 System.out.println("Before trim " + s5.length());
		 System.out.println(s5.trim());
		 System.out.println("After trim " + s5.trim().length());
		 
		 
		 String s6 = s5.trim();
		 System.out.println(s6.length());
		 
		 
		 //charAt() -- return a character from a string based on index
		 
		 String s7="Welcome";
		 System.out.println(s7.charAt(3));   
		 System.out.println(s7.charAt(0));
		 
		 //contains() -- checks String is a  part of the main string or not always returns true or false
		 
		 System.out.println(s7.contains("Wel"));    // true
		 System.out.println(s7.contains("come"));   // true
		 System.out.println(s7.contains("wel"));    // false
		 System.out.println(s7.contains("Come"));    // false
		 System.out.println(s7.contains("Welcme"));    // false
		 
		 //equals() and equalsIgnoreCase() -- Compare strings 
		 
		 String s8 = "Welcome";
		 System.out.println(s7==s8);    //true
		 System.out.println(s7.equals(s8));  //true
		 System.out.println(s7.equals("welcome")); // false
		 System.out.println(s7.equalsIgnoreCase("welcome"));  //true
		 
		 //replace -- replace single/multiple(sequence) of characters in a string
		 String s9="Welcome to selenium java selenium python selenium c#";
		 System.out.println(s9.replace('e', 'x')); //Wxlcomx to sxlxnium java sxlxnium python sxlxnium c#
		 System.out.println(s9.replace("selenium", "playwright"));
		 
		 
		 //substring() -- extract substring from the main string
		 //starting index count from 0
		 //ending index count from 1
		 
		 String s10 = "Selenium";
		 System.out.println(s10.substring(1,5));  //elen
		 System.out.println(s10.substring(0,3));  //Sel
		 
		 //toUppercase() toLowercase()
		 System.out.println(s10.toUpperCase());
		 System.out.println(s10.toLowerCase());
		 
		 
		 //split() -- split the string into multiple parts based on delimeter.
		 String s11= "venkat@gmail.com";
		 String a[] = s11.split("@");
		 System.out.println(a[0]);
		 System.out.println(a[1]);
		 
		 
		 //ex1
		 String s12 = "$12,13,14";
		 System.out.println(s12.replace("$","").replace(",",""));
		 
		 //ex2
		 String s13 = "abc,123@xyz";
		 String arr [] = s13.split(",");
		 System.out.println(Arrays.toString(arr));
		 
		 String arr1[]=arr[1].split("@");
		 System.out.println(Arrays.toString(arr1));
		 
		 System.out.println(arr[0]);
		 System.out.println(arr1[0]);
		 System.out.println(arr1[1]);
		 
		 //ex3
		 String s14 = "abc 123";
		 Object ar [] = s14.split(" ");
		 System.out.println(Arrays.toString(ar));
		 
		 // * % ^ & ( )  you cannot use as delimeter
		 
		 //ex4
		 String name = "John Kenedy";
		 System.out.println(name.replace('J','j').contains("john"));
		 System.out.println(name.toLowerCase().contains("john"));
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
