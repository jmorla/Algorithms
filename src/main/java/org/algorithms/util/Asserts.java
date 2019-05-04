package org.algorithms.util;


/**
 * Asserts common conditions
 * 
 * @author Jorge L. Morla from {@Asserts} spring framework class
 * @version 1.0
 * 
 * */
public class Asserts {

	
	/**
	 * Asserts that object passed as parameter is not null
	 * 
	 * @param o, {@Object} to be evaluated
	 * @param exMessage, message for the {@code IllegalArgumentException} to be thrown
	 * */
	public static void notNull(Object o, String exMessage) {
		if(o == null)
			throw new IllegalArgumentException(exMessage);
	}
}
