package day9;

public class CountWordsinString {

	public static void main(String[] args) {

		String s = "i am venkat";
		/*
		 * int countword = 0; for (int i=0;i<=s.length()-1;i++) { char currentchar =
		 * s.charAt(i); if (currentchar == ' ') { countword++; } }
		 * System.out.println("Number of words in the String is :" + countword);
		 */

		// Trim leading and trailing spaces and split the string by spaces
		String[] words = s.trim().split("\\s+");

		// The number of words is the length of the resulting array
		int countword = words.length;

		System.out.println("Number of words in the String is: " + countword);
	}
}