package day9;

public class CharacterOccurrencesinaString {

	public static void main(String[] args) {

		String s = "asdfgabca";
		int countA = 0;
		int countB = 0;
		int countC = 0;

		for (int i = 0; i <= s.length() - 1; i++) {
			char currentChar = s.charAt(i);
			if (currentChar == 'a') {
				countA++;
			} else if (currentChar == 'b') {
				countB++;
			} else if (currentChar == 'c') {
				countC++;

			}
		}

		// Print the counts of 'a', 'b', and 'c'
		System.out.println("Number of 'a': " + countA);
		System.out.println("Number of 'b': " + countB);
		System.out.println("Number of 'c': " + countC);

	}

}
