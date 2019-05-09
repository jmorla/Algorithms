package org.algorithms.hackerrank.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets {

	
	public static List<Integer> compare(List<Integer> a, List<Integer> b) {
		
		List<Integer> result = new ArrayList<Integer>(2);
		int alicia = 0;
		int bob = 0;
		
		for(int i = 0; i < a.size(); i++) {
			if(a.get(i) > b.get(i))
				alicia ++;
			else if(a.get(i) < b.get(i))
				bob ++;
		}
		result.add(alicia);
		result.add(bob);
		
		return result;
	} 
	
	public static void main(String[] args) {
		
		System.out.println(compare(Arrays.asList(10, 20, 30),
				Arrays.asList(30, 20, 10)));
	}
}
