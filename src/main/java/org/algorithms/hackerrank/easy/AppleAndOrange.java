package org.algorithms.hackerrank.easy;

public class AppleAndOrange {

	
	 static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, 
			    int[] oranges) {
		 
		 int apples_felt = 0;
		 int oranges_felt = 0;

		 
		 for(int i=0; i < apples.length; i++) {
			 if(apples[i]+a >= s && apples[i]+a <= t)
				 apples_felt++;
		 }
		 
		 for(int i=0; i < oranges.length; i++) {
			 if(oranges[i]+b <= t && oranges[i]+b >= s) {
				 oranges_felt++;
			 }
		 }
		 
		 System.out.println(apples_felt);
		 System.out.println(oranges_felt);
		 
	 }
	 
	 
	 public static void main(String[] args) {
		 
		 countApplesAndOranges(7, 11, 5, 15, new int[] {-2, 2, 1}, new int[] {5, -6});
	}
}
