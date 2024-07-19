package day9;

public class StringvsStringBuffervsStringBuilder {

	public static void main(String[] args) {

		// String -- Immutable
		String s = "Cyber";
		s.concat("evolve");
		System.out.println(s);

		// StringBuffer -- Mutable
		StringBuffer sbf = new StringBuffer("Cyber");
		sbf.append("evolve");
		System.out.println(sbf); // mutable we can change the original value of sbf

		// StringBuilder -- Mutable
		StringBuilder sbi = new StringBuilder("Cyber");
		sbi.append("evolve");
		System.out.println(sbi); // mutable we can change the original value of sbf

	}

}
