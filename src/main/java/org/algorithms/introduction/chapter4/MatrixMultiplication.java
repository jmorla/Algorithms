package org.algorithms.introduction.chapter4;

public class MatrixMultiplication {

	public static int[][] matrixMultiplication(int[][] a, int[][] b) {
		
		int n = a.length;
		
		int[][] c = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				c[i][j] = 0;
				for(int k = 0; k < n; k++)
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
			}
		}
		
		return c;
	}
	
	public static void main(String[] args) {
		int[][] a = {{1, 2},
					 {3, 4}};
		
		int[][] b = {{5, 6}, 
					 {7, 8}};
		
		int[][] c = matrixMultiplication(a, b);
		
		
		for(int[] y : c) {
			for(int x : y)
				System.out.print(x+" ");
			System.out.println();
		}
	}
}
