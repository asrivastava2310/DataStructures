package array1dandstrings;

import java.util.Arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		int a1[] = { 1, 3, 5, 7, 9, 12 };
		System.out.println("Arr1 : " + Arrays.toString(a1));
		int a2[] = { 2, 4, 6, 8, 10, 11 };
		System.out.println("Arr2 : " + Arrays.toString(a2));
		int a3[] = mergeSortedArrays(a1, a2);
		System.out.println("Merged array : " + Arrays.toString(a3));
	}

	private static int[] mergeSortedArrays(int[] a1, int[] a2) {
		int result[] = new int[a1.length + a2.length];
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < a1.length && j < a2.length) {
			if (a1[i] < a2[j]) {
				result[k] = a1[i];
				i++;
				k++;
			} else {
				result[k] = a2[j];
				j++;
				k++;
			}
		}
		// store remaining elements of 1st array
		while (i < a1.length) {
			result[k] = a1[i];
			i++;
			k++;
		}

		// store remaining elements of 2nd array
		while (i < a1.length) {
			result[k] = a2[j];
			j++;
			k++;
		}
		return result;
	}

}
