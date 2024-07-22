package day13;

public class StaticMain {

//	public static void main(String[] args)  //Valid
//
//	static public void main(String[] args)  //Valid
//
//	public void static main(String[] args)  //Invalid
//
//	void main(String[] args) public static  //Invalid
//
//	public static void main(int a [])  //valid but not a main method normal method
//

	public static void main(String[] args) {

		// Static methods can access static Stuffs directly (without objects)
		System.out.println(StaticDemo.a);
		StaticDemo.m1();
		// m2(); // cannot access because of m2 is non-static
		// System.out.println(b); // cannot access because of b is non-static

		// Static methods can access non-static Stuffs through objects.
		// StaticDemo sd = new StaticDemo();

//		System.out.println(sd.b);
//		sd.m2();
//		sd.m();

		System.out.println(StaticDemo.s.length());

	}

}
