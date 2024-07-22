package day13;

public class StaticDemo {

	static int a = 10; // Static variable
	static String s = "Welcome";

	int b = 20; // Non Static variable

	static void m1() { //// Static method
		System.out.println("This is m1 static method");
	}

	void m2() // Non static method
	{
		System.out.println("This is m2 non static method");
	}

	void m() // Non static methods can call all in
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}

	/*
	 * public static void main(String[] args) {
	 * 
	 * // Static methods can access static Stuffs directly (without objects)
	 * System.out.println(a); m1(); // m2(); // cannot access because of m2 is
	 * non-static // System.out.println(b); // cannot access because of b is
	 * non-static
	 * 
	 * // Static methods can access non-static Stuffs through objects. StaticDemo sd
	 * = new StaticDemo();
	 * 
	 * // System.out.println(sd.b); // sd.m2(); sd.m();
	 */
}
