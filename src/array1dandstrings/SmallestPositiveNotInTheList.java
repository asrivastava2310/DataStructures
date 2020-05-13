package array1dandstrings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmallestPositiveNotInTheList {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 1, 3);
		System.out.println("Given list : " + list);

		System.out.println("using sorting");
		printMissingSmallestUsingSorting(list);

		System.out.println("using extra storage");
		printMissingSmallestUsingExtraStorage(list);
	}

	// using sorting
	private static void printMissingSmallestUsingSorting(List<Integer> list) {
		Collections.sort(list); // 1, 3 ,5
		int smallestPositive = 1;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) < smallestPositive) {
				continue;
			} else if (list.get(i) == smallestPositive) {
				smallestPositive++;
			} else {
				break;
			}
		}
		System.out.println("Smallest positive missing in the list : " + smallestPositive);
	}

	// Using extra storage
	private static void printMissingSmallestUsingExtraStorage(List<Integer> list) {
		boolean[] present = new boolean[10]; //range is 1-10
		present[0] = true; //since 0 is not negative and non positive so first positive number is 1
		for (Integer i : list) {
			if (i.intValue() > 0) {
				present[i.intValue()] = true;
			}
		}
		
		System.out.println(Arrays.toString(present));
		for (int i = 0; i < present.length; i++) {
			if (!present[i]) {
				System.out.println("Smallest positive missing in the list : " + i);
				break;
			}
		}
	}

}
