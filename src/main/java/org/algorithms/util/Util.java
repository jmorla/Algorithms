package org.algorithms.util;

public class Util {
	
	public static void printArray(int[] array) {
		for(int i : array)
			System.out.print(i+",");
	}
	
	public static int[] subArray(int[] arr, int l, int r) {
		if((l + r) > arr.length) 
			throw new IllegalArgumentException("right value cannot be grater than {0}"
					.replace("{0}",""+(arr.length-1))) ;
		
		int[] subArr = new int[r];
		for (int i = l, j = 0 ; j < r; i++, j++) {
			subArr[j] = arr[i]; 
		}
		
		return subArr;
	}
	
	public static int[] subArray(int[] arr, int r) {
		return subArray(arr, 0, r);
	}
	
	
	public static int[] randomArrayWithSize(int size, int maxSizeElement) {
		int arr[] = new int[size];
		
		for(int i=0; i<size; i++) {
			arr[i] = (int) (Math.random() * maxSizeElement);
		}
		
		return arr;
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6};
		
		printArray(subArray(arr, 5));
	}

}
