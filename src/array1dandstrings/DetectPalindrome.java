package array1dandstrings;

import java.util.stream.IntStream;

public class DetectPalindrome {

	public static void main(String[] args) {
		String text1 = "malayalam";
		String text2 = "hello";

		System.out.println("Using char by char comparison from first and last till mid point");
		System.out.println(text1 + " is " + checkPallindromeByComparision(text1));
		System.out.println(text2 + " is " + checkPallindromeByComparision(text2));

		System.out.println("\nUsing String reverse");
		System.out.println(text1 + " is " + checkPallindromeByStringReverse(text1));
		System.out.println(text2 + " is " + checkPallindromeByStringReverse(text2));

		System.out.println("\nUsing Stream API");
		System.out.println(text1 + " is " + checkPallindromeByStreamApi(text1));
		System.out.println(text2 + " is " + checkPallindromeByStreamApi(text2));
		
		System.out.println("\nUsing Recursion");
		System.out.println(text1 + " is " + checkPallindromeByRecursion(text1,0,text1.length()-1));
		System.out.println(text2 + " is " + checkPallindromeByRecursion(text2,0,text2.length()-1));
	}

	// Using char by char comparison from first and last till mid point
	private static String checkPallindromeByComparision(String text) {
		int strLength = text.length();
		for (int i = 0; i < strLength / 2; i++) {
			if (text.charAt(i) != text.charAt(strLength - i - 1)) {
				return "not Pallindrome";
			}
		}
		return "Pallindrome";
	}

	// Using StringBuilder reverse
	private static String checkPallindromeByStringReverse(String text) {
		String reverse = new StringBuilder(text).reverse().toString();
		if (text.equals(reverse)) {
			return "Pallindrome";
		} else {
			return "not Pallindrome";
		}
	}

	// Using Stream API
	private static String checkPallindromeByStreamApi(String text) {

		if (IntStream.range(0, text.length() / 2)
				.noneMatch(i -> text.charAt(i) != text.charAt(text.length() - 1 - i))) {
			return "Pallindrome";
		} else {
			return "not Pallindrome";
		}
	}

	// Using Recursion
	private static String checkPallindromeByRecursion(String text, int start, int end) {
		if (start == end) {
			return "Pallindrome";
		}
		if (text.charAt(start) != text.charAt(end)) {
			return "not Pallindrome";
		}
		if (end < start + 1) {
			return checkPallindromeByRecursion(text, start + 1, end - 1);
		}
		return "Pallindrome";
	}

}
