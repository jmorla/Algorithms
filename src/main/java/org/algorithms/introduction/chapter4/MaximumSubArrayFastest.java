package org.algorithms.introduction.chapter4;

/**
 *  1) Divide the given array in two halves
 *	2) Return the maximum of following three
 *		a) Maximum subarray sum in left half (Make a recursive call)
 *		b) Maximum subarray sum in right half (Make a recursive call)
 *		c) Maximum subarray sum such that the subarray crosses the midpoint
 * 
 * 
 * Time complexity: O((n)log(n))
 * */
public class MaximumSubArrayFastest {

	public static int max(int arr[], int l, int h) {
		
		if(l == h)
			return arr[l];
		
		
		
		return 0;
	}
	
	
	public static int maxAcrossSum(int arr[], int l, int m, int h) {
		
		return 0;
	}
}
