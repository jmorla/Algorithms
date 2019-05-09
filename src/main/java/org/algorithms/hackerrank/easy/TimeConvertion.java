package org.algorithms.hackerrank.easy;

public class TimeConvertion {

	
	public static String timeConversion(String s) {
		
		int hour = Integer.parseInt(s.substring(0,2));
		boolean isAM = s.contains("AM");
		
		String parsed 
				= (isAM ? 
						(hour == 12) ? "00" : String.format("%02d", hour)
					: 
						(hour == 12)? hour : hour + 12)+ s.substring(2,8);
		
		return parsed;
	}
	
	public static void main(String[] args) {
		System.out.println(timeConversion("01:45:54PM"));
	}
}
 