package org.algorithms.introduction.chapter2;

import org.algorithms.util.Util;

public class BubbleSort {

	
	public static int[] bubbleSort(int arr[]) {
		
		int j = 0, i = j, aux;
		
		while(i < arr.length) {
			while(j < arr.length-i-1) {
				if(arr[j] > arr[j + 1]) {
					aux = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = aux;
				}
				j ++;
			}
			i++;
			j = 0;
		}
		return arr;
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = Util.randomArrayWithSize(10, 20);
		
		Util.printArray(bubbleSort(arr));
	}
}
