package cci.arraysandstrings;

/*
 *  Assume you have a method isSubString which checks if one word is a substring
	of another. Given two strings, S1 and S2, write code to check if S2 is a rotation ofS1 using only one
	call to isSubString (e.g., "waterbottle" is a rotation of" erbottlewat").
 */
public class StringRotation {

	public static void main(String[] args) {
		String S1 = "abc";
		String S2 = "bca";

		System.out.println("Is " + S2 + " a rotation of " + S1 + " ? - " + isSubString(S1 + S1, S2));
	}

	private static boolean isSubString(String first, String second) {
		return first.contains(second);
	}

}
