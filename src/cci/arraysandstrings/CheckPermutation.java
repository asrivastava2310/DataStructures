package cci.arraysandstrings;

import java.util.Arrays;

/*
 *Given two strings, write a method to decide if one is a permutation of the other.
 */
public class CheckPermutation {

	public static void main(String[] args) {
		String first = "god";
		String second = "dog";
		System.out.println(first + " is permutaion of " + second + " ? - " + isPermutationUsingSorting(first, second));
		System.out.println(
				first + " is permutaion of " + second + " ? - " + isPermutationUsingCharactersCount(first, second));
	}

	// Running time will be proportional to sorting algorithm
	private static boolean isPermutationUsingSorting(String first, String second) {
		if (first.length() != second.length()) {
			return false;
		}
		return sort(first).equals(sort(second));
	}

	private static String sort(String input) {
		char[] content = input.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}

	private static boolean isPermutationUsingCharactersCount(String first, String second) {
		if (first.length() != second.length()) {
			return false;
		}
		int[] letters = new int[256]; // Assuming extended ascii string(0-255)

		// prepare count of chars in 1st string
		for (int i = 0; i < first.length(); i++) {
			letters[first.charAt(i)]++;
		}

		// Now match with second string
		for (int i = 0; i < second.length(); i++) {
			letters[second.charAt(i)]--;
			if (letters[second.charAt(i)] < 0) {
				return false;
			}
		}
		return true;
	}

}
