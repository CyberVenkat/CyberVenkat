package day12;

public class AdderMain {

	public static void main(String[] args) {

		Adder addobj = new Adder();

		addobj.sum();
		addobj.sum(100, 200);
		addobj.sum(11.0, 10);
		addobj.sum(10, 121.0);
		addobj.sum(10, 20, 30);

		// addobj.sum(10.1,11.1,12.1); is invalid
	}

}
