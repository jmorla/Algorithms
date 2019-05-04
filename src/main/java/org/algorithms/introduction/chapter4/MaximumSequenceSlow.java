package org.algorithms.introduction.chapter4;

import org.algorithms.util.Util;

/**
 * Lowest version of Maximum algorithm
 * Time Complexity : O(n^2)
 * */
public class MaximumSequenceSlow {

	
	/**
	 * Seek the maximum sub array in a given array
	 * @param arr The array
	 * */
	public static int[] seek(int[] arr) {
		
		/*
		 * low: contains the low index of the sub array
		 * high: contains the high index of the sub array
		 * sum: contains the sum of all numbers between arr[i] .. arr[j]
		 * max: contains the max sum found
		 * */
		int low=0, high=0, sum = arr[0], max = sum;
		
		for(int i=0; i < arr.length - 1;) {
			for(int j=i+1; j < arr.length; j++) {
				sum += arr[j];
				if(max < sum) {
					low = i;
					high = j;
					max = sum;
				}
			}
			i++;
			sum = arr[i];
		}
		
		// contains the max sub array found
		int[] temp = new int[1 + (high - low)];
		
		int k = low;
		
		// copy the max sub array from arr to temp
		for(int i=0; i<temp.length; i++, k++)
			temp[i] = arr[k];
		
		return temp;
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = {-9,-1,-6, 7};
		
		Util.printArray(seek(arr));
	}
	
}
