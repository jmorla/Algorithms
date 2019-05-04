package org.algorithms.introduction.chapter2;

import org.algorithms.util.Util;

public class MergeSort {

	public static int[] merge(int[] array, int l, int m, int r) {

		int n1 = m - l + 1;
		int n2 = r - m;

		// Temporal arrays
		int[] left = new int[n1];
		int[] right = new int[n2];

		// copy data to temporal arrays left and right
		for (int i = 0; i < n1; i++)
			left[i] = array[l + i];
		for (int j = 0; j < n2; j++)
			right[j] = array[m + j + 1];

		// Indexes for the main and sub arrays
		int i = 0, j = 0, k = l;

		while (i < n1 && j < n2) {

			if (left[i] <= right[j]) {
				array[k] = left[i];
				i++;
			} else {
				array[k] = right[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			array[k] = left[i];
			i++;
			k++;
		}

		while (j < n2) {
			array[k] = right[j];
			j++;
			k++;
		}

		return array;
	}

	public static int[] mergeSort(int array[], int l, int r) {

		if (l < r) {

			int m = (l + r) / 2;

			mergeSort(array, l, m);
			mergeSort(array, m + 1, r);

			merge(array, l, m, r);
		}

		return array;
	}

	public static void main(String[] args) {
		int[] array = { 2, 1, 2, 1 };

		Util.printArray(mergeSort(array, 0, array.length - 1));
	}

}
