package org.algorithms.introduction.chapter2;


public class SelectionSort {

	/**
	 * Sorts using selection sort algorithm
	 * @param array, unsorted array
	 * 
	 * @return sorted array
	 * */
	public static int[] sort(int[] array) {
		for (int i = 0; i < array.length-1; i++) {
			int min_index = i;
			
			for(int j=i+1; j < array.length; j++) {
				if (array[j] < array[min_index]) {
					min_index = j;
				}
			}
			int aux = array[i];
			array[i] = array[min_index];
			array[min_index] = aux;
		}

		return array;
	}

	public static void main(String[] args) {
		for (int i : sort(new int[] {3, 3, 4, 2, 1})) {
			System.out.print(i + ",");
		}   
	}
}