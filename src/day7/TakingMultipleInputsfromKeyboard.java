package day7;

import java.util.Scanner;

public class TakingMultipleInputsfromKeyboard {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	/*System.out.println("Enter First number: ");
	int num1 = sc.nextInt();
	System.out.println("Enter Second number :");
	int num2 = sc.nextInt();
	
	System.out.println("Addition of two numbers : " + (num1+num2));   */
		
		System.out.println("Enter name : ");
		String name = sc.next();
		System.out.println("Your name is : " + name);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		System.out.println("Your age is : " + age);
		
		System.out.println("i am " + name + " and i am " + age + " years old");
		
		System.out.println("Enter any value : ");
		Object value = sc.next();
		System.out.println(value);
		
		
		
		
		

	}

}
