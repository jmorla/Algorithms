package org.algorithms.introduction.chapter2;

public class SumBinary {

	public static int[] sum(int a[], int[] b) {
		int[] c = new int[a.length + 1];
		int reminder = 0;
		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] == 1 && b[i] == 1)
				c[i] = 1;
			reminder = (a[i] ^ b[i]);
			c[i + 1] = (reminder ^ c[i + 1]);
		}
		return c;
	}

	public static void main(String[] args) {

		int[] a = { 1, 1, 1 }; // 7
		int[] b = { 1, 1, 1 }; // 7

		for (int i : sum(a, b)) {
			System.out.print(i+",");
		}
	}
}
