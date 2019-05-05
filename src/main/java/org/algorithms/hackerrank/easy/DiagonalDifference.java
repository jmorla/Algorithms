package org.algorithms.hackerrank.easy;

public class DiagonalDifference {

	public static int diagonalDifference(int[][] arr) {
		
		int sum_left = 0, sum_right = 0;
		
		int x = 0, y = 0;
		
		for (;x < arr.length && y < arr[0].length; x++, y++)
			sum_left += arr[x][y];
		
		y = 0;
		x--;
		
		System.out.println();
		for(; x >= 0 && y < arr[0].length; x--, y++)
			sum_right += arr[x][y]; 
		
		int result = sum_left - sum_right;
		return result > 0 ? result : result * -1;
	}
	
	
	public static void main(String[] args) {
		int arr[][] = {
					   {1,2,3},
					   {4,5,6}, 
					   {9,8,9}
					  };
		
		System.out.println(diagonalDifference(arr));
	}
}
