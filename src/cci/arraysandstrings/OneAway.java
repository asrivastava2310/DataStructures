package cci.arraysandstrings;

/*
 *  There are three types of edits that can be performed on strings: insert a character,
	remove a character, or replace a character. Given two strings, write a function to check if they are
	one edit (or zero edits) away.
	EXAMPLE
	pale, ple -> true
	pales, pale -> true
	pale, bale -> true
	pale, bae -> false
 */
public class OneAway {

	public static void main(String[] args) {
		String one = "pale";
		String two = "ale";
		System.out.println(one + " is one edit away from " + two + " ? - " + oneEditAway(one, two));
	}

	private static boolean oneEditAway(String first, String second) {
		if (first.length() == second.length()) {
			return oneEditReplace(first, second);
		} else if (first.length() + 1 == second.length()) {
			return oneEditInsert(first, second);
		} else if (first.length() - 1 == second.length()) {
			return oneEditInsert(second, first);
		}
		return false;
	}

	private static boolean oneEditReplace(String first, String second) {
		boolean foundDiff = false;
		for (int i = 0; i < first.length(); i++) {
			if (first.charAt(i) != second.charAt(i)) {
				if (foundDiff) {
					return false;
				}
				foundDiff = true;
			}
		}
		return true;
	}

	private static boolean oneEditInsert(String first, String second) {
		int index1 = 0;
		int index2 = 0;
		while (index1 < first.length() && index2 < second.length()) {
			if (first.charAt(index1) != second.charAt(index2)) {
				if (index1 != index2) {
					return false;
				}
				index2++;
			} else {
				index1++;
				index2++;
			}
		}
		return true;
	}
}
