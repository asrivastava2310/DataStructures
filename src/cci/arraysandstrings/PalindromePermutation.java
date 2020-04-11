package cci.arraysandstrings;

/*
 *  Given a string, write a function to check if it is a permutation of
	a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A
	permutation is a rearrangement of letters. The palindrome does not need to be limited to just
	dictionary words.
	EXAMPLE
	Input: Tact Coa
	Output: True (permutations: "taco cat'; "atc o eta·; etc.)
 */
public class PalindromePermutation {

	public static void main(String[] args) {
		String input = "aabba";// ommmo is one palindormic permutation
		System.out.println(input + " has any palindormic permutation? - " + isPermutationOfPalindrome(input));
	}

	private static boolean isPermutationOfPalindrome(String input) {
		// The significant and enough test is to check if there is at most 1 character
		// which is occuring odd no of times.

		int[] chars = new int[256]; // Assuming extended ascii string (0-255)

		// increment indexes
		for (int i = 0; i < input.length(); i++) {
			chars[input.charAt(i)]++;
		}
        
		boolean foundOdd = false;
		for (int i = 0; i < chars.length; i++) {
               if(chars[i] % 2 != 0) {
            	   if(foundOdd) {
            		   return false;
            	   }
            	   foundOdd = true;
               }
		}
		return true;
	}

}
