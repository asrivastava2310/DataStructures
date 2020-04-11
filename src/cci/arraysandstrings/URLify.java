package cci.arraysandstrings;

/*
 *  Write a method to replace all spaces in a string with '%20'. You may assume that the string
	has sufficient space at the end to hold the additional characters, and that you are given the "true"
	length of the string. (Note: if implementing in Java, please use a character array so that you can
	perform this operation in place.)
	EXAMPLE
	Input: "Mr John Smith", 13
	Output: "Mr%20John%20Smith"
 */
public class URLify {

	public static void main(String[] args) {
		char[] input = new char[50]; // lets say we have 50 bytes of space
		String actual = "Mr John Smith";
		int i = 0;
		for (; i < actual.length(); i++) {
			input[i] = actual.charAt(i);
		}
		input[i] = '\0'; // terminating char array
		System.out.println("Given String : " + actual);
		replaceSpaces(input, 13);
		System.out.println("After repalcing spaces by %20");
		for (char ch : input) {
			System.out.print(ch); // This will print some extra characters according to assumed extra length
		}
	}

	private static void replaceSpaces(char[] input, int length) {

		// count the spaces
		int spaces = 0;
		for (int i = 0; i < length; i++) {
			if (input[i] == ' ') {
				spaces++;
			}
		}
		int newLength = length + 2 * spaces;

		for (int i = length - 1; i >= 0; i--) {
			if (input[i] == ' ') {
				input[newLength - 1] = '0';
				input[newLength - 2] = '2';
				input[newLength - 3] = '%';
				newLength -= 3;

			} else {
				input[newLength - 1] = input[i];
				newLength--;
			}
		}
	}

}
