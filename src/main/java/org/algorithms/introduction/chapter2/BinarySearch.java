package org.algorithms.introduction.chapter2;

import org.algorithms.util.Util;

public class BinarySearch {

	public static int binarySearch(int[] arr, int number) {

		return search(arr, 0, arr.length - 1, number);
	}

	private static int search(int[] arr, int l, int r, int number) {

		if (l <= r) {
			int m = (l + r) / 2;

			if (arr[m] == number)
				return m;

			else if (arr[m] > number)
				return search(arr, l, m, number);

			else
				return search(arr, m + 1, r, number);
		}

		return -1;
	}

	public static void main(String[] args) {

		int[] array = MergeSort.mergeSort(Util.randomArrayWithSize(10, 20), 0, 9);

		int number = array[(int) (Math.random() * 10)];
	
		System.out.print("Looking for '"+number+"' in Array={");Util.printArray(array); System.out.println("}");
		
		System.out.println("\nArray["+binarySearch(array, number)+"] = "+number);
	}
}
