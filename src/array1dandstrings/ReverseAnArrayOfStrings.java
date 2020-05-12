package array1dandstrings;

import java.util.Arrays;

public class ReverseAnArrayOfStrings {

	public static void main(String[] args) {
		String[] words = { "Monday", "Tuesday", "Wednesday" };
		System.out.println("Given array of strings : " + Arrays.toString(words));
		System.out.println("Using StringBuilder's reverse");
		String[] reversedWords = reverseWords(words);
		System.out.println("After reversing : " + Arrays.toString(reversedWords));
	}

	// Using StringBuilder's reverse
	private static String[] reverseWords(String[] words) {
		String[] reversedWords = new String[words.length];
		for (int i = 0; i < words.length; i++) {
			reversedWords[i] = new StringBuilder(words[i]).reverse().toString();
		}
		return reversedWords;
	}
}
