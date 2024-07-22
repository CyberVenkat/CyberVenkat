package day14;

public class PassingParamstoMainmethod {

	public static void main(String args[]) {

		System.out.println(args.length);

		for (String value : args) {
			System.out.println(value);
		}

		// System.out.println("Testing");

	}

}
