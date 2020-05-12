package array1dandstrings;

public class FrequencyOfAGivenWordInAString {

	public static void main(String[] args) {
		String text = "Geeks for Geeks A computer science portal for geeks";
		String word = "geeks";
		System.out.println("Frequency of " + word + " in " + text + " is : " + frequency(text, word));
	}

	private static long frequency(String text, String word) {
		String[] tokens = text.split(" ");
		int count = 0;
		for (int i = 0; i < tokens.length; i++) {
			if (tokens[i].equalsIgnoreCase(word)) {
				count++;
			}
		}
		return count;
	}
}
