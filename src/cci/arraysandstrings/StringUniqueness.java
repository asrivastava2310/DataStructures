package cci.arraysandstrings;

/*
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 */
public class StringUniqueness {

	public static void main(String[] args) {
		String input = "Hi There";
		System.out.println(isUniqueUsingadditionalDataStructure(input));
	}

	// Assuming String is extended ASCII(0-255) i.e. there are 256 characters
	private static boolean isUniqueUsingadditionalDataStructure(String input) {
		if(input.length() > 256) {  //base case
			return false;
		}
		boolean[] chars = new boolean[256];
		for (int i = 0; i < input.length(); i++) {
			int index = input.charAt(i);
			if (chars[index]) {
				return false;
			}
			chars[index] = true;
		}
		return true;
	}

}
