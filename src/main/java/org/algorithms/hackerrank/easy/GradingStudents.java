package org.algorithms.hackerrank.easy;

import org.algorithms.util.Util;

/**
 * @author Jorge L. Morla
 * @since 2019
 * @see https://www.hackerrank.com/challenges/grading/problem
 * 
 * 
 * Time complexiy : <code>O(n)</code>
 * */
public class GradingStudents {
	
	
	/**
	 * Round grades passed as array of parameters
	 * 
	 * @param grades before being rounded
	 * 
	 * @return grades after being rounded
	 * */
	public static int[] roundGrade(int arr[]) {
		
		for(int i = 0;i<arr.length; i++) {	
			if(arr[i] > 37 && arr[i] % 5 >= 3) {
				arr[i] += 5 - (arr[i] % 5);
			}
		}
		return arr;
	}
	

	
	public static void main(String[] args) {
		Util.printArray(roundGrade(new int[] {73,67,38,33}));
	}

}
