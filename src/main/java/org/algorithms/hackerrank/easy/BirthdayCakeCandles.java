package org.algorithms.hackerrank.easy;

public class BirthdayCakeCandles {

	
	public static int birthdayCakeCandles(int arr[]) {
		
		int max = Integer.MIN_VALUE;
		
		int i = -1;
		
		while(++i < arr.length)
			if(max < arr[i])
				max = arr[i];
		
		i = -1;
		int candles = 0;
		while(++i < arr.length)
			if(arr[i] == max) candles++;
			
		return candles;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {2, 3, 1, 3, 4, 10, 10, 10};
		
		System.out.println(birthdayCakeCandles(arr));
	}
}
