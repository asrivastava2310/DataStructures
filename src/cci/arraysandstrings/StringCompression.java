package cci.arraysandstrings;

/*
 *  Implement a method to perform basic string compression using the counts
	of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
	"compressed" string would not become smaller than the original string, your method should return
	the original string. You can assume the string has only uppercase and lowercase letters (a - z).
 */
public class StringCompression {

	public static void main(String[] args) {
		String input = "aabcccccaaa";
		System.out.println("Compression of " + input + " : " + compress(input));
	}

	private static String compress(String input) {
		StringBuilder compressed = new StringBuilder();
		int countConsecutive = 0;
		for (int i = 0; i < input.length(); i++) {
             countConsecutive++;
             if(i + 1 >= input.length() || input.charAt(i) != input.charAt(i+1)) {
            	 compressed.append(input.charAt(i));
            	 compressed.append(countConsecutive);
            	 countConsecutive = 0;
             }
		}
		return compressed.toString();
	}

}
