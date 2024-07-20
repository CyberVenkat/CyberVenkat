package day11;

public class Greetings {

	// No param and no return value

	void m1() {
		System.out.println("Hello");

	}
	// No param and give return value

	String m2() {
		return ("Hello how are you");

	}

	// Take param and no return value

	void m3(String name) {
		System.out.println("My name is : " + name);

	}

	// Take param and gives return value
	String m4(String name) {
		return ("My roommate name is : " + name);
	}

}
