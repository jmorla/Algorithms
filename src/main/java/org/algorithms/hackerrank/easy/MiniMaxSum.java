package org.algorithms.hackerrank.easy;

public class MiniMaxSum {

	
	public static void minMaxSum(int arr[]) {
		
		long min_sum = Long.MAX_VALUE;
		long max_sum = Long.MIN_VALUE;
		long total_sum = 0;
		
		for(int i = 0; i<arr.length; i++)
			total_sum += arr[i];
		
		for(int i = 0; i<arr.length; i++) {
			if(min_sum > total_sum - arr[i])
				min_sum = total_sum - arr[i];
			
			if(max_sum < total_sum - arr[i])
				max_sum = total_sum - arr[i];
		}
		
		System.out.print(min_sum+" "+max_sum);
	}
	
	public static void main(String[] args) {
		int[] arr = {1,3,5,7,9};
		
		minMaxSum(arr);
	}
}
