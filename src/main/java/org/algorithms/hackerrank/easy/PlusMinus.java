package org.algorithms.hackerrank.easy;

public class PlusMinus {

	public static void plusMinus(int []arr) {
		
		int negative = 0 , positive = 0, zero = 0;
		double n = arr.length;
		
		for(int i = 0; i< n; i++) {
			if(arr[i] > 0)
				positive++;
			
			else if(arr[i] < 0)
				negative++;
			
			else
				zero++;
		}
		
		System.out.printf("%.6f\n", (positive/n));
		System.out.printf("%.6f\n", (negative/n));
		System.out.printf("%.6f\n", (zero/n));
	}
	
	public static void main(String[] args) {
		int[] arr = {1,1,0,-1,-1};
		
		plusMinus(arr);
	}
}
