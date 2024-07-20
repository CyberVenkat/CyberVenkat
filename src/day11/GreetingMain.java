package day11;

public class GreetingMain {

	public static void main(String[] args) {

		Greetings gr = new Greetings();

		// Method 1
		gr.m1();

		// Method 2
		String s = gr.m2();
		System.out.println(s);

		// Method 3
		gr.m3("Venkat");

		// Method
		String var = gr.m4("Akshay");
		System.out.println(var);
	}

}
