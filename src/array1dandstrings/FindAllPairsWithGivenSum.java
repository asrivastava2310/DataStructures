package array1dandstrings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindAllPairsWithGivenSum {

	public static void main(String[] args) {
		int arr[] = { 1, 5, 7, -1, 5 };// {1,2,2,2,3,4,4,4};
		int sum = 6;
		System.out.println("Given Array : " + Arrays.toString(arr));
		System.out.println("\nPairs usig hashing");
		printAllPairsWithGivenSumUsingHashMap(arr, sum);

		System.out.println("\nPairs usig sorting");
		printAllPairsWithGivenSumUsingSorting(arr, sum);

	}

	private static void printAllPairsWithGivenSumUsingHashMap(int[] arr, int sum) {
		Map<Integer, Integer> pairs = new HashMap<>();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (pairs.containsKey(arr[i])) {
				count++;
				System.out.println("Pair with sum " + sum + " : (" + arr[i] + "," + pairs.get(arr[i]) + ")");
			} else {
				pairs.put(sum - arr[i], arr[i]);
			}
		}
		System.out.println("Total pairs : " + count);
        //System.out.println("Distinct Pairs : ");
        //pairs.forEach((k,v)->System.out.println("("+k+","+v+")"));
	}

	// Use sorting and binary search to find k and n-k in other half
	// This will give distinct pairs
	private static void printAllPairsWithGivenSumUsingSorting(int[] a, int sum) {
		Arrays.sort(a);
		int count = 0;
		int low = 0;
		int high = a.length - 1;
		while (low <= high) {
			int k = a[low] + a[high];
			if (k == sum) {
				System.out.println("Pair with sum " + sum + " : (" + a[low] + "," + a[high] + ")");
				low++;
				high--;
				count++;
			} else if (k < sum) {
				low++;
			} else {
				high--;
			}
		}
		System.out.println("Total pairs : " + count);
	}

}
