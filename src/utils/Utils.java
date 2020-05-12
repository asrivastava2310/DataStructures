package utils;

public class Utils {

	public static <T> void printArray(T[] tArray) {
		for (int i = 0; i < tArray.length; i++) {
			System.out.print(tArray[i] + " ");
		}
		System.out.println();
	}
}
