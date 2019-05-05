package org.algorithms.introduction.chapter4;

import org.algorithms.util.Util;

/**
 * 1) Divide the given array in two halves 2) Return the maximum of following
 * three a) Maximum subarray sum in left half (Make a recursive call) b) Maximum
 * subarray sum in right half (Make a recursive call) c) Maximum subarray sum
 * such that the subarray crosses the midpoint
 * 
 * 
 * Time complexity: O((n)log(n))
 */
public class MaximumSubArrayFastest {

	static class Sum{
		public int low;
		public int high;
		public int sum;
		
		public Sum() {}
		
		public Sum(int low, int high, int sum) {
			this.low = low;
			this.high = high;
			this.sum = sum;
		}
	}
	
	public static Sum maxSubArraySum(int arr[], int l, int h) {

		if (l == h)
			return new Sum(l, h, arr[l]);

		else {
			int m = (h + l) / 2;

			Sum max_left = maxSubArraySum(arr, l, m);
			
			Sum max_right = maxSubArraySum(arr, m + 1, h);
			
			Sum crossing_sum = maxCrossingSum(arr, l, m, h);
			
			
			int max = Math.max(Math.max(max_left.sum, max_right.sum),
					crossing_sum.sum);
			
			if(max == max_left.sum)
				return max_left;
				
			if(max == max_right.sum)
				return max_right;
			
			if(max == crossing_sum.sum);
				return crossing_sum;
			
		}
	}
	
	public static int[] getMaxSubArray(int arr[], int l, int h) {
		
		int temp[] = new int[h - l + 1];
		for(int i = l; i <= h; i ++) {
			temp[i] = arr[i];
		}
		
		return temp;
	}

	public static Sum maxCrossingSum(int arr[], int l, int m, int h) {

		Sum crossing_sum = new Sum(l, h, 0);
		int left_sum = Integer.MIN_VALUE, right_sum = Integer.MIN_VALUE, sum = 0;

		for (int i = l; i <= m; i++) {
			sum += arr[i];
			if (sum > left_sum)
				left_sum = sum;
		}

		sum = 0;
		for (int i = m + 1; i <= h; i++) {
			sum += arr[i];
			if (sum > right_sum)
				right_sum = sum;
		}

		crossing_sum.sum = (left_sum + right_sum);
		
		return crossing_sum;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, -7, 2, 3 };

		Sum s = maxSubArraySum(arr, 0, arr.length - 1);
		
		System.out.println("Sum is: {0}".replace("{0}", ""+s.sum));
		Util.printArray(getMaxSubArray(arr, s.low, s.high));
	}
}
