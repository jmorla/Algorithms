package org.algorithms.introduction.chapter2;

import org.algorithms.util.Asserts;

/**
 * Insertion sort algorithm 
 * Time Complexity: O(n^2)
 * 
 * @author Jorge L. Morla
 * @version v1.0
 * */
public class InsertionSort {

	
	/**
	 * Sorts to increasing order using insertion algorithm
	 * @param array the unsorted array of {@code Integer}
	 * 
	 * @return sorted array of {@code Integer}
	 * */
	public static int[] sort(int [] array) {
		for(int j=1; j<array.length; j++) {
			int key = array[j];
			int i = j -1;
			
			while (i>-1 && array[i] > key) {
				array[i + 1] = array[i];
				i--;
			}
			array[i + 1] = key;
		}
		return array;
	}
	
	/**
	 * Sorts to decreasing order using insertion algorithm
	 * @param array, the unsorted array of {@code Integer}
	 * 
	 * @return sorted array of {@code Integer}
	 * */
	public static int[] sortInverse(int[] array) {
		for(int i=1; i<array.length; i++) {
			int aux = array[i];
			int j = i - 1;
			
			while(j>-1 && array[j] < aux) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = aux;
		}
		return array; //sorted array
	}
	
	
	public static int searchLinear(int value, int[] array) {
		Asserts.notNull(array, "Array cannot be null");
		
		for(int i = 0; i<array.length; i++) {
			if(value == array[i])
				return i;
		}
			
		return -1;
	}
	
	
	public static void main(String[] args) {		
		int[] array = {1,2,3,4,5,6};
		
		System.out.println(searchLinear(4, array));
	}
}
