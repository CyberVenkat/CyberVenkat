package day12;

public class OverloadingMainmethod {

	void main(int x) {
		System.out.println(x);
	}

	void main(String s) {
		System.out.println(s);
	}

	void main(String s1, String s2) {

		System.out.println(s1 + s2);
	}

	public static void main(String[] args) {
		OverloadingMainmethod ovm = new OverloadingMainmethod();
		ovm.main(100);
		ovm.main("venk@");
		ovm.main("ven", "kat");

	}

}
