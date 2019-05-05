package org.algorithms.hackerrank.easy;

public class Staircase {

	public static void startcase(int n) {
		
		int i, j;
		
		for(int x=0; x<n; x++) {
			for(j=n-x; j>1; j--)
				System.out.print(" ");
			for(i=0; i<=x; i++)
				System.out.print("#");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		startcase(6);
	}
}
