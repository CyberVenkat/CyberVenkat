package day12;

public class Adder {

	int a = 10, b = 20;

	void sum() { // No param
		System.out.println(a + b);
	}

	void sum(int x, int y) { // no of param are different
		System.out.println(x + y);
	}

	void sum(int x, double y) { // data type of param are different
		System.out.println(x + y);
	}

	void sum(double x, int y) { // order of data type are different
		System.out.println(x + y);
	}

	void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}

}
