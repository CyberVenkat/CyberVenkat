package day13;

public class ThisKeyword {

	int x, y; // Class variables or instance variables

	/*
	 * ThisKeyword(int a, int b) { // Local variables this.x = a; this.y = b;
	 * 
	 * }
	 */
	void setdata(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void display() {
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {

		// ThisKeyword th = new ThisKeyword(100, 200);

		ThisKeyword th = new ThisKeyword();
		th.setdata(10, 20);
		th.display();
	}

}
